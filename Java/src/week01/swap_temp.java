package week01;

public class swap_temp {

	public static void main(String[] args) {
		System.out.println("Sorting with 3rd variable");
		System.out.println("");
		int a = 2;
		int b = 3;
		int c = 0;
		System.out.println("Before sorting a = " + a + ", b =" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After sorting a = " + a + ", b = " + b);
	}
}
