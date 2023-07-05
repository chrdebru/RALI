// Generated from RALI.g4 by ANTLR 4.4
package antlr4;
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, RESERVED=9, 
		NUMBER=10, LABEL=11, WHITESPACE=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "RESERVED", 
		"NUMBER", "LABEL", "WHITESPACE"
	};


	public RALILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RALI.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\no\n\n\3\13\6\13r\n\13\r\13\16\13s\3\f\3\f\7\fx\n\f\f\f\16\f"+
		"{\13\f\3\r\6\r~\n\r\r\r\16\r\177\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\6\3\2\62;\3\2C\\\4\2\62;C\\\5\2"+
		"\13\f\17\17\"\"\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5!\3\2\2\2\7)\3\2\2\2"+
		"\t/\3\2\2\2\13\61\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21D\3\2\2\2\23n\3\2\2"+
		"\2\25q\3\2\2\2\27u\3\2\2\2\31}\3\2\2\2\33\34\7O\2\2\34\35\7K\2\2\35\36"+
		"\7P\2\2\36\37\7W\2\2\37 \7U\2\2 \4\3\2\2\2!\"\7F\2\2\"#\7K\2\2#$\7X\2"+
		"\2$%\7K\2\2%&\7F\2\2&\'\7G\2\2\'(\7U\2\2(\6\3\2\2\2)*\7V\2\2*+\7K\2\2"+
		"+,\7O\2\2,-\7G\2\2-.\7U\2\2.\b\3\2\2\2/\60\7*\2\2\60\n\3\2\2\2\61\62\7"+
		"K\2\2\62\63\7P\2\2\63\64\7V\2\2\64\65\7G\2\2\65\66\7T\2\2\66\67\7U\2\2"+
		"\678\7G\2\289\7E\2\29:\7V\2\2:;\7U\2\2;\f\3\2\2\2<=\7+\2\2=\16\3\2\2\2"+
		">?\7W\2\2?@\7P\2\2@A\7K\2\2AB\7Q\2\2BC\7P\2\2C\20\3\2\2\2DE\7L\2\2EF\7"+
		"Q\2\2FG\7K\2\2GH\7P\2\2H\22\3\2\2\2IJ\7V\2\2JK\7K\2\2KL\7O\2\2LM\7G\2"+
		"\2Mo\7U\2\2NO\7F\2\2OP\7K\2\2PQ\7X\2\2QR\7K\2\2RS\7F\2\2ST\7G\2\2To\7"+
		"U\2\2UV\7W\2\2VW\7P\2\2WX\7K\2\2XY\7Q\2\2Yo\7P\2\2Z[\7W\2\2[\\\7P\2\2"+
		"\\]\7K\2\2]^\7Q\2\2^o\7P\2\2_`\7K\2\2`a\7P\2\2ab\7V\2\2bc\7G\2\2cd\7T"+
		"\2\2de\7U\2\2ef\7G\2\2fg\7E\2\2gh\7V\2\2ho\7U\2\2ij\7O\2\2jk\7K\2\2kl"+
		"\7P\2\2lm\7W\2\2mo\7U\2\2nI\3\2\2\2nN\3\2\2\2nU\3\2\2\2nZ\3\2\2\2n_\3"+
		"\2\2\2ni\3\2\2\2o\24\3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2s"+
		"t\3\2\2\2t\26\3\2\2\2uy\t\3\2\2vx\t\4\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z\30\3\2\2\2{y\3\2\2\2|~\t\5\2\2}|\3\2\2\2~\177\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\r\2\2\u0082"+
		"\32\3\2\2\2\b\2nswy\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}