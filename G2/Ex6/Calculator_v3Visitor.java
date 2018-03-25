// Generated from Calculator_v3.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Calculator_v3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Calculator_v3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Calculator_v3Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Calculator_v3Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link Calculator_v3Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(Calculator_v3Parser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStat}
	 * labeled alternative in {@link Calculator_v3Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStat(Calculator_v3Parser.AssignmentStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calculator_v3Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Calculator_v3Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARIABLE(Calculator_v3Parser.VARIABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUM(Calculator_v3Parser.NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENTESIS_EXPR}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENTESIS_EXPR(Calculator_v3Parser.PARENTESIS_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULT_DIV}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULT_DIV(Calculator_v3Parser.MULT_DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD_SUB(Calculator_v3Parser.ADD_SUBContext ctx);
}