// Generated from antlr4\RALI.g4 by ANTLR 4.12.0
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RALILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, RESERVED=9, 
		NUMBER=10, LABEL=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "RESERVED", 
			"NUMBER", "LABEL", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TIMES'", "'UNION'", "'INTERSECT'", "'DIVIDES'", "'JOIN'", "'MINUS'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "RESERVED", "NUMBER", 
			"LABEL", "WHITESPACE"
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


	public RALILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RALI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\f\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bk\b\b\u0001"+
		"\t\u0004\tn\b\t\u000b\t\f\to\u0001\n\u0001\n\u0005\nt\b\n\n\n\f\nw\t\n"+
		"\u0001\u000b\u0004\u000bz\b\u000b\u000b\u000b\f\u000b{\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0001\u0000\u0004\u0001\u000009\u0001\u0000AZ\u0002\u000009AZ\u0003\u0000"+
		"\t\n\r\r  \u0086\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000"+
		"\u0000\u0005%\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t"+
		"7\u0001\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\rB\u0001\u0000"+
		"\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011j\u0001\u0000\u0000\u0000"+
		"\u0013m\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017y"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005T\u0000\u0000\u001a\u001b\u0005"+
		"I\u0000\u0000\u001b\u001c\u0005M\u0000\u0000\u001c\u001d\u0005E\u0000"+
		"\u0000\u001d\u001e\u0005S\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000"+
		"\u001f \u0005U\u0000\u0000 !\u0005N\u0000\u0000!\"\u0005I\u0000\u0000"+
		"\"#\u0005O\u0000\u0000#$\u0005N\u0000\u0000$\u0004\u0001\u0000\u0000\u0000"+
		"%&\u0005I\u0000\u0000&\'\u0005N\u0000\u0000\'(\u0005T\u0000\u0000()\u0005"+
		"E\u0000\u0000)*\u0005R\u0000\u0000*+\u0005S\u0000\u0000+,\u0005E\u0000"+
		"\u0000,-\u0005C\u0000\u0000-.\u0005T\u0000\u0000.\u0006\u0001\u0000\u0000"+
		"\u0000/0\u0005D\u0000\u000001\u0005I\u0000\u000012\u0005V\u0000\u0000"+
		"23\u0005I\u0000\u000034\u0005D\u0000\u000045\u0005E\u0000\u000056\u0005"+
		"S\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005J\u0000\u000089\u0005"+
		"O\u0000\u00009:\u0005I\u0000\u0000:;\u0005N\u0000\u0000;\n\u0001\u0000"+
		"\u0000\u0000<=\u0005M\u0000\u0000=>\u0005I\u0000\u0000>?\u0005N\u0000"+
		"\u0000?@\u0005U\u0000\u0000@A\u0005S\u0000\u0000A\f\u0001\u0000\u0000"+
		"\u0000BC\u0005(\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005)\u0000"+
		"\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005T\u0000\u0000GH\u0005I\u0000"+
		"\u0000HI\u0005M\u0000\u0000IJ\u0005E\u0000\u0000Jk\u0005S\u0000\u0000"+
		"KL\u0005D\u0000\u0000LM\u0005I\u0000\u0000MN\u0005V\u0000\u0000NO\u0005"+
		"I\u0000\u0000OP\u0005D\u0000\u0000PQ\u0005E\u0000\u0000Qk\u0005S\u0000"+
		"\u0000RS\u0005U\u0000\u0000ST\u0005N\u0000\u0000TU\u0005I\u0000\u0000"+
		"UV\u0005O\u0000\u0000Vk\u0005N\u0000\u0000WX\u0005U\u0000\u0000XY\u0005"+
		"N\u0000\u0000YZ\u0005I\u0000\u0000Z[\u0005O\u0000\u0000[k\u0005N\u0000"+
		"\u0000\\]\u0005I\u0000\u0000]^\u0005N\u0000\u0000^_\u0005T\u0000\u0000"+
		"_`\u0005E\u0000\u0000`a\u0005R\u0000\u0000ab\u0005S\u0000\u0000bc\u0005"+
		"E\u0000\u0000cd\u0005C\u0000\u0000dk\u0005T\u0000\u0000ef\u0005M\u0000"+
		"\u0000fg\u0005I\u0000\u0000gh\u0005N\u0000\u0000hi\u0005U\u0000\u0000"+
		"ik\u0005S\u0000\u0000jF\u0001\u0000\u0000\u0000jK\u0001\u0000\u0000\u0000"+
		"jR\u0001\u0000\u0000\u0000jW\u0001\u0000\u0000\u0000j\\\u0001\u0000\u0000"+
		"\u0000je\u0001\u0000\u0000\u0000k\u0012\u0001\u0000\u0000\u0000ln\u0007"+
		"\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0014\u0001\u0000"+
		"\u0000\u0000qu\u0007\u0001\u0000\u0000rt\u0007\u0002\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u0016\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xz\u0007\u0003\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}~\u0006\u000b\u0000\u0000~\u0018\u0001\u0000"+
		"\u0000\u0000\u0006\u0000josu{\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}