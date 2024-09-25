package week6;

import java.util.Scanner;

public class SentenceRev {
    public static void main(String[] args) {
	String sentence;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a sentence");
	sentence = sc.nextLine();

	String[] wrdArr = sentence.split(" ");
	for (int i = wrdArr.length - 1; i >= 0; i--)
	    System.out.print(wrdArr[i] + " ");
    }
}
