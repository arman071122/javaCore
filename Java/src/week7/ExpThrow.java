package week7;

public class ExpThrow {
    public static void main(String[] args) {

	System.out.println("hello");
	m1();
    }

    public static void m1() {
	try {
	    if (4 < 5) {
		throw new ArithmeticException();
	    }
	} catch (ArithmeticException e) {

	}
    }
}