package week01;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		double a = sc.nextDouble();
		System.out.println("Enter the second number");
		double b = sc.nextDouble();

		System.out.println("Sum of the numbers : " + (a + b));
		System.out.println("Difference of the numbers :" + (a - b));
		System.out.println("Product of the numbers : " + (a * b));
		System.out.println("Quotient of the numbers : " + (a / b));
		System.out.println("Reminder of the numbers is :" + (a % b));

		sc.close();
	}
}
