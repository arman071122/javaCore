package week02;

import java.util.Scanner;

public class vowelsPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anything");
		String s = sc.nextLine();

		int i = 0;
		int vowCnt = 0;

		while (i <= s.length() - 1) {
			char vow = s.charAt(i);
			if (vow == 'a' | vow == 'e' | vow == 'i' | vow == 'o' | vow == 'u' | vow == 'A' | vow == 'E' | vow == 'I'
					| vow == 'O' | vow == 'U') {
				System.out.println("Vowel " + vow + " found at " + i);
				vowCnt++;
			}
			i++;
		}

		if (vowCnt == 0) {
			System.out.println("No vowels found in the word");
		}
		sc.close();
	}
}