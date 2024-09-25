package week5;

import java.util.Scanner;

public class Overloading {
    void area(int l, int b) {
	System.out.println("\nArea of rectangle = " + (l * b));
    }

    void area(int r, boolean Circle) {
	System.out.println("\nArea of circle = " + (3.14 * r * r));
    }

    void area(int l) {
	System.out.println("\nArea of square = " + (l * l));
    }

    public static void main(String[] args) {
	int l, b, r, ch;
	boolean Circle;
	Scanner sc = new Scanner(System.in);
	System.out.println("Area of square, rectangle, circle");
	Overloading ar = new Overloading();
	do {
	    System.out.println("\nEnter choice \n1.Rectangle\n2.Sqaure\n3.Circle\n");
	    ch = sc.nextInt();
	    switch (ch) {
	    case 1: {
		Circle = false;
		System.out.print("Enter the length of rectangle : ");
		l = sc.nextInt();
		System.out.print("Enter the breadth of rectangle : ");
		b = sc.nextInt();
		ar.area(l, b);
		break;
	    }
	    case 2: {
		Circle = false;
		System.out.print("Enter the length of square : ");
		l = sc.nextInt();
		ar.area(l);
		break;
	    }
	    case 3: {
		Circle = true;
		System.out.print("Enter the radius of circle : ");
		r = sc.nextInt();
		ar.area(r, true);
		break;
	    }
	    }
	} while (ch != 4);
    }
}
