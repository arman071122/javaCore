package week02;

import java.util.Scanner;

public class StrRevFun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter anything ");
		String s = sc.next();

		String last = "";
		String rev = "";

		while (s != "") {
			int len = s.length();
			last = s.substring(len - 1);
			s = s.substring(0, len - 1);
			rev = rev.concat(last);
		}

		System.out.println("Reversed string is " + rev);

		sc.close();
	}
}
