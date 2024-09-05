package week2;

import java.util.Scanner;

public class primeNum {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();

	int notPrime = 0;

	if (num <= 1) {
	    System.out.println(num + " is neither prime nor composite");
	    sc.close();
	    return;
	} else {
	    int i = 2;

	    while (i <= num - 1) {
		if (num % i == 0) {
		    notPrime = 1;
		}
		i++;
	    }
	}

	if (notPrime == 1)
	    System.out.println("Not Prime");

	else
	    System.out.println("Prime");

	sc.close();
    }
}
