package utils;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * Fraction<p>
 * Formal and Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */
public class Fraction implements Serializable {

	private static final long serialVersionUID = 3425026364257824986L;

	// ---------------------------------------------------------
	// Instance Fields
	private final int num;
	private final int den;

	// ---------------------------------------------------------
	// CTOR
	/**
	 * 
	 * Constructor
	 * @param num numerator
	 * @param den denominator
	 */
	public Fraction(int num, int den) {
		assert den >= 0 : "Denominator can't be negative";
		this.num = num;
		this.den = den;
	}

	/**
	 * 
	 * Constructor
	 * @param str
	 */
	public Fraction(String str) {
		int p = str.indexOf('/');  
		if (p == -1) { 		// no denominator
			num = Integer.valueOf(str);
			den = 1;
		} else {   
			num = Integer.valueOf(str.substring(0,  p));
			den = Integer.valueOf(str.substring(p + 1));
		}
	}

	// ---------------------------------------------------------
	// Getters
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @return the den
	 */
	public int getDen() {
		return den;
	}


	// ---------------------------------------------------------
	// Static Methods --> Operations
	public static Fraction add(Fraction f1, Fraction f2) {
		int num = f1.num * f2.den + f1.den * f2.num;
		int den = f1.den * f2.den;
		return new Fraction(num, den);
	}

	public static Fraction subtract(Fraction f1, Fraction f2) {
		return Fraction.add(f1, new Fraction((-1) * f2.num, f2.den));
	}

	public static Fraction multiply(Fraction f1, Fraction f2) {
		int num = f1.num * f2.num;
		int den = f1.den * f2.den;
		return new Fraction(num, den);
	}

	public static Fraction divide(Fraction f1, Fraction f2) {
		return Fraction.multiply(f1, new Fraction(f2.den, f2.num));
	}

	public static Fraction power(Fraction f1, int exp) {
		if (exp < 0) {
			exp *= -1;
			return new Fraction((int) (Math.pow(f1.den, exp)), (int) (Math.pow(f1.num, exp)));
		}
		return new Fraction((int) (Math.pow(f1.num, exp)), (int) (Math.pow(f1.den, exp)));
	}

	public static Fraction reduce(Fraction f1) {
		int originalNum = f1.num;
		int originalDen = f1.den;
		int gcd = BigInteger.valueOf(originalNum).gcd(BigInteger.valueOf(originalDen)).intValue();
		return new Fraction(originalNum / gcd, originalDen / gcd);
	}

	// ---------------------------------------------------------
	// Other Methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + den;
		result = prime * result + num;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Fraction other = (Fraction) obj;
		if (den != other.den) {
			return false;
		}
		if (num != other.num) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(num);
		if (den != 1 && num != 0) {
			builder.append("/");
			builder.append(den);
		}
		return builder.toString();
	}

}
