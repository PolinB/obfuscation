// Generated from /home/polinb/IdeaProjects/Test/src/main/java/antlr/Hello.g4 by ANTLR 4.7.2
package antlr;

    import java.util.*;

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
		LPAR=1, RPAR=2, IF=3, WHILE=4, USING=5, NAMESPACE=6, STD=7, SEMICLONE=8, 
		LONG=9, LONGLONG=10, INT=11, BOOL=12, RETURN=13, EQ=14, DEQ=15, NOT_EQ=16, 
		LS=17, GT=18, LSEQ=19, GTEQ=20, CIN=21, COUT=22, DCOLON=23, DLEFT=24, 
		DRIGHT=25, ENDL=26, TRUE=27, FALSE=28, INTEGER=29, PLUS=30, MUL=31, INCLUDE=32, 
		INCLUDE_NAME=33, MAIN=34, LPF=35, RPF=36, VARIABLE_NAME=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAR", "RPAR", "IF", "WHILE", "USING", "NAMESPACE", "STD", "SEMICLONE", 
			"LONG", "LONGLONG", "INT", "BOOL", "RETURN", "EQ", "DEQ", "NOT_EQ", "LS", 
			"GT", "LSEQ", "GTEQ", "CIN", "COUT", "DCOLON", "DLEFT", "DRIGHT", "ENDL", 
			"TRUE", "FALSE", "INTEGER", "PLUS", "MUL", "INCLUDE", "INCLUDE_NAME", 
			"MAIN", "LPF", "RPF", "VARIABLE_NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'while'", "'using'", "'namespace'", "'std'", 
			"';'", "'long'", "'long long'", "'int'", "'bool'", "'return'", "'='", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'cin'", "'cout'", "'::'", 
			"'<<'", "'>>'", "'endl'", "'true'", "'false'", null, "'+'", "'*'", "'#include'", 
			null, "'int main()'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAR", "RPAR", "IF", "WHILE", "USING", "NAMESPACE", "STD", "SEMICLONE", 
			"LONG", "LONGLONG", "INT", "BOOL", "RETURN", "EQ", "DEQ", "NOT_EQ", "LS", 
			"GT", "LSEQ", "GTEQ", "CIN", "COUT", "DCOLON", "DLEFT", "DRIGHT", "ENDL", 
			"TRUE", "FALSE", "INTEGER", "PLUS", "MUL", "INCLUDE", "INCLUDE_NAME", 
			"MAIN", "LPF", "RPF", "VARIABLE_NAME", "WS"
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


	    private static Random random = new Random();

	    private static int getRandom() {
	        int x = random.nextInt();
	        return x > 0 ? x : -x;
	    }

	    private static String addNewVariable(ArrayList<String> addedVariables, ArrayList<String> variables, int index) {
	        StringBuilder sb = new StringBuilder();
	        int randOp = getRandom() % 3;
	        String type = getType(getRandom());
	        String name = getVariableName(index);
	        String rightPart = "";
	        switch (randOp) {
	            case 0: {
	                if (addedVariables.size() == 0) {
	                    rightPart = Integer.toString(getRandom() % 1000);
	                } else {
	                    rightPart = addedVariables.get(getRandom() % addedVariables.size());
	                }
	                break;
	            }
	            case 1: {
	                if (variables.size() == 0) {
	                    rightPart = Integer.toString(getRandom() % 1000);
	                } else {
	                    rightPart = variables.get(getRandom() % variables.size());
	                }
	                break;
	            }
	            case 2: {
	                rightPart = Integer.toString(getRandom() % 1000);
	            }
	        }
	        sb.append(type).append(" ").append(name).append(" = ").append(rightPart).append(";");
	        addedVariables.add(name);
	        return sb.toString();
	    }

	    private static String addActionWithVariable(ArrayList<String> addedVariables, ArrayList<String> variables) {
	        StringBuilder sb = new StringBuilder();
	        int randOp = getRandom() % 3;
	        String name = addedVariables.get(getRandom() % addedVariables.size());
	        String rightPart = "";
	        switch (randOp) {
	            case 0: {
	                rightPart = addedVariables.get(getRandom() % addedVariables.size());
	                break;
	            }
	            case 1: {
	                if (variables.size() == 0) {
	                    rightPart = Integer.toString(getRandom() % 1000);
	                } else {
	                    rightPart = addedVariables.get(getRandom() % addedVariables.size());
	                }
	                break;
	            }
	            case 2: {
	                rightPart = Integer.toString(getRandom() % 1000);
	            }
	        }
	        sb.append(name).append(" = ").append(rightPart).append(";");

	        return sb.toString();
	    }

	    private static String getVariableName(int index) {
	        int curNumber = index / 2;
	        StringBuilder name = new StringBuilder();
	        while (curNumber != 0) {
	            switch (curNumber % 4) {
	                case 0:
	                    name.insert(0, Integer.toString(0));
	                    break;
	                case 1:
	                    name.insert(0, 'O');
	                    break;
	                case 2:
	                    name.insert(0, Integer.toString(1));
	                    break;
	                case 3:
	                    name.insert(0, 'I');
	                    break;
	            }
	            curNumber /= 4;
	        }
	        if (index % 2 == 0) {
	            name.insert(0, 'O');
	        } else {
	            name.insert(0, 'I');
	        }
	        return name.toString();
	    }

	    private static String getType(int ind) {
	        ind %= 4;
	        switch (ind) {
	            case 0:
	                return "long";
	            case 1:
	                return "long long";
	            case 2:
	                return "int";
	            case 3:
	                return "bool";
	        }
	        return "";
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0106\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u00c7\n\36\3\36\3\36\7\36\u00cb"+
		"\n\36\f\36\16\36\u00ce\13\36\3\36\5\36\u00d1\n\36\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u00e3\n\"\f\"\16\"\u00e6\13\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\7&\u00fb\n&"+
		"\f&\16&\u00fe\13&\3\'\6\'\u0101\n\'\r\'\16\'\u0102\3\'\3\'\2\2(\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(\3\2\b\3\2\63;\3\2\62;\4\2C\\c|\7\2\60\60C\\^^aac|\6\2"+
		"\62;C\\aac|\4\2\13\f\"\"\2\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O"+
		"\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tV\3\2\2\2\13\\\3\2\2\2\rb\3\2\2\2\17l"+
		"\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25w\3\2\2\2\27\u0081\3\2\2\2\31\u0085"+
		"\3\2\2\2\33\u008a\3\2\2\2\35\u0091\3\2\2\2\37\u0093\3\2\2\2!\u0096\3\2"+
		"\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u00a0\3\2\2\2+\u00a3"+
		"\3\2\2\2-\u00a7\3\2\2\2/\u00ac\3\2\2\2\61\u00af\3\2\2\2\63\u00b2\3\2\2"+
		"\2\65\u00b5\3\2\2\2\67\u00ba\3\2\2\29\u00bf\3\2\2\2;\u00d0\3\2\2\2=\u00d2"+
		"\3\2\2\2?\u00d4\3\2\2\2A\u00d6\3\2\2\2C\u00df\3\2\2\2E\u00e9\3\2\2\2G"+
		"\u00f4\3\2\2\2I\u00f6\3\2\2\2K\u00f8\3\2\2\2M\u0100\3\2\2\2OP\7*\2\2P"+
		"\4\3\2\2\2QR\7+\2\2R\6\3\2\2\2ST\7k\2\2TU\7h\2\2U\b\3\2\2\2VW\7y\2\2W"+
		"X\7j\2\2XY\7k\2\2YZ\7n\2\2Z[\7g\2\2[\n\3\2\2\2\\]\7w\2\2]^\7u\2\2^_\7"+
		"k\2\2_`\7p\2\2`a\7i\2\2a\f\3\2\2\2bc\7p\2\2cd\7c\2\2de\7o\2\2ef\7g\2\2"+
		"fg\7u\2\2gh\7r\2\2hi\7c\2\2ij\7e\2\2jk\7g\2\2k\16\3\2\2\2lm\7u\2\2mn\7"+
		"v\2\2no\7f\2\2o\20\3\2\2\2pq\7=\2\2q\22\3\2\2\2rs\7n\2\2st\7q\2\2tu\7"+
		"p\2\2uv\7i\2\2v\24\3\2\2\2wx\7n\2\2xy\7q\2\2yz\7p\2\2z{\7i\2\2{|\7\"\2"+
		"\2|}\7n\2\2}~\7q\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080\26\3\2\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\30\3\2\2\2\u0085"+
		"\u0086\7d\2\2\u0086\u0087\7q\2\2\u0087\u0088\7q\2\2\u0088\u0089\7n\2\2"+
		"\u0089\32\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7"+
		"v\2\2\u008d\u008e\7w\2\2\u008e\u008f\7t\2\2\u008f\u0090\7p\2\2\u0090\34"+
		"\3\2\2\2\u0091\u0092\7?\2\2\u0092\36\3\2\2\2\u0093\u0094\7?\2\2\u0094"+
		"\u0095\7?\2\2\u0095 \3\2\2\2\u0096\u0097\7#\2\2\u0097\u0098\7?\2\2\u0098"+
		"\"\3\2\2\2\u0099\u009a\7>\2\2\u009a$\3\2\2\2\u009b\u009c\7@\2\2\u009c"+
		"&\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7?\2\2\u009f(\3\2\2\2\u00a0\u00a1"+
		"\7@\2\2\u00a1\u00a2\7?\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5"+
		"\7k\2\2\u00a5\u00a6\7p\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7v\2\2\u00ab.\3\2\2\2\u00ac\u00ad"+
		"\7<\2\2\u00ad\u00ae\7<\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1"+
		"\7>\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7@\2\2\u00b4\64"+
		"\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7f\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00bd\7w\2\2\u00bd\u00be\7g\2\2\u00be8\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4:\3\2\2\2\u00c5\u00c7\7/\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\t\2\2\2\u00c9\u00cb\t\3\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\7\62\2\2\u00d0"+
		"\u00c6\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3"+
		">\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7%\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7w\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7g\2\2\u00deB\3\2\2\2\u00df"+
		"\u00e0\7>\2\2\u00e0\u00e4\t\4\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8D\3\2\2\2\u00e9"+
		"\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7\"\2"+
		"\2\u00ed\u00ee\7o\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1"+
		"\7p\2\2\u00f1\u00f2\7*\2\2\u00f2\u00f3\7+\2\2\u00f3F\3\2\2\2\u00f4\u00f5"+
		"\7}\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7\177\2\2\u00f7J\3\2\2\2\u00f8\u00fc"+
		"\t\4\2\2\u00f9\u00fb\t\6\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdL\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00ff\u0101\t\7\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\'\2\2\u0105"+
		"N\3\2\2\2\t\2\u00c6\u00cc\u00d0\u00e4\u00fc\u0102\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}