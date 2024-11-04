package week11;

public class First {

    public static void main(String[] args) throws InterruptedException {

	Second s = new Second();

	Runnable r1 = () -> {
	    for (int i = 1; i <= 10; i++) {
		s.increment();
	    }
	};

	Runnable r2 = () -> {
	    for (int i = 1; i <= 10; i++) {
		s.increment();
	    }
	};

	Thread th1 = new Thread(r1, "Thread 1");
	Thread th2 = new Thread(r2, "Thread 2");
	th1.start();
	th2.start();
	th1.join();
	th2.join();
	System.out.println("\n Final count " + s.num);
    }
}
