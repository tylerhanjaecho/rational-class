import java.util.Scanner;
class Rational {
	private int numerator;
	private int denominator;
	private int gcf;

	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public String getRational() {
		return numerator + "/" + denominator;
	}

	public double getDecimal() {
		return (double) numerator / (double) denominator;
	}

	public int getGCF() {
		for (int i = 1; i <= Math.min(numerator, denominator); i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcf = i;
			}
		}
		return gcf;
	}

	public String getSimplified() {
		return numerator / getGCF() + "/" + denominator / getGCF();
	}

	public String getSum(Rational rational1, Rational rational2) {
		int tempNumerator = rational1.getNumerator() * rational2.getDenominator() + rational2.getNumerator() * rational1.getDenominator();
		int tempDenominator = rational1.getDenominator() * rational2.getDenominator();
		Rational tempRational = new Rational(tempNumerator, tempDenominator);

		return tempRational.getSimplified(); 
	}

	public String getDiff(Rational rational1, Rational rational2) {
		int tempNumerator = rational1.getNumerator() * rational2.getDenominator() - rational2.getNumerator() * rational1.getDenominator();
		int tempDenominator = rational1.getDenominator() * rational2.getDenominator();
		Rational tempRational = new Rational(tempNumerator, tempDenominator);
		
		return tempRational.getSimplified(); 
	}

	public String getProduct(Rational rational1, Rational rational2) {
		int tempNumerator = rational1.getNumerator() * rational2.getNumerator();
		int tempDenominator = rational1.getDenominator() * rational2.getDenominator();
		Rational tempRational = new Rational(tempNumerator, tempDenominator);
		
		return tempRational.getSimplified(); 
	}

	public String getQuotient(Rational rational1, Rational rational2) {
		int tempNumerator = rational1.getNumerator() * rational2.getDenominator();
		int tempDenominator = rational1.getDenominator() * rational2.getNumerator();
		Rational tempRational = new Rational(tempNumerator, tempDenominator);
		
		return tempRational.getSimplified(); 
	}
}		