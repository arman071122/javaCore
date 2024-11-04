package week11;

import java.util.Scanner;

public class StringApp {
    static void StringCheck(String s) throws VowelNotFoundException {
	boolean vowelFound = false;

	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
		    || ch == 'o' || ch == 'u') {
		vowelFound = true;
		break;
	    }
	}

	if (vowelFound) {
	    System.out.println("Congratulations");
	} else {
	    throw new VowelNotFoundException();
	}
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string : ");
	String s = sc.next();
	try {
	    StringCheck(s);
	} catch (VowelNotFoundException e) {
	    System.out.println(e);
	}
    }
}
