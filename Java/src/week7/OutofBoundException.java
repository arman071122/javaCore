package week7;

import java.util.Scanner;

public class OutofBoundException {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range of array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the numbers in the array\n");
	try {
	    for (int i = 0; i <= n; i++) {
		arr[i] = sc.nextInt();
	    }
	} catch (ArrayIndexOutOfBoundsException a) {
	    System.out.println(a);
	}
    }

}
