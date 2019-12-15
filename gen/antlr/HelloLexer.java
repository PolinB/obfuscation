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
		VOID=9, RETURN=10, WHILE=11, DO=12, FOR=13, EQ=14, CIN=15, COUT=16, DCOLON=17, 
		DLEFT=18, DRIGHT=19, INTEGER=20, INCLUDE=21, INCLUDE_NAME=22, MAIN=23, 
		LPF=24, RPF=25, VARIABLE_NAME=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"USING", "NAMESPACE", "STD", "SEMICLONE", "LONG", "LONGLONG", "INT", 
			"BOOL", "VOID", "RETURN", "WHILE", "DO", "FOR", "EQ", "CIN", "COUT", 
			"DCOLON", "DLEFT", "DRIGHT", "INTEGER", "INCLUDE", "INCLUDE_NAME", "MAIN", 
			"LPF", "RPF", "VARIABLE_NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'using'", "'namespace'", "'std'", "';'", "'long'", "'long long'", 
			"'int'", "'bool'", "'void'", "'return'", "'while'", "'do'", "'for'", 
			"'='", "'cin'", "'cout'", "'::'", "'<<'", "'>>'", null, "'#include'", 
			null, "'int main()'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USING", "NAMESPACE", "STD", "SEMICLONE", "LONG", "LONGLONG", "INT", 
			"BOOL", "VOID", "RETURN", "WHILE", "DO", "FOR", "EQ", "CIN", "COUT", 
			"DCOLON", "DLEFT", "DRIGHT", "INTEGER", "INCLUDE", "INCLUDE_NAME", "MAIN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\5\25\u0096\n\25\3\25\3\25\7\25\u009a\n\25\f\25\16\25"+
		"\u009d\13\25\3\25\5\25\u00a0\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\7\27\u00ae\n\27\f\27\16\27\u00b1\13\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\7\33\u00c6\n\33\f\33\16\33\u00c9\13\33\3\34\6\34\u00cc"+
		"\n\34\r\34\16\34\u00cd\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\35\3\2\b\3\2\63;\3\2\62;\4\2C\\c|\7\2\60"+
		"\60C\\^^aac|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u00d6\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5?\3\2\2\2\7I\3\2\2\2\tM\3"+
		"\2\2\2\13O\3\2\2\2\rT\3\2\2\2\17^\3\2\2\2\21b\3\2\2\2\23g\3\2\2\2\25l"+
		"\3\2\2\2\27s\3\2\2\2\31y\3\2\2\2\33|\3\2\2\2\35\u0080\3\2\2\2\37\u0082"+
		"\3\2\2\2!\u0086\3\2\2\2#\u008b\3\2\2\2%\u008e\3\2\2\2\'\u0091\3\2\2\2"+
		")\u009f\3\2\2\2+\u00a1\3\2\2\2-\u00aa\3\2\2\2/\u00b4\3\2\2\2\61\u00bf"+
		"\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00cb\3\2\2\29:\7w\2\2:"+
		";\7u\2\2;<\7k\2\2<=\7p\2\2=>\7i\2\2>\4\3\2\2\2?@\7p\2\2@A\7c\2\2AB\7o"+
		"\2\2BC\7g\2\2CD\7u\2\2DE\7r\2\2EF\7c\2\2FG\7e\2\2GH\7g\2\2H\6\3\2\2\2"+
		"IJ\7u\2\2JK\7v\2\2KL\7f\2\2L\b\3\2\2\2MN\7=\2\2N\n\3\2\2\2OP\7n\2\2PQ"+
		"\7q\2\2QR\7p\2\2RS\7i\2\2S\f\3\2\2\2TU\7n\2\2UV\7q\2\2VW\7p\2\2WX\7i\2"+
		"\2XY\7\"\2\2YZ\7n\2\2Z[\7q\2\2[\\\7p\2\2\\]\7i\2\2]\16\3\2\2\2^_\7k\2"+
		"\2_`\7p\2\2`a\7v\2\2a\20\3\2\2\2bc\7d\2\2cd\7q\2\2de\7q\2\2ef\7n\2\2f"+
		"\22\3\2\2\2gh\7x\2\2hi\7q\2\2ij\7k\2\2jk\7f\2\2k\24\3\2\2\2lm\7t\2\2m"+
		"n\7g\2\2no\7v\2\2op\7w\2\2pq\7t\2\2qr\7p\2\2r\26\3\2\2\2st\7y\2\2tu\7"+
		"j\2\2uv\7k\2\2vw\7n\2\2wx\7g\2\2x\30\3\2\2\2yz\7f\2\2z{\7q\2\2{\32\3\2"+
		"\2\2|}\7h\2\2}~\7q\2\2~\177\7t\2\2\177\34\3\2\2\2\u0080\u0081\7?\2\2\u0081"+
		"\36\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085"+
		" \3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7v\2\2\u008a\"\3\2\2\2\u008b\u008c\7<\2\2\u008c\u008d\7<\2\2\u008d"+
		"$\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7>\2\2\u0090&\3\2\2\2\u0091\u0092"+
		"\7@\2\2\u0092\u0093\7@\2\2\u0093(\3\2\2\2\u0094\u0096\7/\2\2\u0095\u0094"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009b\t\2\2\2\u0098"+
		"\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a0\7\62\2\2\u009f\u0095\3\2\2\2\u009f\u009e\3\2\2\2\u00a0*\3\2\2\2"+
		"\u00a1\u00a2\7%\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5"+
		"\7e\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7f\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00af\t\4\2\2\u00ac"+
		"\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7@\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7c\2"+
		"\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7*\2\2\u00bd\u00be"+
		"\7+\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7}\2\2\u00c0\62\3\2\2\2\u00c1\u00c2"+
		"\7\177\2\2\u00c2\64\3\2\2\2\u00c3\u00c7\t\4\2\2\u00c4\u00c6\t\6\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\66\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\t\7\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\b\34\2\2\u00d08\3\2\2\2\t\2\u0095\u009b\u009f"+
		"\u00af\u00c7\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}