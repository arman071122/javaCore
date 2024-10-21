package week02;

import java.util.Scanner;

public class SwitchCalcDoWhile {
    int a, b;
    boolean isFirstRun = true;
    Scanner sc = new Scanner(System.in);

    void input() {
	System.out.println("\n Enter 2 numbers");
	System.out.print("a = ");
	a = sc.nextInt();
	System.out.print("b = ");
	b = sc.nextInt();
	System.out.println("");
	isFirstRun = false;
    }

    void sameInput() {
	if (!isFirstRun) {
	    System.out.println("\n Continue with the same inputs? (y/n)");
	    char choice = sc.next().charAt(0);
	    if (choice == 'n') {
		input();
	    } else if (choice == 'y') {
		System.out.println("\nSo a = " + a + " and b = " + b + "\n");
	    }
	} else {
	    input();
	}
    }

    void addNum() {
	sameInput();
	System.out.println("Sum is " + (a + b) + "\n");
    }

    void subNum() {
	sameInput();
	System.out.println("Difference is " + (a - b) + "\n");
    }

    void mulNum() {
	sameInput();
	System.out.println("Product is " + (a * b) + "\n");
    }

    void divNum() {
	sameInput();
	if (b == 0) {
	    System.out.println("Division by zero is not allowed.\n");
	} else {
	    System.out.println("Quotient is " + (a / b));
	    System.out.println("Remainder is " + (a % b) + "\n");
	}
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	SwitchCalcDoWhile calc = new SwitchCalcDoWhile();

	int ch;
	System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit \n");
	do {
	    System.out.print("Enter any option : ");
	    ch = sc.nextInt();

	    switch (ch) {
	    case 1:
		calc.addNum();
		break;
	    case 2:
		calc.subNum();
		break;
	    case 3:
		calc.mulNum();
		break;
	    case 4:
		calc.divNum();
		break;
	    case 5:
		System.out.println("\nBYE BYE BYE !!!");
		break;
	    default:
		System.out.println("Invalid Input\n");
	    }
	} while (ch != 5);

	sc.close();
    }
}
