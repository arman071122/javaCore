package week2;

import java.util.Scanner;

public class strRevFun3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anything");
		String s = sc.nextLine();

		int i = s.length() - 1;

		while (i >= 0) {
			char a = s.charAt(i);
			System.out.print(a);
			i--;
		}
		sc.close();
	}
}
