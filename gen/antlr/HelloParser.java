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
		USING=1, NAMESPACE=2, STD=3, SEMICLONE=4, LONG=5, LONGLONG=6, INT=7, BOOL=8, 
		VOID=9, RETURN=10, WHILE=11, DO=12, FOR=13, EQ=14, CIN=15, COUT=16, DCOLON=17, 
		DLEFT=18, DRIGHT=19, INTEGER=20, INCLUDE=21, INCLUDE_NAME=22, MAIN=23, 
		LPF=24, RPF=25, VARIABLE_NAME=26, WS=27;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_body = 2, RULE_line = 3, RULE_variableDeclaration = 4, 
		RULE_rightPart = 5, RULE_variableChange = 6, RULE_integerOrVariableInRightPart = 7, 
		RULE_variableInRightPart = 8, RULE_type = 9, RULE_usingLine = 10, RULE_cinLine = 11, 
		RULE_coutLine = 12, RULE_returnLine = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "body", "line", "variableDeclaration", "rightPart", 
			"variableChange", "integerOrVariableInRightPart", "variableInRightPart", 
			"type", "usingLine", "cinLine", "coutLine", "returnLine"
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
		public boolean connectedIostream;
		public boolean connectedStd;
		public boolean hasReturn;
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
		        ((StartContext)_localctx).connectedIostream =  false;
		        ((StartContext)_localctx).connectedStd =  false;
		        ((StartContext)_localctx).hasReturn =  false;
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((StartContext)_localctx).program = program();

			        StringBuilder sb = new StringBuilder();
			        sb.append(((StartContext)_localctx).program.sb.toString());
			        System.out.println(sb.toString());
			    
			setState(30);
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
		public UsingLineContext usingLine;
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
		public UsingLineContext usingLine() {
			return getRuleContext(UsingLineContext.class,0);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(32);
				((ProgramContext)_localctx).INCLUDE = match(INCLUDE);
				_localctx.sb.append((((ProgramContext)_localctx).INCLUDE!=null?((ProgramContext)_localctx).INCLUDE.getText():null)).append(" ");
				setState(34);
				((ProgramContext)_localctx).INCLUDE_NAME = match(INCLUDE_NAME);

				            if (((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).equals("<iostream>")) {
				                ((StartContext)getInvokingContext(0)).connectedIostream =  true;
				            }
				            _localctx.sb.append((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).append("\n");
				         
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(41);
				((ProgramContext)_localctx).usingLine = usingLine();

				            ((StartContext)getInvokingContext(0)).connectedStd =  true;
				            _localctx.sb.append("\n").append(((ProgramContext)_localctx).usingLine.sb.toString());
				         
				}
			}

			setState(46);
			((ProgramContext)_localctx).MAIN = match(MAIN);
			_localctx.sb.append("\n").append((((ProgramContext)_localctx).MAIN!=null?((ProgramContext)_localctx).MAIN.getText():null)).append(" ");
			setState(48);
			((ProgramContext)_localctx).LPF = match(LPF);
			_localctx.sb.append((((ProgramContext)_localctx).LPF!=null?((ProgramContext)_localctx).LPF.getText():null)).append("\n");
			setState(50);
			((ProgramContext)_localctx).body = body();

			            if (!((ProgramContext)_localctx).body.hasReturn) {
			                throw new RuntimeException("Forgot return.");
			            }
			            _localctx.sb.append(((ProgramContext)_localctx).body.sb.toString());
			         
			setState(52);
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
		public boolean hasReturn;
		public LineContext line;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
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
		        ((BodyContext)_localctx).hasReturn =  false;
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STD) | (1L << LONG) | (1L << LONGLONG) | (1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << RETURN) | (1L << CIN) | (1L << COUT) | (1L << VARIABLE_NAME))) != 0)) {
				{
				{
				setState(55);
				((BodyContext)_localctx).line = line();

				        _localctx.sb.append(((BodyContext)_localctx).line.sb.toString()).append("\n");
				        if (((BodyContext)_localctx).line.hasReturn) {
				            ((BodyContext)_localctx).hasReturn =  true;
				        }
				    
				}
				}
				setState(62);
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

	public static class LineContext extends ParserRuleContext {
		public StringBuilder sb;
		public boolean hasReturn;
		public VariableDeclarationContext variableDeclaration;
		public VariableChangeContext variableChange;
		public CinLineContext cinLine;
		public CoutLineContext coutLine;
		public ReturnLineContext returnLine;
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableChangeContext variableChange() {
			return getRuleContext(VariableChangeContext.class,0);
		}
		public CinLineContext cinLine() {
			return getRuleContext(CinLineContext.class,0);
		}
		public CoutLineContext coutLine() {
			return getRuleContext(CoutLineContext.class,0);
		}
		public ReturnLineContext returnLine() {
			return getRuleContext(ReturnLineContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);

		        ((LineContext)_localctx).sb =  new StringBuilder();
		        ((LineContext)_localctx).hasReturn =  false;
		    
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((LineContext)_localctx).variableDeclaration = variableDeclaration();

				        _localctx.sb.append(((LineContext)_localctx).variableDeclaration.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				((LineContext)_localctx).variableChange = variableChange();

				        _localctx.sb.append(((LineContext)_localctx).variableChange.sb.toString());
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				((LineContext)_localctx).cinLine = cinLine();

				        _localctx.sb.append(((LineContext)_localctx).cinLine.sb.toString());
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				((LineContext)_localctx).coutLine = coutLine();

				        _localctx.sb.append(((LineContext)_localctx).coutLine.sb.toString());
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				((LineContext)_localctx).returnLine = returnLine();

				        _localctx.sb.append(((LineContext)_localctx).returnLine.sb.toString());
				        ((LineContext)_localctx).hasReturn =  true;
				    
				}
				break;
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public StringBuilder sb;
		public TypeContext type;
		public Token VARIABLE_NAME;
		public RightPartContext rightPart;
		public Token SEMICLONE;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(HelloParser.VARIABLE_NAME, 0); }
		public TerminalNode SEMICLONE() { return getToken(HelloParser.SEMICLONE, 0); }
		public TerminalNode EQ() { return getToken(HelloParser.EQ, 0); }
		public RightPartContext rightPart() {
			return getRuleContext(RightPartContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);

		        ((VariableDeclarationContext)_localctx).sb =  new StringBuilder();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((VariableDeclarationContext)_localctx).type = type();

			        _localctx.sb.append(((VariableDeclarationContext)_localctx).type.sb.toString()).append(" ");
			    
			setState(82);
			((VariableDeclarationContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((VariableDeclarationContext)_localctx).VARIABLE_NAME!=null?((VariableDeclarationContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
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
			    
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(84);
				match(EQ);

				        _localctx.sb.append(" = ");
				    
				setState(86);
				((VariableDeclarationContext)_localctx).rightPart = rightPart();

				        _localctx.sb.append(((VariableDeclarationContext)_localctx).rightPart.sb.toString());
				    
				}
			}

			setState(91);
			((VariableDeclarationContext)_localctx).SEMICLONE = match(SEMICLONE);

			        _localctx.sb.append((((VariableDeclarationContext)_localctx).SEMICLONE!=null?((VariableDeclarationContext)_localctx).SEMICLONE.getText():null));
			    
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

	public static class RightPartContext extends ParserRuleContext {
		public StringBuilder sb;
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart;
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart() {
			return getRuleContext(IntegerOrVariableInRightPartContext.class,0);
		}
		public RightPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRightPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRightPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitRightPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightPartContext rightPart() throws RecognitionException {
		RightPartContext _localctx = new RightPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rightPart);

		        ((RightPartContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((RightPartContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

			        _localctx.sb.append(((RightPartContext)_localctx).integerOrVariableInRightPart.sb.toString());
			    
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

	public static class VariableChangeContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token VARIABLE_NAME;
		public RightPartContext rightPart;
		public Token SEMICLONE;
		public TerminalNode VARIABLE_NAME() { return getToken(HelloParser.VARIABLE_NAME, 0); }
		public TerminalNode EQ() { return getToken(HelloParser.EQ, 0); }
		public RightPartContext rightPart() {
			return getRuleContext(RightPartContext.class,0);
		}
		public TerminalNode SEMICLONE() { return getToken(HelloParser.SEMICLONE, 0); }
		public VariableChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableChange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVariableChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVariableChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVariableChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableChangeContext variableChange() throws RecognitionException {
		VariableChangeContext _localctx = new VariableChangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableChange);

		        ((VariableChangeContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((VariableChangeContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((VariableChangeContext)_localctx).VARIABLE_NAME!=null?((VariableChangeContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
			            _localctx.sb.append(((StartContext)getInvokingContext(0)).variables.get(variableName));
			        } else {
			            throw new RuntimeException("Unknown variable in left part.");
			        }
			    
			setState(99);
			match(EQ);

			        _localctx.sb.append(" = ");
			    
			setState(101);
			((VariableChangeContext)_localctx).rightPart = rightPart();

			        _localctx.sb.append(((VariableChangeContext)_localctx).rightPart.sb.toString());
			    
			setState(103);
			((VariableChangeContext)_localctx).SEMICLONE = match(SEMICLONE);

			        _localctx.sb.append((((VariableChangeContext)_localctx).SEMICLONE!=null?((VariableChangeContext)_localctx).SEMICLONE.getText():null));
			    
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

	public static class IntegerOrVariableInRightPartContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token INTEGER;
		public VariableInRightPartContext variableInRightPart;
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public VariableInRightPartContext variableInRightPart() {
			return getRuleContext(VariableInRightPartContext.class,0);
		}
		public IntegerOrVariableInRightPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerOrVariableInRightPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIntegerOrVariableInRightPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIntegerOrVariableInRightPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIntegerOrVariableInRightPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerOrVariableInRightPartContext integerOrVariableInRightPart() throws RecognitionException {
		IntegerOrVariableInRightPartContext _localctx = new IntegerOrVariableInRightPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integerOrVariableInRightPart);

		        ((IntegerOrVariableInRightPartContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((IntegerOrVariableInRightPartContext)_localctx).INTEGER = match(INTEGER);

				        _localctx.sb.append((((IntegerOrVariableInRightPartContext)_localctx).INTEGER!=null?((IntegerOrVariableInRightPartContext)_localctx).INTEGER.getText():null));
				    
				}
				break;
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				((IntegerOrVariableInRightPartContext)_localctx).variableInRightPart = variableInRightPart();

				        _localctx.sb.append(((IntegerOrVariableInRightPartContext)_localctx).variableInRightPart.sb.toString());
				    
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

	public static class VariableInRightPartContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token VARIABLE_NAME;
		public TerminalNode VARIABLE_NAME() { return getToken(HelloParser.VARIABLE_NAME, 0); }
		public VariableInRightPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInRightPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVariableInRightPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVariableInRightPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVariableInRightPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInRightPartContext variableInRightPart() throws RecognitionException {
		VariableInRightPartContext _localctx = new VariableInRightPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableInRightPart);

		        ((VariableInRightPartContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((VariableInRightPartContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((VariableInRightPartContext)_localctx).VARIABLE_NAME!=null?((VariableInRightPartContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
			            _localctx.sb.append(((StartContext)getInvokingContext(0)).variables.get(variableName));
			        } else {
			            throw new RuntimeException("Unknown variable in right part.");
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
		enterRule(_localctx, 18, RULE_type);

		        ((TypeContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((TypeContext)_localctx).LONG = match(LONG);
				_localctx.sb.append((((TypeContext)_localctx).LONG!=null?((TypeContext)_localctx).LONG.getText():null));
				}
				break;
			case LONGLONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((TypeContext)_localctx).LONGLONG = match(LONGLONG);
				_localctx.sb.append((((TypeContext)_localctx).LONGLONG!=null?((TypeContext)_localctx).LONGLONG.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				((TypeContext)_localctx).INT = match(INT);
				_localctx.sb.append((((TypeContext)_localctx).INT!=null?((TypeContext)_localctx).INT.getText():null));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				((TypeContext)_localctx).BOOL = match(BOOL);
				_localctx.sb.append((((TypeContext)_localctx).BOOL!=null?((TypeContext)_localctx).BOOL.getText():null));
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
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

	public static class UsingLineContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token USING;
		public Token NAMESPACE;
		public Token STD;
		public Token SEMICLONE;
		public TerminalNode USING() { return getToken(HelloParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(HelloParser.NAMESPACE, 0); }
		public TerminalNode STD() { return getToken(HelloParser.STD, 0); }
		public TerminalNode SEMICLONE() { return getToken(HelloParser.SEMICLONE, 0); }
		public UsingLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterUsingLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitUsingLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitUsingLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingLineContext usingLine() throws RecognitionException {
		UsingLineContext _localctx = new UsingLineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_usingLine);

		        ((UsingLineContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((UsingLineContext)_localctx).USING = match(USING);
			_localctx.sb.append((((UsingLineContext)_localctx).USING!=null?((UsingLineContext)_localctx).USING.getText():null)).append(" ");
			setState(130);
			((UsingLineContext)_localctx).NAMESPACE = match(NAMESPACE);
			_localctx.sb.append((((UsingLineContext)_localctx).NAMESPACE!=null?((UsingLineContext)_localctx).NAMESPACE.getText():null)).append(" ");
			setState(132);
			((UsingLineContext)_localctx).STD = match(STD);
			_localctx.sb.append((((UsingLineContext)_localctx).STD!=null?((UsingLineContext)_localctx).STD.getText():null));
			setState(134);
			((UsingLineContext)_localctx).SEMICLONE = match(SEMICLONE);
			_localctx.sb.append((((UsingLineContext)_localctx).SEMICLONE!=null?((UsingLineContext)_localctx).SEMICLONE.getText():null)).append("\n");
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

	public static class CinLineContext extends ParserRuleContext {
		public StringBuilder sb;
		public boolean hasStd;
		public Token STD;
		public Token DCOLON;
		public Token CIN;
		public Token DRIGHT;
		public VariableInRightPartContext variableInRightPart;
		public Token SEMICLONE;
		public TerminalNode CIN() { return getToken(HelloParser.CIN, 0); }
		public TerminalNode SEMICLONE() { return getToken(HelloParser.SEMICLONE, 0); }
		public TerminalNode STD() { return getToken(HelloParser.STD, 0); }
		public TerminalNode DCOLON() { return getToken(HelloParser.DCOLON, 0); }
		public List<TerminalNode> DRIGHT() { return getTokens(HelloParser.DRIGHT); }
		public TerminalNode DRIGHT(int i) {
			return getToken(HelloParser.DRIGHT, i);
		}
		public List<VariableInRightPartContext> variableInRightPart() {
			return getRuleContexts(VariableInRightPartContext.class);
		}
		public VariableInRightPartContext variableInRightPart(int i) {
			return getRuleContext(VariableInRightPartContext.class,i);
		}
		public CinLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cinLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCinLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCinLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCinLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CinLineContext cinLine() throws RecognitionException {
		CinLineContext _localctx = new CinLineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cinLine);

		        ((CinLineContext)_localctx).sb =  new StringBuilder();
		        ((CinLineContext)_localctx).hasStd =  false;
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STD) {
				{
				setState(137);
				((CinLineContext)_localctx).STD = match(STD);
				setState(138);
				((CinLineContext)_localctx).DCOLON = match(DCOLON);

				        _localctx.sb.append((((CinLineContext)_localctx).STD!=null?((CinLineContext)_localctx).STD.getText():null)).append((((CinLineContext)_localctx).DCOLON!=null?((CinLineContext)_localctx).DCOLON.getText():null));
				        ((CinLineContext)getInvokingContext(11)).hasStd =  true;
				    
				}
			}

			setState(142);
			((CinLineContext)_localctx).CIN = match(CIN);

			        if (!((StartContext)getInvokingContext(0)).connectedIostream) {
			            throw new RuntimeException("Forgot to connect iostream.");
			        }
			        if (!((CinLineContext)getInvokingContext(11)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
			            throw new RuntimeException("Forgot to connect std.");
			        }
			        _localctx.sb.append((((CinLineContext)_localctx).CIN!=null?((CinLineContext)_localctx).CIN.getText():null));
			    
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				((CinLineContext)_localctx).DRIGHT = match(DRIGHT);

				        _localctx.sb.append(" ").append((((CinLineContext)_localctx).DRIGHT!=null?((CinLineContext)_localctx).DRIGHT.getText():null)).append(" ");
				    
				setState(146);
				((CinLineContext)_localctx).variableInRightPart = variableInRightPart();

				        _localctx.sb.append(((CinLineContext)_localctx).variableInRightPart.sb.toString());
				    
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DRIGHT );
			setState(153);
			((CinLineContext)_localctx).SEMICLONE = match(SEMICLONE);

			        _localctx.sb.append((((CinLineContext)_localctx).SEMICLONE!=null?((CinLineContext)_localctx).SEMICLONE.getText():null));
			    
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

	public static class CoutLineContext extends ParserRuleContext {
		public StringBuilder sb;
		public boolean hasStd;
		public Token STD;
		public Token DCOLON;
		public Token COUT;
		public Token DLEFT;
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart;
		public Token SEMICLONE;
		public TerminalNode COUT() { return getToken(HelloParser.COUT, 0); }
		public TerminalNode SEMICLONE() { return getToken(HelloParser.SEMICLONE, 0); }
		public TerminalNode STD() { return getToken(HelloParser.STD, 0); }
		public TerminalNode DCOLON() { return getToken(HelloParser.DCOLON, 0); }
		public List<TerminalNode> DLEFT() { return getTokens(HelloParser.DLEFT); }
		public TerminalNode DLEFT(int i) {
			return getToken(HelloParser.DLEFT, i);
		}
		public List<IntegerOrVariableInRightPartContext> integerOrVariableInRightPart() {
			return getRuleContexts(IntegerOrVariableInRightPartContext.class);
		}
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart(int i) {
			return getRuleContext(IntegerOrVariableInRightPartContext.class,i);
		}
		public CoutLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coutLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCoutLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCoutLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCoutLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoutLineContext coutLine() throws RecognitionException {
		CoutLineContext _localctx = new CoutLineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_coutLine);

		        ((CoutLineContext)_localctx).sb =  new StringBuilder();
		        ((CoutLineContext)_localctx).hasStd =  false;
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STD) {
				{
				setState(156);
				((CoutLineContext)_localctx).STD = match(STD);
				setState(157);
				((CoutLineContext)_localctx).DCOLON = match(DCOLON);

				        _localctx.sb.append((((CoutLineContext)_localctx).STD!=null?((CoutLineContext)_localctx).STD.getText():null)).append((((CoutLineContext)_localctx).DCOLON!=null?((CoutLineContext)_localctx).DCOLON.getText():null));
				        ((CoutLineContext)getInvokingContext(12)).hasStd =  true;
				    
				}
			}

			setState(161);
			((CoutLineContext)_localctx).COUT = match(COUT);

			        if (!((StartContext)getInvokingContext(0)).connectedIostream) {
			            throw new RuntimeException("Forgot to connect iostream.");
			        }
			        if (!((CoutLineContext)getInvokingContext(12)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
			            throw new RuntimeException("Forgot to connect std.");
			        }
			        _localctx.sb.append((((CoutLineContext)_localctx).COUT!=null?((CoutLineContext)_localctx).COUT.getText():null));
			    
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				((CoutLineContext)_localctx).DLEFT = match(DLEFT);

				        _localctx.sb.append(" ").append((((CoutLineContext)_localctx).DLEFT!=null?((CoutLineContext)_localctx).DLEFT.getText():null)).append(" ");
				    
				setState(165);
				((CoutLineContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

				        _localctx.sb.append(((CoutLineContext)_localctx).integerOrVariableInRightPart.sb.toString());
				    
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DLEFT );
			setState(172);
			((CoutLineContext)_localctx).SEMICLONE = match(SEMICLONE);

			        _localctx.sb.append((((CoutLineContext)_localctx).SEMICLONE!=null?((CoutLineContext)_localctx).SEMICLONE.getText():null));
			    
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

	public static class ReturnLineContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token RETURN;
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart;
		public Token SEMICLONE;
		public TerminalNode RETURN() { return getToken(HelloParser.RETURN, 0); }
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart() {
			return getRuleContext(IntegerOrVariableInRightPartContext.class,0);
		}
		public TerminalNode SEMICLONE() { return getToken(HelloParser.SEMICLONE, 0); }
		public ReturnLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterReturnLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitReturnLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitReturnLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnLineContext returnLine() throws RecognitionException {
		ReturnLineContext _localctx = new ReturnLineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnLine);

		        ((ReturnLineContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((ReturnLineContext)_localctx).RETURN = match(RETURN);

			        _localctx.sb.append((((ReturnLineContext)_localctx).RETURN!=null?((ReturnLineContext)_localctx).RETURN.getText():null)).append(" ");
			    
			setState(177);
			((ReturnLineContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

			        _localctx.sb.append(((ReturnLineContext)_localctx).integerOrVariableInRightPart.sb.toString());
			    
			setState(179);
			((ReturnLineContext)_localctx).SEMICLONE = match(SEMICLONE);

			        _localctx.sb.append((((ReturnLineContext)_localctx).SEMICLONE!=null?((ReturnLineContext)_localctx).SEMICLONE.getText():null));
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00b9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u008f\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\6\r\u0098\n\r\r\r\16\r\u0099\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00a2"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00ab\n\16\r\16\16\16\u00ac"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\2\2\2\u00bb\2\36\3\2\2\2\4(\3\2\2\2\6>\3"+
		"\2\2\2\bP\3\2\2\2\nR\3\2\2\2\f`\3\2\2\2\16c\3\2\2\2\20q\3\2\2\2\22s\3"+
		"\2\2\2\24\u0080\3\2\2\2\26\u0082\3\2\2\2\30\u008e\3\2\2\2\32\u00a1\3\2"+
		"\2\2\34\u00b1\3\2\2\2\36\37\5\4\3\2\37 \b\2\1\2 !\7\2\2\3!\3\3\2\2\2\""+
		"#\7\27\2\2#$\b\3\1\2$%\7\30\2\2%\'\b\3\1\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2"+
		"\2\2()\3\2\2\2).\3\2\2\2*(\3\2\2\2+,\5\26\f\2,-\b\3\1\2-/\3\2\2\2.+\3"+
		"\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\31\2\2\61\62\b\3\1\2\62\63\7\32\2"+
		"\2\63\64\b\3\1\2\64\65\5\6\4\2\65\66\b\3\1\2\66\67\7\33\2\2\678\b\3\1"+
		"\28\5\3\2\2\29:\5\b\5\2:;\b\4\1\2;=\3\2\2\2<9\3\2\2\2=@\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2\2\2AB\5\n\6\2BC\b\5\1\2CQ\3\2\2\2DE\5"+
		"\16\b\2EF\b\5\1\2FQ\3\2\2\2GH\5\30\r\2HI\b\5\1\2IQ\3\2\2\2JK\5\32\16\2"+
		"KL\b\5\1\2LQ\3\2\2\2MN\5\34\17\2NO\b\5\1\2OQ\3\2\2\2PA\3\2\2\2PD\3\2\2"+
		"\2PG\3\2\2\2PJ\3\2\2\2PM\3\2\2\2Q\t\3\2\2\2RS\5\24\13\2ST\b\6\1\2TU\7"+
		"\34\2\2U[\b\6\1\2VW\7\20\2\2WX\b\6\1\2XY\5\f\7\2YZ\b\6\1\2Z\\\3\2\2\2"+
		"[V\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\6\2\2^_\b\6\1\2_\13\3\2\2\2`a\5\20"+
		"\t\2ab\b\7\1\2b\r\3\2\2\2cd\7\34\2\2de\b\b\1\2ef\7\20\2\2fg\b\b\1\2gh"+
		"\5\f\7\2hi\b\b\1\2ij\7\6\2\2jk\b\b\1\2k\17\3\2\2\2lm\7\26\2\2mr\b\t\1"+
		"\2no\5\22\n\2op\b\t\1\2pr\3\2\2\2ql\3\2\2\2qn\3\2\2\2r\21\3\2\2\2st\7"+
		"\34\2\2tu\b\n\1\2u\23\3\2\2\2vw\7\7\2\2w\u0081\b\13\1\2xy\7\b\2\2y\u0081"+
		"\b\13\1\2z{\7\t\2\2{\u0081\b\13\1\2|}\7\n\2\2}\u0081\b\13\1\2~\177\7\13"+
		"\2\2\177\u0081\b\13\1\2\u0080v\3\2\2\2\u0080x\3\2\2\2\u0080z\3\2\2\2\u0080"+
		"|\3\2\2\2\u0080~\3\2\2\2\u0081\25\3\2\2\2\u0082\u0083\7\3\2\2\u0083\u0084"+
		"\b\f\1\2\u0084\u0085\7\4\2\2\u0085\u0086\b\f\1\2\u0086\u0087\7\5\2\2\u0087"+
		"\u0088\b\f\1\2\u0088\u0089\7\6\2\2\u0089\u008a\b\f\1\2\u008a\27\3\2\2"+
		"\2\u008b\u008c\7\5\2\2\u008c\u008d\7\23\2\2\u008d\u008f\b\r\1\2\u008e"+
		"\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\21"+
		"\2\2\u0091\u0097\b\r\1\2\u0092\u0093\7\25\2\2\u0093\u0094\b\r\1\2\u0094"+
		"\u0095\5\22\n\2\u0095\u0096\b\r\1\2\u0096\u0098\3\2\2\2\u0097\u0092\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7\6\2\2\u009c\u009d\b\r\1\2\u009d\31\3\2\2"+
		"\2\u009e\u009f\7\5\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a2\b\16\1\2\u00a1"+
		"\u009e\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\22"+
		"\2\2\u00a4\u00aa\b\16\1\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\b\16\1\2\u00a7"+
		"\u00a8\5\20\t\2\u00a8\u00a9\b\16\1\2\u00a9\u00ab\3\2\2\2\u00aa\u00a5\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\7\6\2\2\u00af\u00b0\b\16\1\2\u00b0\33\3\2\2"+
		"\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\b\17\1\2\u00b3\u00b4\5\20\t\2\u00b4"+
		"\u00b5\b\17\1\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\b\17\1\2\u00b7\35\3\2"+
		"\2\2\r(.>P[q\u0080\u008e\u0099\u00a1\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}