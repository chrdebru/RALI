// Generated from c:\Users\chris\eclipse-workspace-2\RALI\src\antlr4\RALI.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RALILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LABEL=2, TIMES=3, UNION=4, INTERSECTS=5, DIVIDES=6, JOIN=7, 
		MINUS=8, PO=9, PC=10, WHITESPACE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "LABEL", "TIMES", "UNION", "INTERSECTS", "DIVIDES", "JOIN", 
			"MINUS", "PO", "PC", "WHITESPACE", "DIGIT", "LETTER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rc\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\37\n\2\r\2\16\2 \3\3\3\3\3\3\7\3"+
		"&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\6\fZ\n\f\r\f\16\f[\3\f\3\f\3\r\3\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\3\2\5\5\2\13\f\17\17\"\"\3"+
		"\2\62;\3\2C\\\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\3\36\3\2\2\2\5\"\3\2\2\2\7*\3\2\2\2\t\60\3\2\2\2\13\66"+
		"\3\2\2\2\rA\3\2\2\2\17I\3\2\2\2\21N\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27"+
		"Y\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35\37\5\31\r\2\36\35\3\2\2\2\37 \3\2"+
		"\2\2 \36\3\2\2\2 !\3\2\2\2!\4\3\2\2\2\"\'\5\33\16\2#&\5\33\16\2$&\5\31"+
		"\r\2%#\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\6\3\2\2\2)\'"+
		"\3\2\2\2*+\7V\2\2+,\7K\2\2,-\7O\2\2-.\7G\2\2./\7U\2\2/\b\3\2\2\2\60\61"+
		"\7W\2\2\61\62\7P\2\2\62\63\7K\2\2\63\64\7Q\2\2\64\65\7P\2\2\65\n\3\2\2"+
		"\2\66\67\7K\2\2\678\7P\2\289\7V\2\29:\7G\2\2:;\7T\2\2;<\7U\2\2<=\7G\2"+
		"\2=>\7E\2\2>?\7V\2\2?@\7U\2\2@\f\3\2\2\2AB\7F\2\2BC\7K\2\2CD\7X\2\2DE"+
		"\7K\2\2EF\7F\2\2FG\7G\2\2GH\7U\2\2H\16\3\2\2\2IJ\7L\2\2JK\7Q\2\2KL\7K"+
		"\2\2LM\7P\2\2M\20\3\2\2\2NO\7O\2\2OP\7K\2\2PQ\7P\2\2QR\7W\2\2RS\7U\2\2"+
		"S\22\3\2\2\2TU\7*\2\2U\24\3\2\2\2VW\7+\2\2W\26\3\2\2\2XZ\t\2\2\2YX\3\2"+
		"\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\f\2\2^\30\3\2\2\2_"+
		"`\t\3\2\2`\32\3\2\2\2ab\t\4\2\2b\34\3\2\2\2\7\2 %\'[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}