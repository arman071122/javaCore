package week01;

import java.util.Scanner;

public class Fun_calc {
	Scanner sc = new Scanner(System.in);
	double a, b;

	void input() {
		System.out.println("Enter the first number");
		a = sc.nextDouble();
		System.out.println("Enter the second numeber");
		b = sc.nextDouble();
	}

	void addNumbers() {
		System.out.println("Sum = " + (a + b));
	}

	void subNumbers() {
		System.out.println("Difference = " + (a - b));
	}

	void mulNumbers() {
		System.out.println("Product = " + (a * b));
	}

	void divNumbers() {
		System.out.println("Quotient = " + (a / b));
	}

	void remNumbers() {
		System.out.println("Reminder = " + (a % b));
	}

	public static void main(String[] args) {
		Fun_calc calc = new Fun_calc();
		calc.input();
		calc.addNumbers();
		calc.subNumbers();
		calc.mulNumbers();
		calc.divNumbers();
		calc.remNumbers();
	}
}
