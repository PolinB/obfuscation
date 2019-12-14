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
		SEMICLONE=1, LONG=2, LONGLONG=3, INT=4, BOOL=5, VOID=6, RETURN=7, WHILE=8, 
		DO=9, FOR=10, EQ=11, INTEGER=12, INCLUDE=13, INCLUDE_NAME=14, MAIN=15, 
		LPF=16, RPF=17, VARIABLE_NAME=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICLONE", "LONG", "LONGLONG", "INT", "BOOL", "VOID", "RETURN", "WHILE", 
			"DO", "FOR", "EQ", "INTEGER", "INCLUDE", "INCLUDE_NAME", "MAIN", "LPF", 
			"RPF", "VARIABLE_NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'long'", "'long long'", "'int'", "'bool'", "'void'", "'return'", 
			"'while'", "'do'", "'for'", "'='", null, "'#include'", null, "'int main()'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICLONE", "LONG", "LONGLONG", "INT", "BOOL", "VOID", "RETURN", 
			"WHILE", "DO", "FOR", "EQ", "INTEGER", "INCLUDE", "INCLUDE_NAME", "MAIN", 
			"LPF", "RPF", "VARIABLE_NAME", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\5\r`\n\r\3\r\3\r\7\rd\n\r\f\r\16"+
		"\rg\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7"+
		"\17u\n\17\f\17\16\17x\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23\u008d\n\23"+
		"\f\23\16\23\u0090\13\23\3\24\6\24\u0093\n\24\r\24\16\24\u0094\3\24\3\24"+
		"\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25\3\2\b\3\2\63;\3\2\62;\4\2C\\c|\7\2\60\60"+
		"C\\^^aac|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u009c\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\3)\3\2\2\2\5+\3\2\2\2\7\60\3\2\2\2\t:\3\2\2\2\13>\3\2\2\2\rC\3\2"+
		"\2\2\17H\3\2\2\2\21O\3\2\2\2\23U\3\2\2\2\25X\3\2\2\2\27\\\3\2\2\2\31_"+
		"\3\2\2\2\33h\3\2\2\2\35q\3\2\2\2\37{\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2"+
		"\2\2%\u008a\3\2\2\2\'\u0092\3\2\2\2)*\7=\2\2*\4\3\2\2\2+,\7n\2\2,-\7q"+
		"\2\2-.\7p\2\2./\7i\2\2/\6\3\2\2\2\60\61\7n\2\2\61\62\7q\2\2\62\63\7p\2"+
		"\2\63\64\7i\2\2\64\65\7\"\2\2\65\66\7n\2\2\66\67\7q\2\2\678\7p\2\289\7"+
		"i\2\29\b\3\2\2\2:;\7k\2\2;<\7p\2\2<=\7v\2\2=\n\3\2\2\2>?\7d\2\2?@\7q\2"+
		"\2@A\7q\2\2AB\7n\2\2B\f\3\2\2\2CD\7x\2\2DE\7q\2\2EF\7k\2\2FG\7f\2\2G\16"+
		"\3\2\2\2HI\7t\2\2IJ\7g\2\2JK\7v\2\2KL\7w\2\2LM\7t\2\2MN\7p\2\2N\20\3\2"+
		"\2\2OP\7y\2\2PQ\7j\2\2QR\7k\2\2RS\7n\2\2ST\7g\2\2T\22\3\2\2\2UV\7f\2\2"+
		"VW\7q\2\2W\24\3\2\2\2XY\7h\2\2YZ\7q\2\2Z[\7t\2\2[\26\3\2\2\2\\]\7?\2\2"+
		"]\30\3\2\2\2^`\7/\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ae\t\2\2\2bd\t\3\2"+
		"\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\32\3\2\2\2ge\3\2\2\2hi\7%"+
		"\2\2ij\7k\2\2jk\7p\2\2kl\7e\2\2lm\7n\2\2mn\7w\2\2no\7f\2\2op\7g\2\2p\34"+
		"\3\2\2\2qr\7>\2\2rv\t\4\2\2su\t\5\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw"+
		"\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7@\2\2z\36\3\2\2\2{|\7k\2\2|}\7p\2\2}~"+
		"\7v\2\2~\177\7\"\2\2\177\u0080\7o\2\2\u0080\u0081\7c\2\2\u0081\u0082\7"+
		"k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7*\2\2\u0084\u0085\7+\2\2\u0085 "+
		"\3\2\2\2\u0086\u0087\7}\2\2\u0087\"\3\2\2\2\u0088\u0089\7\177\2\2\u0089"+
		"$\3\2\2\2\u008a\u008e\t\4\2\2\u008b\u008d\t\6\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f&\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\t\7\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\b\24\2\2\u0097(\3\2\2\2\b\2_ev\u008e\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}