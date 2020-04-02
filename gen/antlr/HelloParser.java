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
		LPAR=1, RPAR=2, IF=3, ELSE=4, WHILE=5, USING=6, NAMESPACE=7, STD=8, SEMICLONE=9, 
		LONG=10, LONGLONG=11, INT=12, BOOL=13, RETURN=14, EQ=15, DEQ=16, NOT_EQ=17, 
		LS=18, GT=19, LSEQ=20, GTEQ=21, CIN=22, COUT=23, DCOLON=24, DLEFT=25, 
		DRIGHT=26, ENDL=27, TRUE=28, FALSE=29, INTEGER=30, PLUS=31, MUL=32, INCLUDE=33, 
		INCLUDE_NAME=34, MAIN=35, LPF=36, RPF=37, VARIABLE_NAME=38, WS=39;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_body = 2, RULE_line = 3, RULE_variableDeclaration = 4, 
		RULE_rightPart = 5, RULE_variableChange = 6, RULE_integerOrVariableInRightPart = 7, 
		RULE_variableInRightPart = 8, RULE_type = 9, RULE_usingLine = 10, RULE_cinLine = 11, 
		RULE_coutLine = 12, RULE_returnLine = 13, RULE_expression = 14, RULE_expressionPart = 15, 
		RULE_addExpression = 16, RULE_addExpressionPart = 17, RULE_mulExpression = 18, 
		RULE_boolValue = 19, RULE_comparisonOp = 20, RULE_ifBlock = 21, RULE_whileBlock = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "body", "line", "variableDeclaration", "rightPart", 
			"variableChange", "integerOrVariableInRightPart", "variableInRightPart", 
			"type", "usingLine", "cinLine", "coutLine", "returnLine", "expression", 
			"expressionPart", "addExpression", "addExpressionPart", "mulExpression", 
			"boolValue", "comparisonOp", "ifBlock", "whileBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'else'", "'while'", "'using'", "'namespace'", 
			"'std'", "';'", "'long'", "'long long'", "'int'", "'bool'", "'return'", 
			"'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'cin'", "'cout'", 
			"'::'", "'<<'", "'>>'", "'endl'", "'true'", "'false'", null, "'+'", "'*'", 
			"'#include'", null, "'int main()'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAR", "RPAR", "IF", "ELSE", "WHILE", "USING", "NAMESPACE", "STD", 
			"SEMICLONE", "LONG", "LONGLONG", "INT", "BOOL", "RETURN", "EQ", "DEQ", 
			"NOT_EQ", "LS", "GT", "LSEQ", "GTEQ", "CIN", "COUT", "DCOLON", "DLEFT", 
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
			setState(46);
			((StartContext)_localctx).program = program();

			        StringBuilder sb = new StringBuilder();
			        sb.append(((StartContext)_localctx).program.sb.toString());
			        try(java.io.FileOutputStream fos=new java.io.FileOutputStream("/home/polinb/IdeaProjects/Test/results/example.cpp")) {
			            byte[] buffer = sb.toString().getBytes();
			            fos.write(buffer, 0, buffer.length);
			        } catch (java.io.IOException ex){
			            System.out.println(ex.getMessage());
			        }
			    
			setState(48);
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(50);
				((ProgramContext)_localctx).INCLUDE = match(INCLUDE);
				_localctx.sb.append((((ProgramContext)_localctx).INCLUDE!=null?((ProgramContext)_localctx).INCLUDE.getText():null)).append(" ");
				setState(52);
				((ProgramContext)_localctx).INCLUDE_NAME = match(INCLUDE_NAME);

				            if (((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).equals("<iostream>")) {
				                ((StartContext)getInvokingContext(0)).connectedIostream =  true;
				            }
				            _localctx.sb.append((((ProgramContext)_localctx).INCLUDE_NAME!=null?((ProgramContext)_localctx).INCLUDE_NAME.getText():null)).append("\n");
				         
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(59);
				((ProgramContext)_localctx).usingLine = usingLine();

				            ((StartContext)getInvokingContext(0)).connectedStd =  true;
				            _localctx.sb.append("\n").append(((ProgramContext)_localctx).usingLine.sb.toString());
				         
				}
			}

			setState(64);
			((ProgramContext)_localctx).MAIN = match(MAIN);
			_localctx.sb.append("\n").append((((ProgramContext)_localctx).MAIN!=null?((ProgramContext)_localctx).MAIN.getText():null)).append(" ");
			setState(66);
			((ProgramContext)_localctx).LPF = match(LPF);
			_localctx.sb.append((((ProgramContext)_localctx).LPF!=null?((ProgramContext)_localctx).LPF.getText():null)).append("\n");
			setState(68);
			((ProgramContext)_localctx).body = body();

			            if (!((ProgramContext)_localctx).body.hasReturn) {
			                throw new RuntimeException("Forgot return.");
			            }
			            _localctx.sb.append(((ProgramContext)_localctx).body.sb.toString());
			         
			setState(70);
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
		public WhileBlockContext whileBlock;
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
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << STD) | (1L << LONG) | (1L << LONGLONG) | (1L << INT) | (1L << BOOL) | (1L << RETURN) | (1L << CIN) | (1L << COUT) | (1L << VARIABLE_NAME))) != 0)) {
				{
				setState(82);
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
					setState(73);
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
					{
					setState(76);
					((BodyContext)_localctx).ifBlock = ifBlock();

					        _localctx.sb.append(((BodyContext)_localctx).ifBlock.sb.toString());
					    
					}
					break;
				case WHILE:
					{
					setState(79);
					((BodyContext)_localctx).whileBlock = whileBlock();

					        _localctx.sb.append(((BodyContext)_localctx).whileBlock.sb.toString());
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(87);
				((LineContext)_localctx).variableDeclaration = variableDeclaration();

				        _localctx.sb.append(((LineContext)_localctx).variableDeclaration.sb.toString());
				    
				}
				break;
			case 2:
				{
				setState(90);
				((LineContext)_localctx).variableChange = variableChange();

				        _localctx.sb.append(((LineContext)_localctx).variableChange.sb.toString());
				    
				}
				break;
			case 3:
				{
				setState(93);
				((LineContext)_localctx).cinLine = cinLine();

				        _localctx.sb.append(((LineContext)_localctx).cinLine.sb.toString());
				    
				}
				break;
			case 4:
				{
				setState(96);
				((LineContext)_localctx).coutLine = coutLine();

				        _localctx.sb.append(((LineContext)_localctx).coutLine.sb.toString());
				    
				}
				break;
			case 5:
				{
				setState(99);
				((LineContext)_localctx).returnLine = returnLine();

				        _localctx.sb.append(((LineContext)_localctx).returnLine.sb.toString());
				        ((LineContext)_localctx).hasReturn =  true;
				    
				}
				break;
			}
			setState(104);
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
			setState(107);
			((VariableDeclarationContext)_localctx).type = type();

			        _localctx.sb.append(((VariableDeclarationContext)_localctx).type.sb.toString()).append(" ");
			    
			setState(109);
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
			    
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(111);
				match(EQ);

				        _localctx.sb.append(" = ");
				    
				setState(113);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((RightPartContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

				        _localctx.sb.append(((RightPartContext)_localctx).integerOrVariableInRightPart.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(126);
			((VariableChangeContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);

			        String variableName = (((VariableChangeContext)_localctx).VARIABLE_NAME!=null?((VariableChangeContext)_localctx).VARIABLE_NAME.getText():null);
			        if (((StartContext)getInvokingContext(0)).variables.containsKey(variableName)) {
			            _localctx.sb.append(((StartContext)getInvokingContext(0)).variables.get(variableName));
			        } else {
			            throw new RuntimeException("Unknown variable in left part.");
			        }
			    
			setState(128);
			match(EQ);

			        _localctx.sb.append(" = ");
			    
			setState(130);
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
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((IntegerOrVariableInRightPartContext)_localctx).INTEGER = match(INTEGER);

				        _localctx.sb.append((((IntegerOrVariableInRightPartContext)_localctx).INTEGER!=null?((IntegerOrVariableInRightPartContext)_localctx).INTEGER.getText():null));
				    
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((IntegerOrVariableInRightPartContext)_localctx).boolValue = boolValue();

				        _localctx.sb.append(((IntegerOrVariableInRightPartContext)_localctx).boolValue.sb.toString());
				    
				}
				break;
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
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
			setState(143);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((TypeContext)_localctx).LONG = match(LONG);
				_localctx.sb.append((((TypeContext)_localctx).LONG!=null?((TypeContext)_localctx).LONG.getText():null));
				}
				break;
			case LONGLONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				((TypeContext)_localctx).LONGLONG = match(LONGLONG);
				_localctx.sb.append((((TypeContext)_localctx).LONGLONG!=null?((TypeContext)_localctx).LONGLONG.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				((TypeContext)_localctx).INT = match(INT);
				_localctx.sb.append((((TypeContext)_localctx).INT!=null?((TypeContext)_localctx).INT.getText():null));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
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
			setState(156);
			((UsingLineContext)_localctx).USING = match(USING);
			_localctx.sb.append((((UsingLineContext)_localctx).USING!=null?((UsingLineContext)_localctx).USING.getText():null)).append(" ");
			setState(158);
			((UsingLineContext)_localctx).NAMESPACE = match(NAMESPACE);
			_localctx.sb.append((((UsingLineContext)_localctx).NAMESPACE!=null?((UsingLineContext)_localctx).NAMESPACE.getText():null)).append(" ");
			setState(160);
			((UsingLineContext)_localctx).STD = match(STD);
			_localctx.sb.append((((UsingLineContext)_localctx).STD!=null?((UsingLineContext)_localctx).STD.getText():null));
			setState(162);
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
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STD) {
				{
				setState(165);
				((CinLineContext)_localctx).STD = match(STD);
				setState(166);
				((CinLineContext)_localctx).DCOLON = match(DCOLON);

				        _localctx.sb.append((((CinLineContext)_localctx).STD!=null?((CinLineContext)_localctx).STD.getText():null)).append((((CinLineContext)_localctx).DCOLON!=null?((CinLineContext)_localctx).DCOLON.getText():null));
				        ((CinLineContext)getInvokingContext(11)).hasStd =  true;
				    
				}
			}

			setState(170);
			((CinLineContext)_localctx).CIN = match(CIN);

			        if (!((StartContext)getInvokingContext(0)).connectedIostream) {
			            throw new RuntimeException("Forgot to connect iostream.");
			        }
			        if (!((CinLineContext)getInvokingContext(11)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
			            throw new RuntimeException("Forgot to connect std.");
			        }
			        _localctx.sb.append((((CinLineContext)_localctx).CIN!=null?((CinLineContext)_localctx).CIN.getText():null));
			    
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				((CinLineContext)_localctx).DRIGHT = match(DRIGHT);

				        _localctx.sb.append(" ").append((((CinLineContext)_localctx).DRIGHT!=null?((CinLineContext)_localctx).DRIGHT.getText():null)).append(" ");
				    
				setState(174);
				((CinLineContext)_localctx).variableInRightPart = variableInRightPart();

				        _localctx.sb.append(((CinLineContext)_localctx).variableInRightPart.sb.toString());
				    
				}
				}
				setState(179); 
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
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STD) {
				{
				setState(181);
				((CoutLineContext)_localctx).STD = match(STD);
				setState(182);
				((CoutLineContext)_localctx).DCOLON = match(DCOLON);

				        _localctx.sb.append((((CoutLineContext)_localctx).STD!=null?((CoutLineContext)_localctx).STD.getText():null)).append((((CoutLineContext)_localctx).DCOLON!=null?((CoutLineContext)_localctx).DCOLON.getText():null));
				        ((CoutLineContext)getInvokingContext(12)).hasStd =  true;
				    
				}
			}

			setState(186);
			((CoutLineContext)_localctx).COUT = match(COUT);

			        if (!((StartContext)getInvokingContext(0)).connectedIostream) {
			            throw new RuntimeException("Forgot to connect iostream.");
			        }
			        if (!((CoutLineContext)getInvokingContext(12)).hasStd && !((StartContext)getInvokingContext(0)).connectedStd) {
			            throw new RuntimeException("Forgot to connect std.");
			        }
			        _localctx.sb.append((((CoutLineContext)_localctx).COUT!=null?((CoutLineContext)_localctx).COUT.getText():null));
			    
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				((CoutLineContext)_localctx).DLEFT = match(DLEFT);

				        _localctx.sb.append(" ").append((((CoutLineContext)_localctx).DLEFT!=null?((CoutLineContext)_localctx).DLEFT.getText():null)).append(" ");
				    
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case INTEGER:
				case VARIABLE_NAME:
					{
					setState(190);
					((CoutLineContext)_localctx).integerOrVariableInRightPart = integerOrVariableInRightPart();

					        _localctx.sb.append(((CoutLineContext)_localctx).integerOrVariableInRightPart.sb.toString());
					    
					}
					break;
				case ENDL:
					{
					setState(193);
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
				setState(199); 
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
			setState(201);
			((ReturnLineContext)_localctx).RETURN = match(RETURN);

			        _localctx.sb.append((((ReturnLineContext)_localctx).RETURN!=null?((ReturnLineContext)_localctx).RETURN.getText():null)).append(" ");
			    
			setState(203);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((ExpressionContext)_localctx).addExpression = addExpression();

				        _localctx.sb.append(((ExpressionContext)_localctx).addExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				((ExpressionContext)_localctx).addExpression = addExpression();
				setState(210);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((ExpressionPartContext)_localctx).PLUS = match(PLUS);
				setState(216);
				((ExpressionPartContext)_localctx).addExpression = addExpression();

				        _localctx.sb.append(" ").append((((ExpressionPartContext)_localctx).PLUS!=null?((ExpressionPartContext)_localctx).PLUS.getText():null)).append(" ").append(((ExpressionPartContext)_localctx).addExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((ExpressionPartContext)_localctx).PLUS = match(PLUS);
				setState(220);
				((ExpressionPartContext)_localctx).addExpression = addExpression();
				setState(221);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((AddExpressionContext)_localctx).mulExpression = mulExpression();

				        _localctx.sb.append(((AddExpressionContext)_localctx).mulExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((AddExpressionContext)_localctx).mulExpression = mulExpression();
				setState(230);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				((AddExpressionPartContext)_localctx).MUL = match(MUL);
				setState(236);
				((AddExpressionPartContext)_localctx).mulExpression = mulExpression();

				        _localctx.sb.append(" ").append((((AddExpressionPartContext)_localctx).MUL!=null?((AddExpressionPartContext)_localctx).MUL.getText():null)).append(" ").append(((AddExpressionPartContext)_localctx).mulExpression.sb.toString());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((AddExpressionPartContext)_localctx).MUL = match(MUL);
				setState(240);
				((AddExpressionPartContext)_localctx).mulExpression = mulExpression();
				setState(241);
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
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((MulExpressionContext)_localctx).LPAR = match(LPAR);
				setState(247);
				((MulExpressionContext)_localctx).expression = expression();
				setState(248);
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
				setState(251);
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
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((BoolValueContext)_localctx).TRUE = match(TRUE);

				        _localctx.sb.append((((BoolValueContext)_localctx).TRUE!=null?((BoolValueContext)_localctx).TRUE.getText():null));
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
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
			setState(262);
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
		public Token ELSE;
		public BodyContext bElse;
		public TerminalNode LPAR() { return getToken(HelloParser.LPAR, 0); }
		public ComparisonOpContext comparisonOp() {
			return getRuleContext(ComparisonOpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HelloParser.RPAR, 0); }
		public List<TerminalNode> LPF() { return getTokens(HelloParser.LPF); }
		public TerminalNode LPF(int i) {
			return getToken(HelloParser.LPF, i);
		}
		public List<TerminalNode> RPF() { return getTokens(HelloParser.RPF); }
		public TerminalNode RPF(int i) {
			return getToken(HelloParser.RPF, i);
		}
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HelloParser.ELSE, 0); }
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
			setState(265);
			((IfBlockContext)_localctx).i = match(IF);
			setState(266);
			((IfBlockContext)_localctx).LPAR = match(LPAR);
			setState(267);
			((IfBlockContext)_localctx).e1 = expression();
			setState(268);
			((IfBlockContext)_localctx).comparisonOp = comparisonOp();
			setState(269);
			((IfBlockContext)_localctx).e2 = expression();
			setState(270);
			((IfBlockContext)_localctx).RPAR = match(RPAR);

			        _localctx.sb.append((((IfBlockContext)_localctx).i!=null?((IfBlockContext)_localctx).i.getText():null)).append(" ").append((((IfBlockContext)_localctx).LPAR!=null?((IfBlockContext)_localctx).LPAR.getText():null))
			            .append(((IfBlockContext)_localctx).e1.sb.toString()).append(" ").append(((IfBlockContext)_localctx).comparisonOp.sb.toString()).append(" ").append(((IfBlockContext)_localctx).e2.sb.toString())
			            .append((((IfBlockContext)_localctx).RPAR!=null?((IfBlockContext)_localctx).RPAR.getText():null)).append(" ");
			     
			setState(272);
			((IfBlockContext)_localctx).LPF = match(LPF);
			setState(273);
			((IfBlockContext)_localctx).b = body();
			setState(274);
			((IfBlockContext)_localctx).RPF = match(RPF);

			        _localctx.sb.append((((IfBlockContext)_localctx).LPF!=null?((IfBlockContext)_localctx).LPF.getText():null)).append("\n").append(((IfBlockContext)_localctx).b.sb.toString()).append((((IfBlockContext)_localctx).RPF!=null?((IfBlockContext)_localctx).RPF.getText():null)).append("\n");
			     
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(276);
				((IfBlockContext)_localctx).ELSE = match(ELSE);
				setState(277);
				((IfBlockContext)_localctx).LPF = match(LPF);
				setState(278);
				((IfBlockContext)_localctx).bElse = body();
				setState(279);
				((IfBlockContext)_localctx).RPF = match(RPF);

				        _localctx.sb.append((((IfBlockContext)_localctx).ELSE!=null?((IfBlockContext)_localctx).ELSE.getText():null)).append((((IfBlockContext)_localctx).LPF!=null?((IfBlockContext)_localctx).LPF.getText():null)).append("\n").append(((IfBlockContext)_localctx).bElse.sb.toString()).append((((IfBlockContext)_localctx).RPF!=null?((IfBlockContext)_localctx).RPF.getText():null)).append("\n");
				     
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

	public static class WhileBlockContext extends ParserRuleContext {
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
		public TerminalNode WHILE() { return getToken(HelloParser.WHILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileBlock);

		         ((WhileBlockContext)_localctx).sb =  new StringBuilder();
		     
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((WhileBlockContext)_localctx).i = match(WHILE);
			setState(285);
			((WhileBlockContext)_localctx).LPAR = match(LPAR);
			setState(286);
			((WhileBlockContext)_localctx).e1 = expression();
			setState(287);
			((WhileBlockContext)_localctx).comparisonOp = comparisonOp();
			setState(288);
			((WhileBlockContext)_localctx).e2 = expression();
			setState(289);
			((WhileBlockContext)_localctx).RPAR = match(RPAR);

			        _localctx.sb.append((((WhileBlockContext)_localctx).i!=null?((WhileBlockContext)_localctx).i.getText():null)).append(" ").append((((WhileBlockContext)_localctx).LPAR!=null?((WhileBlockContext)_localctx).LPAR.getText():null))
			            .append(((WhileBlockContext)_localctx).e1.sb.toString()).append(" ").append(((WhileBlockContext)_localctx).comparisonOp.sb.toString()).append(" ").append(((WhileBlockContext)_localctx).e2.sb.toString())
			            .append((((WhileBlockContext)_localctx).RPAR!=null?((WhileBlockContext)_localctx).RPAR.getText():null)).append(" ");
			     
			setState(291);
			((WhileBlockContext)_localctx).LPF = match(LPF);
			setState(292);
			((WhileBlockContext)_localctx).b = body();
			setState(293);
			((WhileBlockContext)_localctx).RPF = match(RPF);

			        _localctx.sb.append((((WhileBlockContext)_localctx).LPF!=null?((WhileBlockContext)_localctx).LPF.getText():null)).append("\n").append(((WhileBlockContext)_localctx).b.sb.toString()).append((((WhileBlockContext)_localctx).RPF!=null?((WhileBlockContext)_localctx).RPF.getText():null)).append("\n");
			     
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u012b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\5\3A\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4U\n\4\f\4\16\4X\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6w\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00ab\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\6\r\u00b4\n\r\r\r\16\r\u00b5\3\16\3\16\3\16\5\16\u00bb\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\6\16\u00c8\n\16"+
		"\r\16\16\16\u00c9\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00d8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00e3\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ec\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f7\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0101\n\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0107\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u011d\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\22\27\2\u012f\2\60\3\2\2"+
		"\2\4:\3\2\2\2\6V\3\2\2\2\bh\3\2\2\2\nm\3\2\2\2\f~\3\2\2\2\16\u0080\3\2"+
		"\2\2\20\u008f\3\2\2\2\22\u0091\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2"+
		"\2\30\u00aa\3\2\2\2\32\u00ba\3\2\2\2\34\u00cb\3\2\2\2\36\u00d7\3\2\2\2"+
		" \u00e2\3\2\2\2\"\u00eb\3\2\2\2$\u00f6\3\2\2\2&\u0100\3\2\2\2(\u0106\3"+
		"\2\2\2*\u0108\3\2\2\2,\u010b\3\2\2\2.\u011e\3\2\2\2\60\61\5\4\3\2\61\62"+
		"\b\2\1\2\62\63\7\2\2\3\63\3\3\2\2\2\64\65\7#\2\2\65\66\b\3\1\2\66\67\7"+
		"$\2\2\679\b\3\1\28\64\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2"+
		"<:\3\2\2\2=>\5\26\f\2>?\b\3\1\2?A\3\2\2\2@=\3\2\2\2@A\3\2\2\2AB\3\2\2"+
		"\2BC\7%\2\2CD\b\3\1\2DE\7&\2\2EF\b\3\1\2FG\5\6\4\2GH\b\3\1\2HI\7\'\2\2"+
		"IJ\b\3\1\2J\5\3\2\2\2KL\5\b\5\2LM\b\4\1\2MU\3\2\2\2NO\5,\27\2OP\b\4\1"+
		"\2PU\3\2\2\2QR\5.\30\2RS\b\4\1\2SU\3\2\2\2TK\3\2\2\2TN\3\2\2\2TQ\3\2\2"+
		"\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XV\3\2\2\2YZ\5\n\6\2Z[\b\5"+
		"\1\2[i\3\2\2\2\\]\5\16\b\2]^\b\5\1\2^i\3\2\2\2_`\5\30\r\2`a\b\5\1\2ai"+
		"\3\2\2\2bc\5\32\16\2cd\b\5\1\2di\3\2\2\2ef\5\34\17\2fg\b\5\1\2gi\3\2\2"+
		"\2hY\3\2\2\2h\\\3\2\2\2h_\3\2\2\2hb\3\2\2\2he\3\2\2\2ij\3\2\2\2jk\7\13"+
		"\2\2kl\b\5\1\2l\t\3\2\2\2mn\5\24\13\2no\b\6\1\2op\7(\2\2pv\b\6\1\2qr\7"+
		"\21\2\2rs\b\6\1\2st\5\f\7\2tu\b\6\1\2uw\3\2\2\2vq\3\2\2\2vw\3\2\2\2w\13"+
		"\3\2\2\2xy\5\20\t\2yz\b\7\1\2z\177\3\2\2\2{|\5\36\20\2|}\b\7\1\2}\177"+
		"\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\r\3\2\2\2\u0080\u0081\7(\2\2\u0081\u0082"+
		"\b\b\1\2\u0082\u0083\7\21\2\2\u0083\u0084\b\b\1\2\u0084\u0085\5\f\7\2"+
		"\u0085\u0086\b\b\1\2\u0086\17\3\2\2\2\u0087\u0088\7 \2\2\u0088\u0090\b"+
		"\t\1\2\u0089\u008a\5(\25\2\u008a\u008b\b\t\1\2\u008b\u0090\3\2\2\2\u008c"+
		"\u008d\5\22\n\2\u008d\u008e\b\t\1\2\u008e\u0090\3\2\2\2\u008f\u0087\3"+
		"\2\2\2\u008f\u0089\3\2\2\2\u008f\u008c\3\2\2\2\u0090\21\3\2\2\2\u0091"+
		"\u0092\7(\2\2\u0092\u0093\b\n\1\2\u0093\23\3\2\2\2\u0094\u0095\7\f\2\2"+
		"\u0095\u009d\b\13\1\2\u0096\u0097\7\r\2\2\u0097\u009d\b\13\1\2\u0098\u0099"+
		"\7\16\2\2\u0099\u009d\b\13\1\2\u009a\u009b\7\17\2\2\u009b\u009d\b\13\1"+
		"\2\u009c\u0094\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\b\f\1\2\u00a0"+
		"\u00a1\7\t\2\2\u00a1\u00a2\b\f\1\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\b\f"+
		"\1\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\b\f\1\2\u00a6\27\3\2\2\2\u00a7\u00a8"+
		"\7\n\2\2\u00a8\u00a9\7\32\2\2\u00a9\u00ab\b\r\1\2\u00aa\u00a7\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00b3"+
		"\b\r\1\2\u00ae\u00af\7\34\2\2\u00af\u00b0\b\r\1\2\u00b0\u00b1\5\22\n\2"+
		"\u00b1\u00b2\b\r\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\31\3\2\2\2\u00b7"+
		"\u00b8\7\n\2\2\u00b8\u00b9\7\32\2\2\u00b9\u00bb\b\16\1\2\u00ba\u00b7\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\31\2\2\u00bd"+
		"\u00c7\b\16\1\2\u00be\u00bf\7\33\2\2\u00bf\u00c5\b\16\1\2\u00c0\u00c1"+
		"\5\20\t\2\u00c1\u00c2\b\16\1\2\u00c2\u00c6\3\2\2\2\u00c3\u00c4\7\35\2"+
		"\2\u00c4\u00c6\b\16\1\2\u00c5\u00c0\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00be\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00cc\7\20\2\2\u00cc\u00cd"+
		"\b\17\1\2\u00cd\u00ce\5\20\t\2\u00ce\u00cf\b\17\1\2\u00cf\35\3\2\2\2\u00d0"+
		"\u00d1\5\"\22\2\u00d1\u00d2\b\20\1\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\5"+
		"\"\22\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\b\20\1\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d0\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\37\3\2\2\2\u00d9\u00da\7!\2\2"+
		"\u00da\u00db\5\"\22\2\u00db\u00dc\b\21\1\2\u00dc\u00e3\3\2\2\2\u00dd\u00de"+
		"\7!\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\5 \21\2\u00e0\u00e1\b\21\1\2"+
		"\u00e1\u00e3\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3!\3"+
		"\2\2\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\b\22\1\2\u00e6\u00ec\3\2\2\2\u00e7"+
		"\u00e8\5&\24\2\u00e8\u00e9\5$\23\2\u00e9\u00ea\b\22\1\2\u00ea\u00ec\3"+
		"\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00ee"+
		"\7\"\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\b\23\1\2\u00f0\u00f7\3\2\2\2"+
		"\u00f1\u00f2\7\"\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\5$\23\2\u00f4\u00f5"+
		"\b\23\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00f1\3\2\2\2"+
		"\u00f7%\3\2\2\2\u00f8\u00f9\7\3\2\2\u00f9\u00fa\5\36\20\2\u00fa\u00fb"+
		"\7\4\2\2\u00fb\u00fc\b\24\1\2\u00fc\u0101\3\2\2\2\u00fd\u00fe\5\20\t\2"+
		"\u00fe\u00ff\b\24\1\2\u00ff\u0101\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00fd"+
		"\3\2\2\2\u0101\'\3\2\2\2\u0102\u0103\7\36\2\2\u0103\u0107\b\25\1\2\u0104"+
		"\u0105\7\37\2\2\u0105\u0107\b\25\1\2\u0106\u0102\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0107)\3\2\2\2\u0108\u0109\t\2\2\2\u0109\u010a\b\26\1\2\u010a+"+
		"\3\2\2\2\u010b\u010c\7\5\2\2\u010c\u010d\7\3\2\2\u010d\u010e\5\36\20\2"+
		"\u010e\u010f\5*\26\2\u010f\u0110\5\36\20\2\u0110\u0111\7\4\2\2\u0111\u0112"+
		"\b\27\1\2\u0112\u0113\7&\2\2\u0113\u0114\5\6\4\2\u0114\u0115\7\'\2\2\u0115"+
		"\u011c\b\27\1\2\u0116\u0117\7\6\2\2\u0117\u0118\7&\2\2\u0118\u0119\5\6"+
		"\4\2\u0119\u011a\7\'\2\2\u011a\u011b\b\27\1\2\u011b\u011d\3\2\2\2\u011c"+
		"\u0116\3\2\2\2\u011c\u011d\3\2\2\2\u011d-\3\2\2\2\u011e\u011f\7\7\2\2"+
		"\u011f\u0120\7\3\2\2\u0120\u0121\5\36\20\2\u0121\u0122\5*\26\2\u0122\u0123"+
		"\5\36\20\2\u0123\u0124\7\4\2\2\u0124\u0125\b\30\1\2\u0125\u0126\7&\2\2"+
		"\u0126\u0127\5\6\4\2\u0127\u0128\7\'\2\2\u0128\u0129\b\30\1\2\u0129/\3"+
		"\2\2\2\27:@TVhv~\u008f\u009c\u00aa\u00b5\u00ba\u00c5\u00c9\u00d7\u00e2"+
		"\u00eb\u00f6\u0100\u0106\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}