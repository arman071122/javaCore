package week02;

import java.util.Scanner;

public class strRevFun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter anything ");
		String s = sc.next();

		int i = s.length() - 1;
		String rev = "";

		while (i >= 0) {
			rev += s.charAt(i);
			i--;
		}
		System.out.println("Reversed string is " + rev);

		sc.close();
	}
}
