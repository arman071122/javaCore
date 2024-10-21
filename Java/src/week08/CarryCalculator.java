package week08;

import java.util.Scanner;

public class CarryCalculator {
    static int numOfCarries(int num1, int num2) {
	int carryCount = 0, carry = 0, sum = 0;
	while (num1 > 9 & num2 > 9) {
	    sum = (num1 % 10) + (num2 % 10);
	    if (carry + sum > 9) {
		carry = sum / 10;
		carryCount++;
	    }
	    num1 /= 10;
	    num2 /= 10;
	}
	return carryCount;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to add");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	System.out.println("Addition of " + num1 + " and " + num2 + " has " + numOfCarries(num1, num2) + " of carries");

    }
}
