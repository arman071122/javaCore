package week7;

public class FinallyEg {
    public static void main(String[] args) {

	try {
	    int a = 10 / 0;

	} catch (NullPointerException e) {
	    System.out.println(e);
	} finally {
	    System.out.println("hello world");
	}

    }
}