package week4;

public class properW {
    public static void main(String[] args) {
	int n = 7; // Height of the W

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j <= n * 4; j++) {
		// Logic to print stars for W
		if (j == i || j == (n * 2 - i) || j == (n * 2 + i) || j == (n * 4 - i)) {
		    System.out.print("*");
		} else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}
    }
}
