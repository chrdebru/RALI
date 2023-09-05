import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RALIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LABEL=2, TIMES=3, UNION=4, INTERSECTS=5, DIVIDES=6, JOIN=7, 
		MINUS=8, PO=9, PC=10, WHITESPACE=11;
	public static final int
		RULE_start = 0, RULE_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'TIMES'", "'UNION'", "'INTERSECTS'", "'DIVIDES'", 
			"'JOIN'", "'MINUS'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "LABEL", "TIMES", "UNION", "INTERSECTS", "DIVIDES", "JOIN", 
			"MINUS", "PO", "PC", "WHITESPACE"
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

	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expression();
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
	public static class IntersectionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode PO() { return getToken(RALIParser.PO, 0); }
		public TerminalNode PC() { return getToken(RALIParser.PC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INTERSECTS() { return getToken(RALIParser.INTERSECTS, 0); }
		public IntersectionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationContext extends ExpressionContext {
		public TerminalNode LABEL() { return getToken(RALIParser.LABEL, 0); }
		public RelationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DivisionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode PO() { return getToken(RALIParser.PO, 0); }
		public TerminalNode PC() { return getToken(RALIParser.PC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDES() { return getToken(RALIParser.DIVIDES, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DifferenceContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode PO() { return getToken(RALIParser.PO, 0); }
		public TerminalNode PC() { return getToken(RALIParser.PC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(RALIParser.MINUS, 0); }
		public DifferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NaturalJoinContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode PO() { return getToken(RALIParser.PO, 0); }
		public TerminalNode PC() { return getToken(RALIParser.PC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(RALIParser.JOIN, 0); }
		public NaturalJoinContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CartesianProductContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode PO() { return getToken(RALIParser.PO, 0); }
		public TerminalNode PC() { return getToken(RALIParser.PC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(RALIParser.TIMES, 0); }
		public CartesianProductContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode PO() { return getToken(RALIParser.PO, 0); }
		public TerminalNode PC() { return getToken(RALIParser.PC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode UNION() { return getToken(RALIParser.UNION, 0); }
		public UnionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new RelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(LABEL);
				}
				break;
			case 2:
				_localctx = new CartesianProductContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				match(PO);
				setState(8);
				((CartesianProductContext)_localctx).left = expression();
				setState(9);
				((CartesianProductContext)_localctx).operator = match(TIMES);
				setState(10);
				((CartesianProductContext)_localctx).right = expression();
				setState(11);
				match(PC);
				}
				break;
			case 3:
				_localctx = new UnionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(PO);
				setState(14);
				((UnionContext)_localctx).left = expression();
				setState(15);
				((UnionContext)_localctx).operator = match(UNION);
				setState(16);
				((UnionContext)_localctx).right = expression();
				setState(17);
				match(PC);
				}
				break;
			case 4:
				_localctx = new IntersectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				match(PO);
				setState(20);
				((IntersectionContext)_localctx).left = expression();
				setState(21);
				((IntersectionContext)_localctx).operator = match(INTERSECTS);
				setState(22);
				((IntersectionContext)_localctx).right = expression();
				setState(23);
				match(PC);
				}
				break;
			case 5:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(25);
				match(PO);
				setState(26);
				((DivisionContext)_localctx).left = expression();
				setState(27);
				((DivisionContext)_localctx).operator = match(DIVIDES);
				setState(28);
				((DivisionContext)_localctx).right = expression();
				setState(29);
				match(PC);
				}
				break;
			case 6:
				_localctx = new NaturalJoinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				match(PO);
				setState(32);
				((NaturalJoinContext)_localctx).left = expression();
				setState(33);
				((NaturalJoinContext)_localctx).operator = match(JOIN);
				setState(34);
				((NaturalJoinContext)_localctx).right = expression();
				setState(35);
				match(PC);
				}
				break;
			case 7:
				_localctx = new DifferenceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(37);
				match(PO);
				setState(38);
				((DifferenceContext)_localctx).left = expression();
				setState(39);
				((DifferenceContext)_localctx).operator = match(MINUS);
				setState(40);
				((DifferenceContext)_localctx).right = expression();
				setState(41);
				match(PC);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\60\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\2\2\4\2\4\2\2\2\63\2\6\3\2\2\2\4-\3"+
		"\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b.\7\4\2\2\t\n\7\13\2\2\n\13\5\4\3\2\13"+
		"\f\7\5\2\2\f\r\5\4\3\2\r\16\7\f\2\2\16.\3\2\2\2\17\20\7\13\2\2\20\21\5"+
		"\4\3\2\21\22\7\6\2\2\22\23\5\4\3\2\23\24\7\f\2\2\24.\3\2\2\2\25\26\7\13"+
		"\2\2\26\27\5\4\3\2\27\30\7\7\2\2\30\31\5\4\3\2\31\32\7\f\2\2\32.\3\2\2"+
		"\2\33\34\7\13\2\2\34\35\5\4\3\2\35\36\7\b\2\2\36\37\5\4\3\2\37 \7\f\2"+
		"\2 .\3\2\2\2!\"\7\13\2\2\"#\5\4\3\2#$\7\t\2\2$%\5\4\3\2%&\7\f\2\2&.\3"+
		"\2\2\2\'(\7\13\2\2()\5\4\3\2)*\7\n\2\2*+\5\4\3\2+,\7\f\2\2,.\3\2\2\2-"+
		"\b\3\2\2\2-\t\3\2\2\2-\17\3\2\2\2-\25\3\2\2\2-\33\3\2\2\2-!\3\2\2\2-\'"+
		"\3\2\2\2.\5\3\2\2\2\3-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}