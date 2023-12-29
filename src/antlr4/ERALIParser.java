// Generated from antlr4\ERALI.g4 by ANTLR 4.12.0
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ERALIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, RESERVED=47, LABEL=48, INTEGER=49, DECIMAL=50, STRING=51, DATE=52, 
		WHITESPACE=53;
	public static final int
		RULE_statement = 0, RULE_expression = 1, RULE_distinct = 2, RULE_joinsOperator = 3, 
		RULE_diffUnionOperator = 4, RULE_selection = 5, RULE_rename = 6, RULE_alias = 7, 
		RULE_condition = 8, RULE_atomicformula = 9, RULE_attributeorvalue = 10, 
		RULE_projection = 11, RULE_aggregation = 12, RULE_aggregationOperation = 13, 
		RULE_projectionAttribute = 14, RULE_projectionExpression = 15, RULE_sort = 16, 
		RULE_inlinerelation = 17, RULE_attribute = 18, RULE_tuple = 19, RULE_value = 20, 
		RULE_null = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "expression", "distinct", "joinsOperator", "diffUnionOperator", 
			"selection", "rename", "alias", "condition", "atomicformula", "attributeorvalue", 
			"projection", "aggregation", "aggregationOperation", "projectionAttribute", 
			"projectionExpression", "sort", "inlinerelation", "attribute", "tuple", 
			"value", "null"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'INTERSECTION'", "'SET'", "'('", "')'", "'DISTINCT'", "'PRODUCT'", 
			"'JOIN'", "'DIVISION'", "'MINUS'", "'UNION'", "'SELECT'", "'RENAME'", 
			"','", "'<-'", "'NOT'", "'AND'", "'OR'", "'<'", "'<='", "'>'", "'>='", 
			"'<>'", "'PROJECT'", "'{'", "'}'", "'GROUP'", "'->'", "'AVG'", "'SUM'", 
			"'MIN'", "'MAX'", "'COUNT'", "'*'", "'/'", "'+'", "'-'", "'SORT'", "'['", 
			"']'", "':'", "'STRING'", "'INTEGER'", "'DECIMAL'", "'DATE'", "'NULL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "RESERVED", 
			"LABEL", "INTEGER", "DECIMAL", "STRING", "DATE", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ERALI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ERALIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends StatementContext {
		public Token label;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(ERALIParser.LABEL, 0); }
		public AssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((AssignmentContext)_localctx).label = match(LABEL);
				setState(45);
				match(T__0);
				setState(46);
				expression(0);
				}
				break;
			case 2:
				_localctx = new QueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntersectionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntersectionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterIntersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitIntersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitIntersection(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ExpressionContext {
		public InlinerelationContext inlinerelation() {
			return getRuleContext(InlinerelationContext.class,0);
		}
		public ConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SigmaContext extends ExpressionContext {
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public SigmaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterSigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitSigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitSigma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetIntersectionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetIntersectionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterSetIntersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitSetIntersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitSetIntersection(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TauContext extends ExpressionContext {
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public TauContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterTau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitTau(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitTau(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetDifferenceOrUnionContext extends ExpressionContext {
		public ExpressionContext left;
		public DiffUnionOperatorContext operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DiffUnionOperatorContext diffUnionOperator() {
			return getRuleContext(DiffUnionOperatorContext.class,0);
		}
		public SetDifferenceOrUnionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterSetDifferenceOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitSetDifferenceOrUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitSetDifferenceOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JoinsContext extends ExpressionContext {
		public ExpressionContext left;
		public JoinsOperatorContext operator;
		public ConditionContext cond;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public JoinsOperatorContext joinsOperator() {
			return getRuleContext(JoinsOperatorContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public JoinsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterJoins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitJoins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitJoins(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GammaContext extends ExpressionContext {
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public GammaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterGamma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitGamma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitGamma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ExpressionContext {
		public TerminalNode LABEL() { return getToken(ERALIParser.LABEL, 0); }
		public RelationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeltaContext extends ExpressionContext {
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public DeltaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterDelta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitDelta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitDelta(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RhoContext extends ExpressionContext {
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public RhoContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterRho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitRho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitRho(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DifferenceOrUnionContext extends ExpressionContext {
		public ExpressionContext left;
		public DiffUnionOperatorContext operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DiffUnionOperatorContext diffUnionOperator() {
			return getRuleContext(DiffUnionOperatorContext.class,0);
		}
		public DifferenceOrUnionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterDifferenceOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitDifferenceOrUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitDifferenceOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PiContext extends ExpressionContext {
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public PiContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitPi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitPi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				_localctx = new RelationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(LABEL);
				}
				break;
			case T__38:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				inlinerelation();
				}
				break;
			case T__23:
				{
				_localctx = new PiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				projection();
				}
				break;
			case T__26:
				{
				_localctx = new GammaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				aggregation();
				}
				break;
			case T__37:
				{
				_localctx = new TauContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				sort();
				}
				break;
			case T__11:
				{
				_localctx = new SigmaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				selection();
				}
				break;
			case T__12:
				{
				_localctx = new RhoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				rename();
				}
				break;
			case T__5:
				{
				_localctx = new DeltaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				distinct();
				}
				break;
			case T__3:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__3);
				setState(60);
				expression(0);
				setState(61);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new JoinsContext(new ExpressionContext(_parentctx, _parentState));
						((JoinsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(66);
						((JoinsContext)_localctx).operator = joinsOperator();
						setState(68);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(67);
							((JoinsContext)_localctx).cond = condition(0);
							}
							break;
						}
						setState(70);
						((JoinsContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((IntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(73);
						match(T__1);
						setState(74);
						((IntersectionContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new SetIntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((SetIntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(76);
						match(T__2);
						setState(77);
						match(T__1);
						setState(78);
						((SetIntersectionContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new DifferenceOrUnionContext(new ExpressionContext(_parentctx, _parentState));
						((DifferenceOrUnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(80);
						((DifferenceOrUnionContext)_localctx).operator = diffUnionOperator();
						setState(81);
						((DifferenceOrUnionContext)_localctx).right = expression(4);
						}
						break;
					case 5:
						{
						_localctx = new SetDifferenceOrUnionContext(new ExpressionContext(_parentctx, _parentState));
						((SetDifferenceOrUnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(84);
						match(T__2);
						setState(85);
						((SetDifferenceOrUnionContext)_localctx).operator = diffUnionOperator();
						setState(86);
						((SetDifferenceOrUnionContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DistinctContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__5);
			setState(94);
			match(T__3);
			setState(95);
			expression(0);
			setState(96);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinsOperatorContext extends ParserRuleContext {
		public Token set;
		public JoinsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinsOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterJoinsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitJoinsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitJoinsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinsOperatorContext joinsOperator() throws RecognitionException {
		JoinsOperatorContext _localctx = new JoinsOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_joinsOperator);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__7);
				}
				break;
			case T__2:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(100);
					((JoinsOperatorContext)_localctx).set = match(T__2);
					}
				}

				setState(103);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiffUnionOperatorContext extends ParserRuleContext {
		public DiffUnionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diffUnionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterDiffUnionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitDiffUnionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitDiffUnionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiffUnionOperatorContext diffUnionOperator() throws RecognitionException {
		DiffUnionOperatorContext _localctx = new DiffUnionOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_diffUnionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__11);
			setState(109);
			condition(0);
			setState(110);
			match(T__3);
			setState(111);
			expression(0);
			setState(112);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RenameContext extends ParserRuleContext {
		public AliasContext alias;
		public List<AliasContext> aliases = new ArrayList<AliasContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__12);
			setState(115);
			((RenameContext)_localctx).alias = alias();
			((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(116);
				match(T__13);
				setState(117);
				((RenameContext)_localctx).alias = alias();
				((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__3);
			setState(124);
			expression(0);
			setState(125);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(ERALIParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(ERALIParser.LABEL, i);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LABEL);
			setState(128);
			match(T__14);
			setState(129);
			match(LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ConditionContext {
		public ConditionContext cond;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NegationContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ConditionContext {
		public ConditionContext left;
		public Token op;
		public ConditionContext right;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public OrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ConditionContext {
		public ConditionContext left;
		public Token op;
		public ConditionContext right;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public AndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ConditionContext {
		public AtomicformulaContext atomicformula() {
			return getRuleContext(AtomicformulaContext.class,0);
		}
		public AtomContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case LABEL:
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				atomicformula();
				}
				break;
			case T__15:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(T__15);
				setState(134);
				((NegationContext)_localctx).cond = condition(4);
				}
				break;
			case T__3:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__3);
				setState(136);
				condition(0);
				setState(137);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						((AndContext)_localctx).op = match(T__16);
						setState(143);
						((AndContext)_localctx).right = condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(144);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(145);
						((OrContext)_localctx).op = match(T__17);
						setState(146);
						((OrContext)_localctx).right = condition(3);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicformulaContext extends ParserRuleContext {
		public AttributeorvalueContext left;
		public Token op;
		public AttributeorvalueContext right;
		public List<AttributeorvalueContext> attributeorvalue() {
			return getRuleContexts(AttributeorvalueContext.class);
		}
		public AttributeorvalueContext attributeorvalue(int i) {
			return getRuleContext(AttributeorvalueContext.class,i);
		}
		public AtomicformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAtomicformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAtomicformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAtomicformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicformulaContext atomicformula() throws RecognitionException {
		AtomicformulaContext _localctx = new AtomicformulaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atomicformula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((AtomicformulaContext)_localctx).left = attributeorvalue();
			setState(153);
			((AtomicformulaContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252930L) != 0)) ) {
				((AtomicformulaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
			((AtomicformulaContext)_localctx).right = attributeorvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeorvalueContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(ERALIParser.LABEL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeorvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeorvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAttributeorvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAttributeorvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAttributeorvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeorvalueContext attributeorvalue() throws RecognitionException {
		AttributeorvalueContext _localctx = new AttributeorvalueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeorvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				setState(156);
				match(LABEL);
				}
				break;
			case T__45:
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				setState(157);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionContext extends ParserRuleContext {
		public ProjectionAttributeContext projectionAttribute;
		public List<ProjectionAttributeContext> attributes = new ArrayList<ProjectionAttributeContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ProjectionAttributeContext> projectionAttribute() {
			return getRuleContexts(ProjectionAttributeContext.class);
		}
		public ProjectionAttributeContext projectionAttribute(int i) {
			return getRuleContext(ProjectionAttributeContext.class,i);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__23);
			setState(161);
			match(T__24);
			setState(162);
			((ProjectionContext)_localctx).projectionAttribute = projectionAttribute();
			((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).projectionAttribute);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(163);
				match(T__13);
				setState(164);
				((ProjectionContext)_localctx).projectionAttribute = projectionAttribute();
				((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).projectionAttribute);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__25);
			setState(171);
			match(T__3);
			setState(172);
			expression(0);
			setState(173);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationContext extends ParserRuleContext {
		public Token by;
		public Token attributename;
		public AggregationOperationContext aggregationOperation() {
			return getRuleContext(AggregationOperationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LABEL() { return getTokens(ERALIParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(ERALIParser.LABEL, i);
		}
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__26);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(176);
				((AggregationContext)_localctx).by = match(LABEL);
				setState(177);
				match(T__13);
				}
			}

			setState(180);
			aggregationOperation();
			setState(181);
			match(T__27);
			setState(182);
			((AggregationContext)_localctx).attributename = match(LABEL);
			setState(183);
			match(T__3);
			setState(184);
			expression(0);
			setState(185);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationOperationContext extends ParserRuleContext {
		public Token op;
		public ProjectionExpressionContext projectionExpression() {
			return getRuleContext(ProjectionExpressionContext.class,0);
		}
		public AggregationOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAggregationOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAggregationOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAggregationOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationOperationContext aggregationOperation() throws RecognitionException {
		AggregationOperationContext _localctx = new AggregationOperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aggregationOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((AggregationOperationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) ) {
				((AggregationOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(188);
			match(T__3);
			setState(189);
			projectionExpression(0);
			setState(190);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionAttributeContext extends ParserRuleContext {
		public ProjectionExpressionContext exp;
		public Token attributename;
		public TerminalNode LABEL() { return getToken(ERALIParser.LABEL, 0); }
		public ProjectionExpressionContext projectionExpression() {
			return getRuleContext(ProjectionExpressionContext.class,0);
		}
		public ProjectionAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterProjectionAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitProjectionAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitProjectionAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionAttributeContext projectionAttribute() throws RecognitionException {
		ProjectionAttributeContext _localctx = new ProjectionAttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_projectionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(192);
				((ProjectionAttributeContext)_localctx).exp = projectionExpression(0);
				setState(193);
				match(T__27);
				}
				break;
			}
			setState(197);
			((ProjectionAttributeContext)_localctx).attributename = match(LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionExpressionContext extends ParserRuleContext {
		public Token op;
		public List<ProjectionExpressionContext> projectionExpression() {
			return getRuleContexts(ProjectionExpressionContext.class);
		}
		public ProjectionExpressionContext projectionExpression(int i) {
			return getRuleContext(ProjectionExpressionContext.class,i);
		}
		public TerminalNode LABEL() { return getToken(ERALIParser.LABEL, 0); }
		public TerminalNode DECIMAL() { return getToken(ERALIParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(ERALIParser.INTEGER, 0); }
		public ProjectionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterProjectionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitProjectionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitProjectionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionExpressionContext projectionExpression() throws RecognitionException {
		return projectionExpression(0);
	}

	private ProjectionExpressionContext projectionExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProjectionExpressionContext _localctx = new ProjectionExpressionContext(_ctx, _parentState);
		ProjectionExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_projectionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(200);
				match(T__3);
				setState(201);
				projectionExpression(0);
				setState(202);
				match(T__4);
				}
				break;
			case LABEL:
			case INTEGER:
			case DECIMAL:
				{
				setState(204);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ProjectionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_projectionExpression);
						setState(207);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(208);
						((ProjectionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((ProjectionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						projectionExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new ProjectionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_projectionExpression);
						setState(210);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(211);
						((ProjectionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ProjectionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						projectionExpression(4);
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortContext extends ParserRuleContext {
		public Token LABEL;
		public List<Token> attributes = new ArrayList<Token>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LABEL() { return getTokens(ERALIParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(ERALIParser.LABEL, i);
		}
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__37);
			setState(219);
			match(T__24);
			setState(220);
			((SortContext)_localctx).LABEL = match(LABEL);
			((SortContext)_localctx).attributes.add(((SortContext)_localctx).LABEL);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(221);
				match(T__13);
				setState(222);
				((SortContext)_localctx).LABEL = match(LABEL);
				((SortContext)_localctx).attributes.add(((SortContext)_localctx).LABEL);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(T__25);
			setState(229);
			match(T__3);
			setState(230);
			expression(0);
			setState(231);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlinerelationContext extends ParserRuleContext {
		public AttributeContext attribute;
		public List<AttributeContext> attributes = new ArrayList<AttributeContext>();
		public TupleContext tuple;
		public List<TupleContext> tuples = new ArrayList<TupleContext>();
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TupleContext> tuple() {
			return getRuleContexts(TupleContext.class);
		}
		public TupleContext tuple(int i) {
			return getRuleContext(TupleContext.class,i);
		}
		public InlinerelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlinerelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterInlinerelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitInlinerelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitInlinerelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlinerelationContext inlinerelation() throws RecognitionException {
		InlinerelationContext _localctx = new InlinerelationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inlinerelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__38);
			setState(234);
			((InlinerelationContext)_localctx).attribute = attribute();
			((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(235);
				match(T__13);
				setState(236);
				((InlinerelationContext)_localctx).attribute = attribute();
				((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__39);
			setState(243);
			match(T__24);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(244);
				((InlinerelationContext)_localctx).tuple = tuple();
				((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(245);
					match(T__13);
					setState(246);
					((InlinerelationContext)_localctx).tuple = tuple();
					((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(254);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public Token label;
		public Token type;
		public TerminalNode LABEL() { return getToken(ERALIParser.LABEL, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((AttributeContext)_localctx).label = match(LABEL);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(257);
				match(T__40);
				setState(258);
				((AttributeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970697666560L) != 0)) ) {
					((AttributeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ParserRuleContext {
		public ValueContext value;
		public List<ValueContext> values = new ArrayList<ValueContext>();
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__3);
			setState(262);
			((TupleContext)_localctx).value = value();
			((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(263);
				match(T__13);
				setState(264);
				((TupleContext)_localctx).value = value();
				((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ERALIParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(ERALIParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(ERALIParser.STRING, 0); }
		public TerminalNode DATE() { return getToken(ERALIParser.DATE, 0); }
		public NullContext null_() {
			return getRuleContext(NullContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(DECIMAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(STRING);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(DATE);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				null_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends ParserRuleContext {
		public NullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullContext null_() throws RecognitionException {
		NullContext _localctx = new NullContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 8:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 15:
			return projectionExpression_sempred((ProjectionExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean projectionExpression_sempred(ProjectionExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u011a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00001\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001E\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001Y\b\u0001\n\u0001\f\u0001\\\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003f\b\u0003\u0001\u0003\u0003\u0003"+
		"i\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006w\b\u0006\n\u0006\f\u0006z\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u008c\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0094\b\b\n\b\f\b\u0097\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0003\n\u009f\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00a6\b\u000b\n\u000b\f\u000b\u00a9\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00b3\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00c4\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00ce\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00d6\b\u000f\n\u000f\f\u000f\u00d9\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e0"+
		"\b\u0010\n\u0010\f\u0010\u00e3\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00ee\b\u0011\n\u0011\f\u0011\u00f1\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f8\b\u0011\n"+
		"\u0011\f\u0011\u00fb\t\u0011\u0003\u0011\u00fd\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0104\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u010a\b\u0013\n"+
		"\u0013\f\u0013\u010d\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0116\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0000\u0003\u0002\u0010\u001e\u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0007\u0001\u0000\n\u000b\u0002\u0000\u0001\u0001"+
		"\u0013\u0017\u0001\u0000\u001d!\u0001\u000002\u0001\u0000\"#\u0001\u0000"+
		"$%\u0001\u0000*-\u012b\u00000\u0001\u0000\u0000\u0000\u0002?\u0001\u0000"+
		"\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000"+
		"\bj\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\fr\u0001\u0000"+
		"\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000"+
		"\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000"+
		"\u0000\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00af\u0001\u0000"+
		"\u0000\u0000\u001a\u00bb\u0001\u0000\u0000\u0000\u001c\u00c3\u0001\u0000"+
		"\u0000\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00da\u0001\u0000\u0000"+
		"\u0000\"\u00e9\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000"+
		"&\u0105\u0001\u0000\u0000\u0000(\u0115\u0001\u0000\u0000\u0000*\u0117"+
		"\u0001\u0000\u0000\u0000,-\u00050\u0000\u0000-.\u0005\u0001\u0000\u0000"+
		".1\u0003\u0002\u0001\u0000/1\u0003\u0002\u0001\u00000,\u0001\u0000\u0000"+
		"\u00000/\u0001\u0000\u0000\u00001\u0001\u0001\u0000\u0000\u000023\u0006"+
		"\u0001\uffff\uffff\u00003@\u00050\u0000\u00004@\u0003\"\u0011\u00005@"+
		"\u0003\u0016\u000b\u00006@\u0003\u0018\f\u00007@\u0003 \u0010\u00008@"+
		"\u0003\n\u0005\u00009@\u0003\f\u0006\u0000:@\u0003\u0004\u0002\u0000;"+
		"<\u0005\u0004\u0000\u0000<=\u0003\u0002\u0001\u0000=>\u0005\u0005\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?2\u0001\u0000\u0000\u0000?4\u0001\u0000"+
		"\u0000\u0000?5\u0001\u0000\u0000\u0000?6\u0001\u0000\u0000\u0000?7\u0001"+
		"\u0000\u0000\u0000?8\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000"+
		"?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000@Z\u0001\u0000\u0000"+
		"\u0000AB\n\u0006\u0000\u0000BD\u0003\u0006\u0003\u0000CE\u0003\u0010\b"+
		"\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0003\u0002\u0001\u0007GY\u0001\u0000\u0000\u0000HI\n\u0005"+
		"\u0000\u0000IJ\u0005\u0002\u0000\u0000JY\u0003\u0002\u0001\u0006KL\n\u0004"+
		"\u0000\u0000LM\u0005\u0003\u0000\u0000MN\u0005\u0002\u0000\u0000NY\u0003"+
		"\u0002\u0001\u0005OP\n\u0003\u0000\u0000PQ\u0003\b\u0004\u0000QR\u0003"+
		"\u0002\u0001\u0004RY\u0001\u0000\u0000\u0000ST\n\u0002\u0000\u0000TU\u0005"+
		"\u0003\u0000\u0000UV\u0003\b\u0004\u0000VW\u0003\u0002\u0001\u0003WY\u0001"+
		"\u0000\u0000\u0000XA\u0001\u0000\u0000\u0000XH\u0001\u0000\u0000\u0000"+
		"XK\u0001\u0000\u0000\u0000XO\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u0003\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]^\u0005\u0006\u0000\u0000^_\u0005\u0004\u0000\u0000_`\u0003\u0002\u0001"+
		"\u0000`a\u0005\u0005\u0000\u0000a\u0005\u0001\u0000\u0000\u0000bi\u0005"+
		"\u0007\u0000\u0000ci\u0005\b\u0000\u0000df\u0005\u0003\u0000\u0000ed\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gi\u0005\t\u0000\u0000hb\u0001\u0000\u0000\u0000hc\u0001\u0000\u0000\u0000"+
		"he\u0001\u0000\u0000\u0000i\u0007\u0001\u0000\u0000\u0000jk\u0007\u0000"+
		"\u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0005\f\u0000\u0000mn\u0003"+
		"\u0010\b\u0000no\u0005\u0004\u0000\u0000op\u0003\u0002\u0001\u0000pq\u0005"+
		"\u0005\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0005\r\u0000\u0000"+
		"sx\u0003\u000e\u0007\u0000tu\u0005\u000e\u0000\u0000uw\u0003\u000e\u0007"+
		"\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{|\u0005\u0004\u0000\u0000|}\u0003\u0002\u0001\u0000"+
		"}~\u0005\u0005\u0000\u0000~\r\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"0\u0000\u0000\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u0082\u00050\u0000"+
		"\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0084\u0006\b\uffff\uffff"+
		"\u0000\u0084\u008c\u0003\u0012\t\u0000\u0085\u0086\u0005\u0010\u0000\u0000"+
		"\u0086\u008c\u0003\u0010\b\u0004\u0087\u0088\u0005\u0004\u0000\u0000\u0088"+
		"\u0089\u0003\u0010\b\u0000\u0089\u008a\u0005\u0005\u0000\u0000\u008a\u008c"+
		"\u0001\u0000\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u0085"+
		"\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008c\u0095"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\n\u0003\u0000\u0000\u008e\u008f\u0005"+
		"\u0011\u0000\u0000\u008f\u0094\u0003\u0010\b\u0004\u0090\u0091\n\u0002"+
		"\u0000\u0000\u0091\u0092\u0005\u0012\u0000\u0000\u0092\u0094\u0003\u0010"+
		"\b\u0003\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0011\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0014\n\u0000"+
		"\u0099\u009a\u0007\u0001\u0000\u0000\u009a\u009b\u0003\u0014\n\u0000\u009b"+
		"\u0013\u0001\u0000\u0000\u0000\u009c\u009f\u00050\u0000\u0000\u009d\u009f"+
		"\u0003(\u0014\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"\u0018\u0000\u0000\u00a1\u00a2\u0005\u0019\u0000\u0000\u00a2\u00a7\u0003"+
		"\u001c\u000e\u0000\u00a3\u00a4\u0005\u000e\u0000\u0000\u00a4\u00a6\u0003"+
		"\u001c\u000e\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\u001a\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0004\u0000\u0000\u00ac\u00ad\u0003\u0002\u0001\u0000\u00ad\u00ae\u0005"+
		"\u0005\u0000\u0000\u00ae\u0017\u0001\u0000\u0000\u0000\u00af\u00b2\u0005"+
		"\u001b\u0000\u0000\u00b0\u00b1\u00050\u0000\u0000\u00b1\u00b3\u0005\u000e"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u001a"+
		"\r\u0000\u00b5\u00b6\u0005\u001c\u0000\u0000\u00b6\u00b7\u00050\u0000"+
		"\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000\u00b8\u00b9\u0003\u0002\u0001"+
		"\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u0019\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0007\u0002\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000"+
		"\u0000\u00bd\u00be\u0003\u001e\u000f\u0000\u00be\u00bf\u0005\u0005\u0000"+
		"\u0000\u00bf\u001b\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003\u001e\u000f"+
		"\u0000\u00c1\u00c2\u0005\u001c\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u00050\u0000\u0000"+
		"\u00c6\u001d\u0001\u0000\u0000\u0000\u00c7\u00c8\u0006\u000f\uffff\uffff"+
		"\u0000\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9\u00ca\u0003\u001e\u000f"+
		"\u0000\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0007\u0003\u0000\u0000\u00cd\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d7\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\n\u0004\u0000\u0000\u00d0\u00d1\u0007\u0004\u0000\u0000"+
		"\u00d1\u00d6\u0003\u001e\u000f\u0005\u00d2\u00d3\n\u0003\u0000\u0000\u00d3"+
		"\u00d4\u0007\u0005\u0000\u0000\u00d4\u00d6\u0003\u001e\u000f\u0004\u00d5"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u001f\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005&\u0000\u0000\u00db\u00dc"+
		"\u0005\u0019\u0000\u0000\u00dc\u00e1\u00050\u0000\u0000\u00dd\u00de\u0005"+
		"\u000e\u0000\u0000\u00de\u00e0\u00050\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u001a"+
		"\u0000\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7\u0003\u0002"+
		"\u0001\u0000\u00e7\u00e8\u0005\u0005\u0000\u0000\u00e8!\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\'\u0000\u0000\u00ea\u00ef\u0003$\u0012\u0000"+
		"\u00eb\u00ec\u0005\u000e\u0000\u0000\u00ec\u00ee\u0003$\u0012\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005(\u0000\u0000\u00f3\u00fc\u0005\u0019\u0000\u0000\u00f4\u00f9"+
		"\u0003&\u0013\u0000\u00f5\u00f6\u0005\u000e\u0000\u0000\u00f6\u00f8\u0003"+
		"&\u0013\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u001a"+
		"\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u0103\u00050\u0000\u0000"+
		"\u0101\u0102\u0005)\u0000\u0000\u0102\u0104\u0007\u0006\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"%\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u0004\u0000\u0000\u0106\u010b"+
		"\u0003(\u0014\u0000\u0107\u0108\u0005\u000e\u0000\u0000\u0108\u010a\u0003"+
		"(\u0014\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\u0005\u0000\u0000\u010f\'\u0001\u0000\u0000"+
		"\u0000\u0110\u0116\u00051\u0000\u0000\u0111\u0116\u00052\u0000\u0000\u0112"+
		"\u0116\u00053\u0000\u0000\u0113\u0116\u00054\u0000\u0000\u0114\u0116\u0003"+
		"*\u0015\u0000\u0115\u0110\u0001\u0000\u0000\u0000\u0115\u0111\u0001\u0000"+
		"\u0000\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116)\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005.\u0000\u0000\u0118+\u0001\u0000\u0000\u0000\u0019"+
		"0?DXZehx\u008b\u0093\u0095\u009e\u00a7\u00b2\u00c3\u00cd\u00d5\u00d7\u00e1"+
		"\u00ef\u00f9\u00fc\u0103\u010b\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}