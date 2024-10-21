package week09;

import java.util.Scanner;

public class StringQuestion {
    public static void main(String[] args) {
	int ch;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string : ");
	String s = sc.nextLine();
	System.out.println("String Functions\n");
	System.out.println("1. charAt");
	System.out.println("2. length");
	System.out.println("3. concat");
	System.out.println("4. substring(int beginIndex)");
	System.out.println("5. substring(int beginIndex, int endIndex)");
	System.out.println("6. trim");
	System.out.println("7. equals");
	System.out.println("8. equalsIgnoreCase");
	System.out.println("9. contains");
	System.out.println("10. toUpperCase");
	System.out.println("11. toLowerCase");
	System.out.println("12. indexOf");
	System.out.println("13. lastIndexof");
	System.out.println("14. replace");
	System.out.println("15. split");
	System.out.println("16. reverse");
	System.out.println("17. Exit");

	do {
	    System.out.println("\nEnter ur choice of implementation");
	    ch = sc.nextInt();
	    switch (ch) {
	    case 1: {
		System.out.println("\nYou've selected charAt\n");
		System.out.print("\nEnter the index : ");
		int index = sc.nextInt();
		System.out.println("Character at " + index + " is " + s.charAt(index));
		break;
	    }
	    case 2: {
		System.out.println("\nYou've selected length\n");
		System.out.println(s.length() + " is the length of the string");
		break;
	    }
	    case 3: {
		System.out.println("\nYou've selected concat\n");
		System.out.println("Enter the string u want to concat to " + s);
		String concat = sc.next();
		System.out.println("Result is " + s.concat(concat));
		break;
	    }
	    case 4: {
		System.out.println("\nYou've selected substring(int beginIndex)\n");
		System.out.println("Enter the index from which " + s + " should be displayed");
		int index = sc.nextInt();
		System.out.println("Result is " + s.substring(index));
		break;
	    }
	    case 5: {
		System.out.println("\nYou've selected substring(int beginIndex, int endIndex)\n");
		System.out.println("Enter the begining and ending indices of the string to be displayed");
		int bindex = sc.nextInt();
		int eindex = sc.nextInt();
		System.out.println("Result is " + s.substring(bindex, eindex));
		break;
	    }
	    case 6: {
		System.out.println("\nYou've selected trim\n");
		System.out.println("Trimmed string is " + s.trim());
		break;
	    }
	    case 7: {
		System.out.println("\nYou've selected equals\n");
		System.out.println("Enter the string to which u want to compare " + s + " to(Case Sensitive)");
		String eqs = sc.next();
		if (s.equals(eqs))
		    System.out.println("Yes, " + s + " is equal to " + eqs);
		else
		    System.out.println("No, " + s + " is not equal to " + eqs);
		break;
	    }
	    case 8: {
		System.out.println("\nYou've selected equalsIgnoreCase\n");
		System.out.println("Enter the string to which u want to compare " + s + " to");
		String eqs = sc.next();
		if (s.equalsIgnoreCase(eqs))
		    System.out.println("Yes, " + s + " is equal to " + eqs);
		else
		    System.out.println("No, " + s + " is not equal to " + eqs);
	    }
	    case 9: {
		System.out.println("\nYou've selected contains\n");
		System.out.println("Enter the character sequence to check if it exist in " + s);
		String seq = sc.next();
		if (s.contains(seq))
		    System.out.println("Yes, " + s + " contains " + seq);
		else
		    System.out.println("No, " + s + " does not contain " + seq);
		break;
	    }
	    case 10: {
		System.out.println("\nYou've selected toUpperCase\n");
		System.out.println("Result is " + s.toUpperCase());
		break;
	    }
	    case 11: {
		System.out.println("\nYou've selected toLowerCase\n");
		System.out.println("Result is " + s.toLowerCase());
		break;
	    }
	    case 12: {
		System.out.println("\nYou've selected indexOf\n");
		System.out.println("Enter the substring or a character of " + s
			+ " of which u want to see the index of its first occurence");
		String sub = sc.next();
		System.out.println(s.indexOf(sub));
		break;
	    }
	    case 13: {
		System.out.println("\nYou've selected lastIndexOf\n");
		System.out.println("Enter the substring or a character of " + s
			+ " of which u want to see the index of its last occurence");
		String sub = sc.next();
		System.out.println(s.lastIndexOf(sub));
	    }
	    case 14: {
		System.out.println("\nYou've selected replace\n");
		System.out.println("Enter the substring of " + s + " which u want to replace");
		String toBeReplaced = sc.next();
		System.out.println("Enter the string with which u want to replace " + toBeReplaced + " in " + s);
		String replacement = sc.next();
		System.out.println("Result is " + s.replace(toBeReplaced, replacement));
		break;
	    }
	    case 15: {
		System.out.println("\nYou've selected split\n");
		System.out.println(s + " is splitted into the following array");
		String[] sArray = s.split(" ");
		for (int i = 0; i < sArray.length; i++)
		    System.out.println(sArray[i]);
		break;
	    }
	    case 16: {
		System.out.println("\nYou've selected reverse\n");
		char[] arr = s.toCharArray();
		System.out.print("Reversed of " + s + " is ");
		for (int i = arr.length - 1; i >= 0; i--)
		    System.out.print(arr[i]);
		break;
	    }
	    default:
		if (ch == 17)
		    System.out.println("Bye");
		else
		    System.out.println("Invalid input");
	    }
	} while (ch != 17);
    }
}