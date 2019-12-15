// Generated from /home/polinb/IdeaProjects/Test/src/main/java/antlr/Hello.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICLONE=1, LONG=2, LONGLONG=3, INT=4, BOOL=5, VOID=6, RETURN=7, WHILE=8, 
		DO=9, FOR=10, EQ=11, INTEGER=12, INCLUDE=13, INCLUDE_NAME=14, MAIN=15, 
		LPF=16, RPF=17, VARIABLE_NAME=18, WS=19;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_body = 2, RULE_expression = 3, 
		RULE_type = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "body", "expression", "type"
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

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public java.util.HashMap<String, String> variables;
		public int index;
		public ProgramContext program;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);

		        ((StartContext)_localctx).variables =  new java.util.HashMap<>();
		        ((StartContext)_localctx).index =  10;
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((StartContext)_localctx).program = program();

			        StringBuilder sb = new StringBuilder();
			        sb.append(((StartContext)_localctx).program.sb.toString());
			        System.out.println(sb.toString());
			    
			setState(12);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token INCLUDE;
		public Token INCLUDE_NAME;
		public Token MAIN;
		public Token LPF;
		public BodyContext body;
		public Token RPF;
		public TerminalNode MAIN() { return getToken(HelloParser.MAIN, 0); }
		public TerminalNode LPF() { return getToken(HelloParser.LPF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RPF() { return getToken(HelloParser.RPF, 0); }
		public List<TerminalNode> INCLUDE() { return getTokens(HelloParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(HelloParser.INCLUDE, i);
		}
		public List<TerminalNode> INCLUDE_NAME() { return getTokens(HelloParser.INCLUDE_NAME); }
		public TerminalNode INCLUDE_NAME(int i) {
			return getToken(HelloParser.INCLUDE_NAME, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);

		            ((ProgramContext)_localctx).sb =  new StringBuilder();
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(14);
				((ProgramContext)_localctx).INCLUDE = match(INCLUDE);
				_localctx.sb.append((((ProgramContext)_localctx).INCLUDE!=null?((ProgramContext)_localctx).INCLUDE.getText():null)).append(" ");
				setState(16);
				((ProgramContext)_localctx).INCLUDE_NAME = match(INCLUDE_NAME);
				_localctx.sb.append((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).append("\n");
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			((ProgramContext)_localctx).MAIN = match(MAIN);
			_localctx.sb.append("\n").append((((ProgramContext)_localctx).MAIN!=null?((ProgramContext)_localctx).MAIN.getText():null)).append(" ");
			setState(25);
			((ProgramContext)_localctx).LPF = match(LPF);
			_localctx.sb.append((((ProgramContext)_localctx).LPF!=null?((ProgramContext)_localctx).LPF.getText():null)).append("\n");
			setState(27);
			((ProgramContext)_localctx).body = body();
			_localctx.sb.append(((ProgramContext)_localctx).body.sb.toString());
			setState(29);
			((ProgramContext)_localctx).RPF = match(RPF);
			_localctx.sb.append((((ProgramContext)_localctx).RPF!=null?((ProgramContext)_localctx).RPF.getText():null));
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

	public static class BodyContext extends ParserRuleContext {
		public StringBuilder sb;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);

		        ((BodyContext)_localctx).sb =  new StringBuilder();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LONG) | (1L << LONGLONG) | (1L << INT) | (1L << BOOL) | (1L << VOID))) != 0)) {
				{
				{
				setState(32);
				((BodyContext)_localctx).expression = expression();
				_localctx.sb.append(((BodyContext)_localctx).expression.sb.toString()).append("\n");
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public StringBuilder sb;
		public TypeContext type;
		public Token VARIABLE_NAME;
		public Token INTEGER;
		public Token SEMICLONE;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(HelloParser.VARIABLE_NAME, 0); }
		public TerminalNode EQ() { return getToken(HelloParser.EQ, 0); }
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public TerminalNode SEMICLONE() { return getToken(HelloParser.SEMICLONE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);

		        ((ExpressionContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((ExpressionContext)_localctx).type = type();

			        _localctx.sb.append(((ExpressionContext)_localctx).type.sb.toString()).append(" ");
			    
			setState(42);
			((ExpressionContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((ExpressionContext)_localctx).VARIABLE_NAME!=null?((ExpressionContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
			            /*_localctx.sb.append(((StartContext)getInvokingContext(0)).variables.get(variableName));*/
			            throw new RuntimeException("Re-declaring a variable.");
			        } else {
			            int curNumber = (((StartContext)getInvokingContext(0)).index) / 2;
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
			            if ((((StartContext)getInvokingContext(0)).index) % 2 == 0) {
			                name.insert(0, 'O');
			            } else {
			                name.insert(0, 'I');
			            }
			            String newName = name.toString();
			            ((StartContext)getInvokingContext(0)).variables.put(variableName, newName);
			            _localctx.sb.append(newName);
			            ((StartContext)getInvokingContext(0)).index++;
			        }
			    
			setState(44);
			match(EQ);

			        _localctx.sb.append(" = ");
			    
			setState(46);
			((ExpressionContext)_localctx).INTEGER = match(INTEGER);

			        _localctx.sb.append((((ExpressionContext)_localctx).INTEGER!=null?((ExpressionContext)_localctx).INTEGER.getText():null));
			    
			setState(48);
			((ExpressionContext)_localctx).SEMICLONE = match(SEMICLONE);

			        _localctx.sb.append((((ExpressionContext)_localctx).SEMICLONE!=null?((ExpressionContext)_localctx).SEMICLONE.getText():null));
			    
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

	public static class TypeContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token LONG;
		public Token LONGLONG;
		public Token INT;
		public Token BOOL;
		public Token VOID;
		public TerminalNode LONG() { return getToken(HelloParser.LONG, 0); }
		public TerminalNode LONGLONG() { return getToken(HelloParser.LONGLONG, 0); }
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public TerminalNode VOID() { return getToken(HelloParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);

		        ((TypeContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((TypeContext)_localctx).LONG = match(LONG);
				_localctx.sb.append((((TypeContext)_localctx).LONG!=null?((TypeContext)_localctx).LONG.getText():null));
				}
				break;
			case LONGLONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((TypeContext)_localctx).LONGLONG = match(LONGLONG);
				_localctx.sb.append((((TypeContext)_localctx).LONGLONG!=null?((TypeContext)_localctx).LONGLONG.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				((TypeContext)_localctx).INT = match(INT);
				_localctx.sb.append((((TypeContext)_localctx).INT!=null?((TypeContext)_localctx).INT.getText():null));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				((TypeContext)_localctx).BOOL = match(BOOL);
				_localctx.sb.append((((TypeContext)_localctx).BOOL!=null?((TypeContext)_localctx).BOOL.getText():null));
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				((TypeContext)_localctx).VOID = match(VOID);
				_localctx.sb.append((((TypeContext)_localctx).VOID!=null?((TypeContext)_localctx).VOID.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\25\n\3"+
		"\f\3\16\3\30\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4"+
		"&\n\4\f\4\16\4)\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2"+
		"B\2\f\3\2\2\2\4\26\3\2\2\2\6\'\3\2\2\2\b*\3\2\2\2\n?\3\2\2\2\f\r\5\4\3"+
		"\2\r\16\b\2\1\2\16\17\7\2\2\3\17\3\3\2\2\2\20\21\7\17\2\2\21\22\b\3\1"+
		"\2\22\23\7\20\2\2\23\25\b\3\1\2\24\20\3\2\2\2\25\30\3\2\2\2\26\24\3\2"+
		"\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\21\2\2\32\33\b"+
		"\3\1\2\33\34\7\22\2\2\34\35\b\3\1\2\35\36\5\6\4\2\36\37\b\3\1\2\37 \7"+
		"\23\2\2 !\b\3\1\2!\5\3\2\2\2\"#\5\b\5\2#$\b\4\1\2$&\3\2\2\2%\"\3\2\2\2"+
		"&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\7\3\2\2\2)\'\3\2\2\2*+\5\n\6\2+,\b\5"+
		"\1\2,-\7\24\2\2-.\b\5\1\2./\7\r\2\2/\60\b\5\1\2\60\61\7\16\2\2\61\62\b"+
		"\5\1\2\62\63\7\3\2\2\63\64\b\5\1\2\64\t\3\2\2\2\65\66\7\4\2\2\66@\b\6"+
		"\1\2\678\7\5\2\28@\b\6\1\29:\7\6\2\2:@\b\6\1\2;<\7\7\2\2<@\b\6\1\2=>\7"+
		"\b\2\2>@\b\6\1\2?\65\3\2\2\2?\67\3\2\2\2?9\3\2\2\2?;\3\2\2\2?=\3\2\2\2"+
		"@\13\3\2\2\2\5\26\'?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}