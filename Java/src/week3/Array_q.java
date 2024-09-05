package week3;

import java.util.Scanner;

public class Array_q {
    String s;
    int i, j, found = 0, isFirstRun = 1;
    Scanner sc = new Scanner(System.in);

    void input() {
	System.out.print("\nEnter any string : ");
	s = sc.next();
	isFirstRun = 0;
    }

    void sameInput() {
	if (isFirstRun == 0) {
	    System.out.println("\nContinue with your string '" + s + "' (y/n)\n");
	    char choice = sc.next().charAt(0);
	    if (choice == 'n')
		input();
	    else
		System.out.println("\n Well then");
	} else
	    input();
    }

    void str_pal() {
	sameInput();
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
	System.out.println("\nReversed string is " + rev + "\n");
	if (s.equals(rev))
	    System.out.println(s + " is a palindrome\n");
	else
	    System.out.println(s + " is not a palindrome\n");
    }

    void str_search() {
	found = 0;
	sameInput();
	System.out.print("\nEnter the letter to search : ");
	char c = sc.next().charAt(0);

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
	    System.out.println("\nLetter " + c + " not found.\n");

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

    public static void main(String[] args) {
	Array_q obj = new Array_q();
	Scanner sc = new Scanner(System.in);
	int ch;
	System.out.println("\n1. Check Palindrome\n2. Search Character\n3. Exit\n");

	do {
	    System.out.print("Enter your choice : ");
	    ch = sc.nextInt();

	    switch (ch) {
	    case 1: {
		obj.str_pal();
		break;
	    }
	    case 2: {
		obj.str_search();
		break;
	    }
	    default:
		if (ch == 3)
		    System.out.println("\nBYE BYE BYE");
		else
		    System.out.println("Invalid choice, please try again.");
	    }
	} while (ch != 3);

	sc.close();
    }
}
