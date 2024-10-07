package week8;

import java.util.Scanner;

public class VoterApp {
    public static void checkEligiblity(int age) throws UnderageException {
	if (age < 18)
	    throw new UnderageException();
	else
	    System.out.println("\n You are eligible to vote");
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("\n Welcome to Voters portal");

	System.out.print("\n Enter ur age : ");
	int age = sc.nextInt();

	try {
	    checkEligiblity(age);
	} catch (UnderageException u) {
	    System.out.println(u);
	}
    }
}
