package week8;

import java.util.Scanner;

public class ArrayQuestion {

    public int findInt(int arr[], int length, int num, int diff) {
	int n = 0;
	for (int i = 0; i < length; i++) {
	    if (Math.abs(arr[i] - num) <= diff) {
		n++;
	    }
	}

	if (n == 0)
	    return -1;
	else
	    return n;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayQuestion q1 = new ArrayQuestion();

	System.out.print("\nEnter the length of the array : ");
	int length = sc.nextInt();
	int arr[] = new int[length];

	System.out.print("\nEnter the numbers in the array : ");
	for (int i = 0; i < length; i++) {
	    arr[i] = sc.nextInt();
	}

	System.out.print("\nEnter the number : ");
	int num = sc.nextInt();

	System.out.print("\nEnter the difference : ");
	int diff = sc.nextInt();

	int result = q1.findInt(arr, length, num, diff);

	if (result == -1) {
	    System.out.println("\nNOPE");
	} else {
	    System.out.println("\nThere are " + result + " of elements");
	}
    }
}
