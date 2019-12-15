// Generated from /home/polinb/IdeaProjects/Test/src/main/java/antlr/Hello.g4 by ANTLR 4.7.2
package antlr;

    import java.util.*;

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
		LPAR=1, RPAR=2, USING=3, NAMESPACE=4, STD=5, SEMICLONE=6, LONG=7, LONGLONG=8, 
		INT=9, BOOL=10, RETURN=11, EQ=12, CIN=13, COUT=14, DCOLON=15, DLEFT=16, 
		DRIGHT=17, ENDL=18, TRUE=19, FALSE=20, INTEGER=21, PLUS=22, MUL=23, INCLUDE=24, 
		INCLUDE_NAME=25, MAIN=26, LPF=27, RPF=28, VARIABLE_NAME=29, WS=30;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_body = 2, RULE_line = 3, RULE_variableDeclaration = 4, 
		RULE_rightPart = 5, RULE_variableChange = 6, RULE_integerOrVariableInRightPart = 7, 
		RULE_variableInRightPart = 8, RULE_type = 9, RULE_usingLine = 10, RULE_cinLine = 11, 
		RULE_coutLine = 12, RULE_returnLine = 13, RULE_expression = 14, RULE_expressionPart = 15, 
		RULE_addExpression = 16, RULE_addExpressionPart = 17, RULE_mulExpression = 18, 
		RULE_boolValue = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "body", "line", "variableDeclaration", "rightPart", 
			"variableChange", "integerOrVariableInRightPart", "variableInRightPart", 
			"type", "usingLine", "cinLine", "coutLine", "returnLine", "expression", 
			"expressionPart", "addExpression", "addExpressionPart", "mulExpression", 
			"boolValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'using'", "'namespace'", "'std'", "';'", "'long'", 
			"'long long'", "'int'", "'bool'", "'return'", "'='", "'cin'", "'cout'", 
			"'::'", "'<<'", "'>>'", "'endl'", "'true'", "'false'", null, "'+'", "'*'", 
			"'#include'", null, "'int main()'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAR", "RPAR", "USING", "NAMESPACE", "STD", "SEMICLONE", "LONG", 
			"LONGLONG", "INT", "BOOL", "RETURN", "EQ", "CIN", "COUT", "DCOLON", "DLEFT", 
			"DRIGHT", "ENDL", "TRUE", "FALSE", "INTEGER", "PLUS", "MUL", "INCLUDE", 
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

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public HashMap<String, String> variables;
		public ArrayList<String> addedVariables;
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

		        ((StartContext)_localctx).addedVariables =  new ArrayList<>();
		        ((StartContext)_localctx).variables =  new HashMap<>();
		        ((StartContext)_localctx).index =  10;
		        ((StartContext)_localctx).connectedIostream =  false;
		        ((StartContext)_localctx).connectedStd =  false;
		        ((StartContext)_localctx).hasReturn =  false;
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((StartContext)_localctx).program = program();

			        StringBuilder sb = new StringBuilder();
			        sb.append(((StartContext)_localctx).program.sb.toString());
			        try(java.io.FileOutputStream fos=new java.io.FileOutputStream("/home/polinb/IdeaProjects/Test/results/example.cpp")) {
			            byte[] buffer = sb.toString().getBytes();
			            fos.write(buffer, 0, buffer.length);
			        } catch (java.io.IOException ex){
			            System.out.println(ex.getMessage());
			        }
			    
			setState(42);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(44);
				((ProgramContext)_localctx).INCLUDE = match(INCLUDE);
				_localctx.sb.append((((ProgramContext)_localctx).INCLUDE!=null?((ProgramContext)_localctx).INCLUDE.getText():null)).append(" ");
				setState(46);
				((ProgramContext)_localctx).INCLUDE_NAME = match(INCLUDE_NAME);

				            if (((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).equals("<iostream>")) {
				                ((StartContext)getInvokingContext(0)).connectedIostream =  true;
				            }
				            _localctx.sb.append((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).append("\n");
				         
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(53);
				((ProgramContext)_localctx).usingLine = usingLine();

				            ((StartContext)getInvokingContext(0)).connectedStd =  true;
				            _localctx.sb.append("\n").append(((ProgramContext)_localctx).usingLine.sb.toString());
				         
				}
			}

			setState(58);
			((ProgramContext)_localctx).MAIN = match(MAIN);
			_localctx.sb.append("\n").append((((ProgramContext)_localctx).MAIN!=null?((ProgramContext)_localctx).MAIN.getText():null)).append(" ");
			setState(60);
			((ProgramContext)_localctx).LPF = match(LPF);
			_localctx.sb.append((((ProgramContext)_localctx).LPF!=null?((ProgramContext)_localctx).LPF.getText():null)).append("\n");
			setState(62);
			((ProgramContext)_localctx).body = body();

			            if (!((ProgramContext)_localctx).body.hasReturn) {
			                throw new RuntimeException("Forgot return.");
			            }
			            _localctx.sb.append(((ProgramContext)_localctx).body.sb.toString());
			         
			setState(64);
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STD) | (1L << LONG) | (1L << LONGLONG) | (1L << INT) | (1L << BOOL) | (1L << RETURN) | (1L << CIN) | (1L << COUT) | (1L << VARIABLE_NAME))) != 0)) {
				{
				{
				setState(67);
				((BodyContext)_localctx).line = line();

				        ArrayList<String> values = new ArrayList<>(((StartContext)getInvokingContext(0)).variables.values());
				        int linesNum = (getRandom() % 7);
				        for (int i = 0; i < linesNum; ++i) {
				            String line = "";
				            if (getRandom() % 2 == 0) {
				                line = addNewVariable(((StartContext)getInvokingContext(0)).addedVariables, values, ((StartContext)getInvokingContext(0)).index);
				                ++((StartContext)getInvokingContext(0)).index;
				            } else if (!((StartContext)getInvokingContext(0)).addedVariables.isEmpty()) {
				                line = addActionWithVariable(((StartContext)getInvokingContext(0)).addedVariables, values);
				            }
				            if (!line.isEmpty()) {
				                _localctx.sb.append(line).append("\n");
				            }
				        }
				        _localctx.sb.append(((BodyContext)_localctx).line.sb.toString()).append("\n");
				        if (((BodyContext)_localctx).line.hasReturn) {
				            ((BodyContext)_localctx).hasReturn =  true;
				        }
				    
				}
				}
				setState(74);
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
		public Token SEMICLONE;
		public TerminalNode SEMICLONE() { return getToken(HelloParser.SEMICLONE, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(75);
				((LineContext)_localctx).variableDeclaration = variableDeclaration();

				        _localctx.sb.append(((LineContext)_localctx).variableDeclaration.sb.toString());
				    
				}
				break;
			case 2:
				{
				setState(78);
				((LineContext)_localctx).variableChange = variableChange();

				        _localctx.sb.append(((LineContext)_localctx).variableChange.sb.toString());
				    
				}
				break;
			case 3:
				{
				setState(81);
				((LineContext)_localctx).cinLine = cinLine();

				        _localctx.sb.append(((LineContext)_localctx).cinLine.sb.toString());
				    
				}
				break;
			case 4:
				{
				setState(84);
				((LineContext)_localctx).coutLine = coutLine();

				        _localctx.sb.append(((LineContext)_localctx).coutLine.sb.toString());
				    
				}
				break;
			case 5:
				{
				setState(87);
				((LineContext)_localctx).returnLine = returnLine();

				        _localctx.sb.append(((LineContext)_localctx).returnLine.sb.toString());
				        ((LineContext)_localctx).hasReturn =  true;
				    
				}
				break;
			}
			setState(92);
			((LineContext)_localctx).SEMICLONE = match(SEMICLONE);

			        _localctx.sb.append((((LineContext)_localctx).SEMICLONE!=null?((LineContext)_localctx).SEMICLONE.getText():null));
			    
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(HelloParser.VARIABLE_NAME, 0); }
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
			setState(95);
			((VariableDeclarationContext)_localctx).type = type();

			        _localctx.sb.append(((VariableDeclarationContext)_localctx).type.sb.toString()).append(" ");
			    
			setState(97);
			((VariableDeclarationContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((VariableDeclarationContext)_localctx).VARIABLE_NAME!=null?((VariableDeclarationContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
			            throw new RuntimeException("Re-declaring a variable.");
			        } else {
			            String newName = getVariableName(((StartContext)getInvokingContext(0)).index);
			            ((StartContext)getInvokingContext(0)).variables.put(variableName, newName);
			            _localctx.sb.append(newName);
			            ((StartContext)getInvokingContext(0)).index++;
			        }
			    
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(99);
				match(EQ);

				        _localctx.sb.append(" = ");
				    
				setState(101);
				((VariableDeclarationContext)_localctx).rightPart = rightPart();

				        _localctx.sb.append(((VariableDeclarationContext)_localctx).rightPart.sb.toString());
				    
				}
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

	public static class RightPartContext extends ParserRuleContext {
		public StringBuilder sb;
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart;
		public ExpressionContext expression;
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart() {
			return getRuleContext(IntegerOrVariableInRightPartContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((RightPartContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

				        _localctx.sb.append(((RightPartContext)_localctx).integerOrVariableInRightPart.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((RightPartContext)_localctx).expression = expression();

				        _localctx.sb.append(((RightPartContext)_localctx).expression.sb.toString());
				    
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

	public static class VariableChangeContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token VARIABLE_NAME;
		public RightPartContext rightPart;
		public TerminalNode VARIABLE_NAME() { return getToken(HelloParser.VARIABLE_NAME, 0); }
		public TerminalNode EQ() { return getToken(HelloParser.EQ, 0); }
		public RightPartContext rightPart() {
			return getRuleContext(RightPartContext.class,0);
		}
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
			setState(114);
			((VariableChangeContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((VariableChangeContext)_localctx).VARIABLE_NAME!=null?((VariableChangeContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
			            _localctx.sb.append(((StartContext)getInvokingContext(0)).variables.get(variableName));
			        } else {
			            throw new RuntimeException("Unknown variable in left part.");
			        }
			    
			setState(116);
			match(EQ);

			        _localctx.sb.append(" = ");
			    
			setState(118);
			((VariableChangeContext)_localctx).rightPart = rightPart();

			        _localctx.sb.append(((VariableChangeContext)_localctx).rightPart.sb.toString());
			    
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
		public BoolValueContext boolValue;
		public VariableInRightPartContext variableInRightPart;
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((IntegerOrVariableInRightPartContext)_localctx).INTEGER = match(INTEGER);

				        _localctx.sb.append((((IntegerOrVariableInRightPartContext)_localctx).INTEGER!=null?((IntegerOrVariableInRightPartContext)_localctx).INTEGER.getText():null));
				    
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((IntegerOrVariableInRightPartContext)_localctx).boolValue = boolValue();

				        _localctx.sb.append(((IntegerOrVariableInRightPartContext)_localctx).boolValue.sb.toString());
				    
				}
				break;
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
			setState(131);
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
		public TerminalNode LONG() { return getToken(HelloParser.LONG, 0); }
		public TerminalNode LONGLONG() { return getToken(HelloParser.LONGLONG, 0); }
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((TypeContext)_localctx).LONG = match(LONG);
				_localctx.sb.append((((TypeContext)_localctx).LONG!=null?((TypeContext)_localctx).LONG.getText():null));
				}
				break;
			case LONGLONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((TypeContext)_localctx).LONGLONG = match(LONGLONG);
				_localctx.sb.append((((TypeContext)_localctx).LONGLONG!=null?((TypeContext)_localctx).LONGLONG.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				((TypeContext)_localctx).INT = match(INT);
				_localctx.sb.append((((TypeContext)_localctx).INT!=null?((TypeContext)_localctx).INT.getText():null));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				((TypeContext)_localctx).BOOL = match(BOOL);
				_localctx.sb.append((((TypeContext)_localctx).BOOL!=null?((TypeContext)_localctx).BOOL.getText():null));
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
			setState(144);
			((UsingLineContext)_localctx).USING = match(USING);
			_localctx.sb.append((((UsingLineContext)_localctx).USING!=null?((UsingLineContext)_localctx).USING.getText():null)).append(" ");
			setState(146);
			((UsingLineContext)_localctx).NAMESPACE = match(NAMESPACE);
			_localctx.sb.append((((UsingLineContext)_localctx).NAMESPACE!=null?((UsingLineContext)_localctx).NAMESPACE.getText():null)).append(" ");
			setState(148);
			((UsingLineContext)_localctx).STD = match(STD);
			_localctx.sb.append((((UsingLineContext)_localctx).STD!=null?((UsingLineContext)_localctx).STD.getText():null));
			setState(150);
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
		public TerminalNode CIN() { return getToken(HelloParser.CIN, 0); }
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
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STD) {
				{
				setState(153);
				((CinLineContext)_localctx).STD = match(STD);
				setState(154);
				((CinLineContext)_localctx).DCOLON = match(DCOLON);

				        _localctx.sb.append((((CinLineContext)_localctx).STD!=null?((CinLineContext)_localctx).STD.getText():null)).append((((CinLineContext)_localctx).DCOLON!=null?((CinLineContext)_localctx).DCOLON.getText():null));
				        ((CinLineContext)getInvokingContext(11)).hasStd =  true;
				    
				}
			}

			setState(158);
			((CinLineContext)_localctx).CIN = match(CIN);

			        if (!((StartContext)getInvokingContext(0)).connectedIostream) {
			            throw new RuntimeException("Forgot to connect iostream.");
			        }
			        if (!((CinLineContext)getInvokingContext(11)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
			            throw new RuntimeException("Forgot to connect std.");
			        }
			        _localctx.sb.append((((CinLineContext)_localctx).CIN!=null?((CinLineContext)_localctx).CIN.getText():null));
			    
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				((CinLineContext)_localctx).DRIGHT = match(DRIGHT);

				        _localctx.sb.append(" ").append((((CinLineContext)_localctx).DRIGHT!=null?((CinLineContext)_localctx).DRIGHT.getText():null)).append(" ");
				    
				setState(162);
				((CinLineContext)_localctx).variableInRightPart = variableInRightPart();

				        _localctx.sb.append(((CinLineContext)_localctx).variableInRightPart.sb.toString());
				    
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DRIGHT );
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
		public Token ENDL;
		public TerminalNode COUT() { return getToken(HelloParser.COUT, 0); }
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
		public List<TerminalNode> ENDL() { return getTokens(HelloParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(HelloParser.ENDL, i);
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
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STD) {
				{
				setState(169);
				((CoutLineContext)_localctx).STD = match(STD);
				setState(170);
				((CoutLineContext)_localctx).DCOLON = match(DCOLON);

				        _localctx.sb.append((((CoutLineContext)_localctx).STD!=null?((CoutLineContext)_localctx).STD.getText():null)).append((((CoutLineContext)_localctx).DCOLON!=null?((CoutLineContext)_localctx).DCOLON.getText():null));
				        ((CoutLineContext)getInvokingContext(12)).hasStd =  true;
				    
				}
			}

			setState(174);
			((CoutLineContext)_localctx).COUT = match(COUT);

			        if (!((StartContext)getInvokingContext(0)).connectedIostream) {
			            throw new RuntimeException("Forgot to connect iostream.");
			        }
			        if (!((CoutLineContext)getInvokingContext(12)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
			            throw new RuntimeException("Forgot to connect std.");
			        }
			        _localctx.sb.append((((CoutLineContext)_localctx).COUT!=null?((CoutLineContext)_localctx).COUT.getText():null));
			    
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				((CoutLineContext)_localctx).DLEFT = match(DLEFT);

				        _localctx.sb.append(" ").append((((CoutLineContext)_localctx).DLEFT!=null?((CoutLineContext)_localctx).DLEFT.getText():null)).append(" ");
				    
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case INTEGER:
				case VARIABLE_NAME:
					{
					setState(178);
					((CoutLineContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

					        _localctx.sb.append(((CoutLineContext)_localctx).integerOrVariableInRightPart.sb.toString());
					    
					}
					break;
				case ENDL:
					{
					setState(181);
					((CoutLineContext)_localctx).ENDL = match(ENDL);

					        if (!((CoutLineContext)getInvokingContext(12)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
					            throw new RuntimeException("Forgot to connect std.");
					        }
					        _localctx.sb.append((((CoutLineContext)_localctx).ENDL!=null?((CoutLineContext)_localctx).ENDL.getText():null));
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DLEFT );
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
		public TerminalNode RETURN() { return getToken(HelloParser.RETURN, 0); }
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart() {
			return getRuleContext(IntegerOrVariableInRightPartContext.class,0);
		}
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
			setState(189);
			((ReturnLineContext)_localctx).RETURN = match(RETURN);

			        _localctx.sb.append((((ReturnLineContext)_localctx).RETURN!=null?((ReturnLineContext)_localctx).RETURN.getText():null)).append(" ");
			    
			setState(191);
			((ReturnLineContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

			        _localctx.sb.append(((ReturnLineContext)_localctx).integerOrVariableInRightPart.sb.toString());
			    
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
		public AddExpressionContext addExpression;
		public ExpressionPartContext expressionPart;
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public ExpressionPartContext expressionPart() {
			return getRuleContext(ExpressionPartContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_expression);

		        ((ExpressionContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((ExpressionContext)_localctx).addExpression = addExpression();

				        _localctx.sb.append(((ExpressionContext)_localctx).addExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((ExpressionContext)_localctx).addExpression = addExpression();
				setState(198);
				((ExpressionContext)_localctx).expressionPart = expressionPart();

				        _localctx.sb.append(((ExpressionContext)_localctx).addExpression.sb.toString()).append(((ExpressionContext)_localctx).expressionPart.sb.toString());
				    
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

	public static class ExpressionPartContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token PLUS;
		public AddExpressionContext addExpression;
		public ExpressionPartContext expressionPart;
		public TerminalNode PLUS() { return getToken(HelloParser.PLUS, 0); }
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public ExpressionPartContext expressionPart() {
			return getRuleContext(ExpressionPartContext.class,0);
		}
		public ExpressionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpressionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpressionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpressionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPartContext expressionPart() throws RecognitionException {
		ExpressionPartContext _localctx = new ExpressionPartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionPart);

		        ((ExpressionPartContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((ExpressionPartContext)_localctx).PLUS = match(PLUS);
				setState(204);
				((ExpressionPartContext)_localctx).addExpression = addExpression();

				        _localctx.sb.append(" ").append((((ExpressionPartContext)_localctx).PLUS!=null?((ExpressionPartContext)_localctx).PLUS.getText():null)).append(" ").append(((ExpressionPartContext)_localctx).addExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				((ExpressionPartContext)_localctx).PLUS = match(PLUS);
				setState(208);
				((ExpressionPartContext)_localctx).addExpression = addExpression();
				setState(209);
				((ExpressionPartContext)_localctx).expressionPart = expressionPart();

				        _localctx.sb.append(" ").append((((ExpressionPartContext)_localctx).PLUS!=null?((ExpressionPartContext)_localctx).PLUS.getText():null)).append(" ").append(((ExpressionPartContext)_localctx).addExpression.sb.toString()).append(((ExpressionPartContext)_localctx).expressionPart.sb.toString());
				    
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

	public static class AddExpressionContext extends ParserRuleContext {
		public StringBuilder sb;
		public MulExpressionContext mulExpression;
		public AddExpressionPartContext addExpressionPart;
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public AddExpressionPartContext addExpressionPart() {
			return getRuleContext(AddExpressionPartContext.class,0);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addExpression);

		        ((AddExpressionContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((AddExpressionContext)_localctx).mulExpression = mulExpression();

				        _localctx.sb.append(((AddExpressionContext)_localctx).mulExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((AddExpressionContext)_localctx).mulExpression = mulExpression();
				setState(218);
				((AddExpressionContext)_localctx).addExpressionPart = addExpressionPart();

				        _localctx.sb.append(((AddExpressionContext)_localctx).mulExpression.sb.toString()).append(((AddExpressionContext)_localctx).addExpressionPart.sb.toString());
				    
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

	public static class AddExpressionPartContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token MUL;
		public MulExpressionContext mulExpression;
		public AddExpressionPartContext addExpressionPart;
		public TerminalNode MUL() { return getToken(HelloParser.MUL, 0); }
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public AddExpressionPartContext addExpressionPart() {
			return getRuleContext(AddExpressionPartContext.class,0);
		}
		public AddExpressionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpressionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAddExpressionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAddExpressionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAddExpressionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionPartContext addExpressionPart() throws RecognitionException {
		AddExpressionPartContext _localctx = new AddExpressionPartContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addExpressionPart);

		        ((AddExpressionPartContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				((AddExpressionPartContext)_localctx).MUL = match(MUL);
				setState(224);
				((AddExpressionPartContext)_localctx).mulExpression = mulExpression();

				        _localctx.sb.append(" ").append((((AddExpressionPartContext)_localctx).MUL!=null?((AddExpressionPartContext)_localctx).MUL.getText():null)).append(" ").append(((AddExpressionPartContext)_localctx).mulExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((AddExpressionPartContext)_localctx).MUL = match(MUL);
				setState(228);
				((AddExpressionPartContext)_localctx).mulExpression = mulExpression();
				setState(229);
				((AddExpressionPartContext)_localctx).addExpressionPart = addExpressionPart();

				        _localctx.sb.append(" ").append((((AddExpressionPartContext)_localctx).MUL!=null?((AddExpressionPartContext)_localctx).MUL.getText():null)).append(" ").append(((AddExpressionPartContext)_localctx).mulExpression.sb.toString()).append(((AddExpressionPartContext)_localctx).addExpressionPart.sb.toString());
				    
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

	public static class MulExpressionContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token LPAR;
		public ExpressionContext expression;
		public Token RPAR;
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart;
		public TerminalNode LPAR() { return getToken(HelloParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HelloParser.RPAR, 0); }
		public IntegerOrVariableInRightPartContext integerOrVariableInRightPart() {
			return getRuleContext(IntegerOrVariableInRightPartContext.class,0);
		}
		public MulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpressionContext mulExpression() throws RecognitionException {
		MulExpressionContext _localctx = new MulExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mulExpression);

		        ((MulExpressionContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((MulExpressionContext)_localctx).LPAR = match(LPAR);
				setState(235);
				((MulExpressionContext)_localctx).expression = expression();
				setState(236);
				((MulExpressionContext)_localctx).RPAR = match(RPAR);

				        _localctx.sb.append((((MulExpressionContext)_localctx).LPAR!=null?((MulExpressionContext)_localctx).LPAR.getText():null)).append(((MulExpressionContext)_localctx).expression.sb.toString()).append((((MulExpressionContext)_localctx).RPAR!=null?((MulExpressionContext)_localctx).RPAR.getText():null));
				    
				}
				break;
			case TRUE:
			case FALSE:
			case INTEGER:
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((MulExpressionContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

				        _localctx.sb.append(((MulExpressionContext)_localctx).integerOrVariableInRightPart.sb.toString());
				    
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

	public static class BoolValueContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(HelloParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HelloParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolValue);

		        ((BoolValueContext)_localctx).sb =  new StringBuilder();
		    
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				((BoolValueContext)_localctx).TRUE = match(TRUE);

				        _localctx.sb.append((((BoolValueContext)_localctx).TRUE!=null?((BoolValueContext)_localctx).TRUE.getText():null));
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				((BoolValueContext)_localctx).FALSE = match(FALSE);

				        _localctx.sb.append((((BoolValueContext)_localctx).FALSE!=null?((BoolValueContext)_localctx).FALSE.getText():null));
				    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7s\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u009f\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\6\r\u00a8\n\r\r\r\16\r\u00a9\3\16\3\16\3\16\5\16\u00af"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ba\n\16\6\16"+
		"\u00bc\n\16\r\16\16\16\u00bd\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00cc\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e0"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00eb\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f5\n\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00fb\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(\2\2\2\u0101\2*\3\2\2\2\4\64\3\2\2\2\6J\3\2\2\2\b\\\3\2\2\2\na\3\2"+
		"\2\2\fr\3\2\2\2\16t\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u0090"+
		"\3\2\2\2\26\u0092\3\2\2\2\30\u009e\3\2\2\2\32\u00ae\3\2\2\2\34\u00bf\3"+
		"\2\2\2\36\u00cb\3\2\2\2 \u00d6\3\2\2\2\"\u00df\3\2\2\2$\u00ea\3\2\2\2"+
		"&\u00f4\3\2\2\2(\u00fa\3\2\2\2*+\5\4\3\2+,\b\2\1\2,-\7\2\2\3-\3\3\2\2"+
		"\2./\7\32\2\2/\60\b\3\1\2\60\61\7\33\2\2\61\63\b\3\1\2\62.\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2\678"+
		"\5\26\f\289\b\3\1\29;\3\2\2\2:\67\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\34\2"+
		"\2=>\b\3\1\2>?\7\35\2\2?@\b\3\1\2@A\5\6\4\2AB\b\3\1\2BC\7\36\2\2CD\b\3"+
		"\1\2D\5\3\2\2\2EF\5\b\5\2FG\b\4\1\2GI\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\7\3\2\2\2LJ\3\2\2\2MN\5\n\6\2NO\b\5\1\2O]\3\2\2\2PQ"+
		"\5\16\b\2QR\b\5\1\2R]\3\2\2\2ST\5\30\r\2TU\b\5\1\2U]\3\2\2\2VW\5\32\16"+
		"\2WX\b\5\1\2X]\3\2\2\2YZ\5\34\17\2Z[\b\5\1\2[]\3\2\2\2\\M\3\2\2\2\\P\3"+
		"\2\2\2\\S\3\2\2\2\\V\3\2\2\2\\Y\3\2\2\2]^\3\2\2\2^_\7\b\2\2_`\b\5\1\2"+
		"`\t\3\2\2\2ab\5\24\13\2bc\b\6\1\2cd\7\37\2\2dj\b\6\1\2ef\7\16\2\2fg\b"+
		"\6\1\2gh\5\f\7\2hi\b\6\1\2ik\3\2\2\2je\3\2\2\2jk\3\2\2\2k\13\3\2\2\2l"+
		"m\5\20\t\2mn\b\7\1\2ns\3\2\2\2op\5\36\20\2pq\b\7\1\2qs\3\2\2\2rl\3\2\2"+
		"\2ro\3\2\2\2s\r\3\2\2\2tu\7\37\2\2uv\b\b\1\2vw\7\16\2\2wx\b\b\1\2xy\5"+
		"\f\7\2yz\b\b\1\2z\17\3\2\2\2{|\7\27\2\2|\u0084\b\t\1\2}~\5(\25\2~\177"+
		"\b\t\1\2\177\u0084\3\2\2\2\u0080\u0081\5\22\n\2\u0081\u0082\b\t\1\2\u0082"+
		"\u0084\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084"+
		"\21\3\2\2\2\u0085\u0086\7\37\2\2\u0086\u0087\b\n\1\2\u0087\23\3\2\2\2"+
		"\u0088\u0089\7\t\2\2\u0089\u0091\b\13\1\2\u008a\u008b\7\n\2\2\u008b\u0091"+
		"\b\13\1\2\u008c\u008d\7\13\2\2\u008d\u0091\b\13\1\2\u008e\u008f\7\f\2"+
		"\2\u008f\u0091\b\13\1\2\u0090\u0088\3\2\2\2\u0090\u008a\3\2\2\2\u0090"+
		"\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091\25\3\2\2\2\u0092\u0093\7\5\2"+
		"\2\u0093\u0094\b\f\1\2\u0094\u0095\7\6\2\2\u0095\u0096\b\f\1\2\u0096\u0097"+
		"\7\7\2\2\u0097\u0098\b\f\1\2\u0098\u0099\7\b\2\2\u0099\u009a\b\f\1\2\u009a"+
		"\27\3\2\2\2\u009b\u009c\7\7\2\2\u009c\u009d\7\21\2\2\u009d\u009f\b\r\1"+
		"\2\u009e\u009b\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\7\17\2\2\u00a1\u00a7\b\r\1\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\b\r\1\2"+
		"\u00a4\u00a5\5\22\n\2\u00a5\u00a6\b\r\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a2"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\31\3\2\2\2\u00ab\u00ac\7\7\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00af\b\16"+
		"\1\2\u00ae\u00ab\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7\20\2\2\u00b1\u00bb\b\16\1\2\u00b2\u00b3\7\22\2\2\u00b3\u00b9"+
		"\b\16\1\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6\b\16\1\2\u00b6\u00ba\3\2\2"+
		"\2\u00b7\u00b8\7\24\2\2\u00b8\u00ba\b\16\1\2\u00b9\u00b4\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\33\3\2\2\2\u00bf\u00c0"+
		"\7\r\2\2\u00c0\u00c1\b\17\1\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\b\17\1"+
		"\2\u00c3\35\3\2\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00c6\b\20\1\2\u00c6\u00cc"+
		"\3\2\2\2\u00c7\u00c8\5\"\22\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\b\20\1\2"+
		"\u00ca\u00cc\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\37"+
		"\3\2\2\2\u00cd\u00ce\7\30\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\b\21\1"+
		"\2\u00d0\u00d7\3\2\2\2\u00d1\u00d2\7\30\2\2\u00d2\u00d3\5\"\22\2\u00d3"+
		"\u00d4\5 \21\2\u00d4\u00d5\b\21\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00cd\3"+
		"\2\2\2\u00d6\u00d1\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da"+
		"\b\22\1\2\u00da\u00e0\3\2\2\2\u00db\u00dc\5&\24\2\u00dc\u00dd\5$\23\2"+
		"\u00dd\u00de\b\22\1\2\u00de\u00e0\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00db"+
		"\3\2\2\2\u00e0#\3\2\2\2\u00e1\u00e2\7\31\2\2\u00e2\u00e3\5&\24\2\u00e3"+
		"\u00e4\b\23\1\2\u00e4\u00eb\3\2\2\2\u00e5\u00e6\7\31\2\2\u00e6\u00e7\5"+
		"&\24\2\u00e7\u00e8\5$\23\2\u00e8\u00e9\b\23\1\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e1\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb%\3\2\2\2\u00ec\u00ed\7\3\2\2"+
		"\u00ed\u00ee\5\36\20\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\b\24\1\2\u00f0"+
		"\u00f5\3\2\2\2\u00f1\u00f2\5\20\t\2\u00f2\u00f3\b\24\1\2\u00f3\u00f5\3"+
		"\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f7"+
		"\7\25\2\2\u00f7\u00fb\b\25\1\2\u00f8\u00f9\7\26\2\2\u00f9\u00fb\b\25\1"+
		"\2\u00fa\u00f6\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb)\3\2\2\2\25\64:J\\jr"+
		"\u0083\u0090\u009e\u00a9\u00ae\u00b9\u00bd\u00cb\u00d6\u00df\u00ea\u00f4"+
		"\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}