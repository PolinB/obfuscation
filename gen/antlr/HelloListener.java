// Generated from /home/polinb/IdeaProjects/Test/src/main/java/antlr/Hello.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HelloParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HelloParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HelloParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HelloParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HelloParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HelloParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(HelloParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(HelloParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#rightPart}.
	 * @param ctx the parse tree
	 */
	void enterRightPart(HelloParser.RightPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#rightPart}.
	 * @param ctx the parse tree
	 */
	void exitRightPart(HelloParser.RightPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableChange}.
	 * @param ctx the parse tree
	 */
	void enterVariableChange(HelloParser.VariableChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableChange}.
	 * @param ctx the parse tree
	 */
	void exitVariableChange(HelloParser.VariableChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#integerOrVariableInRightPart}.
	 * @param ctx the parse tree
	 */
	void enterIntegerOrVariableInRightPart(HelloParser.IntegerOrVariableInRightPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#integerOrVariableInRightPart}.
	 * @param ctx the parse tree
	 */
	void exitIntegerOrVariableInRightPart(HelloParser.IntegerOrVariableInRightPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableInRightPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableInRightPart(HelloParser.VariableInRightPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableInRightPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableInRightPart(HelloParser.VariableInRightPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HelloParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HelloParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#usingLine}.
	 * @param ctx the parse tree
	 */
	void enterUsingLine(HelloParser.UsingLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#usingLine}.
	 * @param ctx the parse tree
	 */
	void exitUsingLine(HelloParser.UsingLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cinLine}.
	 * @param ctx the parse tree
	 */
	void enterCinLine(HelloParser.CinLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cinLine}.
	 * @param ctx the parse tree
	 */
	void exitCinLine(HelloParser.CinLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#coutLine}.
	 * @param ctx the parse tree
	 */
	void enterCoutLine(HelloParser.CoutLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#coutLine}.
	 * @param ctx the parse tree
	 */
	void exitCoutLine(HelloParser.CoutLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#returnLine}.
	 * @param ctx the parse tree
	 */
	void enterReturnLine(HelloParser.ReturnLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#returnLine}.
	 * @param ctx the parse tree
	 */
	void exitReturnLine(HelloParser.ReturnLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expressionPart}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPart(HelloParser.ExpressionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expressionPart}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPart(HelloParser.ExpressionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(HelloParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(HelloParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#addExpressionPart}.
	 * @param ctx the parse tree
	 */
	void enterAddExpressionPart(HelloParser.AddExpressionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#addExpressionPart}.
	 * @param ctx the parse tree
	 */
	void exitAddExpressionPart(HelloParser.AddExpressionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(HelloParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(HelloParser.MulExpressionContext ctx);
}