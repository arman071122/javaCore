package week3;

import java.util.Scanner;

public class Str_srch {
    public static void main(String[] args) {
	int i;
	int found = 0;
	System.out.print("\n Enter a string : ");
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	System.out.print("\nEnter the letter to search : ");
	char c = sc.next().charAt(0);
	sc.close();
	char c_arr[] = s.toCharArray();

	int pos[] = new int[c_arr.length];

	for (i = 0; i < c_arr.length; i++) {
	    if (c == c_arr[i]) {
		pos[i] = i + 1;
		found = 1;
	    }
	}

	if (found == 1)
	    System.out.print("\nLetter " + c + " found at ");
	else
	    System.out.println("\nLetter " + c + " not found.");

	for (i = 0; i < pos.length; i++) {
	    if (pos[i] != 0) {
		if (pos[i] == 1) {
		    System.out.print(pos[i] + "st, ");
		} else if (pos[i] == 2) {
		    System.out.print(pos[i] + "nd, ");
		} else if (pos[i] == 3) {
		    System.out.print(pos[i] + "rd, ");
		} else {
		    System.out.print(pos[i] + "th, ");
		}
	    }
	}
	if (found == 1)
	    System.out.println("positions.");

    }
}
