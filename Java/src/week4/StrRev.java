package week4;

public class StrRev {
    public static void main(String[] args) {
	String s = "namra";

	char c[] = s.toCharArray();
	for (int i = s.length() - 1; i >= 0; i--) {
	    System.out.print(c[i]);
	}
    }
}