package week2;

import java.util.Scanner;

public class numPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int n = num;
		int rem = 0, rev = 0;

		while (n != 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n /= 10;
		}

		if (num == rev)
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not a palindrome");

		sc.close();
	}
}
