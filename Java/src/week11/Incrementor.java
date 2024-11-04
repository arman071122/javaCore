package week11;

public class Incrementor {
    int num;

    void increment() {
	synchronized (this) {
	    num++;
	    System.out.print("Count incremented to " + num + " by " + Thread.currentThread().getName());
	    System.out.println();
	}
    }
}
