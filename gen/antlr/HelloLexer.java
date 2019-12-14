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
		DO=9, FOR=10, EQ=11, INTEGER=12, VARIABLE_NAME=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICLONE", "LONG", "LONGLONG", "INT", "BOOL", "VOID", "RETURN", "WHILE", 
			"DO", "FOR", "EQ", "INTEGER", "VARIABLE_NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'long'", "'long long'", "'int'", "'bool'", "'void'", "'return'", 
			"'while'", "'do'", "'for'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICLONE", "LONG", "LONGLONG", "INT", "BOOL", "VOID", "RETURN", 
			"WHILE", "DO", "FOR", "EQ", "INTEGER", "VARIABLE_NAME", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\5\rV\n\r\3\r\3\r\7"+
		"\rZ\n\r\f\r\16\r]\13\r\3\16\3\16\7\16a\n\16\f\16\16\16d\13\16\3\17\6\17"+
		"g\n\17\r\17\16\17h\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\3\2\7\3\2\63;\3\2\62;\4\2C\\c|\6\2"+
		"\62;C\\aac|\4\2\13\f\"\"\2o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37"+
		"\3\2\2\2\5!\3\2\2\2\7&\3\2\2\2\t\60\3\2\2\2\13\64\3\2\2\2\r9\3\2\2\2\17"+
		">\3\2\2\2\21E\3\2\2\2\23K\3\2\2\2\25N\3\2\2\2\27R\3\2\2\2\31U\3\2\2\2"+
		"\33^\3\2\2\2\35f\3\2\2\2\37 \7=\2\2 \4\3\2\2\2!\"\7n\2\2\"#\7q\2\2#$\7"+
		"p\2\2$%\7i\2\2%\6\3\2\2\2&\'\7n\2\2\'(\7q\2\2()\7p\2\2)*\7i\2\2*+\7\""+
		"\2\2+,\7n\2\2,-\7q\2\2-.\7p\2\2./\7i\2\2/\b\3\2\2\2\60\61\7k\2\2\61\62"+
		"\7p\2\2\62\63\7v\2\2\63\n\3\2\2\2\64\65\7d\2\2\65\66\7q\2\2\66\67\7q\2"+
		"\2\678\7n\2\28\f\3\2\2\29:\7x\2\2:;\7q\2\2;<\7k\2\2<=\7f\2\2=\16\3\2\2"+
		"\2>?\7t\2\2?@\7g\2\2@A\7v\2\2AB\7w\2\2BC\7t\2\2CD\7p\2\2D\20\3\2\2\2E"+
		"F\7y\2\2FG\7j\2\2GH\7k\2\2HI\7n\2\2IJ\7g\2\2J\22\3\2\2\2KL\7f\2\2LM\7"+
		"q\2\2M\24\3\2\2\2NO\7h\2\2OP\7q\2\2PQ\7t\2\2Q\26\3\2\2\2RS\7?\2\2S\30"+
		"\3\2\2\2TV\7/\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W[\t\2\2\2XZ\t\3\2\2YX"+
		"\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\32\3\2\2\2][\3\2\2\2^b\t\4\2"+
		"\2_a\t\5\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\34\3\2\2\2db\3\2"+
		"\2\2eg\t\6\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\17"+
		"\2\2k\36\3\2\2\2\7\2U[bh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}