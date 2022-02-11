import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first numerator ---->");
		int numerator1 = scanner.nextInt();
		System.out.println("Enter the first denominator ---->");
		int denominator1 =  scanner.nextInt();
		Rational rational1 = new Rational(numerator1, denominator1);

		System.out.println("Enter the second numerator ---->");
		int numerator2 = scanner.nextInt();
		System.out.println("Enter the second denominator ---->");
		int denominator2 =  scanner.nextInt();
		Rational rational2 = new Rational(numerator2, denominator2);

		System.out.println(rational1.getRational() + " + " + rational2.getRational() + " = " + rational1.getSum(rational1, rational2));
		System.out.println(rational1.getRational() + " - " + rational2.getRational() + " = " + rational1.getDiff(rational1, rational2));
		System.out.println(rational1.getRational() + " * " + rational2.getRational() + " = " + rational1.getProduct(rational1, rational2));
		System.out.println(rational1.getRational() + " / " + rational2.getRational() + " = " + rational1.getQuotient(rational1, rational2));
	}
}		