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
	 * Enter a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HelloParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HelloParser.TypeContext ctx);
}