package rali;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import antlr4.RALIBaseVisitor;
import antlr4.RALIParser.AndContext;
import antlr4.RALIParser.AssignmentContext;
import antlr4.RALIParser.AtomicformulaContext;
import antlr4.RALIParser.AttributeContext;
import antlr4.RALIParser.CartesianProductContext;
import antlr4.RALIParser.CondContext;
import antlr4.RALIParser.DifferenceContext;
import antlr4.RALIParser.DivisionContext;
import antlr4.RALIParser.InlinerelationContext;
import antlr4.RALIParser.IntersectionContext;
import antlr4.RALIParser.NaturalJoinContext;
import antlr4.RALIParser.NegationContext;
import antlr4.RALIParser.OrContext;
import antlr4.RALIParser.ParensContext;
import antlr4.RALIParser.ProjectionContext;
import antlr4.RALIParser.RelationContext;
import antlr4.RALIParser.SelectionContext;
import antlr4.RALIParser.ThetaJoinContext;
import antlr4.RALIParser.TupleContext;
import antlr4.RALIParser.UnionContext;

public class RALIVisitorImp extends RALIBaseVisitor<String> {
	
	private Connection connection;
	private static int count = 0;
	
	private static List<String> attributes;
	private static List<String> attributetypes;
	
	private static Map<String, String> types = new HashMap<String, String>();
	
	private static String INTEGER = "INTEGER";
	private static String DECIMAL = "DECIMAL";
	private static String STRING = "STRING";
	private static String DATE = "DATE";
	
	private static String error = null;
	private static String sql = null;

	public RALIVisitorImp(Connection connection) {
		this.connection = connection;
		
		types.put(INTEGER, "INTEGER");
		types.put(DECIMAL, "DOUBLE PRECISION");
		types.put(STRING, "VARCHAR(255)");
		types.put(DATE, "DATE");
	}

	@Override
	public String visitRelation(RelationContext ctx) {
		String relation = ctx.getText();
		return String.format("(SELECT DISTINCT * FROM %s)", relation);
	}
	
	@Override
	public String visitProjection(ProjectionContext ctx) {
		List<String> attlist = ctx.attributes.stream().map(x -> x.getText()).toList();
		String atts = String.join(", ", attlist);
		
		if(attlist.size() != attlist.stream().distinct().toList().size()) {
			return String.format("[[ERROR: Duplicate attribute names in selection: %s.]]", atts);
		}
		
		String exp = visit(ctx.expression());
		
		return String.format("(SELECT DISTINCT %s FROM %s)", atts, exp);
	}

	@Override
	public String visitSelection(SelectionContext ctx) {
		String cond = visit(ctx.condition());
		String exp = visit(ctx.expression());
		
		return String.format("(SELECT DISTINCT * FROM %s WHERE %s)", exp, cond);
	}

	@Override
	public String visitCond(CondContext ctx) {
		return visit(ctx.condition());
	}

	@Override
	public String visitNegation(NegationContext ctx) {
		return String.format("NOT (%s)", visit(ctx.cond));
	}

	@Override
	public String visitOr(OrContext ctx) {
		return String.format("(%s OR %s)", visit(ctx.left), visit(ctx.right));
	}

	@Override
	public String visitAnd(AndContext ctx) {
		return String.format("(%s AND %s)", visit(ctx.left), visit(ctx.right));
	}

	@Override
	public String visitAtomicformula(AtomicformulaContext ctx) {	
		// We use "" for strings, but SQL requires ''
		// This is a quick, dirty, but probably good enough hack
		return ctx.getText().replace("\"", "'");
	}

	@Override
	public String visitInlinerelation(InlinerelationContext ctx) {
		// We need to create a new table in the database
		// Increment the counter 
		count++;
		attributes = new ArrayList<String>();
		attributetypes = new ArrayList<String>();
		error = null;
		sql = "";
		
		try {
			super.visitInlinerelation(ctx);
			
			String create = "CREATE TABLE TABLE" + count + "(" 
					+ String.join(", ", attributes) + ");";
			
			connection.createStatement().execute(create + sql);
			
			if (error == null)
				return String.format("(SELECT DISTINCT * FROM TABLE%s)", count);
			
			return error;
		} catch (SQLException e) {
			return String.format("[[ERROR: Problem creating constant relation: %s.]]", e.getMessage().replace("\n", "").replace("\r", ""));
		}
	}

	@Override
	public String visitAttribute(AttributeContext ctx) {
		String attname = ctx.label.getText();
		String atttype = ctx.type != null ? types.get(ctx.type.getText()) : "VARCHAR(255)";
		attributes.add(attname + " " + atttype);
		attributetypes.add(atttype);
		return super.visitAttribute(ctx);
	}

	@Override
	public String visitTuple(TupleContext ctx) {
		int size = attributes.size();
		List<String> values = ctx.values.stream().map(v -> v.getText()).toList();
		
		if(ctx.values.size() != size) {
			error = String.format("[[ERROR: Tuple does not have the correct size of %d: %s.]]", size, values);
			// We do not have to return, but why bother with the rest?
			return "";
		}
		
		String insert = "INSERT INTO TABLE" + count + " VALUES (";
		for(int i = 0; i < size; i++) {
			if(i != 0) insert += ", ";
			String type = attributetypes.get(i);
			if(type.equals(types.get(DATE)))
				insert += "'" + values.get(i) + "'";
			else if (type.equals(types.get(STRING)))
				insert += values.get(i).replace("\"", "'");
			else
				insert += values.get(i);
		}
		insert += ");";
		
		sql += insert;
		
		return super.visitTuple(ctx);
	}

	@Override
	public String visitUnion(UnionContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return String.format("(SELECT * FROM %s UNION %s)", left, right);
	}
	
	@Override
	public String visitIntersection(IntersectionContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return String.format("(SELECT * FROM %s INTERSECT %s)", left, right);
	}
	
	@Override
	public String visitDifference(DifferenceContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return String.format("(SELECT * FROM %s MINUS %s)", left, right);
	}
	
	@Override
	public String visitNaturalJoin(NaturalJoinContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return String.format("(SELECT DISTINCT * FROM %s NATURAL JOIN %s)", left, right);
	}
	
	@Override
	public String visitCartesianProduct(CartesianProductContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);;
		
		try {
			// Get the attributes of the LHS and store them in a list
			ResultSet rsleft = connection.createStatement().executeQuery(left);
			ArrayList<String> attleft = new ArrayList<String>();
			for(int a = 1; a <= rsleft.getMetaData().getColumnCount(); a++)
				attleft.add(rsleft.getMetaData().getColumnLabel(a));
						
			// Get the attributes of the RHS and store them in a list
			ResultSet rsright = connection.createStatement().executeQuery(right);
			ArrayList<String> attright = new ArrayList<String>();
			for(int a = 1; a <= rsright.getMetaData().getColumnCount(); a++)
				attright.add(rsright.getMetaData().getColumnLabel(a));
			
			attleft.retainAll(attright);
			
			if(attleft.size() > 0)
				return String.format("[[ERROR: LHS and RHS of the Cartisian Product share attributes: %s.]]", attleft);
			
			return String.format("(SELECT DISTINCT * FROM %s CROSS JOIN %s)", left, right);
			
		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}
	}
	
	@Override
	public String visitParens(ParensContext ctx) {
		String e = visit(ctx.expression());
		return String.format("(%s)", e);
	}
	
	@Override
	public String visitDivision(DivisionContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		
		try {
			// Get the attributes of the LHS and store them in a list
			ResultSet rsleft = connection.createStatement().executeQuery(left);
			ArrayList<String> attleft = new ArrayList<String>();
			for(int a = 1; a <= rsleft.getMetaData().getColumnCount(); a++)
				attleft.add(rsleft.getMetaData().getColumnLabel(a));
						
			// Get the attributes of the RHS and store them in a list
			ResultSet rsright = connection.createStatement().executeQuery(right);
			ArrayList<String> attright = new ArrayList<String>();
			for(int a = 1; a <= rsright.getMetaData().getColumnCount(); a++)
				attright.add(rsright.getMetaData().getColumnLabel(a));
			
			if(!attleft.containsAll(attright))
				return "[[ERROR: Schema of LHS does not contain all attributes of RHS.]]";
			
			if(attleft.size() == attright.size())
				return "[[ERROR: LHS and RHS cannot have the same schema for a division.]]";
			
			// We now remove RHS's attributes from the LHS for the query
			attleft.removeAll(attright);
			
			int v1 = count++;
			int v2 = count++;
			int v3 = count++;
			
			String query = ""
					+ "SELECT DISTINCT %s FROM %s AS R%d WHERE NOT EXISTS ("
					+ "(SELECT %s FROM %s AS R%d)"
					+ "EXCEPT"
					+ "(SELECT %s FROM %s AS R%d WHERE %s)"		
					+ ")";
			
			String filled = String.format(query, 
					attleft.stream().collect(Collectors.joining(", ")), 
					left,
					v1,
					attright.stream().collect(Collectors.joining(", ")),
					right,
					v2,
					attright.stream().collect(Collectors.joining(", ")),
					left,
					v3,
					attleft.stream().map(x -> String.format("R%d.%s = R%d.%s", v3, x, v1, x)).collect(Collectors.joining(", "))
					);
			
			return filled;
			
		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}
	}
	
	@Override
	public String visitAssignment(AssignmentContext ctx) {
		String query = visit(ctx.expression());

		if(ctx.label == null)
			return query;
		
		try {
			String viewname = ctx.label.getText();
			String sql = String.format("CREATE VIEW %s AS %s", viewname, query);
			connection.createStatement().execute(sql);
			return String.format("(SELECT DISTINCT * FROM %s)", viewname);
			
		} catch (SQLException e) {
			return String.format("[[ERROR: Problem creating constant relation: %s.]]", e.getMessage().replace("\n", "").replace("\r", ""));
		}
	}

	@Override
	public String visitThetaJoin(ThetaJoinContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		String cond = visit(ctx.cond);
		
		try {
			// Get the attributes of the LHS and store them in a list
			ResultSet rsleft = connection.createStatement().executeQuery(left);
			ArrayList<String> attleft = new ArrayList<String>();
			for(int a = 1; a <= rsleft.getMetaData().getColumnCount(); a++)
				attleft.add(rsleft.getMetaData().getColumnLabel(a));
						
			// Get the attributes of the RHS and store them in a list
			ResultSet rsright = connection.createStatement().executeQuery(right);
			ArrayList<String> attright = new ArrayList<String>();
			for(int a = 1; a <= rsright.getMetaData().getColumnCount(); a++)
				attright.add(rsright.getMetaData().getColumnLabel(a));
			
			attleft.retainAll(attright);
			
			if(attleft.size() > 0)
				return String.format("[[ERROR: LHS and RHS of the Theta Join share attributes: %s.]]", attleft);
			
			return String.format("(SELECT DISTINCT * FROM %s JOIN %s ON %s)", left, right, cond);
			
		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}	
	}

}
