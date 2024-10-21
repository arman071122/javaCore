package week02;

import java.util.Scanner;

public class sumOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();

		int i = 1;
		long sum = 0;

		while (i <= n) {
			sum += i;
			i++;
		}

		System.out.println("Sum of numbers until " + n + " is " + sum);

		sc.close();
	}
}
