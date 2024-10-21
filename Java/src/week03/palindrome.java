package week03;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter anything");
	String s = sc.next();

	int i = s.length() - 1;
	String rev = "";

	while (i >= 0) {
	    char a = s.charAt(i);
	    rev += a;
	    i--;
	}
	if (s.equals(rev))
	    System.out.println("The provided string is a palindrome");
	else
	    System.out.println("The provided string is not a palindrome");
	sc.close();
    }
}
