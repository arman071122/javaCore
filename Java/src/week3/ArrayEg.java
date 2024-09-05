package week3;

import java.util.Scanner;

public class ArrayEg {

    int ar[]; // short syntax of declaring array
    int a[] = new int[5]; // syntax of array, this is declaration
    int b[] = new int[] { 1, 2, 3, 4, 5 }; // declaration and initialization
    int c[] = { 1, 2, 3, 4, 5 }; // short form of declarationa and initialization

    int i = 0, j = 0;
    int sum, rem, rev, n, l;
    boolean isPrime;
    float avg;
    Scanner sc = new Scanner(System.in);
    
    void input() {

	System.out.println("Enter the length of array");
	l = sc.nextInt();
	ar = new int[l];

	System.out.println("Enter each number");
	while (i != l) {
	    ar[i] = sc.nextInt();
	    i++;
	}
    }

    void addNum() {
	i = sum = 0; // initialisation

	while (i != ar.length) {
	    sum += ar[i];
	    i++;
	}
	System.out.println("\nSum of the elements in the array is " + sum + "\n");
    }

    void avgNum() {
	i = sum = 0; // initialisation
	avg = 0;
	float l = ar.length;

	while (i != l) {
	    sum += ar[i];
	    avg = sum / l;
	    i++;
	}
	System.out.println("Average of the numbers in the array is " + avg + "\n");

    }

    void palNum() {
	int revNums[] = new int[ar.length];
	i = n = 0; // initialisation

	System.out.println("\nPalindrome check of each number in the array");
	System.out.println("***********************************************");

	while (i < ar.length) { // array traversal loop
	    rem = rev = 0;
	    n = ar[i];

	    while (n != 0) { // reversal of each number loop
		rem = n % 10;
		rev = (rev * 10) + rem;
		n /= 10;
	    }
	    revNums[i] = rev; // storing each corresponding reversed number onto the revNums array

	    if (revNums[i] == ar[i]) {
		System.out.println(ar[i] + " is palindrome\n");
	    } else {
		System.out.println(ar[i] + " is not palindrome\n");
	    }
	    i++;
	}
    }

    void prime() {
	System.out.println("\nPrime check of each number in the array");
	System.out.println("******************************************");

	i = n = 0; // initialisation

	while (i < ar.length) {
	    n = ar[i];

	    if (n <= 1) {
		System.out.println(n + " is neither prime nor composite\n");
	    } else {
		isPrime = true;
		j = 2;

		while (j < n) {
		    if (n % j == 0) {
			isPrime = false;
		    }
		    j++;
		}
		if (isPrime == false)
		    System.out.println(n + " is not a prime number\n");
		else
		    System.out.println(n + " is a prime number\n");
	    }
	    i++;
	    isPrime = true;
	}
    }

    public static void main(String[] args) {
	ArrayEg array = new ArrayEg();

	array.input();
	array.addNum();
	array.avgNum();
	array.palNum();
	array.prime();
    }
}