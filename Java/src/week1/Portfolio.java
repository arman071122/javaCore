package week1;

public class Portfolio {
	void name() {
		System.out.println("Arman");
	}

	void dob() {
		System.out.println("07/11/2002");
	}

	void city() {
		System.out.println("Trivandrum");
	}

	void education() {
		System.out.println("B.Tech CSE");
	}

	public static void main(String[] args) {
		Portfolio obj = new Portfolio();
		System.out.println("My Portfolio");
		System.out.println("************");
		System.out.print("Name is ");
		obj.name();
		System.out.print("I was born on ");
		obj.dob();
		System.out.print("My city is ");
		obj.city();
		System.out.print("I completed ");
		obj.education();
	}
}
