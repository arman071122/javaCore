package week2;

import java.util.Scanner;

public class Great3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers : \n");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(" ");

		if (a > b & a > c) {
			System.out.println(a + " is the greatest");
		}

		else if (b > c) {
			System.out.println(b + " is the greatest");
		}

		else {
			System.out.println(c + " is the greatest");
		}

		sc.close();
	}
}
