// Generated from TableProcessorParser.g4 by ANTLR 4.7.1

// --------------------------------
// Bloco 3, Ex. 1
// TableProcessorParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TableProcessorParser}.
 */
public interface TableProcessorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TableProcessorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TableProcessorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(TableProcessorParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(TableProcessorParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSave(TableProcessorParser.SaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSave(TableProcessorParser.SaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TableProcessorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TableProcessorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(TableProcessorParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(TableProcessorParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TableProcessorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TableProcessorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(TableProcessorParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(TableProcessorParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(TableProcessorParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(TableProcessorParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableProcessorParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(TableProcessorParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableProcessorParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(TableProcessorParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperDivideMultiply}
	 * labeled alternative in {@link TableProcessorParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOperDivideMultiply(TableProcessorParser.OperDivideMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperDivideMultiply}
	 * labeled alternative in {@link TableProcessorParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOperDivideMultiply(TableProcessorParser.OperDivideMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperAddSubtract}
	 * labeled alternative in {@link TableProcessorParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOperAddSubtract(TableProcessorParser.OperAddSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperAddSubtract}
	 * labeled alternative in {@link TableProcessorParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOperAddSubtract(TableProcessorParser.OperAddSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableRead}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTableRead(TableProcessorParser.TableReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableRead}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTableRead(TableProcessorParser.TableReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableJoin}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTableJoin(TableProcessorParser.TableJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableJoin}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTableJoin(TableProcessorParser.TableJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableSelect}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTableSelect(TableProcessorParser.TableSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableSelect}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTableSelect(TableProcessorParser.TableSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableOper}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTableOper(TableProcessorParser.TableOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableOper}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTableOper(TableProcessorParser.TableOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableVariable}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTableVariable(TableProcessorParser.TableVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableVariable}
	 * labeled alternative in {@link TableProcessorParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTableVariable(TableProcessorParser.TableVariableContext ctx);
}