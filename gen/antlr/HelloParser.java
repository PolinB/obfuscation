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
		DO=9, FOR=10, EQ=11, INTEGER=12, VARIABLE_NAME=13, WS=14;
	public static final int
		RULE_start = 0, RULE_body = 1, RULE_expression = 2, RULE_type = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "body", "expression", "type"
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
		public BodyContext body;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		        ((StartContext)_localctx).index =  0;
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((StartContext)_localctx).body = body();

			        StringBuilder sb = new StringBuilder();
			        sb.append("#include <iostream>\nint main() {\n").append(((StartContext)_localctx).body.sb.toString()).append("}");
			        System.out.println(sb.toString());
			    
			setState(10);
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
		enterRule(_localctx, 2, RULE_body);

		        ((BodyContext)_localctx).sb =  new StringBuilder();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LONG) | (1L << LONGLONG) | (1L << INT) | (1L << BOOL) | (1L << VOID))) != 0)) {
				{
				{
				setState(12);
				((BodyContext)_localctx).expression = expression();
				_localctx.sb.append(((BodyContext)_localctx).expression.sb.toString()).append("\n");
				}
				}
				setState(19);
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
		enterRule(_localctx, 4, RULE_expression);

		        ((ExpressionContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((ExpressionContext)_localctx).type = type();

			        _localctx.sb.append(((ExpressionContext)_localctx).type.sb.toString()).append(" ");
			    
			setState(22);
			((ExpressionContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((ExpressionContext)_localctx).VARIABLE_NAME!=null?((ExpressionContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
			            _localctx.sb.append(((StartContext)getInvokingContext(0)).variables.get(variableName));
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
			            ((StartContext)getInvokingContext(0)).variables.put(variableName, newName/*Integer.toString(((StartContext)getInvokingContext(0)).index)*/);
			            _localctx.sb.append(newName/*Integer.toString(((StartContext)getInvokingContext(0)).index)*/);
			            ((StartContext)getInvokingContext(0)).index++;
			        }
			    
			setState(24);
			match(EQ);

			        _localctx.sb.append(" = ");
			    
			setState(26);
			((ExpressionContext)_localctx).INTEGER = match(INTEGER);

			        _localctx.sb.append((((ExpressionContext)_localctx).INTEGER!=null?((ExpressionContext)_localctx).INTEGER.getText():null));
			    
			setState(28);
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
		enterRule(_localctx, 6, RULE_type);

		        ((TypeContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				((TypeContext)_localctx).LONG = match(LONG);
				_localctx.sb.append((((TypeContext)_localctx).LONG!=null?((TypeContext)_localctx).LONG.getText():null));
				}
				break;
			case LONGLONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				((TypeContext)_localctx).LONGLONG = match(LONGLONG);
				_localctx.sb.append((((TypeContext)_localctx).LONGLONG!=null?((TypeContext)_localctx).LONGLONG.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				((TypeContext)_localctx).INT = match(INT);
				_localctx.sb.append((((TypeContext)_localctx).INT!=null?((TypeContext)_localctx).INT.getText():null));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				((TypeContext)_localctx).BOOL = match(BOOL);
				_localctx.sb.append((((TypeContext)_localctx).BOOL!=null?((TypeContext)_localctx).BOOL.getText():null));
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20.\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5,\n\5\3\5\2\2\6\2\4\6\b\2\2\2.\2\n\3\2\2\2\4\23"+
		"\3\2\2\2\6\26\3\2\2\2\b+\3\2\2\2\n\13\5\4\3\2\13\f\b\2\1\2\f\r\7\2\2\3"+
		"\r\3\3\2\2\2\16\17\5\6\4\2\17\20\b\3\1\2\20\22\3\2\2\2\21\16\3\2\2\2\22"+
		"\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\23\3\2\2\2\26"+
		"\27\5\b\5\2\27\30\b\4\1\2\30\31\7\17\2\2\31\32\b\4\1\2\32\33\7\r\2\2\33"+
		"\34\b\4\1\2\34\35\7\16\2\2\35\36\b\4\1\2\36\37\7\3\2\2\37 \b\4\1\2 \7"+
		"\3\2\2\2!\"\7\4\2\2\",\b\5\1\2#$\7\5\2\2$,\b\5\1\2%&\7\6\2\2&,\b\5\1\2"+
		"\'(\7\7\2\2(,\b\5\1\2)*\7\b\2\2*,\b\5\1\2+!\3\2\2\2+#\3\2\2\2+%\3\2\2"+
		"\2+\'\3\2\2\2+)\3\2\2\2,\t\3\2\2\2\4\23+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}