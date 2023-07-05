package rali;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import antlr4.RALIBaseVisitor;
import antlr4.RALIParser.CartesianProductContext;
import antlr4.RALIParser.DifferenceContext;
import antlr4.RALIParser.DivisionContext;
import antlr4.RALIParser.IntersectionContext;
import antlr4.RALIParser.NaturalJoinContext;
import antlr4.RALIParser.ParensContext;
import antlr4.RALIParser.RelationContext;
import antlr4.RALIParser.UnionContext;

public class RALIVisitorImp extends RALIBaseVisitor<String> {
	
	private Connection connection;
	private static int count = 0;

	public RALIVisitorImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public String visitRelation(RelationContext ctx) {
		String relation = ctx.getText();
		return String.format("(SELECT * FROM %s)", relation);
	}
	
	@Override
	public String visitUnion(UnionContext ctx) {
		String left = visit(ctx.expression(0));
		String right = visit(ctx.expression(1));
		return String.format("(SELECT * FROM %s UNION %s)", left, right);
	}
	
	@Override
	public String visitIntersection(IntersectionContext ctx) {
		String left = visit(ctx.expression(0));
		String right = visit(ctx.expression(1));
		return String.format("(SELECT * FROM %s INTERSECT %s)", left, right);
	}
	
	@Override
	public String visitDifference(DifferenceContext ctx) {
		String left = visit(ctx.expression(0));
		String right = visit(ctx.expression(1));
		return String.format("(SELECT * FROM %s MINUS %s)", left, right);
	}
	
	@Override
	public String visitNaturalJoin(NaturalJoinContext ctx) {
		String left = visit(ctx.expression(0));
		String right = visit(ctx.expression(1));
		return String.format("(SELECT DISTINCT * FROM %s NATURAL JOIN %s)", left, right);
	}
	
	@Override
	public String visitCartesianProduct(CartesianProductContext ctx) {
		String left = visit(ctx.expression(0));
		String right = visit(ctx.expression(1));
		
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
		String left = visit(ctx.expression(0));
		String right = visit(ctx.expression(1));
		
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

}
