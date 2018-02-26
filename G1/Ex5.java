package G1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * G1 - Ex5
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

// TODO consider refactoring the code...

public class Ex5 {

	// Static Fields
	private static Scanner sc;
	private static Map<String, Double> variables;
	private static List<String> operations;

	// Static CTOR
	static {
		operations = new LinkedList<>();
		operations.add("+");
		operations.add("-");
		operations.add("*");
		operations.add("/");
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		variables  = new HashMap<>();

		while (sc.hasNextLine()) {
			System.out.println("Resultado : " + processLine(sc.nextLine()));
		} 

		// Tests
		//System.out.println("Resultado : " + processLine("n = 10"));
		//System.out.println("Resultado : " + processLine("4 * n"));
		//System.out.println("Resultado : " + processLine("n = n + 1"));
		//System.out.println("Resultado : " + processLine("n + 5"));

		System.exit(0);
	}

	public static double processLine (String line) {
		Stack<Double> operands 		  = new Stack<>();

		// Get elements from line (considering elements are split by white space)
		String[] elems = line.split("\\s+");

		for (int i = 0; i < elems.length; i++) {
			String elem = elems[i];
			//System.out.println("-----------------\nProcessing " + elem);
			// Numbers --> to stack
			if (elem.matches("\\d+")) {
				//System.out.println("Pushing number " + elem);
				operands.push(Double.parseDouble(elem));
			}

			// Operands --> calculate
			else if (operations.contains(elem)) {
				if (operands.size() < 1)  {
					System.err.println("ERROR: Two operands missing!");
					System.exit(1);
				}

				double operand2 = processLine(elems[i + 1]);
				double operand1 = operands.pop();

				try {
					//System.out.println("Pushing result of " + operand1 + elem + operand2);
					operands.push(calculator(operand2, operand1, elem));
					//System.out.println("Variables: " + variables);
					//System.out.println("Stack: " + operands);
					return operands.peek();
				} catch (IllegalArgumentException e) {
					System.err.println("ERROR!");
					System.exit(1);
				}
			}

			// Neither an operand nor a number --> possibily a variable
			else {
				// Assignments (= after)
				if (i < elems.length - 1 && elems[i+1].contains("=")) { 	
					//System.out.print("Assigning variable " + elem  + "... ") ;
					variables.put(elem, processLine(line.substring(i + 1)));
					//System.out.println("\nDONE Assigning variable " + elem  + " with " + variables.get(elem));
					i = elems.length; // stops the processing the current line
					//System.out.println("Variables: " + variables);
					//System.out.println("Stack: " + operands);
					return variables.get(elem);
				}

				// Not an assignment --> read variable value
				else if (variables.containsKey(elem)){
					//System.out.println("Reading variable " + elem );
					operands.push(variables.get(elem));
				}	

				// Ignoring =, all other symbols will be errors
				else if (!elem.equals("=")) {
					System.err.println(elem + " is invalid Expression");
				}
			}
			//System.out.println("Variables: " + variables);
			//System.out.println("Stack: " + operands);
		}
		return operands.peek();
	}

	/**
	 * @param  operand1
	 * @param  operand2
	 * @param  op operation to execute {@code (+, -, * or /)}
	 * @return result of the operation between the two given operands
	 * @throw  IllegalArgumentException if the operand2 is 0 (for division) or if the op argument is invalid
	 */
	public static double calculator (double operand1, double operand2, String op) {
		double result = 0;

		switch(op) {
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "*":
				result = operand1 * operand2;
				break;
			case "/":
				if (operand2 == 0) {
					throw new IllegalArgumentException("ERROR: Divide by zero!");
				}
				result = operand1 / operand2; 
				break;
			default:
				throw new IllegalArgumentException("ERROR: invalid operator!");
		}

		return result;
	}

}
