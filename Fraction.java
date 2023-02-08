// Fraction class example // 

public class Fraction {
  //instance variables 
  	private int numerator;
  	private int denominator;
	
	
	public void setNumerator(int num) { // note, there is no static //   // this method sets a value passed into it to the numerator variable 
	  																   // that has a scope within the whole class //
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
	
}

