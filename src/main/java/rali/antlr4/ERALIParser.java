// Generated from ERALI.g4 by ANTLR 4.12.0
package rali.antlr4;
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
		T__0=1, SELECT=2, RENAME=3, PROJECT=4, SET=5, INTERSECTION=6, DIVISION=7, 
		PRODUCT=8, MINUS=9, JOIN=10, TIMES=11, UNION=12, DIFFERENCE=13, DISTINCT=14, 
		SORT=15, LEFT=16, RIGHT=17, OUTER=18, GROUP=19, AVG=20, SUM=21, MIN=22, 
		MAX=23, COUNT=24, STRINGTYPE=25, INTEGERTYPE=26, DECIMALTYPE=27, DATETYPE=28, 
		EQ=29, NEQ=30, LT=31, GT=32, LTE=33, GTE=34, LEFTARROW=35, RIGHTARROW=36, 
		COMMA=37, LPAREN=38, RPAREN=39, LCURLY=40, RCURLY=41, LBRACKET=42, RBRACKET=43, 
		COLON=44, SEMICOLON=45, AND=46, OR=47, NOT=48, LABEL=49, INTEGER=50, DECIMAL=51, 
		STRING=52, DATE=53, NUMMIN=54, NUMPLU=55, NUMDIV=56, NUMMUL=57, WHITESPACE=58;
	public static final int
		RULE_statement = 0, RULE_expression = 1, RULE_term = 2, RULE_distinct = 3, 
		RULE_joinsOperator = 4, RULE_diffUnionOperator = 5, RULE_selection = 6, 
		RULE_rename = 7, RULE_alias = 8, RULE_condition = 9, RULE_atomicformula = 10, 
		RULE_attributeorvalue = 11, RULE_projection = 12, RULE_aggregation = 13, 
		RULE_aggregationOperation = 14, RULE_projectionAttribute = 15, RULE_projectionExpression = 16, 
		RULE_sort = 17, RULE_inlinerelation = 18, RULE_attribute = 19, RULE_tuple = 20, 
		RULE_value = 21, RULE_null = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "expression", "term", "distinct", "joinsOperator", "diffUnionOperator", 
			"selection", "rename", "alias", "condition", "atomicformula", "attributeorvalue", 
			"projection", "aggregation", "aggregationOperation", "projectionAttribute", 
			"projectionExpression", "sort", "inlinerelation", "attribute", "tuple", 
			"value", "null"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NULL'", "'SELECT'", "'RENAME'", "'PROJECT'", "'SET'", "'INTERSECTION'", 
			"'DIVISION'", "'PRODUCT'", "'MINUS'", "'JOIN'", "'TIMES'", "'UNION'", 
			"'DIFFERENCE'", "'DISTINCT'", "'SORT'", "'LEFT'", "'RIGHT'", "'OUTER'", 
			"'GROUP'", "'AVG'", "'SUM'", "'MIN'", "'MAX'", "'COUNT'", "'STRING'", 
			"'INTEGER'", "'DECIMAL'", "'DATE'", "'='", "'<>'", "'<'", "'>'", "'<='", 
			"'>='", "'<-'", "'->'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"':'", "';'", "'AND'", "'OR'", "'NOT'", null, null, null, null, null, 
			"'-'", "'+'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELECT", "RENAME", "PROJECT", "SET", "INTERSECTION", "DIVISION", 
			"PRODUCT", "MINUS", "JOIN", "TIMES", "UNION", "DIFFERENCE", "DISTINCT", 
			"SORT", "LEFT", "RIGHT", "OUTER", "GROUP", "AVG", "SUM", "MIN", "MAX", 
			"COUNT", "STRINGTYPE", "INTEGERTYPE", "DECIMALTYPE", "DATETYPE", "EQ", 
			"NEQ", "LT", "GT", "LTE", "GTE", "LEFTARROW", "RIGHTARROW", "COMMA", 
			"LPAREN", "RPAREN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "COLON", 
			"SEMICOLON", "AND", "OR", "NOT", "LABEL", "INTEGER", "DECIMAL", "STRING", 
			"DATE", "NUMMIN", "NUMPLU", "NUMDIV", "NUMMUL", "WHITESPACE"
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
		public TerminalNode EQ() { return getToken(ERALIParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ERALIParser.SEMICOLON, 0); }
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
		public TerminalNode SEMICOLON() { return getToken(ERALIParser.SEMICOLON, 0); }
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((AssignmentContext)_localctx).label = match(LABEL);
				setState(47);
				match(EQ);
				setState(48);
				expression(0);
				setState(49);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new QueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				expression(0);
				setState(52);
				match(SEMICOLON);
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
		public TerminalNode INTERSECTION() { return getToken(ERALIParser.INTERSECTION, 0); }
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
		public TerminalNode SET() { return getToken(ERALIParser.SET, 0); }
		public TerminalNode INTERSECTION() { return getToken(ERALIParser.INTERSECTION, 0); }
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
		public TerminalNode SET() { return getToken(ERALIParser.SET, 0); }
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
	public static class SimpleContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SimpleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ERALIListener ) ((ERALIListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ERALIVisitor ) return ((ERALIVisitor<? extends T>)visitor).visitSimple(this);
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case LABEL:
				{
				_localctx = new SimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				term();
				}
				break;
			case LBRACKET:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				inlinerelation();
				}
				break;
			case PROJECT:
				{
				_localctx = new PiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				projection();
				}
				break;
			case GROUP:
				{
				_localctx = new GammaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				aggregation();
				}
				break;
			case SORT:
				{
				_localctx = new TauContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				sort();
				}
				break;
			case SELECT:
				{
				_localctx = new SigmaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				selection();
				}
				break;
			case RENAME:
				{
				_localctx = new RhoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				rename();
				}
				break;
			case DISTINCT:
				{
				_localctx = new DeltaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				distinct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new JoinsContext(new ExpressionContext(_parentctx, _parentState));
						((JoinsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68);
						((JoinsContext)_localctx).operator = joinsOperator();
						setState(70);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(69);
							((JoinsContext)_localctx).cond = condition(0);
							}
							break;
						}
						setState(72);
						((JoinsContext)_localctx).right = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((IntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(75);
						match(INTERSECTION);
						setState(76);
						((IntersectionContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new SetIntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((SetIntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(78);
						match(SET);
						setState(79);
						match(INTERSECTION);
						setState(80);
						((SetIntersectionContext)_localctx).right = expression(4);
						}
						break;
					case 4:
						{
						_localctx = new DifferenceOrUnionContext(new ExpressionContext(_parentctx, _parentState));
						((DifferenceOrUnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(82);
						((DifferenceOrUnionContext)_localctx).operator = diffUnionOperator();
						setState(83);
						((DifferenceOrUnionContext)_localctx).right = expression(3);
						}
						break;
					case 5:
						{
						_localctx = new SetDifferenceOrUnionContext(new ExpressionContext(_parentctx, _parentState));
						((SetDifferenceOrUnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(86);
						match(SET);
						setState(87);
						((SetDifferenceOrUnionContext)_localctx).operator = diffUnionOperator();
						setState(88);
						((SetDifferenceOrUnionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(94);
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends TermContext {
		public TerminalNode LABEL() { return getToken(ERALIParser.LABEL, 0); }
		public RelationContext(TermContext ctx) { copyFrom(ctx); }
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
	public static class ParensContext extends TermContext {
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
		public ParensContext(TermContext ctx) { copyFrom(ctx); }
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

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				_localctx = new RelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(LABEL);
				}
				break;
			case LPAREN:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(LPAREN);
				setState(97);
				expression(0);
				setState(98);
				match(RPAREN);
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
	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(ERALIParser.DISTINCT, 0); }
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
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
		enterRule(_localctx, 6, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(DISTINCT);
			setState(103);
			match(LPAREN);
			setState(104);
			expression(0);
			setState(105);
			match(RPAREN);
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
		public Token dir;
		public Token outer;
		public Token set;
		public TerminalNode PRODUCT() { return getToken(ERALIParser.PRODUCT, 0); }
		public TerminalNode JOIN() { return getToken(ERALIParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(ERALIParser.OUTER, 0); }
		public TerminalNode LEFT() { return getToken(ERALIParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ERALIParser.RIGHT, 0); }
		public TerminalNode DIVISION() { return getToken(ERALIParser.DIVISION, 0); }
		public TerminalNode SET() { return getToken(ERALIParser.SET, 0); }
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
		enterRule(_localctx, 8, RULE_joinsOperator);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRODUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(PRODUCT);
				}
				break;
			case JOIN:
			case LEFT:
			case RIGHT:
			case OUTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) {
					{
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT || _la==RIGHT) {
						{
						setState(108);
						((JoinsOperatorContext)_localctx).dir = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LEFT || _la==RIGHT) ) {
							((JoinsOperatorContext)_localctx).dir = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(111);
					((JoinsOperatorContext)_localctx).outer = match(OUTER);
					}
				}

				setState(114);
				match(JOIN);
				}
				break;
			case SET:
			case DIVISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(115);
					((JoinsOperatorContext)_localctx).set = match(SET);
					}
				}

				setState(118);
				match(DIVISION);
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
		public TerminalNode MINUS() { return getToken(ERALIParser.MINUS, 0); }
		public TerminalNode UNION() { return getToken(ERALIParser.UNION, 0); }
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
		enterRule(_localctx, 10, RULE_diffUnionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==UNION) ) {
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
		public TerminalNode SELECT() { return getToken(ERALIParser.SELECT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
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
		enterRule(_localctx, 12, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(SELECT);
			setState(124);
			condition(0);
			setState(125);
			match(LPAREN);
			setState(126);
			expression(0);
			setState(127);
			match(RPAREN);
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
		public TerminalNode RENAME() { return getToken(ERALIParser.RENAME, 0); }
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ERALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ERALIParser.COMMA, i);
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
		enterRule(_localctx, 14, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(RENAME);
			setState(130);
			((RenameContext)_localctx).alias = alias();
			((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				((RenameContext)_localctx).alias = alias();
				((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(LPAREN);
			setState(139);
			expression(0);
			setState(140);
			match(RPAREN);
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
		public TerminalNode LEFTARROW() { return getToken(ERALIParser.LEFTARROW, 0); }
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
		enterRule(_localctx, 16, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(LABEL);
			setState(143);
			match(LEFTARROW);
			setState(144);
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
		public TerminalNode NOT() { return getToken(ERALIParser.NOT, 0); }
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
		public TerminalNode OR() { return getToken(ERALIParser.OR, 0); }
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
		public TerminalNode AND() { return getToken(ERALIParser.AND, 0); }
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
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case LABEL:
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(147);
				atomicformula();
				}
				break;
			case NOT:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(NOT);
				setState(149);
				((NegationContext)_localctx).cond = condition(4);
				}
				break;
			case LPAREN:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(LPAREN);
				setState(151);
				condition(0);
				setState(152);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(157);
						((AndContext)_localctx).op = match(AND);
						setState(158);
						((AndContext)_localctx).right = condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(160);
						((OrContext)_localctx).op = match(OR);
						setState(161);
						((OrContext)_localctx).right = condition(3);
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode EQ() { return getToken(ERALIParser.EQ, 0); }
		public TerminalNode LT() { return getToken(ERALIParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ERALIParser.LTE, 0); }
		public TerminalNode GT() { return getToken(ERALIParser.GT, 0); }
		public TerminalNode GTE() { return getToken(ERALIParser.GTE, 0); }
		public TerminalNode NEQ() { return getToken(ERALIParser.NEQ, 0); }
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
		enterRule(_localctx, 20, RULE_atomicformula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((AtomicformulaContext)_localctx).left = attributeorvalue();
			setState(168);
			((AtomicformulaContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) ) {
				((AtomicformulaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
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
		enterRule(_localctx, 22, RULE_attributeorvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				setState(171);
				match(LABEL);
				}
				break;
			case T__0:
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				setState(172);
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
		public TerminalNode PROJECT() { return getToken(ERALIParser.PROJECT, 0); }
		public TerminalNode LCURLY() { return getToken(ERALIParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ERALIParser.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
		public List<ProjectionAttributeContext> projectionAttribute() {
			return getRuleContexts(ProjectionAttributeContext.class);
		}
		public ProjectionAttributeContext projectionAttribute(int i) {
			return getRuleContext(ProjectionAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ERALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ERALIParser.COMMA, i);
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
		enterRule(_localctx, 24, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(PROJECT);
			setState(176);
			match(LCURLY);
			setState(177);
			((ProjectionContext)_localctx).projectionAttribute = projectionAttribute();
			((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).projectionAttribute);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				((ProjectionContext)_localctx).projectionAttribute = projectionAttribute();
				((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).projectionAttribute);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(RCURLY);
			setState(186);
			match(LPAREN);
			setState(187);
			expression(0);
			setState(188);
			match(RPAREN);
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
		public TerminalNode GROUP() { return getToken(ERALIParser.GROUP, 0); }
		public AggregationOperationContext aggregationOperation() {
			return getRuleContext(AggregationOperationContext.class,0);
		}
		public TerminalNode RIGHTARROW() { return getToken(ERALIParser.RIGHTARROW, 0); }
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
		public List<TerminalNode> LABEL() { return getTokens(ERALIParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(ERALIParser.LABEL, i);
		}
		public TerminalNode COMMA() { return getToken(ERALIParser.COMMA, 0); }
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
		enterRule(_localctx, 26, RULE_aggregation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(GROUP);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(191);
				((AggregationContext)_localctx).by = match(LABEL);
				setState(192);
				match(COMMA);
				}
			}

			setState(195);
			aggregationOperation();
			setState(196);
			match(RIGHTARROW);
			setState(197);
			((AggregationContext)_localctx).attributename = match(LABEL);
			setState(198);
			match(LPAREN);
			setState(199);
			expression(0);
			setState(200);
			match(RPAREN);
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
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ProjectionExpressionContext projectionExpression() {
			return getRuleContext(ProjectionExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
		public TerminalNode AVG() { return getToken(ERALIParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(ERALIParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(ERALIParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ERALIParser.MAX, 0); }
		public TerminalNode COUNT() { return getToken(ERALIParser.COUNT, 0); }
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
		enterRule(_localctx, 28, RULE_aggregationOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((AggregationOperationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32505856L) != 0)) ) {
				((AggregationOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(203);
			match(LPAREN);
			setState(204);
			projectionExpression(0);
			setState(205);
			match(RPAREN);
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
		public TerminalNode RIGHTARROW() { return getToken(ERALIParser.RIGHTARROW, 0); }
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
		enterRule(_localctx, 30, RULE_projectionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(207);
				((ProjectionAttributeContext)_localctx).exp = projectionExpression(0);
				setState(208);
				match(RIGHTARROW);
				}
				break;
			}
			setState(212);
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
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public List<ProjectionExpressionContext> projectionExpression() {
			return getRuleContexts(ProjectionExpressionContext.class);
		}
		public ProjectionExpressionContext projectionExpression(int i) {
			return getRuleContext(ProjectionExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
		public TerminalNode LABEL() { return getToken(ERALIParser.LABEL, 0); }
		public TerminalNode DECIMAL() { return getToken(ERALIParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(ERALIParser.INTEGER, 0); }
		public TerminalNode NUMMUL() { return getToken(ERALIParser.NUMMUL, 0); }
		public TerminalNode NUMDIV() { return getToken(ERALIParser.NUMDIV, 0); }
		public TerminalNode NUMPLU() { return getToken(ERALIParser.NUMPLU, 0); }
		public TerminalNode NUMMIN() { return getToken(ERALIParser.NUMMIN, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_projectionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(215);
				match(LPAREN);
				setState(216);
				projectionExpression(0);
				setState(217);
				match(RPAREN);
				}
				break;
			case LABEL:
			case INTEGER:
			case DECIMAL:
				{
				setState(219);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
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
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ProjectionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_projectionExpression);
						setState(222);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(223);
						((ProjectionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NUMDIV || _la==NUMMUL) ) {
							((ProjectionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						projectionExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new ProjectionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_projectionExpression);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						((ProjectionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NUMMIN || _la==NUMPLU) ) {
							((ProjectionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						projectionExpression(4);
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public TerminalNode SORT() { return getToken(ERALIParser.SORT, 0); }
		public TerminalNode LCURLY() { return getToken(ERALIParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ERALIParser.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
		public List<TerminalNode> LABEL() { return getTokens(ERALIParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(ERALIParser.LABEL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ERALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ERALIParser.COMMA, i);
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
		enterRule(_localctx, 34, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(SORT);
			setState(234);
			match(LCURLY);
			setState(235);
			((SortContext)_localctx).LABEL = match(LABEL);
			((SortContext)_localctx).attributes.add(((SortContext)_localctx).LABEL);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236);
				match(COMMA);
				setState(237);
				((SortContext)_localctx).LABEL = match(LABEL);
				((SortContext)_localctx).attributes.add(((SortContext)_localctx).LABEL);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(RCURLY);
			setState(244);
			match(LPAREN);
			setState(245);
			expression(0);
			setState(246);
			match(RPAREN);
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
		public TerminalNode LBRACKET() { return getToken(ERALIParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ERALIParser.RBRACKET, 0); }
		public TerminalNode LCURLY() { return getToken(ERALIParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ERALIParser.RCURLY, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ERALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ERALIParser.COMMA, i);
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
		enterRule(_localctx, 36, RULE_inlinerelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LBRACKET);
			setState(249);
			((InlinerelationContext)_localctx).attribute = attribute();
			((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(250);
				match(COMMA);
				setState(251);
				((InlinerelationContext)_localctx).attribute = attribute();
				((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(RBRACKET);
			setState(258);
			match(LCURLY);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(259);
				((InlinerelationContext)_localctx).tuple = tuple();
				((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(260);
					match(COMMA);
					setState(261);
					((InlinerelationContext)_localctx).tuple = tuple();
					((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(269);
			match(RCURLY);
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
		public TerminalNode COLON() { return getToken(ERALIParser.COLON, 0); }
		public TerminalNode STRINGTYPE() { return getToken(ERALIParser.STRINGTYPE, 0); }
		public TerminalNode INTEGERTYPE() { return getToken(ERALIParser.INTEGERTYPE, 0); }
		public TerminalNode DECIMALTYPE() { return getToken(ERALIParser.DECIMALTYPE, 0); }
		public TerminalNode DATETYPE() { return getToken(ERALIParser.DATETYPE, 0); }
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
		enterRule(_localctx, 38, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((AttributeContext)_localctx).label = match(LABEL);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(272);
				match(COLON);
				setState(273);
				((AttributeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
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
		public TerminalNode LPAREN() { return getToken(ERALIParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ERALIParser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ERALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ERALIParser.COMMA, i);
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
		enterRule(_localctx, 40, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LPAREN);
			setState(277);
			((TupleContext)_localctx).value = value();
			((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				((TupleContext)_localctx).value = value();
				((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(RPAREN);
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
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(DECIMAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(STRING);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(DATE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
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
		enterRule(_localctx, 44, RULE_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__0);
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
		case 9:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 16:
			return projectionExpression_sempred((ProjectionExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
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
		"\u0004\u0001:\u0129\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00007\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001[\b\u0001"+
		"\n\u0001\f\u0001^\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004n\b\u0004"+
		"\u0001\u0004\u0003\u0004q\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"u\b\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0086\b\u0007\n"+
		"\u0007\f\u0007\u0089\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009b\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a3\b\t\n\t\f\t\u00a6\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00ae\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b5\b\f\n\f\f\f\u00b8"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00c2\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00d3\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00dd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00e5\b\u0010\n\u0010\f\u0010\u00e8\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00ef\b\u0011\n\u0011\f\u0011\u00f2\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00fd\b\u0012\n\u0012\f\u0012\u0100\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0107\b\u0012"+
		"\n\u0012\f\u0012\u010a\t\u0012\u0003\u0012\u010c\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0113\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0119\b\u0014\n"+
		"\u0014\f\u0014\u011c\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0125\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0000\u0003\u0002\u0012 \u0017\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,\u0000\b\u0001\u0000\u0010\u0011\u0002\u0000\t\t\f\f\u0001\u0000"+
		"\u001d\"\u0001\u0000\u0014\u0018\u0001\u000013\u0001\u000089\u0001\u0000"+
		"67\u0001\u0000\u0019\u001c\u013b\u00006\u0001\u0000\u0000\u0000\u0002"+
		"A\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006f\u0001"+
		"\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000\u0000"+
		"\f{\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000\u0010"+
		"\u008e\u0001\u0000\u0000\u0000\u0012\u009a\u0001\u0000\u0000\u0000\u0014"+
		"\u00a7\u0001\u0000\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000\u0018"+
		"\u00af\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000\u0000\u0000\u001c"+
		"\u00ca\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00dc"+
		"\u0001\u0000\u0000\u0000\"\u00e9\u0001\u0000\u0000\u0000$\u00f8\u0001"+
		"\u0000\u0000\u0000&\u010f\u0001\u0000\u0000\u0000(\u0114\u0001\u0000\u0000"+
		"\u0000*\u0124\u0001\u0000\u0000\u0000,\u0126\u0001\u0000\u0000\u0000."+
		"/\u00051\u0000\u0000/0\u0005\u001d\u0000\u000001\u0003\u0002\u0001\u0000"+
		"12\u0005-\u0000\u000027\u0001\u0000\u0000\u000034\u0003\u0002\u0001\u0000"+
		"45\u0005-\u0000\u000057\u0001\u0000\u0000\u00006.\u0001\u0000\u0000\u0000"+
		"63\u0001\u0000\u0000\u00007\u0001\u0001\u0000\u0000\u000089\u0006\u0001"+
		"\uffff\uffff\u00009B\u0003\u0004\u0002\u0000:B\u0003$\u0012\u0000;B\u0003"+
		"\u0018\f\u0000<B\u0003\u001a\r\u0000=B\u0003\"\u0011\u0000>B\u0003\f\u0006"+
		"\u0000?B\u0003\u000e\u0007\u0000@B\u0003\u0006\u0003\u0000A8\u0001\u0000"+
		"\u0000\u0000A:\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000A<\u0001"+
		"\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\\\u0001\u0000\u0000"+
		"\u0000CD\n\u0005\u0000\u0000DF\u0003\b\u0004\u0000EG\u0003\u0012\t\u0000"+
		"FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0003\u0002\u0001\u0006I[\u0001\u0000\u0000\u0000JK\n\u0004\u0000"+
		"\u0000KL\u0005\u0006\u0000\u0000L[\u0003\u0002\u0001\u0005MN\n\u0003\u0000"+
		"\u0000NO\u0005\u0005\u0000\u0000OP\u0005\u0006\u0000\u0000P[\u0003\u0002"+
		"\u0001\u0004QR\n\u0002\u0000\u0000RS\u0003\n\u0005\u0000ST\u0003\u0002"+
		"\u0001\u0003T[\u0001\u0000\u0000\u0000UV\n\u0001\u0000\u0000VW\u0005\u0005"+
		"\u0000\u0000WX\u0003\n\u0005\u0000XY\u0003\u0002\u0001\u0002Y[\u0001\u0000"+
		"\u0000\u0000ZC\u0001\u0000\u0000\u0000ZJ\u0001\u0000\u0000\u0000ZM\u0001"+
		"\u0000\u0000\u0000ZQ\u0001\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]\u0003\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_e\u0005"+
		"1\u0000\u0000`a\u0005&\u0000\u0000ab\u0003\u0002\u0001\u0000bc\u0005\'"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000d`\u0001"+
		"\u0000\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fg\u0005\u000e\u0000"+
		"\u0000gh\u0005&\u0000\u0000hi\u0003\u0002\u0001\u0000ij\u0005\'\u0000"+
		"\u0000j\u0007\u0001\u0000\u0000\u0000kx\u0005\b\u0000\u0000ln\u0007\u0000"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oq\u0005\u0012\u0000\u0000pm\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rx\u0005\n\u0000\u0000"+
		"su\u0005\u0005\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0005\u0007\u0000\u0000wk\u0001\u0000"+
		"\u0000\u0000wp\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000x\t\u0001"+
		"\u0000\u0000\u0000yz\u0007\u0001\u0000\u0000z\u000b\u0001\u0000\u0000"+
		"\u0000{|\u0005\u0002\u0000\u0000|}\u0003\u0012\t\u0000}~\u0005&\u0000"+
		"\u0000~\u007f\u0003\u0002\u0001\u0000\u007f\u0080\u0005\'\u0000\u0000"+
		"\u0080\r\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0003\u0000\u0000\u0082"+
		"\u0087\u0003\u0010\b\u0000\u0083\u0084\u0005%\u0000\u0000\u0084\u0086"+
		"\u0003\u0010\b\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005&\u0000\u0000\u008b\u008c\u0003\u0002"+
		"\u0001\u0000\u008c\u008d\u0005\'\u0000\u0000\u008d\u000f\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u00051\u0000\u0000\u008f\u0090\u0005#\u0000\u0000\u0090"+
		"\u0091\u00051\u0000\u0000\u0091\u0011\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0006\t\uffff\uffff\u0000\u0093\u009b\u0003\u0014\n\u0000\u0094\u0095"+
		"\u00050\u0000\u0000\u0095\u009b\u0003\u0012\t\u0004\u0096\u0097\u0005"+
		"&\u0000\u0000\u0097\u0098\u0003\u0012\t\u0000\u0098\u0099\u0005\'\u0000"+
		"\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000"+
		"\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000"+
		"\u0000\u009b\u00a4\u0001\u0000\u0000\u0000\u009c\u009d\n\u0003\u0000\u0000"+
		"\u009d\u009e\u0005.\u0000\u0000\u009e\u00a3\u0003\u0012\t\u0004\u009f"+
		"\u00a0\n\u0002\u0000\u0000\u00a0\u00a1\u0005/\u0000\u0000\u00a1\u00a3"+
		"\u0003\u0012\t\u0003\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009f\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0013\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0016\u000b\u0000\u00a8\u00a9\u0007\u0002\u0000\u0000\u00a9\u00aa\u0003"+
		"\u0016\u000b\u0000\u00aa\u0015\u0001\u0000\u0000\u0000\u00ab\u00ae\u0005"+
		"1\u0000\u0000\u00ac\u00ae\u0003*\u0015\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u0017\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005\u0004\u0000\u0000\u00b0\u00b1\u0005(\u0000\u0000"+
		"\u00b1\u00b6\u0003\u001e\u000f\u0000\u00b2\u00b3\u0005%\u0000\u0000\u00b3"+
		"\u00b5\u0003\u001e\u000f\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005)\u0000\u0000\u00ba\u00bb"+
		"\u0005&\u0000\u0000\u00bb\u00bc\u0003\u0002\u0001\u0000\u00bc\u00bd\u0005"+
		"\'\u0000\u0000\u00bd\u0019\u0001\u0000\u0000\u0000\u00be\u00c1\u0005\u0013"+
		"\u0000\u0000\u00bf\u00c0\u00051\u0000\u0000\u00c0\u00c2\u0005%\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\u001c\u000e\u0000"+
		"\u00c4\u00c5\u0005$\u0000\u0000\u00c5\u00c6\u00051\u0000\u0000\u00c6\u00c7"+
		"\u0005&\u0000\u0000\u00c7\u00c8\u0003\u0002\u0001\u0000\u00c8\u00c9\u0005"+
		"\'\u0000\u0000\u00c9\u001b\u0001\u0000\u0000\u0000\u00ca\u00cb\u0007\u0003"+
		"\u0000\u0000\u00cb\u00cc\u0005&\u0000\u0000\u00cc\u00cd\u0003 \u0010\u0000"+
		"\u00cd\u00ce\u0005\'\u0000\u0000\u00ce\u001d\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0003 \u0010\u0000\u00d0\u00d1\u0005$\u0000\u0000\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
		"1\u0000\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\u0010"+
		"\uffff\uffff\u0000\u00d7\u00d8\u0005&\u0000\u0000\u00d8\u00d9\u0003 \u0010"+
		"\u0000\u00d9\u00da\u0005\'\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0007\u0004\u0000\u0000\u00dc\u00d6\u0001\u0000\u0000\u0000"+
		"\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e6\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\n\u0004\u0000\u0000\u00df\u00e0\u0007\u0005\u0000\u0000\u00e0"+
		"\u00e5\u0003 \u0010\u0005\u00e1\u00e2\n\u0003\u0000\u0000\u00e2\u00e3"+
		"\u0007\u0006\u0000\u0000\u00e3\u00e5\u0003 \u0010\u0004\u00e4\u00de\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005\u000f\u0000\u0000\u00ea\u00eb\u0005(\u0000"+
		"\u0000\u00eb\u00f0\u00051\u0000\u0000\u00ec\u00ed\u0005%\u0000\u0000\u00ed"+
		"\u00ef\u00051\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005)\u0000\u0000\u00f4\u00f5\u0005"+
		"&\u0000\u0000\u00f5\u00f6\u0003\u0002\u0001\u0000\u00f6\u00f7\u0005\'"+
		"\u0000\u0000\u00f7#\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005*\u0000\u0000"+
		"\u00f9\u00fe\u0003&\u0013\u0000\u00fa\u00fb\u0005%\u0000\u0000\u00fb\u00fd"+
		"\u0003&\u0013\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005+\u0000\u0000\u0102\u010b\u0005(\u0000"+
		"\u0000\u0103\u0108\u0003(\u0014\u0000\u0104\u0105\u0005%\u0000\u0000\u0105"+
		"\u0107\u0003(\u0014\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u010a"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u0103\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005)\u0000\u0000\u010e%\u0001\u0000\u0000\u0000\u010f\u0112\u00051"+
		"\u0000\u0000\u0110\u0111\u0005,\u0000\u0000\u0111\u0113\u0007\u0007\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\'\u0001\u0000\u0000\u0000\u0114\u0115\u0005&\u0000\u0000"+
		"\u0115\u011a\u0003*\u0015\u0000\u0116\u0117\u0005%\u0000\u0000\u0117\u0119"+
		"\u0003*\u0015\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0005\'\u0000\u0000\u011e)\u0001\u0000"+
		"\u0000\u0000\u011f\u0125\u00052\u0000\u0000\u0120\u0125\u00053\u0000\u0000"+
		"\u0121\u0125\u00054\u0000\u0000\u0122\u0125\u00055\u0000\u0000\u0123\u0125"+
		"\u0003,\u0016\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0120\u0001"+
		"\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125+\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005\u0001\u0000\u0000\u0127-\u0001\u0000\u0000"+
		"\u0000\u001c6AFZ\\dmptw\u0087\u009a\u00a2\u00a4\u00ad\u00b6\u00c1\u00d2"+
		"\u00dc\u00e4\u00e6\u00f0\u00fe\u0108\u010b\u0112\u011a\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}