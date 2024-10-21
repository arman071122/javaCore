package week10;

public class OuterClass {
    int a = 10;
    static int b = 9;

    static void m1() {

    }

    void m2() {

    }

    static class InnerClass {
	public static void main(String[] args) {
//	    System.out.println(a);
	    System.out.println(b);
	    m1();
//	    m2();
	}
    }
}
