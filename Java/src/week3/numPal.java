package week3;

import java.util.Scanner;

public class numPal {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any number");
	int n = sc.nextInt();
	int rev = 0;

	while (n != 0) {
	    rev = (rev * 10) + (n % 10); // rev*10 + rem
	    n /= 10;
	}
	System.out.println(rev);
	sc.close();
    }
}
