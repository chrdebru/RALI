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
		T__31=32, RESERVED=33, LABEL=34, INTEGER=35, DECIMAL=36, STRING=37, DATE=38, 
		WHITESPACE=39;
	public static final int
		RULE_statement = 0, RULE_expression = 1, RULE_distinct = 2, RULE_joinsOperator = 3, 
		RULE_diffUnionOperator = 4, RULE_selection = 5, RULE_rename = 6, RULE_alias = 7, 
		RULE_condition = 8, RULE_atomicformula = 9, RULE_attributeorvalue = 10, 
		RULE_projection = 11, RULE_inlinerelation = 12, RULE_attribute = 13, RULE_tuple = 14, 
		RULE_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "expression", "distinct", "joinsOperator", "diffUnionOperator", 
			"selection", "rename", "alias", "condition", "atomicformula", "attributeorvalue", 
			"projection", "inlinerelation", "attribute", "tuple", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'INTERSECTION'", "'('", "')'", "'DISTINCT'", "'PRODUCT'", 
			"'JOIN'", "'DIVISION'", "'MINUS'", "'UNION'", "'SELECT'", "'RENAME'", 
			"','", "'<-'", "'NOT'", "'AND'", "'OR'", "'<'", "'<='", "'>'", "'>='", 
			"'<>'", "'PROJECT'", "'{'", "'}'", "'['", "']'", "':'", "'STRING'", "'INTEGER'", 
			"'DECIMAL'", "'DATE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "RESERVED", "LABEL", 
			"INTEGER", "DECIMAL", "STRING", "DATE", "WHITESPACE"
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
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((AssignmentContext)_localctx).label = match(LABEL);
				setState(33);
				match(T__0);
				setState(34);
				expression(0);
				}
				break;
			case 2:
				_localctx = new QueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
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
		public Token operator;
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				_localctx = new RelationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(LABEL);
				}
				break;
			case T__25:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				inlinerelation();
				}
				break;
			case T__22:
				{
				_localctx = new PiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				projection();
				}
				break;
			case T__10:
				{
				_localctx = new SigmaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				selection();
				}
				break;
			case T__11:
				{
				_localctx = new RhoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				rename();
				}
				break;
			case T__4:
				{
				_localctx = new DeltaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				distinct();
				}
				break;
			case T__2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(T__2);
				setState(46);
				expression(0);
				setState(47);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new JoinsContext(new ExpressionContext(_parentctx, _parentState));
						((JoinsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(52);
						((JoinsContext)_localctx).operator = joinsOperator();
						setState(54);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(53);
							((JoinsContext)_localctx).cond = condition(0);
							}
							break;
						}
						setState(56);
						((JoinsContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((IntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						((IntersectionContext)_localctx).operator = match(T__1);
						setState(60);
						((IntersectionContext)_localctx).right = expression(4);
						}
						break;
					case 3:
						{
						_localctx = new DifferenceOrUnionContext(new ExpressionContext(_parentctx, _parentState));
						((DifferenceOrUnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						((DifferenceOrUnionContext)_localctx).operator = diffUnionOperator();
						setState(63);
						((DifferenceOrUnionContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(69);
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
			setState(70);
			match(T__4);
			setState(71);
			match(T__2);
			setState(72);
			expression(0);
			setState(73);
			match(T__3);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
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
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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
			setState(79);
			match(T__10);
			setState(80);
			condition(0);
			setState(81);
			match(T__2);
			setState(82);
			expression(0);
			setState(83);
			match(T__3);
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
			setState(85);
			match(T__11);
			setState(86);
			((RenameContext)_localctx).alias = alias();
			((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(87);
				match(T__12);
				setState(88);
				((RenameContext)_localctx).alias = alias();
				((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__2);
			setState(95);
			expression(0);
			setState(96);
			match(T__3);
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
			setState(98);
			match(LABEL);
			setState(99);
			match(T__13);
			setState(100);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				atomicformula();
				}
				break;
			case T__14:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(T__14);
				setState(105);
				((NegationContext)_localctx).cond = condition(4);
				}
				break;
			case T__2:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__2);
				setState(107);
				condition(0);
				setState(108);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						((AndContext)_localctx).op = match(T__15);
						setState(114);
						((AndContext)_localctx).right = condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(115);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						((OrContext)_localctx).op = match(T__16);
						setState(117);
						((OrContext)_localctx).right = condition(3);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(123);
			((AtomicformulaContext)_localctx).left = attributeorvalue();
			setState(124);
			((AtomicformulaContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126466L) != 0)) ) {
				((AtomicformulaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				setState(127);
				match(LABEL);
				}
				break;
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				setState(128);
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
		public Token LABEL;
		public List<Token> attributes = new ArrayList<Token>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LABEL() { return getTokens(ERALIParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(ERALIParser.LABEL, i);
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
			setState(131);
			match(T__22);
			setState(132);
			match(T__23);
			setState(133);
			((ProjectionContext)_localctx).LABEL = match(LABEL);
			((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).LABEL);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(134);
				match(T__12);
				setState(135);
				((ProjectionContext)_localctx).LABEL = match(LABEL);
				((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).LABEL);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__24);
			setState(142);
			match(T__2);
			setState(143);
			expression(0);
			setState(144);
			match(T__3);
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
		enterRule(_localctx, 24, RULE_inlinerelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__25);
			setState(147);
			((InlinerelationContext)_localctx).attribute = attribute();
			((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(148);
				match(T__12);
				setState(149);
				((InlinerelationContext)_localctx).attribute = attribute();
				((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__26);
			setState(156);
			match(T__23);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(157);
				((InlinerelationContext)_localctx).tuple = tuple();
				((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(158);
					match(T__12);
					setState(159);
					((InlinerelationContext)_localctx).tuple = tuple();
					((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
			match(T__24);
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
		enterRule(_localctx, 26, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((AttributeContext)_localctx).label = match(LABEL);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(170);
				match(T__27);
				setState(171);
				((AttributeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__2);
			setState(175);
			((TupleContext)_localctx).value = value();
			((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(176);
				match(T__12);
				setState(177);
				((TupleContext)_localctx).value = value();
				((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(T__3);
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
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 8:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001E\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bo\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\bw\b\b\n\b\f\bz\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\n\u0082\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0089\b\u000b\n\u000b\f\u000b\u008c\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0097\b\f\n\f\f\f\u009a\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00a1\b\f\n\f\f\f\u00a4\t\f\u0003\f\u00a6\b\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00ad\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b3\b\u000e\n\u000e"+
		"\f\u000e\u00b6\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0002\u0002\u0010\u0010\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0005\u0001"+
		"\u0000\u0006\b\u0001\u0000\t\n\u0002\u0000\u0001\u0001\u0012\u0016\u0001"+
		"\u0000\u001d \u0001\u0000#&\u00c2\u0000$\u0001\u0000\u0000\u0000\u0002"+
		"1\u0001\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000\u0006K\u0001"+
		"\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000"+
		"\fU\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010n\u0001"+
		"\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u0081\u0001\u0000"+
		"\u0000\u0000\u0016\u0083\u0001\u0000\u0000\u0000\u0018\u0092\u0001\u0000"+
		"\u0000\u0000\u001a\u00a9\u0001\u0000\u0000\u0000\u001c\u00ae\u0001\u0000"+
		"\u0000\u0000\u001e\u00b9\u0001\u0000\u0000\u0000 !\u0005\"\u0000\u0000"+
		"!\"\u0005\u0001\u0000\u0000\"%\u0003\u0002\u0001\u0000#%\u0003\u0002\u0001"+
		"\u0000$ \u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0001\u0001"+
		"\u0000\u0000\u0000&\'\u0006\u0001\uffff\uffff\u0000\'2\u0005\"\u0000\u0000"+
		"(2\u0003\u0018\f\u0000)2\u0003\u0016\u000b\u0000*2\u0003\n\u0005\u0000"+
		"+2\u0003\f\u0006\u0000,2\u0003\u0004\u0002\u0000-.\u0005\u0003\u0000\u0000"+
		"./\u0003\u0002\u0001\u0000/0\u0005\u0004\u0000\u000002\u0001\u0000\u0000"+
		"\u00001&\u0001\u0000\u0000\u00001(\u0001\u0000\u0000\u00001)\u0001\u0000"+
		"\u0000\u00001*\u0001\u0000\u0000\u00001+\u0001\u0000\u0000\u00001,\u0001"+
		"\u0000\u0000\u00001-\u0001\u0000\u0000\u00002C\u0001\u0000\u0000\u0000"+
		"34\n\u0004\u0000\u000046\u0003\u0006\u0003\u000057\u0003\u0010\b\u0000"+
		"65\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000089\u0003\u0002\u0001\u00059B\u0001\u0000\u0000\u0000:;\n\u0003\u0000"+
		"\u0000;<\u0005\u0002\u0000\u0000<B\u0003\u0002\u0001\u0004=>\n\u0002\u0000"+
		"\u0000>?\u0003\b\u0004\u0000?@\u0003\u0002\u0001\u0003@B\u0001\u0000\u0000"+
		"\u0000A3\u0001\u0000\u0000\u0000A:\u0001\u0000\u0000\u0000A=\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0005\u0000\u0000GH\u0005\u0003\u0000\u0000HI\u0003\u0002"+
		"\u0001\u0000IJ\u0005\u0004\u0000\u0000J\u0005\u0001\u0000\u0000\u0000"+
		"KL\u0007\u0000\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MN\u0007\u0001"+
		"\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0005\u000b\u0000\u0000PQ\u0003"+
		"\u0010\b\u0000QR\u0005\u0003\u0000\u0000RS\u0003\u0002\u0001\u0000ST\u0005"+
		"\u0004\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005\f\u0000\u0000"+
		"V[\u0003\u000e\u0007\u0000WX\u0005\r\u0000\u0000XZ\u0003\u000e\u0007\u0000"+
		"YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0003\u0002\u0001\u0000`a\u0005"+
		"\u0004\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\"\u0000\u0000cd"+
		"\u0005\u000e\u0000\u0000de\u0005\"\u0000\u0000e\u000f\u0001\u0000\u0000"+
		"\u0000fg\u0006\b\uffff\uffff\u0000go\u0003\u0012\t\u0000hi\u0005\u000f"+
		"\u0000\u0000io\u0003\u0010\b\u0004jk\u0005\u0003\u0000\u0000kl\u0003\u0010"+
		"\b\u0000lm\u0005\u0004\u0000\u0000mo\u0001\u0000\u0000\u0000nf\u0001\u0000"+
		"\u0000\u0000nh\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000ox\u0001"+
		"\u0000\u0000\u0000pq\n\u0003\u0000\u0000qr\u0005\u0010\u0000\u0000rw\u0003"+
		"\u0010\b\u0004st\n\u0002\u0000\u0000tu\u0005\u0011\u0000\u0000uw\u0003"+
		"\u0010\b\u0003vp\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\u0011\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0003\u0014"+
		"\n\u0000|}\u0007\u0002\u0000\u0000}~\u0003\u0014\n\u0000~\u0013\u0001"+
		"\u0000\u0000\u0000\u007f\u0082\u0005\"\u0000\u0000\u0080\u0082\u0003\u001e"+
		"\u000f\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0017"+
		"\u0000\u0000\u0084\u0085\u0005\u0018\u0000\u0000\u0085\u008a\u0005\"\u0000"+
		"\u0000\u0086\u0087\u0005\r\u0000\u0000\u0087\u0089\u0005\"\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u0019\u0000\u0000\u008e\u008f\u0005\u0003\u0000\u0000"+
		"\u008f\u0090\u0003\u0002\u0001\u0000\u0090\u0091\u0005\u0004\u0000\u0000"+
		"\u0091\u0017\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001a\u0000\u0000"+
		"\u0093\u0098\u0003\u001a\r\u0000\u0094\u0095\u0005\r\u0000\u0000\u0095"+
		"\u0097\u0003\u001a\r\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u001b\u0000\u0000\u009c\u00a5"+
		"\u0005\u0018\u0000\u0000\u009d\u00a2\u0003\u001c\u000e\u0000\u009e\u009f"+
		"\u0005\r\u0000\u0000\u009f\u00a1\u0003\u001c\u000e\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u009d\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8\u0019\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ac\u0005\"\u0000\u0000\u00aa\u00ab\u0005\u001c"+
		"\u0000\u0000\u00ab\u00ad\u0007\u0003\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u001b\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af\u00b4\u0003\u001e"+
		"\u000f\u0000\u00b0\u00b1\u0005\r\u0000\u0000\u00b1\u00b3\u0003\u001e\u000f"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000\u00b8\u001d\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0007\u0004\u0000\u0000\u00ba\u001f\u0001\u0000\u0000"+
		"\u0000\u0010$16AC[nvx\u0081\u008a\u0098\u00a2\u00a5\u00ac\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}