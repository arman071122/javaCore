package week03;

import java.util.Scanner;

public class Str_rev {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String s = sc.next();

	char c[] = s.toCharArray();

	int i = s.length() - 1;
	int j = 0;

	while (i > j) {
	    char temp = c[j];
	    c[j] = c[i];
	    c[i] = temp;

	    i--;
	    j++;
	}

	String rev = new String(c);
	System.out.println("Reversed string is " + rev);
	if (s.equals(rev))
	    System.out.println(s + " is a palindrome");
	else
	    System.out.println(s + " is not a palindrome");
	sc.close();
    }
}
