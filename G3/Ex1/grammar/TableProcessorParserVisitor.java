// Generated from TableProcessorParser.g4 by ANTLR 4.7.1

// --------------------------------
// Bloco 3, Ex. 1
// TableProcessorParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TableProcessorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TableProcessorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TableProcessorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(TableProcessorParser.InstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#save}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSave(TableProcessorParser.SaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TableProcessorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(TableProcessorParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TableProcessorParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(TableProcessorParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(TableProcessorParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableProcessorParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(TableProcessorParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperDivideMultiply}
	 * labeled alternative in {@link TableProcessorParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperDivideMultiply(TableProcessorParser.OperDivideMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperAddSubtract}
	 * labeled alternative in {@link TableProcessorParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperAddSubtract(TableProcessorParser.OperAddSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableRead}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRead(TableProcessorParser.TableReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableJoin}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableJoin(TableProcessorParser.TableJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableSelect}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSelect(TableProcessorParser.TableSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableOper}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOper(TableProcessorParser.TableOperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableVariable}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableVariable(TableProcessorParser.TableVariableContext ctx);
}