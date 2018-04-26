package utils;
/**
 * TestFractions<p>
 * Formal and Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */
public class TestFractions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 5);
		Fraction f2 = new Fraction(1, 6);
		Fraction f3 = new Fraction(1, 9);
		Fraction f4 = new Fraction(2, 10);
		Fraction f5 = new Fraction("24/10");
		Fraction f6 = new Fraction("5");

		System.out.println(f1);
		System.out.println(f2 + " + " + f3 + " = " + Fraction.add	  (f2, f3));
		System.out.println(f2 + " - " + f3 + " = " + Fraction.subtract(f2, f3));
		System.out.println(f2 + " * " + f3 + " = " + Fraction.multiply(f2, f3));
		System.out.println(f2 + " / " + f3 + " = " + Fraction.divide  (f2, f3));
		System.out.println(f3 + " ^ " + 3  + " = " + Fraction.power	  (f3, 3));
		System.out.println(f4 + " = " + Fraction.reduce  (f4));
		System.out.println(f5);
		System.out.println(f6);

		System.out.println("-----\n");
		// Further tests
		f1 = new Fraction(1, 4);
		f2 = new Fraction(4, 2);
		f3 = new Fraction(-2, 3);
		f4 = new Fraction(4, 1);
		f5 = new Fraction(2, 1);
		System.out.println(Fraction.subtract(f1, f1)); // should be 0
		System.out.println(Fraction.add(f3, f4)); 	   // should be 10/3
		System.out.println(Fraction.multiply(f2, Fraction.add(f3, f4))); 						   // should be 40/6 
		System.out.println(Fraction.subtract(Fraction.multiply(f2, Fraction.add(f3, f4)), f5)); 						   // should be 28/6

		f6 = new Fraction(1, 2);
		System.out.println(Fraction.power(f6,  3));
		System.out.println(Fraction.power(f6, -3));


	} 

}
