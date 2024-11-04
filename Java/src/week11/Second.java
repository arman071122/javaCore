package week11;

public class Second {
    int num;

    synchronized void increment() {
	num++;
	System.out.print("Count incremented to " + num + " by " + Thread.currentThread().getName());
	System.out.println();
    }

}
