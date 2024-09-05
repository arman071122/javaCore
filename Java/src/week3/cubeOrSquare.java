package week3;

import java.util.Scanner;

public class cubeOrSquare {
    int num, n;
    int sumsq = 0, sumcu = 0, sum = 0;

    void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amy number");
	num = sc.nextInt();
	n = num;
	sc.close();
    }

    void sum() {
	n = num;
	while (n != 0) {
	    int lastdg = n % 10;
	    sum += lastdg;
	    n /= 10;
	}
	System.out.println("Sum of digits is " + sum + "\n");
    }

    void sq() {
	n = num;
	while (n != 0) {
	    int lastdgsq = (n % 10) * (n % 10);
	    sumsq += lastdgsq;
	    n /= 10;
	}
	System.out.println("sum of square of digits of " + num + " is " + sumsq);
    }

    void cube() {
	n = num;
	while (n != 0) {
	    int lastdgcu = (n % 10) * (n % 10) * (n % 10);
	    sumcu += lastdgcu;
	    n /= 10;
	}
	System.out.println("sum of cube of digits of " + num + " is " + sumcu);
    }

    void sqcu() {
	sum();
	if (sum % 2 == 0) {
	    System.out.print("Sum of digits is even so ");
	    sq();
	} else {
	    System.out.print("Sum of digits is odd so ");
	    cube();
	}
    }

    public static void main(String[] args) {
	cubeOrSquare obj = new cubeOrSquare();

	obj.input();
	obj.sqcu();

    }
}
