// Fraction class example // 

public class Fraction {
  //instance variables 
  	private int numerator;
  	private int denominator;
	
	// CONSTRUCTORS // 
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
		reduce();
	}
	
	// exception for no parameters during object definition //
	public Fraction() {
		numerator = 0;
		denominator = 1; // when there are two methods with the same name it is known as OVERLOADING, will only cause an error if they have same 				    parameters // 
	}
	public Fraction(int numerator) { // Shadowing is when two variables have the same name. The compiler is confusing the class instance variable to 					   this constructor variable //
		this.numerator = n; // to get around shadowing the this. method refuse explicitly to the class instance variable so there is no confusion.
		denominator = 1;
	}
	//SETTERS//
	public void setNumerator(int num) { // note, there is no static //   // this method sets a value passed into it to the numerator variable // that 										has a scope within the whole class //
		numerator = num; 
		Reduce(numerator);
	}
	public void setDenominator(int den) { // both setDenom and setNume are setters becasue they get data from outside the class and use it within
		if (den != 0) 
			denominator = den;
			Reduce(denominator);
		else
			denominator = 1;		
	}
	
	//GETTERS//
	public int getNumerator() { // getters that return values from inside the class to outside
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	
	public double getDecimal() { // returns a decimal value of the numerator divided by the denominator //
		return (double) numerator / denominator
	}
	
	// reduces to lowest terms. 
	private void Reduce() {// this method is only used to brake tasks up INSIDE the class. it is a utility method. That is why private is used. //
		int min = math.min(Math.abs(numerator), Math.abs(denominator));
		int gdc = 1;
		boolean done = false;
		while (min >= 1 && !done) {
			if (numerator % min == 0 && denominator % min == 0) {
				done = true;
				gcd = min;
			}
			min--;
			
		}
		numerator /= gcd;
		denominator /= gcd;
	}
	
	@Override
	public String toString() {
		String s = String.format("%d\n------\n%d", getNumerator(), getDenominator());
		return s;
	}
	public boolean equals(Object other){
		Fraction fOther = (Fraction)other;
		if (this.numerator() ==  fOther.numerator() && this.denominator() == fOther.denominator())
			return true;
		return false;
	}
}






///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// in class methods for other class
public class FractionTester {
	public static void main(String [] args) {
	
		public static Fraction FractionTester(Fraction f1, Fraction f2) {
		int num1 = f1.getNumerator();
		int denom1 = f1.getDenominator();
	
		int num2 = f2.getNumerator();
		int denom2 = f2.getDenominator();
	
		int SUMnum = (num1 * num2) + (num2 * num1);
		int SUMdenom = (denom1 * denom2);
		return SUMnum/ SUMdenom;
			
		}

		public static void doubler(Fraction f) { 
		int doubleNum = f.getNumerator();
		f.setNumerator(doubleNum * 2);
		}
	}
}


