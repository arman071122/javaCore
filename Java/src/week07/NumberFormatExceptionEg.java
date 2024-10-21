package week07;

public class NumberFormatExceptionEg {
    public static void main(String[] args) {
	String s = "23";
	try {
	    int a = Integer.parseInt(s);
	    System.out.println(a);
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}
