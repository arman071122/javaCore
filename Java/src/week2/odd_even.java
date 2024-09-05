package week2;

import java.util.Scanner;

public class odd_even {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println(a + " is an even number");
		}

		else {
			System.out.println(a + " is an odd number");
		}

		sc.close();
	}
}
