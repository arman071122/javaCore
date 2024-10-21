package week07;

import java.io.FileNotFoundException;

public class Expthrows {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	m1();
    }

    public static void m1() throws InterruptedException, FileNotFoundException {
	System.out.println("hello");
	Thread.sleep(3000);

	System.out.println("world");
    }

}