import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numerator ---->");
		int numerator = scanner.nextInt();
		System.out.println("Enter the denominator ---->");
		int denominator =  scanner.nextInt();
		Rational rational = new Rational(numerator, denominator);
		System.out.println(rational.getRational() + " equals " + rational.getDecimal());
		System.out.println("and reduces to " + rational.getSimplified());
	}
}		