package interpreter;

import static java.lang.System.err;
import static java.lang.System.exit;
import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import grammar.TableProcessorParser.AssignContext;
import grammar.TableProcessorParser.JoinContext;
import grammar.TableProcessorParser.OperAddSubtractContext;
import grammar.TableProcessorParser.OperDivideMultiplyContext;
import grammar.TableProcessorParser.PrintContext;
import grammar.TableProcessorParser.ReadContext;
import grammar.TableProcessorParser.RestoreContext;
import grammar.TableProcessorParser.SaveContext;
import grammar.TableProcessorParser.SelectContext;
import grammar.TableProcessorParser.TableJoinContext;
import grammar.TableProcessorParser.TableOperContext;
import grammar.TableProcessorParser.TableReadContext;
import grammar.TableProcessorParser.TableSelectContext;
import grammar.TableProcessorParser.TableVariableContext;
import grammar.TableProcessorParser.WriteContext;
import grammar.TableProcessorParserBaseVisitor;
import utils.csv.CSVTable;

/**
 * <b>TableProcessorInterpreter</b><p>
 * This class is Serializable.<p>
 * @see Serializable
 * Formal and Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */
public class TableProcessorInterpreter extends TableProcessorParserBaseVisitor<CSVTable> implements Serializable {

	private static final long serialVersionUID = 5885448611674228910L;

	// Instance Fields
	private Map<String, CSVTable> symbolTable = new HashMap<>();

	// Overriden Methods
	@Override
	public CSVTable visitSave(SaveContext ctx) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ctx.FILE_NAME().getText()));
			out.writeObject(symbolTable);
			out.close();
		} catch(FileNotFoundException e) {
			err.println("ERROR: File can't be saved at the given path " + ctx.FILE_NAME().getText() + "!");
			//exit(1);
		} catch (IOException e) {
			err.println("ERROR: I/O Error!");
			//exit(2);
		}
		return null;
	}

	@Override
	public CSVTable visitRestore(RestoreContext ctx) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ctx.FILE_NAME().getText()));
			Map<String, CSVTable> object = (Map<String, CSVTable>) in.readObject();
			this.symbolTable = object;
			// TODO 
			in.close();
		} catch(FileNotFoundException e) {
			err.println("ERROR: File can't be saved at the given path " + ctx.FILE_NAME().getText() + "!");
			//exit(1);
		} catch (IOException e) {
			err.println("ERROR: I/O Error!");
			//exit(2);
		} catch (ClassNotFoundException e) {
			err.println("ERROR: Internal Error! (Class Table Processor Interpreter Not Found)");
			//exit(6);
		}
		return null;
	}

	@Override
	public CSVTable visitAssign(AssignContext ctx) {
		CSVTable table = visit(ctx.table());
		symbolTable.put(ctx.ID().getText(), table);
		return table;
	}

	@Override
	public CSVTable visitRead(ReadContext ctx) {
		return new CSVTable(ctx.C_FILE_NAME().getText());
	}

	@Override
	public CSVTable visitPrint(PrintContext ctx) {
		CSVTable table = visit(ctx.table());
		System.out.println(table.getTable());
		return table;
	}

	@Override
	public CSVTable visitWrite(WriteContext ctx) {
		CSVTable table = visit(ctx.table());
		try {
			FileWriter out = new FileWriter(new File(ctx.FILE_NAME().getText()));
			out.write(table.getTable().toString());
			out.close();
		} catch (IOException e) {
			err.println("ERROR: I/O Error! File " + ctx.FILE_NAME().getText() + " was not created.");
			//exit(3);
		}
		return table;
	}

	@Override
	public CSVTable visitJoin(JoinContext ctx) {
		// TODO Auto-generated method stub
		out.println("NullPointerException is going to be thrown. It comes from return null @visitJoin");
		return null;

	}

	@Override
	public CSVTable visitSelect(SelectContext ctx) {
		// TODO Auto-generated method stub
		out.println("NullPointerException is going to be thrown. It comes from return null @visitSelect");
		return null;
	}

	@Override
	public CSVTable visitOperDivideMultiply(OperDivideMultiplyContext ctx) {
		// TODO Auto-generated method stub
		out.println("NullPointerException is going to be thrown. It comes from return null @visitOperDivideMultiply");
		return null;
	}

	@Override
	public CSVTable visitOperAddSubtract(OperAddSubtractContext ctx) {
		// TODO Auto-generated method stub
		out.println("NullPointerException is going to be thrown. It comes from return null @visitOperAddSubtract");
		return null;
	}

	@Override
	public CSVTable visitTableRead(TableReadContext ctx) {
		return visit(ctx.read());
	}

	@Override
	public CSVTable visitTableJoin(TableJoinContext ctx) {
		return visit(ctx.join());
	}

	@Override
	public CSVTable visitTableSelect(TableSelectContext ctx) {
		return visit(ctx.select());
	}

	@Override
	public CSVTable visitTableOper(TableOperContext ctx) {
		return visit(ctx.oper());
	}

	@Override
	public CSVTable visitTableVariable(TableVariableContext ctx) {
		String key = ctx.ID().getText();
		if (!symbolTable.containsKey(key)) {
			err.println("ID " + key + " not valid!");			
			exit(4);												
		}												
		return symbolTable.get(key);
	}

}
