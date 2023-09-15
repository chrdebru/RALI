// Generated from antlr4\RALI.g4 by ANTLR 4.12.0
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RALIParser}.
 */
public interface RALIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RALIParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RALIParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntersection(RALIParser.IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntersection(RALIParser.IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relation}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelation(RALIParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relation}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelation(RALIParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant(RALIParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant(RALIParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(RALIParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(RALIParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(RALIParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(RALIParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Difference}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDifference(RALIParser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Difference}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDifference(RALIParser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NaturalJoin}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(RALIParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NaturalJoin}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(RALIParser.NaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CartesianProduct}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProduct(RALIParser.CartesianProductContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CartesianProduct}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProduct(RALIParser.CartesianProductContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Union}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnion(RALIParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Union}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnion(RALIParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#inlinerelation}.
	 * @param ctx the parse tree
	 */
	void enterInlinerelation(RALIParser.InlinerelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#inlinerelation}.
	 * @param ctx the parse tree
	 */
	void exitInlinerelation(RALIParser.InlinerelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(RALIParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(RALIParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(RALIParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(RALIParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RALIParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RALIParser.ValueContext ctx);
}