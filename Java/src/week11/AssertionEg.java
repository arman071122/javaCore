package week11;

public class AssertionEg {
    public static void main(String[] args) {
	try {
	    int age = 14;
	    assert age >= 18 : "Underge";
	} catch (AssertionError e) {
	    System.out.println(e);
	}
    }
}
