package week09;

import java.util.Scanner;

public class CharReplace {
    static String ReplaceCharacter(char str[], int n, char ch1, char ch2) {
	if (n == 0)
	    return null;

	for (int i = 0; i < n; i++) {
	    if (str[i] == ch1)
		str[i] = ch2;
	    else if (str[i] == ch2)
		str[i] = ch1;
	}
	String output = "";
	for (int i = 0; i < n; i++) {
	    output += str[i];
	}

	return output;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a string all lowercase");
	String s = sc.next();
	char[] str = s.toCharArray();
	int n = s.length();

	System.out.println("Enter char 1");
	char ch1 = sc.next().charAt(0);
	System.out.println("Enter the char 2");
	char ch2 = sc.next().charAt(0);

	System.out.println(ReplaceCharacter(str, n, ch1, ch2));

    }
}
