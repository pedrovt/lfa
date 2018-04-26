package listenersAndPTP;	

import static java.lang.System.err;
import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import grammar.FracCalculatorParser;
import grammar.FracCalculatorParserBaseListener;
import utils.Fraction;

/**
 * 
 * <b>FracCalculatorInterpreter</b><p>
 * Implementation with Listener and <i>ParseTreeProperty</i><p>
 * Formal and Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

public class FracCalculatorInterpreter extends FracCalculatorParserBaseListener {

	// Instance Fields
	protected ParseTreeProperty<Fraction> mapFractions = new ParseTreeProperty<>();
	protected Map<String, Fraction> symbolTable  = new HashMap<>();

	// Overriden Methods
	@Override 
	public void exitAssign(FracCalculatorParser.AssignContext ctx) {
		Fraction f = mapFractions.get(ctx.expr());
		symbolTable.put(ctx.ID().getText(), f);
		mapFractions.put(ctx, f);
		//System.out.println("Exit Assign | Value " + f + " put in " + ctx);
	}

	@Override 
	public void exitPrint(FracCalculatorParser.PrintContext ctx) {
		out.println(mapFractions.get(ctx.expr()));
	}

	@Override 
	public void enterExprFrac(FracCalculatorParser.ExprFracContext ctx) { 
		mapFractions.put(ctx, new Fraction(ctx.FRAC().getText()));
		//System.out.println("Enter Expr Frac | Value " + mapFractions.get(ctx) + " put in " + ctx);
	}

	@Override 
	public void exitExprParentesis(FracCalculatorParser.ExprParentesisContext ctx) { 
		mapFractions.put(ctx, mapFractions.get(ctx.expr())); 
		//System.out.println("Enter Expr Parentesis | Value " + mapFractions.get(ctx.expr()) + " put in " + ctx);
	}

	@Override 
	public void enterExprVariable(FracCalculatorParser.ExprVariableContext ctx) { 

		String key = ctx.ID().getText();
		if (!symbolTable.containsKey(key)) {
			err.println("ID " + key + " not valid!");			
			exit(1);												
		}														
		mapFractions.put(ctx, symbolTable.get(key));
		//System.out.println("Enter Expr Variable | Value " + symbolTable.get(key) + " put in " + ctx);
	}

	// Overriden Methods - Operations
	@Override 
	public void exitExprDivisionMultiply(FracCalculatorParser.ExprDivisionMultiplyContext ctx) { 
		Fraction f; 
		if (ctx.op.getText().equals("*")) {
			f = Fraction.multiply
					(mapFractions.get(ctx.expr(0)), mapFractions.get(ctx.expr(1)));
		}
		else {
			f = Fraction.divide
					(mapFractions.get(ctx.expr(0)), mapFractions.get(ctx.expr(1)));
		}
		mapFractions.put(ctx, f);
	}

	@Override 
	public void exitExprAddDifference(FracCalculatorParser.ExprAddDifferenceContext ctx) { 
		Fraction f;
		if (ctx.op.getText().equals("+")) {
			f = Fraction.add
					(mapFractions.get(ctx.expr(0)), mapFractions.get(ctx.expr(1)));
		}
		else {
			f = Fraction.subtract
					(mapFractions.get(ctx.expr(0)), mapFractions.get(ctx.expr(1)));
		}
		mapFractions.put(ctx, f);
	}

	@Override 
	public void exitExprPower(FracCalculatorParser.ExprPowerContext ctx) { 
		mapFractions.put(ctx, Fraction.power(mapFractions.get(ctx.expr()), Integer.parseInt(ctx.POWER().getText().substring(1))));
	}

	@Override 
	public void exitExprReduce(FracCalculatorParser.ExprReduceContext ctx) { 
		mapFractions.put(ctx, Fraction.reduce(mapFractions.get(ctx.expr()))); 
	}
}