package week04;

public class properW {
    public static void main(String[] args) {
	int rows = 5;
	for (int i = 1; i <= rows; i++) {
	    System.out.print("*");

	    for (int j = 1; j <= (rows - i); j++) {
		System.out.print(" ");
	    }

	    System.out.print("*");

	    for (int j = 1; j <= (2 * i - 2); j++) {
		System.out.print(" ");
	    }

	    System.out.print("*");

	    for (int j = 1; j <= (rows - i); j++) {
		System.out.print(" ");
	    }

	    System.out.println("*");
	}
    }
}
