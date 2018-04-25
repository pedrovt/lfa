// Generated from Calculator_v3.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calculator_v3Parser}.
 */
public interface Calculator_v3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calculator_v3Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Calculator_v3Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator_v3Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Calculator_v3Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link Calculator_v3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(Calculator_v3Parser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link Calculator_v3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(Calculator_v3Parser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStat}
	 * labeled alternative in {@link Calculator_v3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStat(Calculator_v3Parser.AssignmentStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStat}
	 * labeled alternative in {@link Calculator_v3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStat(Calculator_v3Parser.AssignmentStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculator_v3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Calculator_v3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator_v3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Calculator_v3Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVARIABLE(Calculator_v3Parser.VARIABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVARIABLE(Calculator_v3Parser.VARIABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNUM(Calculator_v3Parser.NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNUM(Calculator_v3Parser.NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENTESIS_EXPR}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPARENTESIS_EXPR(Calculator_v3Parser.PARENTESIS_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENTESIS_EXPR}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPARENTESIS_EXPR(Calculator_v3Parser.PARENTESIS_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULT_DIV}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULT_DIV(Calculator_v3Parser.MULT_DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULT_DIV}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULT_DIV(Calculator_v3Parser.MULT_DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADD_SUB(Calculator_v3Parser.ADD_SUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link Calculator_v3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADD_SUB(Calculator_v3Parser.ADD_SUBContext ctx);
}