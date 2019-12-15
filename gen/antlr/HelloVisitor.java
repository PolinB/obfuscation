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
	 * Visit a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(HelloParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(HelloParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#rightPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightPart(HelloParser.RightPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variableChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableChange(HelloParser.VariableChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#integerOrVariableInRightPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOrVariableInRightPart(HelloParser.IntegerOrVariableInRightPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#variableInRightPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInRightPart(HelloParser.VariableInRightPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HelloParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#usingLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingLine(HelloParser.UsingLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#cinLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCinLine(HelloParser.CinLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#coutLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoutLine(HelloParser.CoutLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#returnLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnLine(HelloParser.ReturnLineContext ctx);
}