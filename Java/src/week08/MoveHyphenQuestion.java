package week08;

import java.util.Scanner;

public class MoveHyphenQuestion {
    public static String MoveHyphen(char str[], int n) {
	char hyphens[] = new char[n];
	char alphabets[] = new char[n];

	int h = 0;
	int a = 0;

	if (str == null)
	    return "null";
	for (int i = 0; i < n; i++) {
	    if (str[i] == '-')
		hyphens[h++] = '-';
	    if (str[i] != '-')
		alphabets[a++] = str[i];
	}

	String output = "";

	for (int i = 0; i < h; i++)
	    output += hyphens[i];
	for (int i = 0; i < a; i++)
	    output += alphabets[i];

	return output;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string with hyphens : ");
	String s = sc.next();

	char str[] = s.toCharArray();
	int n = s.length();

	System.out.println(MoveHyphen(str, n));
    }
}
