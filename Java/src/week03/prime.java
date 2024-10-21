package week03;

import java.util.Scanner;

public class prime {
    int n = 0;
    int i = 0;
    int notPrime = 0;

    void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	n = sc.nextInt();
	sc.close();
    }

    void Prime() {
	if (n <= 1) {
	    System.out.println(n + " is neither prime nor composite");
	    return;
	} else {
	    i = 2;
	    while (i <= n - 1) {
		if (n % i == 0) {
		    notPrime = 1;
		}
		i++;
	    }
	}

	if (notPrime == 1)
	    System.out.println("Not Prime");
	else
	    System.out.println("Prime");
    }

    public static void main(String[] args) {
	prime primeObj = new prime();
	primeObj.input();
	primeObj.Prime();
    }
}