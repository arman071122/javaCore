package week02;

import java.util.Scanner;

public class anyNumRev {
    public static void main(String[] args) {
	int rev = 0, rem = 0;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number : ");
	int num = sc.nextInt();

	while (num != 0) {
	    rem = num % 10;
	    rev = (rev * 10) + rem;
	    num /= 10;
	}

	System.out.println("Reversed number is " + rev);

	sc.close();
    }
}
