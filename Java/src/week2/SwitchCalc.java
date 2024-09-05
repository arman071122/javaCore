package week2;

import java.util.Scanner;

public class SwitchCalc {
	int a, b;

	void input(Scanner sc) {
		System.out.println("Enter 2 numbers ");
		a = sc.nextInt();
		b = sc.nextInt();
	}

	void addNum() {
		System.out.println("Sum is " + (a + b));
	}

	void subNum() {
		System.out.println("Difference is " + (a - b));
	}

	void mulNum() {
		System.out.println("Product is " + (a * b));
	}

	void divNum() {
		System.out.println("Quotient is " + (a / b));
		System.out.println("Reminder is " + (a % b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Single scanner instance
		SwitchCalc calcu = new SwitchCalc();

		calcu.input(sc); // Pass scanner instance to input method

		System.out.println("Enter any option : \n 1.Additon \n 2.Subtraction \n 3.Multiplication \n 4.Division");
		int sw = sc.nextInt();

		switch (sw) {
		case 1:
			calcu.addNum();
			break;
		case 2:
			calcu.subNum();
			break;
		case 3:
			calcu.mulNum();
			break;
		case 4:
			calcu.divNum();
			break;
		default:
			System.out.println("Invalid Input");
		}

		sc.close();
	}
}
