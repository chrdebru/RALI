// Generated from antlr4\ERALI.g4 by ANTLR 4.12.0
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ERALIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ERALIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ERALIParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ERALIParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Query}
	 * labeled alternative in {@link ERALIParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ERALIParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection(ERALIParser.IntersectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ERALIParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ERALIParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sigma}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigma(ERALIParser.SigmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetIntersection}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetIntersection(ERALIParser.SetIntersectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tau}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTau(ERALIParser.TauContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetDifferenceOrUnion}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDifferenceOrUnion(ERALIParser.SetDifferenceOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Joins}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoins(ERALIParser.JoinsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relation}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(ERALIParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Delta}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelta(ERALIParser.DeltaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rho}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRho(ERALIParser.RhoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DifferenceOrUnion}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferenceOrUnion(ERALIParser.DifferenceOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pi}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPi(ERALIParser.PiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(ERALIParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#joinsOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinsOperator(ERALIParser.JoinsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#diffUnionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiffUnionOperator(ERALIParser.DiffUnionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(ERALIParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#rename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(ERALIParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(ERALIParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(ERALIParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ERALIParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ERALIParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ERALIParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ERALIParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#atomicformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicformula(ERALIParser.AtomicformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#attributeorvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeorvalue(ERALIParser.AttributeorvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(ERALIParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(ERALIParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#inlinerelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlinerelation(ERALIParser.InlinerelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ERALIParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(ERALIParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ERALIParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ERALIParser#null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(ERALIParser.NullContext ctx);
}