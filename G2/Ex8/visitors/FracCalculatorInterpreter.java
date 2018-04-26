package visitors;

import static java.lang.System.err;
import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

import grammar.FracCalculatorParser;
import grammar.FracCalculatorParserBaseVisitor;
import utils.Fraction;

/**
 * 
 * <b>FracCalculatorInterpreter</b><p>
 * Implementation with Visitors<p>
 * Formal and Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

public class FracCalculatorInterpreter extends FracCalculatorParserBaseVisitor<Fraction> {

	// Instance Fields
	private Map<String, Fraction> symbolTable = new HashMap<>();

	// Overriden Methods
	@Override 
	public Fraction visitAssign(FracCalculatorParser.AssignContext ctx) {
		Fraction f = visit(ctx.expr());
		symbolTable.put(ctx.ID().getText(), f);
		return f;
	}

	@Override 
	public Fraction visitPrint(FracCalculatorParser.PrintContext ctx) { 
		Fraction f = visit(ctx.expr());
		out.println(f);
		return f; 		// return null would be acceptable as well
	}

	@Override 
	public Fraction visitExprFrac(FracCalculatorParser.ExprFracContext ctx) { 
		return new Fraction(ctx.FRAC().getText());
	}

	@Override 
	public Fraction visitExprParentesis(FracCalculatorParser.ExprParentesisContext ctx) { 
		return visit(ctx.expr()); 
	}

	@Override 
	public Fraction visitExprVariable(FracCalculatorParser.ExprVariableContext ctx) { 
		String key = ctx.ID().getText();
		if (!symbolTable.containsKey(key)) {
			err.println("ID " + key + " not valid!");			
			exit(1);												
		}														
		return symbolTable.get(key);
	}

	// Overriden Methods - Operations
	@Override 
	public Fraction visitExprDivisionMultiply(FracCalculatorParser.ExprDivisionMultiplyContext ctx) { 
		if (ctx.op.getText().equals("*")) return Fraction.multiply(visit(ctx.expr(0)), visit(ctx.expr(1)));
		return Fraction.divide(visit(ctx.expr(0)), visit(ctx.expr(1)));
	}

	@Override 
	public Fraction visitExprAddDifference(FracCalculatorParser.ExprAddDifferenceContext ctx) {
		if (ctx.op.getText().equals("+")) return Fraction.add(visit(ctx.expr(0)), visit(ctx.expr(1)));
		return Fraction.subtract(visit(ctx.expr(0)), visit(ctx.expr(1)));
	}

	@Override 
	public Fraction visitExprPower(FracCalculatorParser.ExprPowerContext ctx) {
		return Fraction.power(visit(ctx.expr()), Integer.parseInt(ctx.POWER().getText().substring(1)));
	}

	@Override 
	public Fraction visitExprReduce(FracCalculatorParser.ExprReduceContext ctx) { 
		return Fraction.reduce(visit(ctx.expr())); 
	}
}