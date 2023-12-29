// Generated from antlr4\ERALI.g4 by ANTLR 4.12.0
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ERALIParser}.
 */
public interface ERALIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ERALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ERALIParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ERALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ERALIParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Query}
	 * labeled alternative in {@link ERALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ERALIParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Query}
	 * labeled alternative in {@link ERALIParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ERALIParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntersection(ERALIParser.IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntersection(ERALIParser.IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ERALIParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ERALIParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(ERALIParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(ERALIParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sigma}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSigma(ERALIParser.SigmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sigma}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSigma(ERALIParser.SigmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetIntersection}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetIntersection(ERALIParser.SetIntersectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetIntersection}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetIntersection(ERALIParser.SetIntersectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tau}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTau(ERALIParser.TauContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tau}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTau(ERALIParser.TauContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetDifferenceOrUnion}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetDifferenceOrUnion(ERALIParser.SetDifferenceOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetDifferenceOrUnion}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetDifferenceOrUnion(ERALIParser.SetDifferenceOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Joins}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterJoins(ERALIParser.JoinsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Joins}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitJoins(ERALIParser.JoinsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Gamma}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGamma(ERALIParser.GammaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Gamma}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGamma(ERALIParser.GammaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relation}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ERALIParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relation}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ERALIParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Delta}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDelta(ERALIParser.DeltaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Delta}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDelta(ERALIParser.DeltaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rho}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRho(ERALIParser.RhoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rho}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRho(ERALIParser.RhoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DifferenceOrUnion}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceOrUnion(ERALIParser.DifferenceOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DifferenceOrUnion}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceOrUnion(ERALIParser.DifferenceOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pi}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPi(ERALIParser.PiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pi}
	 * labeled alternative in {@link ERALIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPi(ERALIParser.PiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(ERALIParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(ERALIParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#joinsOperator}.
	 * @param ctx the parse tree
	 */
	void enterJoinsOperator(ERALIParser.JoinsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#joinsOperator}.
	 * @param ctx the parse tree
	 */
	void exitJoinsOperator(ERALIParser.JoinsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#diffUnionOperator}.
	 * @param ctx the parse tree
	 */
	void enterDiffUnionOperator(ERALIParser.DiffUnionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#diffUnionOperator}.
	 * @param ctx the parse tree
	 */
	void exitDiffUnionOperator(ERALIParser.DiffUnionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(ERALIParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(ERALIParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(ERALIParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(ERALIParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(ERALIParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(ERALIParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNegation(ERALIParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNegation(ERALIParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOr(ERALIParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOr(ERALIParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ERALIParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ERALIParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ERALIParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ERALIParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond(ERALIParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ERALIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond(ERALIParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#atomicformula}.
	 * @param ctx the parse tree
	 */
	void enterAtomicformula(ERALIParser.AtomicformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#atomicformula}.
	 * @param ctx the parse tree
	 */
	void exitAtomicformula(ERALIParser.AtomicformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#attributeorvalue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeorvalue(ERALIParser.AttributeorvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#attributeorvalue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeorvalue(ERALIParser.AttributeorvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(ERALIParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(ERALIParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(ERALIParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(ERALIParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#aggregationOperation}.
	 * @param ctx the parse tree
	 */
	void enterAggregationOperation(ERALIParser.AggregationOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#aggregationOperation}.
	 * @param ctx the parse tree
	 */
	void exitAggregationOperation(ERALIParser.AggregationOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#projectionAttribute}.
	 * @param ctx the parse tree
	 */
	void enterProjectionAttribute(ERALIParser.ProjectionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#projectionAttribute}.
	 * @param ctx the parse tree
	 */
	void exitProjectionAttribute(ERALIParser.ProjectionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#projectionExpression}.
	 * @param ctx the parse tree
	 */
	void enterProjectionExpression(ERALIParser.ProjectionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#projectionExpression}.
	 * @param ctx the parse tree
	 */
	void exitProjectionExpression(ERALIParser.ProjectionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(ERALIParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(ERALIParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#inlinerelation}.
	 * @param ctx the parse tree
	 */
	void enterInlinerelation(ERALIParser.InlinerelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#inlinerelation}.
	 * @param ctx the parse tree
	 */
	void exitInlinerelation(ERALIParser.InlinerelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ERALIParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ERALIParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(ERALIParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(ERALIParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ERALIParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ERALIParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ERALIParser#null}.
	 * @param ctx the parse tree
	 */
	void enterNull(ERALIParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by {@link ERALIParser#null}.
	 * @param ctx the parse tree
	 */
	void exitNull(ERALIParser.NullContext ctx);
}