package week4;

class Rev {
    String name = "ABC";

    public void reverseString(String s) {

	char c[] = s.toCharArray();
	for (int i = s.length() - 1; i >= 0; i--)
	    System.out.print(c[i]);
    }
}

public class StringRev extends Rev {

    public void diusplay() {
	System.out.println("THis is CHild");
    }
}

class MainTest extends StringRev {
    public static void main(String[] args) {
	MainTest m = new MainTest();
	m.name = "abcd";
    }
}
