// Generated from antlr4\RALI.g4 by ANTLR 4.12.0
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RALIParser}.
 */
public interface RALIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link RALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RALIParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link RALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RALIParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Query}
	 * labeled alternative in {@link RALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterQuery(RALIParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Query}
	 * labeled alternative in {@link RALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitQuery(RALIParser.QueryContext ctx);
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
	 * Enter a parse tree produced by the {@code Sigma}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSigma(RALIParser.SigmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sigma}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSigma(RALIParser.SigmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rho}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRho(RALIParser.RhoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rho}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRho(RALIParser.RhoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DifferenceOrUnion}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceOrUnion(RALIParser.DifferenceOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DifferenceOrUnion}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceOrUnion(RALIParser.DifferenceOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pi}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPi(RALIParser.PiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pi}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPi(RALIParser.PiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Joins}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterJoins(RALIParser.JoinsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Joins}
	 * labeled alternative in {@link RALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitJoins(RALIParser.JoinsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#joinsOperator}.
	 * @param ctx the parse tree
	 */
	void enterJoinsOperator(RALIParser.JoinsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#joinsOperator}.
	 * @param ctx the parse tree
	 */
	void exitJoinsOperator(RALIParser.JoinsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#diffUnionOperator}.
	 * @param ctx the parse tree
	 */
	void enterDiffUnionOperator(RALIParser.DiffUnionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#diffUnionOperator}.
	 * @param ctx the parse tree
	 */
	void exitDiffUnionOperator(RALIParser.DiffUnionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(RALIParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(RALIParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(RALIParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(RALIParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(RALIParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(RALIParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNegation(RALIParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNegation(RALIParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOr(RALIParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOr(RALIParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAnd(RALIParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAnd(RALIParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAtom(RALIParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAtom(RALIParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond(RALIParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link RALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond(RALIParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#atomicformula}.
	 * @param ctx the parse tree
	 */
	void enterAtomicformula(RALIParser.AtomicformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#atomicformula}.
	 * @param ctx the parse tree
	 */
	void exitAtomicformula(RALIParser.AtomicformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#attributeorvalue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeorvalue(RALIParser.AttributeorvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#attributeorvalue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeorvalue(RALIParser.AttributeorvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RALIParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(RALIParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RALIParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(RALIParser.ProjectionContext ctx);
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