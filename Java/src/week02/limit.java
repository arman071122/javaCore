package week02;

import java.util.Scanner;

public class limit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = sc.nextInt();

		System.out.println("Even numbers until" + limit + "are");
		int i = 0;
		while (i <= limit) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

			i++;
		}

		System.out.println("Odd numbers until" + limit + "are");
		i = 0;
		while (i <= limit) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

			i++;
		}

		sc.close();
	}
}
