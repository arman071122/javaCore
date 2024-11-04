package week11;

public class IncrePgm {
    public static void main(String[] args) throws InterruptedException {
	Incrementor in = new Incrementor();

	Runnable r1 = () -> {
	    for (int i = 1; i <= 100; i++) {
		in.increment();
	    }
	};

	Runnable r2 = () -> {
	    for (int i = 1; i <= 100; i++) {
		in.increment();
	    }
	};

	Thread th1 = new Thread(r1, "Thread 1");
	Thread th2 = new Thread(r2, "Thread 2");
	th1.start();
	th2.start();
	th1.join();
	th2.join();
	System.out.println("\n Final count " + in.num);
    }
}
