package week01;

import java.util.Scanner;

public class Num_rev {
	int a, hundreds, tens, ones, tens2;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter a 3 digit number to reverse");
		a = sc.nextInt();
		System.out.println(a);
	}

	void split() {
		hundreds = a / 100;
		// tens2=a%100;
		// tens=tens2/10;
		tens = (a % 100) / 10;
		ones = a % 10;
		System.out.println("Hundreds digit is " + hundreds);
		System.out.println("Tens digit is " + tens);
		System.out.println("Ones digit is " + ones);
	}

	void reversal() {
		System.out.println("Reversed number is " + ((ones * 100) + (tens * 10) + (hundreds)));
	}

	public static void main(String[] args) {
		Num_rev rev = new Num_rev();
		rev.input();
		rev.split();
		rev.reversal();
	}

}
