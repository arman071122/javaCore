package week6;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
	System.out.println("Enter the number of rows");
	Scanner sc = new Scanner(System.in);
	int rows = sc.nextInt();

	for (int i = 0; i < rows; i++) {
	    int num = 1;
	    for (int space = rows - i; space > 1; space--) {
		System.out.print(" ");
	    }
	    for (int pos = 0; pos <= i; pos++) {
		System.out.print(num + " ");
		num = num * (i - pos) / (pos + 1);
	    }
	    System.out.println();
	}
    }
}
