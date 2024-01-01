package erali;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import antlr4.ERALIBaseVisitor;
import antlr4.ERALIParser.AggregationContext;
import antlr4.ERALIParser.AliasContext;
import antlr4.ERALIParser.AndContext;
import antlr4.ERALIParser.AssignmentContext;
import antlr4.ERALIParser.AtomicformulaContext;
import antlr4.ERALIParser.AttributeContext;
import antlr4.ERALIParser.CondContext;
import antlr4.ERALIParser.ConditionContext;
import antlr4.ERALIParser.DifferenceOrUnionContext;
import antlr4.ERALIParser.DistinctContext;
import antlr4.ERALIParser.InlinerelationContext;
import antlr4.ERALIParser.IntersectionContext;
import antlr4.ERALIParser.JoinsContext;
import antlr4.ERALIParser.NegationContext;
import antlr4.ERALIParser.OrContext;
import antlr4.ERALIParser.ParensContext;
import antlr4.ERALIParser.ProjectionAttributeContext;
import antlr4.ERALIParser.ProjectionContext;
import antlr4.ERALIParser.ProjectionExpressionContext;
import antlr4.ERALIParser.RelationContext;
import antlr4.ERALIParser.RenameContext;
import antlr4.ERALIParser.SelectionContext;
import antlr4.ERALIParser.SetDifferenceOrUnionContext;
import antlr4.ERALIParser.SetIntersectionContext;
import antlr4.ERALIParser.SortContext;
import antlr4.ERALIParser.TupleContext;

public class ERALIVisitorImp extends ERALIBaseVisitor<String> {

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

	public ERALIVisitorImp(Connection connection) {
		this.connection = connection;

		types.put(INTEGER, "INTEGER");
		types.put(DECIMAL, "DOUBLE PRECISION");
		types.put(STRING, "VARCHAR(255)");
		types.put(DATE, "DATE");
	}

	@Override
	public String visitRelation(RelationContext ctx) {
		String relation = ctx.getText();
		return String.format("(SELECT * FROM %s)", relation);
	}

	@Override
	public String visitProjection(ProjectionContext ctx) {
		List<String> attlist = ctx.attributes.stream().map(x -> visitProjectionAttribute(x)).toList();
		String atts = String.join(", ", attlist);

		if(attlist.size() != ctx.attributes.stream().map(x -> x.attributename.getText()).distinct().toList().size()) {
			return String.format("[[ERROR: Duplicate attribute names in selection: %s.]]", atts);
		}

		String exp = visit(ctx.expression());

		return String.format("(SELECT %s FROM %s)", atts, exp);
	}

	@Override
	public String visitProjectionAttribute(ProjectionAttributeContext ctx) {
		if(ctx.exp == null)
			return ctx.getText();
		else
			return visitProjectionExpression(ctx.exp) + " AS " + ctx.attributename.getText();
	}

	@Override
	public String visitProjectionExpression(ProjectionExpressionContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitAggregation(AggregationContext ctx) {
		String aggregate = ctx.aggregationOperation().getText();
		String asAttribute = ctx.attributename.getText();
		String exp = visit(ctx.expression());

		if(ctx.by != null) {
			String byAttribute = ctx.by.getText();
			return String.format(
					"(SELECT %s, %s AS %s FROM %s GROUP BY %s)", 
					byAttribute, aggregate, asAttribute, exp, byAttribute);
		} else {
			return String.format(
					"(SELECT %s AS %s FROM %s)", 
					aggregate, asAttribute, exp);
		}
	}

	@Override
	public String visitSort(SortContext ctx) {
		List<String> attlist = ctx.attributes.stream().map(x -> x.getText()).toList();
		String atts = String.join(", ", attlist);
		String exp = visit(ctx.expression());
		return String.format("(SELECT * FROM %s ORDER BY %s)", exp, atts);
	}

	@Override
	public String visitSelection(SelectionContext ctx) {
		String cond = visit(ctx.condition());
		String exp = visit(ctx.expression());

		return String.format("(SELECT * FROM %s WHERE %s)", exp, cond);
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
				return String.format("(SELECT * FROM TABLE%s)", count);

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

			if(values.get(i).equals("NULL"))
				insert += values.get(i);
			else if(type.equals(types.get(DATE)))
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
	public String visitParens(ParensContext ctx) {
		String e = visit(ctx.expression());
		return String.format("(%s)", e);
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
			return String.format("(SELECT * FROM %s)", viewname);

		} catch (SQLException e) {
			return String.format("[[ERROR: Problem creating constant relation: %s.]]", e.getMessage().replace("\n", "").replace("\r", ""));
		}
	}

	@Override
	public String visitRename(RenameContext ctx) {
		String exp = visit(ctx.expression());
		List<String> aliases = ctx.aliases.stream().map(x -> visitAlias(x)).toList();

		// LHS of each alias
		List<String> LHS = aliases.stream().map(x -> x.substring(0, x.indexOf(" "))).toList();

		try {
			// Get the attributes of the query and store them in a list
			ResultSet rs = connection.createStatement().executeQuery(exp);
			ArrayList<String> att = new ArrayList<String>();
			for(int a = 1; a <= rs.getMetaData().getColumnCount(); a++)
				att.add(rs.getMetaData().getColumnLabel(a));

			ArrayList<String> finallist = new ArrayList<String>(aliases);
			for(String a : att) {
				if(!LHS.contains(a))
					finallist.add(a);
			}

			String attributes = finallist.stream().collect(Collectors.joining(", "));
			return String.format("(SELECT %s FROM %s)", attributes, exp);

		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}	
	}

	@Override
	public String visitAlias(AliasContext ctx) {
		return ctx.getText().replace("<-", " AS ");
	}

	@Override
	public String visitDistinct(DistinctContext ctx) {
		String exp = visit(ctx.expression());
		return String.format("(SELECT DISTINCT * FROM %s)", exp);
	}

	//*************************************************************************
	// Cartesian Product and JOINS
	//*************************************************************************

	@Override
	public String visitJoins(JoinsContext ctx) {
		String op = ctx.operator.getText();
		ConditionContext cond = ctx.condition();

		if(cond != null && !op.contains("JOIN"))
			return String.format("[[ERROR: op %s cannot have a condition.]]", op);

		if("PRODUCT".equals(op))
			return visitCartesianProduct(ctx);
		else if(op.contains("DIVISION"))
			if(ctx.operator.set != null)
				return visitSetDivision(ctx);
			else
				return visitDivision(ctx);
		//return "[[ERROR: division on multisets not supported.]]";
		else if(cond != null)
			return visitThetaJoin(ctx);
		else
			return visitNaturalJoin(ctx);
	}	

	public String visitCartesianProduct(JoinsContext ctx) {
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
				return String.format("[[ERROR: LHS and RHS of the Cartesian Product share attributes: %s.]]", attleft);

			return String.format("(SELECT * FROM %s CROSS JOIN %s)", left, right);

		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}
	}

	public String visitNaturalJoin(JoinsContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);

		if(ctx.joinsOperator().outer != null) {
			//			if(ctx.joinsOperator().dir == null) {
			//				return String.format("(SELECT * FROM %s NATURAL OUTER JOIN %s)", left, right);
			//			} else if ("LEFT".equals(ctx.joinsOperator().dir.getText())) {
			//				return String.format("(SELECT * FROM %s LEFT JOIN %s)", left, right);
			//			} else {
			//				return String.format("(SELECT * FROM %s RIGHT JOIN %s)", left, right);
			//			}

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

				ArrayList<String> attleftcopy = new ArrayList<String>(attleft);

				attleft.retainAll(attright);
				if(attleft.size() == 0)
					return String.format("[[ERROR: LHS and RHS of the Natural Join do not share attributes: %s.]]", attleft);

				// Prepare the join condition to simulate a natural join
				String joinatts = String.join(" AND ", attleft.stream().map(x -> String.format("X.%s = Y.%s", x, x)).toList());

				if (ctx.joinsOperator().dir == null) {
					ArrayList<String> attrightcopy = new ArrayList<String>(attright);

					// Prepare the colums to select
					// We need all columns of LHS for the LEFT OUTER JOIN
					String xAtts1 = String.join(", ", attleftcopy.stream().map(x -> String.format("X.%s", x)).toList());
					attrightcopy.removeAll(attleftcopy);
					String yAtts1 = String.join(", ", attrightcopy.stream().map(x -> String.format("Y.%s", x)).toList());

					// We need all columns of RHS for the RIGHT OUTER JOIN 
					String xAtts2 = String.join(", ", attleft.stream().map(x -> String.format("X.%s", x)).toList());
					String yAtts2 = String.join(", ", attright.stream().map(x -> String.format("Y.%s", x)).toList());

					String where = String.join(" AND ", attleft.stream().map(x -> String.format("X.%s IS NULL", x, x)).toList());

					// query based on https://stackoverflow.com/questions/30092068/sql-full-outer-join-not-working
					return String.format("("
							+ "((SELECT %s, %s FROM %s X LEFT OUTER JOIN %s Y ON %s))"
							+ "UNION ALL"
							+ "((SELECT %s, %s FROM %s X RIGHT OUTER JOIN %s Y ON %s WHERE %s))"
							+ ")", 
							xAtts1, yAtts1, left, right, joinatts,
							xAtts2, yAtts2, left, right, joinatts, where);
				} else if ("LEFT".equals(ctx.joinsOperator().dir.getText())) {
					// Prepare the colums to select
					String xAtts = String.join(", ", attleftcopy.stream().map(x -> String.format("X.%s", x)).toList());
					attright.removeAll(attleftcopy);
					String yAtts = String.join(", ", attright.stream().map(x -> String.format("Y.%s", x)).toList());
					return String.format("(SELECT %s, %s FROM %s X LEFT OUTER JOIN %s Y ON %s)", xAtts, yAtts, left, right, joinatts);
				} else {
					// Prepare the colums to select
					String xAtts = String.join(", ", attleft.stream().map(x -> String.format("X.%s", x)).toList());
					String yAtts = String.join(", ", attright.stream().map(x -> String.format("Y.%s", x)).toList());
					return String.format("(SELECT %s, %s FROM %s X RIGHT OUTER JOIN %s Y ON %s)", xAtts, yAtts, left, right, joinatts);
				}

			} catch (SQLException e) {
				return String.format("[[ERROR: %s.]]", e.getMessage());
			}
		}

		return String.format("(SELECT * FROM %s NATURAL JOIN %s)", left, right);
	}

	public String visitThetaJoin(JoinsContext ctx) {
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

			return String.format("(SELECT * FROM %s JOIN %s ON %s)", left, right, cond);

		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}	
	}

	public String visitSetDivision(JoinsContext ctx) {
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
					attleft.stream().map(x -> String.format("R%d.%s = R%d.%s", v3, x, v1, x)).collect(Collectors.joining(" AND "))
					);

			return filled;

		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}
	}

	public String visitDivision(JoinsContext ctx) {
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

			String attleftstring = attleft.stream().collect(Collectors.joining(", "));
			String attrightstring = attright.stream().collect(Collectors.joining(", "));

			// Get all the tuples from LEFT
			String lquery = String.format("SELECT * FROM %s ORDER BY %s", left, attleftstring);
			List<Map<String, Object>> L = queryToDictionary(lquery);

			// Get DISTINCT S1-S2 from LEFT
			String laquery = String.format("SELECT DISTINCT %s FROM %s ORDER BY %s", attleftstring, left, attleftstring);
			List<Map<String, Object>> LA = queryToDictionary(laquery);

			// Get all the tuples from RIGHT
			String rquery = String.format("SELECT * FROM %s ORDER BY %s", right, attrightstring);
			List<Map<String, Object>> R = queryToDictionary(rquery);

			List<Map<String, Object>> toKeep = new ArrayList<Map<String, Object>>();

			while(!LA.isEmpty()) {				
				// Get an LA from the list
				Map<String, Object> la = LA.get(0);

				// Test if la has all occurrences of R in L
				// If yes, *keep* la and remove these occurrences
				if(hasAllCombinationsIn(la, R, L)) {
					removeAllCombinationsIn(la, R, L);
					toKeep.add(la);
				} 				
				// If no, remove la from the list
				else {
					LA.remove(la);
				}
			}

			// Create a new table based on division.
			List<String> attributes = new ArrayList<String>();
			ResultSet res = connection.createStatement().executeQuery(laquery);
			for(int i = 1; i <= res.getMetaData().getColumnCount(); i++) {
				String clazz = res.getMetaData().getColumnClassName(i);

				if(clazz.equals("java.lang.String"))
					clazz = types.get(STRING);
				else if(clazz.equals("java.lang.Integer"))
					clazz = types.get(INTEGER);
				else if(clazz.equals("java.lang.Double"))
					clazz = types.get(DECIMAL);
				else
					clazz = types.get(DATE);

				attributes.add(res.getMetaData().getColumnName(i) + " " + clazz);
			}

			String create = String.format("CREATE TABLE TABLE%s (%s);", ++count, String.join(", ", attributes));
			connection.createStatement().execute(create);

			for(Map<String, Object> t : toKeep) {
				String atts = "";
				String vals = "";

				boolean first = true;

				for(String k : t.keySet()) {
					if(first)
						first = false;
					else {
						atts += ", ";
						vals += ", ";
					}

					atts += k;

					Object o = t.get(k);
					if (o == null) 
						vals += "NULL";
					else if(o instanceof String)
						vals += "'" + o + "'";
					else if(o instanceof Date)
						vals += "'" + o + "'";
					else
						vals += o;
				}

				String insert = String.format("INSERT INTO TABLE%s (%s) VALUES (%s)", count, atts, vals);
				connection.createStatement().execute(insert);
			}

			return String.format("(SELECT * FROM TABLE%s)", count);

		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}
	}

	private void removeAllCombinationsIn(
			Map<String, Object> la, 
			List<Map<String, Object>> R,
			List<Map<String, Object>> L) {

		for(Map<String, Object> m : R) {
			Map<String, Object> newtuple = new HashMap<String,Object>();
			newtuple.putAll(la);
			newtuple.putAll(m);
			L.remove(newtuple);
		}
	}

	private boolean hasAllCombinationsIn(
			Map<String, Object> la, 
			List<Map<String, Object>> R,
			List<Map<String, Object>> L) {

		List<Map<String, Object>> Lcopy = new ArrayList<Map<String, Object>>(L);

		for(Map<String, Object> m : R) {
			Map<String, Object> newtuple = new HashMap<String,Object>();
			newtuple.putAll(la);
			newtuple.putAll(m);

			if(Lcopy.contains(newtuple))
				Lcopy.remove(newtuple);
			else return false;
		}

		return true;
	}

	private List<Map<String, Object>> queryToDictionary(String query) throws SQLException {
		ResultSet R = connection.createStatement().executeQuery(query);
		List<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
		int n = R.getMetaData().getColumnCount();
		while (R.next()) {
			Map<String, Object> map = new HashMap<String, Object>();
			for (int i = 1; i <= n; i++) {
				map.put(R.getMetaData().getColumnName(i), R.getObject(i));
			}
			maps.add(map);
		}
		return maps;
	}

	//*************************************************************************
	// INTERSECTION
	//*************************************************************************	

	@Override
	public String visitIntersection(IntersectionContext ctx) {
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

			if(!(attleft.containsAll(attright) && attright.containsAll(attleft)))
				return String.format("[[ERROR: LHS and RHS of the Intersection have different attributes: %s.]]", attleft);

			String rownumberatt = "ROWNUMBER" + ++count;

			String sql = "(SELECT %s FROM ("
					+ "SELECT ROW_NUMBER() OVER (PARTITION BY %s) AS %s, %s FROM %s"
					+ " INTERSECT "
					+ "SELECT ROW_NUMBER() OVER (PARTITION BY %s) AS %s, %s FROM %s"
					+ "))";

			String filled = String.format(sql, 
					attleft.stream().collect(Collectors.joining(", ")),
					attleft.stream().collect(Collectors.joining(", ")),
					rownumberatt,
					attleft.stream().collect(Collectors.joining(", ")),
					left,
					attright.stream().collect(Collectors.joining(", ")),
					rownumberatt,
					attright.stream().collect(Collectors.joining(", ")),
					right
					);

			return filled;

		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}
	}

	@Override
	public String visitSetIntersection(SetIntersectionContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return String.format("(SELECT * FROM %s INTERSECT %s)", left, right);
	}

	//*************************************************************************
	// Difference and Union
	//*************************************************************************
	@Override
	public String visitDifferenceOrUnion(DifferenceOrUnionContext ctx) {
		String op = ctx.operator.getText();

		if("MINUS".equals(op))
			return visitDifference(ctx);
		else
			return visitUnion(ctx);
	}	

	public String visitUnion(DifferenceOrUnionContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return String.format("(SELECT * FROM %s UNION ALL %s)", left, right);
	}

	public String visitDifference(DifferenceOrUnionContext ctx) {
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

			if(!(attleft.containsAll(attright) && attright.containsAll(attleft)))
				return String.format("[[ERROR: LHS and RHS of the difference have different attributes: %s.]]", attleft);

			String rownumberatt = "ROWNUMBER" + ++count;

			String sql = "(SELECT %s FROM ("
					+ "SELECT ROW_NUMBER() OVER (PARTITION BY %s) AS %s, %s FROM %s"
					+ " EXCEPT "
					+ "SELECT ROW_NUMBER() OVER (PARTITION BY %s) AS %s, %s FROM %s"
					+ "))";

			String filled = String.format(sql, 
					attleft.stream().collect(Collectors.joining(", ")),
					attleft.stream().collect(Collectors.joining(", ")),
					rownumberatt,
					attleft.stream().collect(Collectors.joining(", ")),
					left,
					attright.stream().collect(Collectors.joining(", ")),
					rownumberatt,
					attright.stream().collect(Collectors.joining(", ")),
					right
					);

			return filled;

		} catch (SQLException e) {
			return String.format("[[ERROR: %s.]]", e.getMessage());
		}
	}

	@Override
	public String visitSetDifferenceOrUnion(SetDifferenceOrUnionContext ctx) {
		String op = ctx.operator.getText();

		if("MINUS".equals(op))
			return visitSetDifference(ctx);
		else
			return visitSetUnion(ctx);
	}	

	public String visitSetUnion(SetDifferenceOrUnionContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return String.format("(SELECT * FROM %s UNION %s)", left, right);
	}

	public String visitSetDifference(SetDifferenceOrUnionContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		return String.format("(SELECT * FROM %s EXCEPT %s)", left, right);
	}
}
