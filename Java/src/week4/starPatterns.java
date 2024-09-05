package week4;

import java.util.Scanner;

public class starPatterns {
    int i, j, row;
    Scanner sc = new Scanner(System.in);

    void rows() {
	System.out.print("Enter the number of rows : ");
	row = sc.nextInt();
    }

    void rightTriangle() {
	for (int i = 1; i <= row; i++) {
	    for (int j = 1; j <= i; j++) {
		System.out.print("* ");
	    }
	    System.out.println("");
	}
    }

    void invRightTriangle() {
	for (int i = row; i > 0; i--) {
	    for (int j = 1; j <= i; j++) {
		System.out.print("* ");
	    }
	    System.out.println("");
	}
    }

    void leftRightTriangle() {
	for (int i = 1; i <= row; i++) {
	    for (int j = row; j > i; j--) {
		System.out.print(" ");
	    }
	    for (int j = 1; j <= i; j++) {
		System.out.print("*");
	    }
	    System.out.println();
	}
    }

    void pyramid() {
	for (int i = 0; i < row; i++) {
	    for (int j = row - i; j > 1; j--) {
		System.out.print(" ");
	    }
	    for (int j = 0; j <= i; j++) {
		System.out.print("* ");
	    }
	    System.out.println("");
	}
    }

    void diamond() {
	for (i = 0; i < row; i++) {
	    for (j = row - i; j > 1; j--) {
		System.out.print(" ");
	    }
	    for (j = 0; j <= i; j++) {
		System.out.print("* ");
	    }
	    System.out.println(" ");
	}

	for (i = row - 2; i >= 0; i--) {
	    for (j = row - i; j > 1; j--) {
		System.out.print(" ");
	    }
	    for (j = 0; j <= i; j++) {
		System.out.print("* ");
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args) {
	starPatterns obj = new starPatterns();

	obj.rows();
	obj.rightTriangle();
	System.out.println();
	obj.invRightTriangle();
	System.out.println();
	obj.leftRightTriangle();
	System.out.println();
	obj.pyramid();
	System.out.println();
	obj.diamond();
    }
}
