package week01;

public class swap_notemp2 {
	public static void main(String[] args) {
		System.out.println("Sorting without 3rd variable - II");
		System.out.println("");
		int a = 2;
		int b = 3;
		System.out.println("Before sorting a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After sorting a = " + a + ", b = " + b);
	}

}
