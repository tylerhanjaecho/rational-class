import java.util.Scanner;
class Rational {
	private int numerator;
	private int denominator;
	private int gcf;

	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
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
}		