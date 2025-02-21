// Generated from RALI.g4 by ANTLR 4.12.0
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
public class RALIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, RENAME=2, PROJECT=3, INTERSECTION=4, DIVISION=5, PRODUCT=6, 
		MINUS=7, JOIN=8, TIMES=9, UNION=10, DIFFERENCE=11, STRINGTYPE=12, INTEGERTYPE=13, 
		DECIMALTYPE=14, DATETYPE=15, EQ=16, NEQ=17, LT=18, GT=19, LTE=20, GTE=21, 
		LEFTARROW=22, COMMA=23, LPAREN=24, RPAREN=25, LCURLY=26, RCURLY=27, LBRACKET=28, 
		RBRACKET=29, COLON=30, AND=31, OR=32, NOT=33, LABEL=34, INTEGER=35, DECIMAL=36, 
		STRING=37, DATE=38, WHITESPACE=39;
	public static final int
		RULE_statement = 0, RULE_expression = 1, RULE_joinsOperator = 2, RULE_diffUnionOperator = 3, 
		RULE_selection = 4, RULE_rename = 5, RULE_alias = 6, RULE_condition = 7, 
		RULE_atomicformula = 8, RULE_attributeorvalue = 9, RULE_projection = 10, 
		RULE_inlinerelation = 11, RULE_attribute = 12, RULE_tuple = 13, RULE_value = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "expression", "joinsOperator", "diffUnionOperator", "selection", 
			"rename", "alias", "condition", "atomicformula", "attributeorvalue", 
			"projection", "inlinerelation", "attribute", "tuple", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'RENAME'", "'PROJECT'", "'INTERSECTION'", "'DIVISION'", 
			"'PRODUCT'", "'MINUS'", "'JOIN'", "'TIMES'", "'UNION'", "'DIFFERENCE'", 
			"'STRING'", "'INTEGER'", "'DECIMAL'", "'DATE'", "'='", "'<>'", "'<'", 
			"'>'", "'<='", "'>='", "'<-'", "','", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "':'", "'AND'", "'OR'", "'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "RENAME", "PROJECT", "INTERSECTION", "DIVISION", "PRODUCT", 
			"MINUS", "JOIN", "TIMES", "UNION", "DIFFERENCE", "STRINGTYPE", "INTEGERTYPE", 
			"DECIMALTYPE", "DATETYPE", "EQ", "NEQ", "LT", "GT", "LTE", "GTE", "LEFTARROW", 
			"COMMA", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", 
			"COLON", "AND", "OR", "NOT", "LABEL", "INTEGER", "DECIMAL", "STRING", 
			"DATE", "WHITESPACE"
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
	public String getGrammarFileName() { return "RALI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RALIParser(TokenStream input) {
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
		public TerminalNode EQ() { return getToken(RALIParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(RALIParser.LABEL, 0); }
		public AssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitAssignment(this);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				((AssignmentContext)_localctx).label = match(LABEL);
				setState(31);
				match(EQ);
				setState(32);
				expression(0);
				}
				break;
			case 2:
				_localctx = new QueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
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
		public TerminalNode INTERSECTION() { return getToken(RALIParser.INTERSECTION, 0); }
		public IntersectionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterIntersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitIntersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitIntersection(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ExpressionContext {
		public TerminalNode LABEL() { return getToken(RALIParser.LABEL, 0); }
		public RelationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitRelation(this);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RALIParser.RPAREN, 0); }
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitParens(this);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterSigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitSigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitSigma(this);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterRho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitRho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitRho(this);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterDifferenceOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitDifferenceOrUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitDifferenceOrUnion(this);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitPi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitPi(this);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterJoins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitJoins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitJoins(this);
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				_localctx = new RelationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37);
				match(LABEL);
				}
				break;
			case LBRACKET:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				inlinerelation();
				}
				break;
			case PROJECT:
				{
				_localctx = new PiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				projection();
				}
				break;
			case SELECT:
				{
				_localctx = new SigmaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				selection();
				}
				break;
			case RENAME:
				{
				_localctx = new RhoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				rename();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(LPAREN);
				setState(43);
				expression(0);
				setState(44);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new JoinsContext(new ExpressionContext(_parentctx, _parentState));
						((JoinsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(49);
						((JoinsContext)_localctx).operator = joinsOperator();
						setState(51);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(50);
							((JoinsContext)_localctx).cond = condition(0);
							}
							break;
						}
						setState(53);
						((JoinsContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((IntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(55);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(56);
						((IntersectionContext)_localctx).operator = match(INTERSECTION);
						setState(57);
						((IntersectionContext)_localctx).right = expression(4);
						}
						break;
					case 3:
						{
						_localctx = new DifferenceOrUnionContext(new ExpressionContext(_parentctx, _parentState));
						((DifferenceOrUnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(59);
						((DifferenceOrUnionContext)_localctx).operator = diffUnionOperator();
						setState(60);
						((DifferenceOrUnionContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(66);
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
	public static class JoinsOperatorContext extends ParserRuleContext {
		public TerminalNode PRODUCT() { return getToken(RALIParser.PRODUCT, 0); }
		public TerminalNode JOIN() { return getToken(RALIParser.JOIN, 0); }
		public TerminalNode DIVISION() { return getToken(RALIParser.DIVISION, 0); }
		public JoinsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinsOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterJoinsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitJoinsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitJoinsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinsOperatorContext joinsOperator() throws RecognitionException {
		JoinsOperatorContext _localctx = new JoinsOperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_joinsOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 352L) != 0)) ) {
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
		public TerminalNode MINUS() { return getToken(RALIParser.MINUS, 0); }
		public TerminalNode UNION() { return getToken(RALIParser.UNION, 0); }
		public DiffUnionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diffUnionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterDiffUnionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitDiffUnionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitDiffUnionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiffUnionOperatorContext diffUnionOperator() throws RecognitionException {
		DiffUnionOperatorContext _localctx = new DiffUnionOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_diffUnionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		public TerminalNode SELECT() { return getToken(RALIParser.SELECT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RALIParser.RPAREN, 0); }
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(SELECT);
			setState(72);
			condition(0);
			setState(73);
			match(LPAREN);
			setState(74);
			expression(0);
			setState(75);
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
		public TerminalNode RENAME() { return getToken(RALIParser.RENAME, 0); }
		public TerminalNode LPAREN() { return getToken(RALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RALIParser.RPAREN, 0); }
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RALIParser.COMMA, i);
		}
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(RENAME);
			setState(78);
			((RenameContext)_localctx).alias = alias();
			((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				((RenameContext)_localctx).alias = alias();
				((RenameContext)_localctx).aliases.add(((RenameContext)_localctx).alias);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(LPAREN);
			setState(87);
			expression(0);
			setState(88);
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
		public List<TerminalNode> LABEL() { return getTokens(RALIParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(RALIParser.LABEL, i);
		}
		public TerminalNode LEFTARROW() { return getToken(RALIParser.LEFTARROW, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LABEL);
			setState(91);
			match(LEFTARROW);
			setState(92);
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
		public TerminalNode NOT() { return getToken(RALIParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NegationContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitNegation(this);
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
		public TerminalNode OR() { return getToken(RALIParser.OR, 0); }
		public OrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitOr(this);
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
		public TerminalNode AND() { return getToken(RALIParser.AND, 0); }
		public AndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitAnd(this);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ConditionContext {
		public TerminalNode LPAREN() { return getToken(RALIParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RALIParser.RPAREN, 0); }
		public CondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitCond(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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

				setState(95);
				atomicformula();
				}
				break;
			case NOT:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(NOT);
				setState(97);
				((NegationContext)_localctx).cond = condition(4);
				}
				break;
			case LPAREN:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(LPAREN);
				setState(99);
				condition(0);
				setState(100);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						((AndContext)_localctx).op = match(AND);
						setState(106);
						((AndContext)_localctx).right = condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						((OrContext)_localctx).op = match(OR);
						setState(109);
						((OrContext)_localctx).right = condition(3);
						}
						break;
					}
					} 
				}
				setState(114);
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
		public TerminalNode EQ() { return getToken(RALIParser.EQ, 0); }
		public TerminalNode LT() { return getToken(RALIParser.LT, 0); }
		public TerminalNode LTE() { return getToken(RALIParser.LTE, 0); }
		public TerminalNode GT() { return getToken(RALIParser.GT, 0); }
		public TerminalNode GTE() { return getToken(RALIParser.GTE, 0); }
		public TerminalNode NEQ() { return getToken(RALIParser.NEQ, 0); }
		public AtomicformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterAtomicformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitAtomicformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitAtomicformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicformulaContext atomicformula() throws RecognitionException {
		AtomicformulaContext _localctx = new AtomicformulaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atomicformula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((AtomicformulaContext)_localctx).left = attributeorvalue();
			setState(116);
			((AtomicformulaContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
				((AtomicformulaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
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
		public TerminalNode LABEL() { return getToken(RALIParser.LABEL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeorvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeorvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterAttributeorvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitAttributeorvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitAttributeorvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeorvalueContext attributeorvalue() throws RecognitionException {
		AttributeorvalueContext _localctx = new AttributeorvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeorvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				{
				setState(119);
				match(LABEL);
				}
				break;
			case INTEGER:
			case DECIMAL:
			case STRING:
			case DATE:
				{
				setState(120);
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
		public TerminalNode PROJECT() { return getToken(RALIParser.PROJECT, 0); }
		public TerminalNode LCURLY() { return getToken(RALIParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(RALIParser.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(RALIParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RALIParser.RPAREN, 0); }
		public List<TerminalNode> LABEL() { return getTokens(RALIParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(RALIParser.LABEL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RALIParser.COMMA, i);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(PROJECT);
			setState(124);
			match(LCURLY);
			setState(125);
			((ProjectionContext)_localctx).LABEL = match(LABEL);
			((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).LABEL);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				((ProjectionContext)_localctx).LABEL = match(LABEL);
				((ProjectionContext)_localctx).attributes.add(((ProjectionContext)_localctx).LABEL);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RCURLY);
			setState(134);
			match(LPAREN);
			setState(135);
			expression(0);
			setState(136);
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
		public TerminalNode LBRACKET() { return getToken(RALIParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(RALIParser.RBRACKET, 0); }
		public TerminalNode LCURLY() { return getToken(RALIParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(RALIParser.RCURLY, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RALIParser.COMMA, i);
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
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterInlinerelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitInlinerelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitInlinerelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlinerelationContext inlinerelation() throws RecognitionException {
		InlinerelationContext _localctx = new InlinerelationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inlinerelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(LBRACKET);
			setState(139);
			((InlinerelationContext)_localctx).attribute = attribute();
			((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(140);
				match(COMMA);
				setState(141);
				((InlinerelationContext)_localctx).attribute = attribute();
				((InlinerelationContext)_localctx).attributes.add(((InlinerelationContext)_localctx).attribute);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(RBRACKET);
			setState(148);
			match(LCURLY);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(149);
				((InlinerelationContext)_localctx).tuple = tuple();
				((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					((InlinerelationContext)_localctx).tuple = tuple();
					((InlinerelationContext)_localctx).tuples.add(((InlinerelationContext)_localctx).tuple);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(159);
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
		public TerminalNode LABEL() { return getToken(RALIParser.LABEL, 0); }
		public TerminalNode COLON() { return getToken(RALIParser.COLON, 0); }
		public TerminalNode STRINGTYPE() { return getToken(RALIParser.STRINGTYPE, 0); }
		public TerminalNode INTEGERTYPE() { return getToken(RALIParser.INTEGERTYPE, 0); }
		public TerminalNode DECIMALTYPE() { return getToken(RALIParser.DECIMALTYPE, 0); }
		public TerminalNode DATETYPE() { return getToken(RALIParser.DATETYPE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((AttributeContext)_localctx).label = match(LABEL);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(162);
				match(COLON);
				setState(163);
				((AttributeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
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
		public TerminalNode LPAREN() { return getToken(RALIParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RALIParser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RALIParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RALIParser.COMMA, i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LPAREN);
			setState(167);
			((TupleContext)_localctx).value = value();
			((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168);
				match(COMMA);
				setState(169);
				((TupleContext)_localctx).value = value();
				((TupleContext)_localctx).values.add(((TupleContext)_localctx).value);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
		public TerminalNode INTEGER() { return getToken(RALIParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(RALIParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(RALIParser.STRING, 0); }
		public TerminalNode DATE() { return getToken(RALIParser.DATE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RALIListener ) ((RALIListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RALIVisitor ) return ((RALIVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		case 7:
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
		"\u0004\u0001\'\u00b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00014\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001?\b\u0001\n\u0001\f\u0001B\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005R\b\u0005\n\u0005\f\u0005U\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007o\b\u0007"+
		"\n\u0007\f\u0007r\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\tz\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0081"+
		"\b\n\n\n\f\n\u0084\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008f\b\u000b\n\u000b"+
		"\f\u000b\u0092\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0099\b\u000b\n\u000b\f\u000b\u009c\t\u000b\u0003"+
		"\u000b\u009e\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00a5\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ab\b\r\n\r\f\r"+
		"\u00ae\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0002"+
		"\u0002\u000e\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0005\u0002\u0000\u0005\u0006\b\b\u0002"+
		"\u0000\u0007\u0007\n\n\u0001\u0000\u0010\u0015\u0001\u0000\f\u000f\u0001"+
		"\u0000#&\u00ba\u0000\"\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000"+
		"\u0000\u0004C\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\b"+
		"G\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000"+
		"\u0000\u000ef\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012"+
		"y\u0001\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u008a\u0001"+
		"\u0000\u0000\u0000\u0018\u00a1\u0001\u0000\u0000\u0000\u001a\u00a6\u0001"+
		"\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\"\u0000\u0000\u001f \u0005\u0010\u0000\u0000 #\u0003\u0002\u0001\u0000"+
		"!#\u0003\u0002\u0001\u0000\"\u001e\u0001\u0000\u0000\u0000\"!\u0001\u0000"+
		"\u0000\u0000#\u0001\u0001\u0000\u0000\u0000$%\u0006\u0001\uffff\uffff"+
		"\u0000%/\u0005\"\u0000\u0000&/\u0003\u0016\u000b\u0000\'/\u0003\u0014"+
		"\n\u0000(/\u0003\b\u0004\u0000)/\u0003\n\u0005\u0000*+\u0005\u0018\u0000"+
		"\u0000+,\u0003\u0002\u0001\u0000,-\u0005\u0019\u0000\u0000-/\u0001\u0000"+
		"\u0000\u0000.$\u0001\u0000\u0000\u0000.&\u0001\u0000\u0000\u0000.\'\u0001"+
		"\u0000\u0000\u0000.(\u0001\u0000\u0000\u0000.)\u0001\u0000\u0000\u0000"+
		".*\u0001\u0000\u0000\u0000/@\u0001\u0000\u0000\u000001\n\u0004\u0000\u0000"+
		"13\u0003\u0004\u0002\u000024\u0003\u000e\u0007\u000032\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0003\u0002"+
		"\u0001\u00056?\u0001\u0000\u0000\u000078\n\u0003\u0000\u000089\u0005\u0004"+
		"\u0000\u00009?\u0003\u0002\u0001\u0004:;\n\u0002\u0000\u0000;<\u0003\u0006"+
		"\u0003\u0000<=\u0003\u0002\u0001\u0003=?\u0001\u0000\u0000\u0000>0\u0001"+
		"\u0000\u0000\u0000>7\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000"+
		"?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A\u0003\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0007"+
		"\u0000\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0007\u0001\u0000"+
		"\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0003"+
		"\u000e\u0007\u0000IJ\u0005\u0018\u0000\u0000JK\u0003\u0002\u0001\u0000"+
		"KL\u0005\u0019\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0005\u0002\u0000"+
		"\u0000NS\u0003\f\u0006\u0000OP\u0005\u0017\u0000\u0000PR\u0003\f\u0006"+
		"\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VW\u0005\u0018\u0000\u0000WX\u0003\u0002\u0001\u0000"+
		"XY\u0005\u0019\u0000\u0000Y\u000b\u0001\u0000\u0000\u0000Z[\u0005\"\u0000"+
		"\u0000[\\\u0005\u0016\u0000\u0000\\]\u0005\"\u0000\u0000]\r\u0001\u0000"+
		"\u0000\u0000^_\u0006\u0007\uffff\uffff\u0000_g\u0003\u0010\b\u0000`a\u0005"+
		"!\u0000\u0000ag\u0003\u000e\u0007\u0004bc\u0005\u0018\u0000\u0000cd\u0003"+
		"\u000e\u0007\u0000de\u0005\u0019\u0000\u0000eg\u0001\u0000\u0000\u0000"+
		"f^\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000"+
		"\u0000gp\u0001\u0000\u0000\u0000hi\n\u0003\u0000\u0000ij\u0005\u001f\u0000"+
		"\u0000jo\u0003\u000e\u0007\u0004kl\n\u0002\u0000\u0000lm\u0005 \u0000"+
		"\u0000mo\u0003\u000e\u0007\u0003nh\u0001\u0000\u0000\u0000nk\u0001\u0000"+
		"\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u000f\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000st\u0003\u0012\t\u0000tu\u0007\u0002\u0000\u0000uv\u0003\u0012\t"+
		"\u0000v\u0011\u0001\u0000\u0000\u0000wz\u0005\"\u0000\u0000xz\u0003\u001c"+
		"\u000e\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0013"+
		"\u0001\u0000\u0000\u0000{|\u0005\u0003\u0000\u0000|}\u0005\u001a\u0000"+
		"\u0000}\u0082\u0005\"\u0000\u0000~\u007f\u0005\u0017\u0000\u0000\u007f"+
		"\u0081\u0005\"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001b\u0000\u0000\u0086\u0087"+
		"\u0005\u0018\u0000\u0000\u0087\u0088\u0003\u0002\u0001\u0000\u0088\u0089"+
		"\u0005\u0019\u0000\u0000\u0089\u0015\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u001c\u0000\u0000\u008b\u0090\u0003\u0018\f\u0000\u008c\u008d\u0005"+
		"\u0017\u0000\u0000\u008d\u008f\u0003\u0018\f\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u001d"+
		"\u0000\u0000\u0094\u009d\u0005\u001a\u0000\u0000\u0095\u009a\u0003\u001a"+
		"\r\u0000\u0096\u0097\u0005\u0017\u0000\u0000\u0097\u0099\u0003\u001a\r"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u0095\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u001b\u0000"+
		"\u0000\u00a0\u0017\u0001\u0000\u0000\u0000\u00a1\u00a4\u0005\"\u0000\u0000"+
		"\u00a2\u00a3\u0005\u001e\u0000\u0000\u00a3\u00a5\u0007\u0003\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0018\u0000\u0000"+
		"\u00a7\u00ac\u0003\u001c\u000e\u0000\u00a8\u00a9\u0005\u0017\u0000\u0000"+
		"\u00a9\u00ab\u0003\u001c\u000e\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0019\u0000\u0000"+
		"\u00b0\u001b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0004\u0000\u0000"+
		"\u00b2\u001d\u0001\u0000\u0000\u0000\u0010\".3>@Sfnpy\u0082\u0090\u009a"+
		"\u009d\u00a4\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}