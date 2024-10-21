package week01;

import java.util.Scanner;

public class Strings_eg {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String in = "Hi";
	String in2 = new String("      Enter anything      "); // both are same first ones the compact form

	System.out.println(in + " " + in2);

	String a = new String(sc.nextLine()); // next() reads a single word whereas nextLine() reads the whole line
	System.out.println("HI " + a + "\n");

	System.out.println("Character at 4th index is " + a.charAt(4) + "\n");

	System.out.println("Length of the string is " + a.length() + "\n");

	System.out.println("Concatenation eg is " + a.concat(in) + "\n");
	System.out.println("Concatenation another eg is " + a.concat(" poda"));

	System.out.println("Substring eg.1 substring is " + a.substring(1, 3) + "\n");
	System.out.println("Substring eg.2 substring is " + a.substring(1));

	System.out.println("Trim omits the spaces before and after the string" + in2.trim() + a + "\n");

	String s1 = "ARMAN";
	String s2 = "arman";
	String s3 = "arman";
	String s4 = "pavam";
	System.out.println("Equals example");
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s3.equals(s4) + "\n");

	int num = 10;
	String s5 = String.valueOf(num);
	System.out.println("Value of method example " + s5 + " length of the number is " + s5.length());

	System.out.println("Contains checks if a sequence of chars in a string \n" + a.contains(s2));
	System.out.println(a.contains("arm"));
	System.out.println(a.contains("no") + "\n");

	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());

	sc.close();
    }
}
//indexof
//lastindexof
//equalsignorecase
//replace
//split
//append
