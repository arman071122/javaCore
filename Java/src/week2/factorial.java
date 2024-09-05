package week2;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		long fact = 1;

		while (num != 0) {
			fact = fact * num;
			num--;
		}

		System.out.println("Factorial of the number is " + fact);

		sc.close();
	}
}
