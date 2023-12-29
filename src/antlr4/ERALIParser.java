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
		T__38=39, T__39=40, RESERVED=41, LABEL=42, INTEGER=43, DECIMAL=44, STRING=45, 
		DATE=46, WHITESPACE=47;
	public static final int
		RULE_statement = 0, RULE_expression = 1, RULE_distinct = 2, RULE_joinsOperator = 3, 
		RULE_diffUnionOperator = 4, RULE_selection = 5, RULE_rename = 6, RULE_alias = 7, 
		RULE_condition = 8, RULE_atomicformula = 9, RULE_attributeorvalue = 10, 
		RULE_projection = 11, RULE_projectionAttribute = 12, RULE_projectionExpression = 13, 
		RULE_sort = 14, RULE_inlinerelation = 15, RULE_attribute = 16, RULE_tuple = 17, 
		RULE_value = 18, RULE_null = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "expression", "distinct", "joinsOperator", "diffUnionOperator", 
			"selection", "rename", "alias", "condition", "atomicformula", "attributeorvalue", 
			"projection", "projectionAttribute", "projectionExpression", "sort", 
			"inlinerelation", "attribute", "tuple", "value", "null"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'INTERSECTION'", "'SET'", "'('", "')'", "'DISTINCT'", "'PRODUCT'", 
			"'JOIN'", "'DIVISION'", "'MINUS'", "'UNION'", "'SELECT'", "'RENAME'", 
			"','", "'<-'", "'NOT'", "'AND'", "'OR'", "'<'", "'<='", "'>'", "'>='", 
			"'<>'", "'PROJECT'", "'{'", "'}'", "'->'", "'*'", "'/'", "'+'", "'-'", 
			"'SORT'", "'['", "']'", "':'", "'STRING'", "'INTEGER'", "'DECIMAL'", 
			"'DATE'", "'NULL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "RESERVED", "LABEL", "INTEGER", "DECIMAL", 
			"STRING", "DATE", "WHITESPACE"
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
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((AssignmentContext)_localctx).label = match(LABEL);
				setState(41);
				match(T__0);
				setState(42);
				expression(0);
				}
				break;
			case 2:
				_localctx = new QueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				_localctx = new RelationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				match(LABEL);
				}
				break;
			case T__32:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				inlinerelation();
				}
				break;
			case T__23:
				{
				_localctx = new PiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				projection();
				}
				break;
			case T__31:
				{
				_localctx = new TauContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				sort();
				}
				break;
			case T__11:
				{
				_localctx = new SigmaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				selection();
				}
				break;
			case T__12:
				{
				_localctx = new RhoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				rename();
				}
				break;
			case T__5:
				{
				_localctx = new DeltaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				distinct();
				}
				break;
			case T__3:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(T__3);
				setState(55);
				expression(0);
				setState(56);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new JoinsContext(new ExpressionContext(_parentctx, _parentState));
						((JoinsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(61);
						((JoinsContext)_localctx).operator = joinsOperator();
						setState(63);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(62);
							((JoinsContext)_localctx).cond = condition(0);
							}
							break;
						}
						setState(65);
						((JoinsContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((IntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68);
						match(T__1);
						setState(69);
						((IntersectionContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new SetIntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((SetIntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(71);
						match(T__2);
						setState(72);
						match(T__1);
						setState(73);
						((SetIntersectionContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new DifferenceOrUnionContext(new ExpressionContext(_parentctx, _parentState));
						((DifferenceOrUnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(75);
						((DifferenceOrUnionContext)_localctx).operator = diffUnionOperator();
						setState(76);
						((DifferenceOrUnionContext)_localctx).right = expression(4);
						}
						break;
					case 5:
						{
						_localctx = new SetDifferenceOrUnionContext(new ExpressionContext(_parentctx, _parentState));
						((SetDifferenceOrUnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(79);
						match(T__2);
						setState(80);
						((SetDifferenceOrUnionContext)_localctx).operator = diffUnionOperator();
						setState(81);
						((SetDifferenceOrUnionContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(87);
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
			setState(88);
			match(T__5);
			setState(89);
			match(T__3);
			setState(90);
			expression(0);
			setState(91);
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__7);
				}
				break;
			case T__2:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(95);
					((JoinsOperatorContext)_localctx).set = match(T__2);
					}
				}

				setState(98);
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
			setState(101);
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
			setState(103);
			match(T__11);
			setState(104);
			condition(0);
			setState(105);
			match(T__3);
			setState(106);
			expression(0);
			setState(107);
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
			setState(109);
			match(T__12);
			setState(110);
			((RenameContext)_localctx).alias = alias();
			((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(111);
				match(T__13);
				setState(112);
				((RenameContext)_localctx).alias = alias();
				((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__3);
			setState(119);
			expression(0);
			setState(120);
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
			setState(122);
			match(LABEL);
			setState(123);
			match(T__14);
			setState(124);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case LABEL:
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				atomicformula();
				}
				break;
			case T__15:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(T__15);
				setState(129);
				((NegationContext)_localctx).cond = condition(4);
				}
				break;
			case T__3:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(T__3);
				setState(131);
				condition(0);
				setState(132);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(136);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(137);
						((AndContext)_localctx).op = match(T__16);
						setState(138);
						((AndContext)_localctx).right = condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(139);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(140);
						((OrContext)_localctx).op = match(T__17);
						setState(141);
						((OrContext)_localctx).right = condition(3);
						}
						break;
					}
					} 
				}
				setState(146);
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
			setState(147);
			((AtomicformulaContext)_localctx).left = attributeorvalue();
			setState(148);
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
			setState(149);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				setState(151);
				match(LABEL);
				}
				break;
			case T__39:
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				setState(152);
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
			setState(155);
			match(T__23);
			setState(156);
			match(T__24);
			setState(157);
			((ProjectionContext)_localctx).projectionAttribute = projectionAttribute();
			((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).projectionAttribute);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(158);
				match(T__13);
				setState(159);
				((ProjectionContext)_localctx).projectionAttribute = projectionAttribute();
				((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).projectionAttribute);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__25);
			setState(166);
			match(T__3);
			setState(167);
			expression(0);
			setState(168);
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
		enterRule(_localctx, 24, RULE_projectionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(170);
				((ProjectionAttributeContext)_localctx).exp = projectionExpression(0);
				setState(171);
				match(T__26);
				}
				break;
			}
			setState(175);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_projectionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(178);
				match(T__3);
				setState(179);
				projectionExpression(0);
				setState(180);
				match(T__4);
				}
				break;
			case LABEL:
			case INTEGER:
			case DECIMAL:
				{
				setState(182);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
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
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ProjectionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_projectionExpression);
						setState(185);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(186);
						((ProjectionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((ProjectionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						projectionExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new ProjectionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_projectionExpression);
						setState(188);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(189);
						((ProjectionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((ProjectionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						projectionExpression(4);
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 28, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__31);
			setState(197);
			match(T__24);
			setState(198);
			((SortContext)_localctx).LABEL = match(LABEL);
			((SortContext)_localctx).attributes.add(((SortContext)_localctx).LABEL);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(199);
				match(T__13);
				setState(200);
				((SortContext)_localctx).LABEL = match(LABEL);
				((SortContext)_localctx).attributes.add(((SortContext)_localctx).LABEL);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(T__25);
			setState(207);
			match(T__3);
			setState(208);
			expression(0);
			setState(209);
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
		enterRule(_localctx, 30, RULE_inlinerelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__32);
			setState(212);
			((InlinerelationContext)_localctx).attribute = attribute();
			((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(213);
				match(T__13);
				setState(214);
				((InlinerelationContext)_localctx).attribute = attribute();
				((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(T__33);
			setState(221);
			match(T__24);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(222);
				((InlinerelationContext)_localctx).tuple = tuple();
				((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(223);
					match(T__13);
					setState(224);
					((InlinerelationContext)_localctx).tuple = tuple();
					((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(232);
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
		enterRule(_localctx, 32, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((AttributeContext)_localctx).label = match(LABEL);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(235);
				match(T__34);
				setState(236);
				((AttributeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__3);
			setState(240);
			((TupleContext)_localctx).value = value();
			((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(241);
				match(T__13);
				setState(242);
				((TupleContext)_localctx).value = value();
				((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(DECIMAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(STRING);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(DATE);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
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
		enterRule(_localctx, 38, RULE_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__39);
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
		case 13:
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
		"\u0004\u0001/\u0104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000-\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001T\b\u0001\n\u0001\f\u0001"+
		"W\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003a\b\u0003\u0001\u0003"+
		"\u0003\u0003d\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006r\b\u0006\n\u0006\f\u0006u\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u008f\b\b\n\b\f\b\u0092\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0003\n\u009a\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a1\b\u000b\n\u000b\f\u000b"+
		"\u00a4\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00ae\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b8\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c0\b\r\n\r\f\r\u00c3\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ca\b\u000e"+
		"\n\u000e\f\u000e\u00cd\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00d8\b\u000f\n\u000f\f\u000f\u00db\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e2\b\u000f\n\u000f"+
		"\f\u000f\u00e5\t\u000f\u0003\u000f\u00e7\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ee\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f4\b\u0011\n\u0011"+
		"\f\u0011\u00f7\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0100\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0000\u0003\u0002\u0010\u001a\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0006\u0001\u0000\n\u000b\u0002\u0000\u0001\u0001\u0013\u0017"+
		"\u0001\u0000*,\u0001\u0000\u001c\u001d\u0001\u0000\u001e\u001f\u0001\u0000"+
		"$\'\u0115\u0000,\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000"+
		"\u0004X\u0001\u0000\u0000\u0000\u0006c\u0001\u0000\u0000\u0000\be\u0001"+
		"\u0000\u0000\u0000\ng\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000"+
		"\u000ez\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000\u0000\u0012"+
		"\u0093\u0001\u0000\u0000\u0000\u0014\u0099\u0001\u0000\u0000\u0000\u0016"+
		"\u009b\u0001\u0000\u0000\u0000\u0018\u00ad\u0001\u0000\u0000\u0000\u001a"+
		"\u00b7\u0001\u0000\u0000\u0000\u001c\u00c4\u0001\u0000\u0000\u0000\u001e"+
		"\u00d3\u0001\u0000\u0000\u0000 \u00ea\u0001\u0000\u0000\u0000\"\u00ef"+
		"\u0001\u0000\u0000\u0000$\u00ff\u0001\u0000\u0000\u0000&\u0101\u0001\u0000"+
		"\u0000\u0000()\u0005*\u0000\u0000)*\u0005\u0001\u0000\u0000*-\u0003\u0002"+
		"\u0001\u0000+-\u0003\u0002\u0001\u0000,(\u0001\u0000\u0000\u0000,+\u0001"+
		"\u0000\u0000\u0000-\u0001\u0001\u0000\u0000\u0000./\u0006\u0001\uffff"+
		"\uffff\u0000/;\u0005*\u0000\u00000;\u0003\u001e\u000f\u00001;\u0003\u0016"+
		"\u000b\u00002;\u0003\u001c\u000e\u00003;\u0003\n\u0005\u00004;\u0003\f"+
		"\u0006\u00005;\u0003\u0004\u0002\u000067\u0005\u0004\u0000\u000078\u0003"+
		"\u0002\u0001\u000089\u0005\u0005\u0000\u00009;\u0001\u0000\u0000\u0000"+
		":.\u0001\u0000\u0000\u0000:0\u0001\u0000\u0000\u0000:1\u0001\u0000\u0000"+
		"\u0000:2\u0001\u0000\u0000\u0000:3\u0001\u0000\u0000\u0000:4\u0001\u0000"+
		"\u0000\u0000:5\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000\u0000;U\u0001"+
		"\u0000\u0000\u0000<=\n\u0006\u0000\u0000=?\u0003\u0006\u0003\u0000>@\u0003"+
		"\u0010\b\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AB\u0003\u0002\u0001\u0007BT\u0001\u0000\u0000\u0000"+
		"CD\n\u0005\u0000\u0000DE\u0005\u0002\u0000\u0000ET\u0003\u0002\u0001\u0006"+
		"FG\n\u0004\u0000\u0000GH\u0005\u0003\u0000\u0000HI\u0005\u0002\u0000\u0000"+
		"IT\u0003\u0002\u0001\u0005JK\n\u0003\u0000\u0000KL\u0003\b\u0004\u0000"+
		"LM\u0003\u0002\u0001\u0004MT\u0001\u0000\u0000\u0000NO\n\u0002\u0000\u0000"+
		"OP\u0005\u0003\u0000\u0000PQ\u0003\b\u0004\u0000QR\u0003\u0002\u0001\u0003"+
		"RT\u0001\u0000\u0000\u0000S<\u0001\u0000\u0000\u0000SC\u0001\u0000\u0000"+
		"\u0000SF\u0001\u0000\u0000\u0000SJ\u0001\u0000\u0000\u0000SN\u0001\u0000"+
		"\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000V\u0003\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XY\u0005\u0006\u0000\u0000YZ\u0005\u0004\u0000\u0000Z[\u0003\u0002"+
		"\u0001\u0000[\\\u0005\u0005\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000"+
		"]d\u0005\u0007\u0000\u0000^d\u0005\b\u0000\u0000_a\u0005\u0003\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0005\t\u0000\u0000c]\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000"+
		"\u0000c`\u0001\u0000\u0000\u0000d\u0007\u0001\u0000\u0000\u0000ef\u0007"+
		"\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000gh\u0005\f\u0000\u0000hi"+
		"\u0003\u0010\b\u0000ij\u0005\u0004\u0000\u0000jk\u0003\u0002\u0001\u0000"+
		"kl\u0005\u0005\u0000\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0005\r\u0000"+
		"\u0000ns\u0003\u000e\u0007\u0000op\u0005\u000e\u0000\u0000pr\u0003\u000e"+
		"\u0007\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vw\u0005\u0004\u0000\u0000wx\u0003\u0002\u0001"+
		"\u0000xy\u0005\u0005\u0000\u0000y\r\u0001\u0000\u0000\u0000z{\u0005*\u0000"+
		"\u0000{|\u0005\u000f\u0000\u0000|}\u0005*\u0000\u0000}\u000f\u0001\u0000"+
		"\u0000\u0000~\u007f\u0006\b\uffff\uffff\u0000\u007f\u0087\u0003\u0012"+
		"\t\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0087\u0003\u0010\b"+
		"\u0004\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0084\u0003\u0010\b\u0000"+
		"\u0084\u0085\u0005\u0005\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086~\u0001\u0000\u0000\u0000\u0086\u0080\u0001\u0000\u0000\u0000\u0086"+
		"\u0082\u0001\u0000\u0000\u0000\u0087\u0090\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\n\u0003\u0000\u0000\u0089\u008a\u0005\u0011\u0000\u0000\u008a\u008f"+
		"\u0003\u0010\b\u0004\u008b\u008c\n\u0002\u0000\u0000\u008c\u008d\u0005"+
		"\u0012\u0000\u0000\u008d\u008f\u0003\u0010\b\u0003\u008e\u0088\u0001\u0000"+
		"\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0011\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0003\u0014\n\u0000\u0094\u0095\u0007\u0001\u0000"+
		"\u0000\u0095\u0096\u0003\u0014\n\u0000\u0096\u0013\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0005*\u0000\u0000\u0098\u009a\u0003$\u0012\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u0015"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0018\u0000\u0000\u009c\u009d"+
		"\u0005\u0019\u0000\u0000\u009d\u00a2\u0003\u0018\f\u0000\u009e\u009f\u0005"+
		"\u000e\u0000\u0000\u009f\u00a1\u0003\u0018\f\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u001a"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7\u00a8\u0003\u0002"+
		"\u0001\u0000\u00a8\u00a9\u0005\u0005\u0000\u0000\u00a9\u0017\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00ac\u0005\u001b\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005*\u0000\u0000\u00b0\u0019\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0006\r\uffff\uffff\u0000\u00b2\u00b3\u0005\u0004\u0000\u0000"+
		"\u00b3\u00b4\u0003\u001a\r\u0000\u00b4\u00b5\u0005\u0005\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b8\u0007\u0002\u0000\u0000\u00b7"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00c1\u0001\u0000\u0000\u0000\u00b9\u00ba\n\u0004\u0000\u0000\u00ba\u00bb"+
		"\u0007\u0003\u0000\u0000\u00bb\u00c0\u0003\u001a\r\u0005\u00bc\u00bd\n"+
		"\u0003\u0000\u0000\u00bd\u00be\u0007\u0004\u0000\u0000\u00be\u00c0\u0003"+
		"\u001a\r\u0004\u00bf\u00b9\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u001b\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005 \u0000"+
		"\u0000\u00c5\u00c6\u0005\u0019\u0000\u0000\u00c6\u00cb\u0005*\u0000\u0000"+
		"\u00c7\u00c8\u0005\u000e\u0000\u0000\u00c8\u00ca\u0005*\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005\u001a\u0000\u0000\u00cf\u00d0\u0005\u0004\u0000\u0000\u00d0"+
		"\u00d1\u0003\u0002\u0001\u0000\u00d1\u00d2\u0005\u0005\u0000\u0000\u00d2"+
		"\u001d\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005!\u0000\u0000\u00d4\u00d9"+
		"\u0003 \u0010\u0000\u00d5\u00d6\u0005\u000e\u0000\u0000\u00d6\u00d8\u0003"+
		" \u0010\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005\"\u0000\u0000\u00dd\u00e6\u0005\u0019\u0000"+
		"\u0000\u00de\u00e3\u0003\"\u0011\u0000\u00df\u00e0\u0005\u000e\u0000\u0000"+
		"\u00e0\u00e2\u0003\"\u0011\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e6\u00de\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\u001a\u0000\u0000\u00e9\u001f\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0005*\u0000\u0000\u00eb\u00ec\u0005#\u0000\u0000\u00ec\u00ee\u0007"+
		"\u0005\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0004"+
		"\u0000\u0000\u00f0\u00f5\u0003$\u0012\u0000\u00f1\u00f2\u0005\u000e\u0000"+
		"\u0000\u00f2\u00f4\u0003$\u0012\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0005\u0000\u0000"+
		"\u00f9#\u0001\u0000\u0000\u0000\u00fa\u0100\u0005+\u0000\u0000\u00fb\u0100"+
		"\u0005,\u0000\u0000\u00fc\u0100\u0005-\u0000\u0000\u00fd\u0100\u0005."+
		"\u0000\u0000\u00fe\u0100\u0003&\u0013\u0000\u00ff\u00fa\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fb\u0001\u0000\u0000\u0000\u00ff\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100%\u0001\u0000\u0000\u0000\u0101\u0102\u0005(\u0000\u0000\u0102"+
		"\'\u0001\u0000\u0000\u0000\u0018,:?SU`cs\u0086\u008e\u0090\u0099\u00a2"+
		"\u00ad\u00b7\u00bf\u00c1\u00cb\u00d9\u00e3\u00e6\u00ed\u00f5\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}