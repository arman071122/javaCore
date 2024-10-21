package week04;

public class megaPattern {
    public static void main(String[] args) {
	int i, j, rows = 5;

	for (i = 5; i > 0; i--) {
	    for (j = 1; j <= i; j++) {
		System.out.print("* ");
	    }
	    for (j = rows * 4; j > (4 * i); j--) {
		System.out.print(" ");
	    }
	    for (j = 1; j <= i; j++) {
		System.out.print("* ");
	    }
	    System.out.println("");
	}
	for (i = 2; i <= 5; i++) {
	    for (j = 1; j <= i; j++) {
		System.out.print("* ");
	    }
	    for (j = rows * 4; j > (4 * i); j--) {
		System.out.print(" ");
	    }
	    for (j = 1; j <= i; j++) {
		System.out.print("* ");
	    }

	    System.out.println("");
	}
    }
}
