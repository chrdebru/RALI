package rali;

import antlr4.RALIBaseVisitor;
import antlr4.RALIParser.CartesianProductContext;
import antlr4.RALIParser.DifferenceContext;
import antlr4.RALIParser.IntersectionContext;
import antlr4.RALIParser.NaturalJoinContext;
import antlr4.RALIParser.ParensContext;
import antlr4.RALIParser.RelationContext;
import antlr4.RALIParser.UnionContext;

public class RALIVisitorImp extends RALIBaseVisitor<String> {
	
	@Override
	public String visitRelation(RelationContext ctx) {
		String relation = ctx.getText();
		return String.format("(SELECT * FROM %s)", relation);
	}
	
//	@Override
//	public String visitDifference(DifferenceContext ctx) {
//		String left = visit(ctx.expression(0));
//		String right = visit(ctx.expression(1));
//		
//		System.out.println(left);
//		System.out.println(right);
//		
//		return String.format("(SELECT * FROM %s UNION %s)", left, right);
//	}
	
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
		return String.format("(SELECT DISTINCT * FROM %s CROSS JOIN %s)", left, right);
	}
	
	@Override
	public String visitParens(ParensContext ctx) {
		String e = visit(ctx.expression());
		return String.format("(%s)", e);
	}

}
