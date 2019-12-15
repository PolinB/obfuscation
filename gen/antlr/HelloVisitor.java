// Generated from /home/polinb/IdeaProjects/Test/src/main/java/antlr/Hello.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(HelloParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(HelloParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(HelloParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#integerOrVariableInRightPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOrVariableInRightPart(HelloParser.IntegerOrVariableInRightPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HelloParser.TypeContext ctx);
}