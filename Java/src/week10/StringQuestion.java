package week10;

import java.util.Scanner;

public class StringQuestion {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ur string");
	String s = sc.next();
	StringBuilder output = new StringBuilder();
	int count = 1;

	for (int i = 1; i < s.length(); i++) {
	    if (s.charAt(i) == s.charAt(i - 1)) {
		count++;
	    } else {
		output.append(count).append(s.charAt(i - 1));
		count = 1;
	    }
	}
	output.append(count).append(s.charAt(s.length() - 1));
	System.out.println(output.toString());
    }
}
