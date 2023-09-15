// Generated from antlr4\RALI.g4 by ANTLR 4.12.0
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RALIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RALIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RALIParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(RALIParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection(RALIParser.IntersectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relation}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(RALIParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(RALIParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(RALIParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(RALIParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Difference}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference(RALIParser.DifferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NaturalJoin}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoin(RALIParser.NaturalJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CartesianProduct}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProduct(RALIParser.CartesianProductContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Union}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(RALIParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RALIParser#inlinerelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlinerelation(RALIParser.InlinerelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RALIParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(RALIParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RALIParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(RALIParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RALIParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RALIParser.ValueContext ctx);
}