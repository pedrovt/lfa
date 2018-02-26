package G1;
import java.util.Scanner;
import java.util.Stack;

/**
 * G1 - Ex2
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

public class Ex2 {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Stack<Double> operands = new Stack<>();

		// Read numbers
		String nextElem = "";
		while (sc.hasNext()) {
			// Get number/operation
			nextElem = sc.next();

			if (nextElem.matches("\\d")) {
				operands.push(Double.parseDouble(nextElem));
			}
			else {
				if (operands.size() < 2)  {
					System.err.println("ERROR: Two operands missing!");
					System.exit(1);
				}

				double operand2 = operands.pop();
				double operand1 = operands.pop();

				double result   = 0;

				switch(nextElem) {
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
							System.err.println("ERROR: Divide by zero!");
							System.exit(2);
						}
						result = operand1 / operand2; 
						break;
					default:
						System.err.println("ERROR: invalid operator!");
						System.exit(3);
						break;
				}

				operands.push(result);

			}
			System.out.println("Stack: " + operands);
		}
		System.exit(1);
	}

}
