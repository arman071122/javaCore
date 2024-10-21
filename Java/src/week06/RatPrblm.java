package week06;

import java.util.Scanner;

public class RatPrblm {

    public static int foodForRats(int r, int unit, int house[]) {
	if (house == null) {
	    return -1;
	}

	int totalFoodRequired = r * unit;
	int foodCollected = 0;

	for (int i = 0; i < house.length; i++) {
	    foodCollected += house[i];

	    if (foodCollected >= totalFoodRequired) {
		return i + 1;
	    }
	}
	return 0;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number of rats : ");
	int r = sc.nextInt();
	System.out.print("Enter the amout of food each rat consumes : ");
	int unit = sc.nextInt();
	System.out.print("Enter the number of houses :");
	int n = sc.nextInt();
	System.out.print("Enter the amount of food in each house : ");
	int house[] = new int[n];

	for (int i = 0; i != n; i++) {
	    house[i] = sc.nextInt();
	}

	int result = foodForRats(r, unit, house);

	if (result == -1) {
	    System.out.println("Array is null");
	} else if (result == 0) {
	    System.out.println("Food not sufficient for all the rats");
	} else {
	    System.out.println("All rats can be fed from the first " + result + " houses");
	}
    }
}
