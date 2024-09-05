package week4;

public class reveres {
    public static void reverseString(String s) {

	char c[] = s.toCharArray();
	for (int i = s.length() - 1; i >= 0; i--)
	    System.out.print(c[i]);
    }
}
