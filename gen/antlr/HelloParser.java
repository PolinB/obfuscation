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
		LPAR=1, RPAR=2, IF=3, WHILE=4, USING=5, NAMESPACE=6, STD=7, SEMICLONE=8, 
		LONG=9, LONGLONG=10, INT=11, BOOL=12, RETURN=13, EQ=14, DEQ=15, NOT_EQ=16, 
		LS=17, GT=18, LSEQ=19, GTEQ=20, CIN=21, COUT=22, DCOLON=23, DLEFT=24, 
		DRIGHT=25, ENDL=26, TRUE=27, FALSE=28, INTEGER=29, PLUS=30, MUL=31, INCLUDE=32, 
		INCLUDE_NAME=33, MAIN=34, LPF=35, RPF=36, VARIABLE_NAME=37, WS=38;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_body = 2, RULE_line = 3, RULE_variableDeclaration = 4, 
		RULE_rightPart = 5, RULE_variableChange = 6, RULE_integerOrVariableInRightPart = 7, 
		RULE_variableInRightPart = 8, RULE_type = 9, RULE_usingLine = 10, RULE_cinLine = 11, 
		RULE_coutLine = 12, RULE_returnLine = 13, RULE_expression = 14, RULE_expressionPart = 15, 
		RULE_addExpression = 16, RULE_addExpressionPart = 17, RULE_mulExpression = 18, 
		RULE_boolValue = 19, RULE_comparisonOp = 20, RULE_ifBlock = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "body", "line", "variableDeclaration", "rightPart", 
			"variableChange", "integerOrVariableInRightPart", "variableInRightPart", 
			"type", "usingLine", "cinLine", "coutLine", "returnLine", "expression", 
			"expressionPart", "addExpression", "addExpressionPart", "mulExpression", 
			"boolValue", "comparisonOp", "ifBlock"
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

		        ((StartContext)_localctx).variables =  new HashMap<>();
		        ((StartContext)_localctx).index =  10;
		        ((StartContext)_localctx).connectedIostream =  false;
		        ((StartContext)_localctx).connectedStd =  false;
		        ((StartContext)_localctx).hasReturn =  false;
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((StartContext)_localctx).program = program();

			        StringBuilder sb = new StringBuilder();
			        sb.append(((StartContext)_localctx).program.sb.toString());
			        try(java.io.FileOutputStream fos=new java.io.FileOutputStream("/home/polinb/IdeaProjects/Test/results/example.cpp")) {
			            byte[] buffer = sb.toString().getBytes();
			            fos.write(buffer, 0, buffer.length);
			        } catch (java.io.IOException ex){
			            System.out.println(ex.getMessage());
			        }
			    
			setState(46);
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(48);
				((ProgramContext)_localctx).INCLUDE = match(INCLUDE);
				_localctx.sb.append((((ProgramContext)_localctx).INCLUDE!=null?((ProgramContext)_localctx).INCLUDE.getText():null)).append(" ");
				setState(50);
				((ProgramContext)_localctx).INCLUDE_NAME = match(INCLUDE_NAME);

				            if (((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).equals("<iostream>")) {
				                ((StartContext)getInvokingContext(0)).connectedIostream =  true;
				            }
				            _localctx.sb.append((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).append("\n");
				         
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(57);
				((ProgramContext)_localctx).usingLine = usingLine();

				            ((StartContext)getInvokingContext(0)).connectedStd =  true;
				            _localctx.sb.append("\n").append(((ProgramContext)_localctx).usingLine.sb.toString());
				         
				}
			}

			setState(62);
			((ProgramContext)_localctx).MAIN = match(MAIN);
			_localctx.sb.append("\n").append((((ProgramContext)_localctx).MAIN!=null?((ProgramContext)_localctx).MAIN.getText():null)).append(" ");
			setState(64);
			((ProgramContext)_localctx).LPF = match(LPF);
			_localctx.sb.append((((ProgramContext)_localctx).LPF!=null?((ProgramContext)_localctx).LPF.getText():null)).append("\n");
			setState(66);
			((ProgramContext)_localctx).body = body();

			            if (!((ProgramContext)_localctx).body.hasReturn) {
			                throw new RuntimeException("Forgot return.");
			            }
			            _localctx.sb.append(((ProgramContext)_localctx).body.sb.toString());
			         
			setState(68);
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
		public ArrayList<String> addedVariables;
		public LineContext line;
		public IfBlockContext ifBlock;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
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
		        ((BodyContext)_localctx).addedVariables =  new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << STD) | (1L << LONG) | (1L << LONGLONG) | (1L << INT) | (1L << BOOL) | (1L << RETURN) | (1L << CIN) | (1L << COUT) | (1L << VARIABLE_NAME))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STD:
				case LONG:
				case LONGLONG:
				case INT:
				case BOOL:
				case RETURN:
				case CIN:
				case COUT:
				case VARIABLE_NAME:
					{
					setState(71);
					((BodyContext)_localctx).line = line();

					        _localctx.sb.append(((BodyContext)_localctx).line.sb.toString()).append("\n");
					        ArrayList<String> values = new ArrayList<>(((StartContext)getInvokingContext(0)).variables.values());
					        int linesNum = (getRandom() % 7);
					        for (int i = 0; i < linesNum; ++i) {
					            String line = "";
					            if (getRandom() % 2 == 0) {
					                line = addNewVariable(((BodyContext)getInvokingContext(2)).addedVariables, values, ((StartContext)getInvokingContext(0)).index);
					                ++((StartContext)getInvokingContext(0)).index;
					            } else if (!((BodyContext)getInvokingContext(2)).addedVariables.isEmpty()) {
					                line = addActionWithVariable(((BodyContext)getInvokingContext(2)).addedVariables, values);
					            }
					            if (!line.isEmpty()) {
					                _localctx.sb.append(line).append("\n");
					            }
					        }
					        if (((BodyContext)_localctx).line.hasReturn) {
					            ((BodyContext)_localctx).hasReturn =  true;
					        }
					    
					}
					break;
				case IF:
				case WHILE:
					{
					setState(74);
					((BodyContext)_localctx).ifBlock = ifBlock();

					        _localctx.sb.append(((BodyContext)_localctx).ifBlock.sb.toString());
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(82);
				((LineContext)_localctx).variableDeclaration = variableDeclaration();

				        _localctx.sb.append(((LineContext)_localctx).variableDeclaration.sb.toString());
				    
				}
				break;
			case 2:
				{
				setState(85);
				((LineContext)_localctx).variableChange = variableChange();

				        _localctx.sb.append(((LineContext)_localctx).variableChange.sb.toString());
				    
				}
				break;
			case 3:
				{
				setState(88);
				((LineContext)_localctx).cinLine = cinLine();

				        _localctx.sb.append(((LineContext)_localctx).cinLine.sb.toString());
				    
				}
				break;
			case 4:
				{
				setState(91);
				((LineContext)_localctx).coutLine = coutLine();

				        _localctx.sb.append(((LineContext)_localctx).coutLine.sb.toString());
				    
				}
				break;
			case 5:
				{
				setState(94);
				((LineContext)_localctx).returnLine = returnLine();

				        _localctx.sb.append(((LineContext)_localctx).returnLine.sb.toString());
				        ((LineContext)_localctx).hasReturn =  true;
				    
				}
				break;
			}
			setState(99);
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
			setState(102);
			((VariableDeclarationContext)_localctx).type = type();

			        _localctx.sb.append(((VariableDeclarationContext)_localctx).type.sb.toString()).append(" ");
			    
			setState(104);
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
			    
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(106);
				match(EQ);

				        _localctx.sb.append(" = ");
				    
				setState(108);
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((RightPartContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

				        _localctx.sb.append(((RightPartContext)_localctx).integerOrVariableInRightPart.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
			setState(121);
			((VariableChangeContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((VariableChangeContext)_localctx).VARIABLE_NAME!=null?((VariableChangeContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
			            _localctx.sb.append(((StartContext)getInvokingContext(0)).variables.get(variableName));
			        } else {
			            throw new RuntimeException("Unknown variable in left part.");
			        }
			    
			setState(123);
			match(EQ);

			        _localctx.sb.append(" = ");
			    
			setState(125);
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
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((IntegerOrVariableInRightPartContext)_localctx).INTEGER = match(INTEGER);

				        _localctx.sb.append((((IntegerOrVariableInRightPartContext)_localctx).INTEGER!=null?((IntegerOrVariableInRightPartContext)_localctx).INTEGER.getText():null));
				    
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((IntegerOrVariableInRightPartContext)_localctx).boolValue = boolValue();

				        _localctx.sb.append(((IntegerOrVariableInRightPartContext)_localctx).boolValue.sb.toString());
				    
				}
				break;
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
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
			setState(138);
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((TypeContext)_localctx).LONG = match(LONG);
				_localctx.sb.append((((TypeContext)_localctx).LONG!=null?((TypeContext)_localctx).LONG.getText():null));
				}
				break;
			case LONGLONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((TypeContext)_localctx).LONGLONG = match(LONGLONG);
				_localctx.sb.append((((TypeContext)_localctx).LONGLONG!=null?((TypeContext)_localctx).LONGLONG.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				((TypeContext)_localctx).INT = match(INT);
				_localctx.sb.append((((TypeContext)_localctx).INT!=null?((TypeContext)_localctx).INT.getText():null));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
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
			setState(151);
			((UsingLineContext)_localctx).USING = match(USING);
			_localctx.sb.append((((UsingLineContext)_localctx).USING!=null?((UsingLineContext)_localctx).USING.getText():null)).append(" ");
			setState(153);
			((UsingLineContext)_localctx).NAMESPACE = match(NAMESPACE);
			_localctx.sb.append((((UsingLineContext)_localctx).NAMESPACE!=null?((UsingLineContext)_localctx).NAMESPACE.getText():null)).append(" ");
			setState(155);
			((UsingLineContext)_localctx).STD = match(STD);
			_localctx.sb.append((((UsingLineContext)_localctx).STD!=null?((UsingLineContext)_localctx).STD.getText():null));
			setState(157);
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STD) {
				{
				setState(160);
				((CinLineContext)_localctx).STD = match(STD);
				setState(161);
				((CinLineContext)_localctx).DCOLON = match(DCOLON);

				        _localctx.sb.append((((CinLineContext)_localctx).STD!=null?((CinLineContext)_localctx).STD.getText():null)).append((((CinLineContext)_localctx).DCOLON!=null?((CinLineContext)_localctx).DCOLON.getText():null));
				        ((CinLineContext)getInvokingContext(11)).hasStd =  true;
				    
				}
			}

			setState(165);
			((CinLineContext)_localctx).CIN = match(CIN);

			        if (!((StartContext)getInvokingContext(0)).connectedIostream) {
			            throw new RuntimeException("Forgot to connect iostream.");
			        }
			        if (!((CinLineContext)getInvokingContext(11)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
			            throw new RuntimeException("Forgot to connect std.");
			        }
			        _localctx.sb.append((((CinLineContext)_localctx).CIN!=null?((CinLineContext)_localctx).CIN.getText():null));
			    
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				((CinLineContext)_localctx).DRIGHT = match(DRIGHT);

				        _localctx.sb.append(" ").append((((CinLineContext)_localctx).DRIGHT!=null?((CinLineContext)_localctx).DRIGHT.getText():null)).append(" ");
				    
				setState(169);
				((CinLineContext)_localctx).variableInRightPart = variableInRightPart();

				        _localctx.sb.append(((CinLineContext)_localctx).variableInRightPart.sb.toString());
				    
				}
				}
				setState(174); 
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
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STD) {
				{
				setState(176);
				((CoutLineContext)_localctx).STD = match(STD);
				setState(177);
				((CoutLineContext)_localctx).DCOLON = match(DCOLON);

				        _localctx.sb.append((((CoutLineContext)_localctx).STD!=null?((CoutLineContext)_localctx).STD.getText():null)).append((((CoutLineContext)_localctx).DCOLON!=null?((CoutLineContext)_localctx).DCOLON.getText():null));
				        ((CoutLineContext)getInvokingContext(12)).hasStd =  true;
				    
				}
			}

			setState(181);
			((CoutLineContext)_localctx).COUT = match(COUT);

			        if (!((StartContext)getInvokingContext(0)).connectedIostream) {
			            throw new RuntimeException("Forgot to connect iostream.");
			        }
			        if (!((CoutLineContext)getInvokingContext(12)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
			            throw new RuntimeException("Forgot to connect std.");
			        }
			        _localctx.sb.append((((CoutLineContext)_localctx).COUT!=null?((CoutLineContext)_localctx).COUT.getText():null));
			    
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				((CoutLineContext)_localctx).DLEFT = match(DLEFT);

				        _localctx.sb.append(" ").append((((CoutLineContext)_localctx).DLEFT!=null?((CoutLineContext)_localctx).DLEFT.getText():null)).append(" ");
				    
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case INTEGER:
				case VARIABLE_NAME:
					{
					setState(185);
					((CoutLineContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

					        _localctx.sb.append(((CoutLineContext)_localctx).integerOrVariableInRightPart.sb.toString());
					    
					}
					break;
				case ENDL:
					{
					setState(188);
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
				setState(194); 
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
			setState(196);
			((ReturnLineContext)_localctx).RETURN = match(RETURN);

			        _localctx.sb.append((((ReturnLineContext)_localctx).RETURN!=null?((ReturnLineContext)_localctx).RETURN.getText():null)).append(" ");
			    
			setState(198);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((ExpressionContext)_localctx).addExpression = addExpression();

				        _localctx.sb.append(((ExpressionContext)_localctx).addExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((ExpressionContext)_localctx).addExpression = addExpression();
				setState(205);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((ExpressionPartContext)_localctx).PLUS = match(PLUS);
				setState(211);
				((ExpressionPartContext)_localctx).addExpression = addExpression();

				        _localctx.sb.append(" ").append((((ExpressionPartContext)_localctx).PLUS!=null?((ExpressionPartContext)_localctx).PLUS.getText():null)).append(" ").append(((ExpressionPartContext)_localctx).addExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((ExpressionPartContext)_localctx).PLUS = match(PLUS);
				setState(215);
				((ExpressionPartContext)_localctx).addExpression = addExpression();
				setState(216);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((AddExpressionContext)_localctx).mulExpression = mulExpression();

				        _localctx.sb.append(((AddExpressionContext)_localctx).mulExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((AddExpressionContext)_localctx).mulExpression = mulExpression();
				setState(225);
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((AddExpressionPartContext)_localctx).MUL = match(MUL);
				setState(231);
				((AddExpressionPartContext)_localctx).mulExpression = mulExpression();

				        _localctx.sb.append(" ").append((((AddExpressionPartContext)_localctx).MUL!=null?((AddExpressionPartContext)_localctx).MUL.getText():null)).append(" ").append(((AddExpressionPartContext)_localctx).mulExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((AddExpressionPartContext)_localctx).MUL = match(MUL);
				setState(235);
				((AddExpressionPartContext)_localctx).mulExpression = mulExpression();
				setState(236);
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((MulExpressionContext)_localctx).LPAR = match(LPAR);
				setState(242);
				((MulExpressionContext)_localctx).expression = expression();
				setState(243);
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
				setState(246);
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
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((BoolValueContext)_localctx).TRUE = match(TRUE);

				        _localctx.sb.append((((BoolValueContext)_localctx).TRUE!=null?((BoolValueContext)_localctx).TRUE.getText():null));
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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

	public static class ComparisonOpContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token op;
		public TerminalNode DEQ() { return getToken(HelloParser.DEQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(HelloParser.NOT_EQ, 0); }
		public TerminalNode LS() { return getToken(HelloParser.LS, 0); }
		public TerminalNode GT() { return getToken(HelloParser.GT, 0); }
		public TerminalNode LSEQ() { return getToken(HelloParser.LSEQ, 0); }
		public TerminalNode GTEQ() { return getToken(HelloParser.GTEQ, 0); }
		public ComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComparisonOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComparisonOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitComparisonOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comparisonOp);

		         ((ComparisonOpContext)_localctx).sb =  new StringBuilder();
		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((ComparisonOpContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEQ) | (1L << NOT_EQ) | (1L << LS) | (1L << GT) | (1L << LSEQ) | (1L << GTEQ))) != 0)) ) {
				((ComparisonOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			        _localctx.sb.append((((ComparisonOpContext)_localctx).op!=null?((ComparisonOpContext)_localctx).op.getText():null));
			     
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

	public static class IfBlockContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token i;
		public Token LPAR;
		public ExpressionContext e1;
		public ComparisonOpContext comparisonOp;
		public ExpressionContext e2;
		public Token RPAR;
		public Token LPF;
		public BodyContext b;
		public Token RPF;
		public TerminalNode LPAR() { return getToken(HelloParser.LPAR, 0); }
		public ComparisonOpContext comparisonOp() {
			return getRuleContext(ComparisonOpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HelloParser.RPAR, 0); }
		public TerminalNode LPF() { return getToken(HelloParser.LPF, 0); }
		public TerminalNode RPF() { return getToken(HelloParser.RPF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public TerminalNode WHILE() { return getToken(HelloParser.WHILE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifBlock);

		         ((IfBlockContext)_localctx).sb =  new StringBuilder();
		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			((IfBlockContext)_localctx).i = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==IF || _la==WHILE) ) {
				((IfBlockContext)_localctx).i = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			((IfBlockContext)_localctx).LPAR = match(LPAR);
			setState(262);
			((IfBlockContext)_localctx).e1 = expression();
			setState(263);
			((IfBlockContext)_localctx).comparisonOp = comparisonOp();
			setState(264);
			((IfBlockContext)_localctx).e2 = expression();
			setState(265);
			((IfBlockContext)_localctx).RPAR = match(RPAR);

			        _localctx.sb.append((((IfBlockContext)_localctx).i!=null?((IfBlockContext)_localctx).i.getText():null)).append(" ").append((((IfBlockContext)_localctx).LPAR!=null?((IfBlockContext)_localctx).LPAR.getText():null))
			            .append(((IfBlockContext)_localctx).e1.sb.toString()).append(" ").append(((IfBlockContext)_localctx).comparisonOp.sb.toString()).append(" ").append(((IfBlockContext)_localctx).e2.sb.toString())
			            .append((((IfBlockContext)_localctx).RPAR!=null?((IfBlockContext)_localctx).RPAR.getText():null)).append(" ");
			     
			setState(267);
			((IfBlockContext)_localctx).LPF = match(LPF);
			setState(268);
			((IfBlockContext)_localctx).b = body();
			setState(269);
			((IfBlockContext)_localctx).RPF = match(RPF);

			        _localctx.sb.append((((IfBlockContext)_localctx).LPF!=null?((IfBlockContext)_localctx).LPF.getText():null)).append("\n").append(((IfBlockContext)_localctx).b.sb.toString()).append((((IfBlockContext)_localctx).RPF!=null?((IfBlockContext)_localctx).RPF.getText():null)).append("\n");
			     
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"d\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u00a6\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00af\n\r\r\r\16"+
		"\r\u00b0\3\16\3\16\3\16\5\16\u00b6\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00c1\n\16\6\16\u00c3\n\16\r\16\16\16\u00c4\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d3\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00de\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00e7\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00f2\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00fc\n\24\3\25\3\25\3\25\3\25\5\25\u0102\n\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\2\2\30"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\3\2\21\26\3\2\5\6"+
		"\2\u0116\2.\3\2\2\2\48\3\2\2\2\6Q\3\2\2\2\bc\3\2\2\2\nh\3\2\2\2\fy\3\2"+
		"\2\2\16{\3\2\2\2\20\u008a\3\2\2\2\22\u008c\3\2\2\2\24\u0097\3\2\2\2\26"+
		"\u0099\3\2\2\2\30\u00a5\3\2\2\2\32\u00b5\3\2\2\2\34\u00c6\3\2\2\2\36\u00d2"+
		"\3\2\2\2 \u00dd\3\2\2\2\"\u00e6\3\2\2\2$\u00f1\3\2\2\2&\u00fb\3\2\2\2"+
		"(\u0101\3\2\2\2*\u0103\3\2\2\2,\u0106\3\2\2\2./\5\4\3\2/\60\b\2\1\2\60"+
		"\61\7\2\2\3\61\3\3\2\2\2\62\63\7\"\2\2\63\64\b\3\1\2\64\65\7#\2\2\65\67"+
		"\b\3\1\2\66\62\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3"+
		"\2\2\2;<\5\26\f\2<=\b\3\1\2=?\3\2\2\2>;\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A"+
		"\7$\2\2AB\b\3\1\2BC\7%\2\2CD\b\3\1\2DE\5\6\4\2EF\b\3\1\2FG\7&\2\2GH\b"+
		"\3\1\2H\5\3\2\2\2IJ\5\b\5\2JK\b\4\1\2KP\3\2\2\2LM\5,\27\2MN\b\4\1\2NP"+
		"\3\2\2\2OI\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7\3\2\2\2"+
		"SQ\3\2\2\2TU\5\n\6\2UV\b\5\1\2Vd\3\2\2\2WX\5\16\b\2XY\b\5\1\2Yd\3\2\2"+
		"\2Z[\5\30\r\2[\\\b\5\1\2\\d\3\2\2\2]^\5\32\16\2^_\b\5\1\2_d\3\2\2\2`a"+
		"\5\34\17\2ab\b\5\1\2bd\3\2\2\2cT\3\2\2\2cW\3\2\2\2cZ\3\2\2\2c]\3\2\2\2"+
		"c`\3\2\2\2de\3\2\2\2ef\7\n\2\2fg\b\5\1\2g\t\3\2\2\2hi\5\24\13\2ij\b\6"+
		"\1\2jk\7\'\2\2kq\b\6\1\2lm\7\20\2\2mn\b\6\1\2no\5\f\7\2op\b\6\1\2pr\3"+
		"\2\2\2ql\3\2\2\2qr\3\2\2\2r\13\3\2\2\2st\5\20\t\2tu\b\7\1\2uz\3\2\2\2"+
		"vw\5\36\20\2wx\b\7\1\2xz\3\2\2\2ys\3\2\2\2yv\3\2\2\2z\r\3\2\2\2{|\7\'"+
		"\2\2|}\b\b\1\2}~\7\20\2\2~\177\b\b\1\2\177\u0080\5\f\7\2\u0080\u0081\b"+
		"\b\1\2\u0081\17\3\2\2\2\u0082\u0083\7\37\2\2\u0083\u008b\b\t\1\2\u0084"+
		"\u0085\5(\25\2\u0085\u0086\b\t\1\2\u0086\u008b\3\2\2\2\u0087\u0088\5\22"+
		"\n\2\u0088\u0089\b\t\1\2\u0089\u008b\3\2\2\2\u008a\u0082\3\2\2\2\u008a"+
		"\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\21\3\2\2\2\u008c\u008d\7\'\2"+
		"\2\u008d\u008e\b\n\1\2\u008e\23\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0098"+
		"\b\13\1\2\u0091\u0092\7\f\2\2\u0092\u0098\b\13\1\2\u0093\u0094\7\r\2\2"+
		"\u0094\u0098\b\13\1\2\u0095\u0096\7\16\2\2\u0096\u0098\b\13\1\2\u0097"+
		"\u008f\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\25\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u009b\b\f\1\2\u009b\u009c"+
		"\7\b\2\2\u009c\u009d\b\f\1\2\u009d\u009e\7\t\2\2\u009e\u009f\b\f\1\2\u009f"+
		"\u00a0\7\n\2\2\u00a0\u00a1\b\f\1\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\t\2"+
		"\2\u00a3\u00a4\7\31\2\2\u00a4\u00a6\b\r\1\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00ae\b"+
		"\r\1\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\b\r\1\2\u00ab\u00ac\5\22\n\2\u00ac"+
		"\u00ad\b\r\1\2\u00ad\u00af\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b3"+
		"\7\t\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b6\b\16\1\2\u00b5\u00b2\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\30\2\2\u00b8\u00c2"+
		"\b\16\1\2\u00b9\u00ba\7\32\2\2\u00ba\u00c0\b\16\1\2\u00bb\u00bc\5\20\t"+
		"\2\u00bc\u00bd\b\16\1\2\u00bd\u00c1\3\2\2\2\u00be\u00bf\7\34\2\2\u00bf"+
		"\u00c1\b\16\1\2\u00c0\u00bb\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\3"+
		"\2\2\2\u00c2\u00b9\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\b\17"+
		"\1\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\b\17\1\2\u00ca\35\3\2\2\2\u00cb"+
		"\u00cc\5\"\22\2\u00cc\u00cd\b\20\1\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf\5"+
		"\"\22\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\b\20\1\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00cb\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7 \2\2"+
		"\u00d5\u00d6\5\"\22\2\u00d6\u00d7\b\21\1\2\u00d7\u00de\3\2\2\2\u00d8\u00d9"+
		"\7 \2\2\u00d9\u00da\5\"\22\2\u00da\u00db\5 \21\2\u00db\u00dc\b\21\1\2"+
		"\u00dc\u00de\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de!\3"+
		"\2\2\2\u00df\u00e0\5&\24\2\u00e0\u00e1\b\22\1\2\u00e1\u00e7\3\2\2\2\u00e2"+
		"\u00e3\5&\24\2\u00e3\u00e4\5$\23\2\u00e4\u00e5\b\22\1\2\u00e5\u00e7\3"+
		"\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7#\3\2\2\2\u00e8\u00e9"+
		"\7!\2\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\b\23\1\2\u00eb\u00f2\3\2\2\2\u00ec"+
		"\u00ed\7!\2\2\u00ed\u00ee\5&\24\2\u00ee\u00ef\5$\23\2\u00ef\u00f0\b\23"+
		"\1\2\u00f0\u00f2\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2"+
		"%\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5\36\20\2\u00f5\u00f6\7\4\2"+
		"\2\u00f6\u00f7\b\24\1\2\u00f7\u00fc\3\2\2\2\u00f8\u00f9\5\20\t\2\u00f9"+
		"\u00fa\b\24\1\2\u00fa\u00fc\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f8\3"+
		"\2\2\2\u00fc\'\3\2\2\2\u00fd\u00fe\7\35\2\2\u00fe\u0102\b\25\1\2\u00ff"+
		"\u0100\7\36\2\2\u0100\u0102\b\25\1\2\u0101\u00fd\3\2\2\2\u0101\u00ff\3"+
		"\2\2\2\u0102)\3\2\2\2\u0103\u0104\t\2\2\2\u0104\u0105\b\26\1\2\u0105+"+
		"\3\2\2\2\u0106\u0107\t\3\2\2\u0107\u0108\7\3\2\2\u0108\u0109\5\36\20\2"+
		"\u0109\u010a\5*\26\2\u010a\u010b\5\36\20\2\u010b\u010c\7\4\2\2\u010c\u010d"+
		"\b\27\1\2\u010d\u010e\7%\2\2\u010e\u010f\5\6\4\2\u010f\u0110\7&\2\2\u0110"+
		"\u0111\b\27\1\2\u0111-\3\2\2\2\268>OQcqy\u008a\u0097\u00a5\u00b0\u00b5"+
		"\u00c0\u00c4\u00d2\u00dd\u00e6\u00f1\u00fb\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}