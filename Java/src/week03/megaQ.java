package week03;

import java.util.Scanner;

public class megaQ {
    int num, combResult, sum, revN, i, n;
    boolean notPrime, isPal;
    String s = "", revS = "";
    Scanner sc = new Scanner(System.in);

    void inputString() { // takes input string
	System.out.print("\nEnter any String : ");
	s = sc.next();
    }

    void inputNum() { // takes input number
	System.out.print("\nEnter any number : ");
	num = sc.nextInt();
    }

    void revString() { // reverses string and changes pal indicator as 1 if s and rev are same
	inputString();
	i = s.length() - 1; // index points at the last letter
	while (i >= 0) { // runs until index 0 is reached
	    char a = s.charAt(i);
	    revS += a;
	    i--;
	}
	System.out.print("Reversed string is " + revS);
	isPal = s.equals(revS);
	resetString(); // reset the strings used for collsion free calculation
    }

    void palindromeString() { // checks if string is palindrome or not
	revString();
	System.out.println(" so the string is a " + (isPal ? "palindrome" : "not palindrome")); // ternary operator - if
												// isPal is true then
												// "palindrome" else
												// "not palindrome"
	isPal = false; // palindrome flag reset

    }

    void palNum() { // checks if number is palindrome or not
	inputNum();
	n = num;
	while (n != 0) { // runs until the number is depleted
	    revN = (revN * 10) + (n % 10); // rev*10 + rem
	    n /= 10;
	}
	System.out.print("Reversed number is " + revN);
	if (num == revN) // if original number = reversed number it is palindrome
	    System.out.println(" so it is a palindrome");
	else
	    System.out.println(" so it is not a palindrome");
	resetNum(); // reset the numbers used for collsion free calculation
    }

    void prime() { // checks if number is prime or not
	inputNum();
	n = num;
	if (n <= 1) { // special condition 0 and 1
	    System.out.println(n + " is neither prime nor composite");
	    return;
	} else {
	    notPrime = false;
	    i = 2;
	    while (i < n) { // checks divisiblity from 2 to n-1
		if (n % i == 0)
		    notPrime = true; // not prime becomes true indicative of composite number
		i++;
	    }
	}
	System.out.println(n + (notPrime ? " is not prime" : " is prime")); // ternary operator - if notPrime is true
									    // then
									    // "is not prime" or else "is prime"
	resetNum(); // reset the numbers used for collsion free calculation
    }

    void mulTable() { // prints the multiplication table of each digit
	inputNum();
	n = num;
	while (n != 0) { // runs until the number is depleted
	    int lastdg = n % 10;
	    i = 1;
	    System.out.println("\nMultiplication table of " + lastdg + " until 12  is\n");
	    while (i != 13) { // runs 12 times as we need table until 12
		System.out.println(lastdg + " x " + i + " = " + (lastdg * i));
		i++;
	    }
	    n /= 10; // removing the last digit for eg 435 / 10 = 43
	}
	resetNum(); // reset the numbers used for collsion free calculation
    }

    void calcuSqCu(int power) { // accessory function for sqCu() method
	n = num;
	while (n != 0) { // runs until number is depleted
	    int lastdg = n % 10;
	    combResult += Math.pow(lastdg, power);
	    n /= 10;
	}
	if (power == 1) { // does the normal sum
	    sum = combResult;
	    System.out.println("Sum of digits is " + sum + "\n");
	} else if (power == 2) { // does the sqauring and summing
	    System.out.println("Sum of square of digits of " + num + " is " + combResult);
	} else if (power == 3) { // does the cubing and summing
	    System.out.println("Sum of cube of digits of " + num + " is " + combResult);
	}
    }

    void sqCu() { // if sum of digit is found even, digits squared and adds them and
		  // if odd, digits cubed and adds them
	inputNum();
	calcuSqCu(1); // does the sum
	if (sum % 2 == 0) { // checks if sum is even
	    System.out.print("Sum of digits is even so ");
	    calcuSqCu(2); // sum is even so squaring method
	} else {
	    System.out.print("Sum of digits is odd so ");
	    calcuSqCu(3); // sum is odd so cubing method
	}
	resetNum(); // resetting the number for collision free calculation
    }

    void resetString() { // reset the strings used for collsion free calculation
	s = "";
	revS = "";
    }

    void resetNum() { // reset the numbers used for collsion free calculation
	num = combResult = sum = revN = i = n = 0;
	notPrime = false;
    }

    public static void main(String[] args) {
	megaQ mega = new megaQ();
	Scanner sc = new Scanner(System.in);
	int ch;

	System.out.println("\n 1. Reverse of String" + "\n 2. Check if string is Palindrome "
		+ "\n 3. Check if number is Palindrome " + "\n 4. Find if number is prime or not "
		+ "\n 5. Multiplication table of each digit of the number "
		+ "\n 6. Check if sum of digits is odd (then sum of cubes of digits) or even (then sum of square of digits) \n "
		+ "7. Exit");

	do {
	    System.out.print("\n\nEnter choice : ");
	    ch = sc.nextInt();

	    switch (ch) {
	    case 1: {
		System.out.println("\nReverse of String");
		System.out.println("******************");

		mega.revString();

		break;
	    }
	    case 2: {
		System.out.println("\nCheck if string is Palindrome");
		System.out.println("******************************");

		mega.palindromeString();

		break;
	    }
	    case 3: {
		System.out.println("\nCheck if number is Palindrome");
		System.out.println("******************************");

		mega.palNum();

		break;
	    }
	    case 4: {
		System.out.println("\nFind if number is prime or not ");
		System.out.println("*******************************");

		mega.prime();

		break;
	    }
	    case 5: {
		System.out.println("\nMultiplication table of each digit of the number ");
		System.out.println("*************************************************");

		mega.mulTable();

		break;
	    }
	    case 6: {
		System.out.println(
			"\nCheck if sum of digits is odd (then sum of cubes of digits) or even (then sum of square of digits)");
		System.out.println(
			"**************************************************************************************************");
		mega.sqCu();

		break;
	    }
	    default:
		if (ch == 7)
		    System.out.println("\n BYE BYE BYE !!!");

		else
		    System.out.println("Invalid Input \n");
	    }
	} while (ch != 7); // when ch==7 exit condition
	sc.close();
    }
}
