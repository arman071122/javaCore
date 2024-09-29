package week6;

import java.util.Scanner;

public class OruFun {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Nala varo? ");
	boolean nalaVaro = scanner.nextBoolean();

	if (nalaVaro) {
	    System.out.println("Nerathe varo? ");
	    boolean neratheVaro = scanner.nextBoolean();

	    if (neratheVaro) {
		System.out.println("\n Gud girl");
	    } else {
		System.out.println("\n Nerathe vaa");
	    }
	} else {
	    System.out.println("\n Ok bie");
	}

	scanner.close();
    }
}
