// Generated from /home/polinb/IdeaProjects/Test/src/main/java/antlr/Hello.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USING=1, NAMESPACE=2, STD=3, SEMICLONE=4, LONG=5, LONGLONG=6, INT=7, BOOL=8, 
		VOID=9, RETURN=10, WHILE=11, DO=12, FOR=13, EQ=14, INTEGER=15, INCLUDE=16, 
		INCLUDE_NAME=17, MAIN=18, LPF=19, RPF=20, VARIABLE_NAME=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"USING", "NAMESPACE", "STD", "SEMICLONE", "LONG", "LONGLONG", "INT", 
			"BOOL", "VOID", "RETURN", "WHILE", "DO", "FOR", "EQ", "INTEGER", "INCLUDE", 
			"INCLUDE_NAME", "MAIN", "LPF", "RPF", "VARIABLE_NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'using'", "'namespace'", "'std'", "';'", "'long'", "'long long'", 
			"'int'", "'bool'", "'void'", "'return'", "'while'", "'do'", "'for'", 
			"'='", null, "'#include'", null, "'int main()'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USING", "NAMESPACE", "STD", "SEMICLONE", "LONG", "LONGLONG", "INT", 
			"BOOL", "VOID", "RETURN", "WHILE", "DO", "FOR", "EQ", "INTEGER", "INCLUDE", 
			"INCLUDE_NAME", "MAIN", "LPF", "RPF", "VARIABLE_NAME", "WS"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\5\20z\n\20\3\20\3\20\7\20~\n\20\f\20\16\20\u0081\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u008f"+
		"\n\22\f\22\16\22\u0092\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u00a7\n\26"+
		"\f\26\16\26\u00aa\13\26\3\27\6\27\u00ad\n\27\r\27\16\27\u00ae\3\27\3\27"+
		"\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\3\2\63;\3\2\62;\4\2C\\"+
		"c|\7\2\60\60C\\^^aac|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u00b6\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\65\3\2\2"+
		"\2\7?\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rJ\3\2\2\2\17T\3\2\2\2\21X\3\2\2"+
		"\2\23]\3\2\2\2\25b\3\2\2\2\27i\3\2\2\2\31o\3\2\2\2\33r\3\2\2\2\35v\3\2"+
		"\2\2\37y\3\2\2\2!\u0082\3\2\2\2#\u008b\3\2\2\2%\u0095\3\2\2\2\'\u00a0"+
		"\3\2\2\2)\u00a2\3\2\2\2+\u00a4\3\2\2\2-\u00ac\3\2\2\2/\60\7w\2\2\60\61"+
		"\7u\2\2\61\62\7k\2\2\62\63\7p\2\2\63\64\7i\2\2\64\4\3\2\2\2\65\66\7p\2"+
		"\2\66\67\7c\2\2\678\7o\2\289\7g\2\29:\7u\2\2:;\7r\2\2;<\7c\2\2<=\7e\2"+
		"\2=>\7g\2\2>\6\3\2\2\2?@\7u\2\2@A\7v\2\2AB\7f\2\2B\b\3\2\2\2CD\7=\2\2"+
		"D\n\3\2\2\2EF\7n\2\2FG\7q\2\2GH\7p\2\2HI\7i\2\2I\f\3\2\2\2JK\7n\2\2KL"+
		"\7q\2\2LM\7p\2\2MN\7i\2\2NO\7\"\2\2OP\7n\2\2PQ\7q\2\2QR\7p\2\2RS\7i\2"+
		"\2S\16\3\2\2\2TU\7k\2\2UV\7p\2\2VW\7v\2\2W\20\3\2\2\2XY\7d\2\2YZ\7q\2"+
		"\2Z[\7q\2\2[\\\7n\2\2\\\22\3\2\2\2]^\7x\2\2^_\7q\2\2_`\7k\2\2`a\7f\2\2"+
		"a\24\3\2\2\2bc\7t\2\2cd\7g\2\2de\7v\2\2ef\7w\2\2fg\7t\2\2gh\7p\2\2h\26"+
		"\3\2\2\2ij\7y\2\2jk\7j\2\2kl\7k\2\2lm\7n\2\2mn\7g\2\2n\30\3\2\2\2op\7"+
		"f\2\2pq\7q\2\2q\32\3\2\2\2rs\7h\2\2st\7q\2\2tu\7t\2\2u\34\3\2\2\2vw\7"+
		"?\2\2w\36\3\2\2\2xz\7/\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\177\t\2\2\2"+
		"|~\t\3\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		" \3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7%\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7e\2\2\u0086\u0087\7n\2\2\u0087\u0088\7w\2\2"+
		"\u0088\u0089\7f\2\2\u0089\u008a\7g\2\2\u008a\"\3\2\2\2\u008b\u008c\7>"+
		"\2\2\u008c\u0090\t\4\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7@\2\2\u0094$\3\2\2\2\u0095\u0096"+
		"\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\u0099\7\"\2\2\u0099"+
		"\u009a\7o\2\2\u009a\u009b\7c\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2"+
		"\u009d\u009e\7*\2\2\u009e\u009f\7+\2\2\u009f&\3\2\2\2\u00a0\u00a1\7}\2"+
		"\2\u00a1(\3\2\2\2\u00a2\u00a3\7\177\2\2\u00a3*\3\2\2\2\u00a4\u00a8\t\4"+
		"\2\2\u00a5\u00a7\t\6\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9,\3\2\2\2\u00aa\u00a8\3\2\2\2"+
		"\u00ab\u00ad\t\7\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\27\2\2"+
		"\u00b1.\3\2\2\2\b\2y\177\u0090\u00a8\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}