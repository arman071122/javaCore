package week04;

public class WPattern {
    public static void main(String[] args) {
	int i, j, rows = 5;

	for (i = 0; i < rows; i++) {
	    for (j = 0; j < i; j++) {
		System.out.print(" ");
	    }
	    for (j = i; j < rows; j++) {
		System.out.print("* ");
	    }

	    for (j = 0; j < 2 * i; j++) {
		System.out.print(" ");
	    }

	    for (j = i; j < rows; j++) {
		System.out.print("* ");
	    }
	    System.out.println();
	}
    }
}
