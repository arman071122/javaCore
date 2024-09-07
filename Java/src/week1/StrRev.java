package week1;

import java.util.Scanner;

public class StrRev {
    public static void main(String[] args) {

	// similar thing with StringBuilder

	System.out.println("Enter anything");
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer(sc.next());

	System.out.println("Reversed string is " + sb.reverse());

	sc.close();
    }
}
