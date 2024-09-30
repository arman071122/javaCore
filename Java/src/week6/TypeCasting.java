package week6;

public class TypeCasting {
    public static void main(String[] args) {

	// Widening
	int a = 5;
	double b = a;
	System.out.println(a);
	System.out.println(b);

	// Narrowing
	double c = 3.45;
	int d = (int) c;
	System.out.println(c);
	System.out.println(d);

    }
}
