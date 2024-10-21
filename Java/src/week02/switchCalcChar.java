package week02;

import java.util.Scanner;

public class switchCalcChar {
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

		System.out.println("Enter any option : \n a.Additon \n b.Subtraction " + "\n c.Multiplication \n d.Division");
		char sw = sc.next().charAt(0);

		switch (sw) {
		case 'a':
			calcu.addNum();
			break;
		case 'b':
			calcu.subNum();
			break;
		case 'c':
			calcu.mulNum();
			break;
		case 'd':
			calcu.divNum();
			break;
		default:
			System.out.println("Invalid Input");
		}

		sc.close();
	}
}
