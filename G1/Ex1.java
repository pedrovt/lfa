package G1;

/**
 * G1 - Ex1
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

import java.util.Scanner;

public class Ex1 {

	static Scanner sc = new Scanner (System.in); 
	public static void main(String[] args) {

		// Read numbers
		double num1 = sc.nextDouble();

		String op = sc.next();

		double num2 = sc.nextDouble();

		// Compute reslt 
		double result = 0;
		switch (op) {
			case "+":
				result = num1+num2;
				break;
			case "-":
				result = num1-num2;
				break;
			case "*":
				result = num1*num2;
				break;
			case "/":
				result = num1/num2; 
				break;
			case "batatas":		// easter egg 
				System.out.println("Descobriu o código secreto! Ganhou 1000€");
				System.exit(2);
			default:
				System.err.println("Operador inválido!");
				System.exit(1);

		}

		System.out.println("Result of " + num1 + " " + op + " " + num2 + " = " + result);
	}
}
