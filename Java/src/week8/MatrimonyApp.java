package week8;

import java.util.Scanner;

public class MatrimonyApp {
    public static void EligiblityMarry(String gender, int age) throws MatrimonyExceptions {
	if (gender.equals("male"))
	    if (age < 21)
		throw new Underage();
	    else if (age > 40)
		throw new Overage();
	    else
		System.out.println("Congratulations lets find u a life partner");

	else if (gender.equals("female"))
	    if (age < 18)
		throw new Underage();
	    else if (age > 40)
		throw new Overage();
	    else
		System.out.println("Congratulations lets find u a life partner");
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("\n Welcome to Matrimony App");
	System.out.print("\n Enter your gender : ");
	String gender = sc.next();

	System.out.print("\n Enter your age : ");
	int age = sc.nextInt();

	try {
	    EligiblityMarry(gender, age);
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}
