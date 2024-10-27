package week10;

class MyThread extends Thread {
    public void run() {
	try {
	    System.out.println(Thread.currentThread().getName() + " is running.\n");
	    Thread.sleep(1000);
	    System.out.println(Thread.currentThread().getName() + " is awake after sleep.\n");
	} catch (InterruptedException e) {
	    System.out.println("Thread interrupted: " + e);
	}
    }
}

public class ThreadExample {
    public static void main(String[] args) {
	MyThread thread1 = new MyThread();
	MyThread thread2 = new MyThread();

	thread1.setName("Thread 1");
	thread2.setName("Thread 2");

	thread1.setPriority(Thread.MIN_PRIORITY);
	thread2.setPriority(Thread.MAX_PRIORITY);

	thread1.start();
	thread2.start();

	System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
	System.out.println(thread2.getName() + " priority: " + thread2.getPriority());

	try {
	    System.out.println("\nWaiting for " + thread1.getName() + " to finish...\n");
	    thread1.join();

	    System.out.println("\nWaiting for " + thread2.getName() + " to finish...\n");
	    thread2.join(500);
	} catch (InterruptedException e) {
	    System.out.println("\nThread interrupted: " + e);
	}

	System.out.println("\nBoth threads have finished or timed out.");
    }
}
