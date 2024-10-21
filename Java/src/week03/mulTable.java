package week03;

import java.util.Scanner;

public class mulTable {
    int n = 0;
    int i = 0;

    void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	n = sc.nextInt();
	sc.close();
    }

    void table() {
	while (n != 0) { // runs until depleting the number
	    int lastdg = n % 10;

	    while (lastdg != 0) { // runs until the acquired last digit is depleted
		i = 1;
		System.out.println("\nMultiplication table until 12 of " + lastdg + " are\n");

		while (i != 13) { // runs 12 times as we need table until 12
		    System.out.println(lastdg + " x " + i + " = " + (lastdg * i));
		    i++;
		}
		lastdg = 0;
	    }
	    n /= 10;
	}
    }

    public static void main(String[] args) {
	mulTable table = new mulTable();

	table.input();
	table.table();
    }
}
