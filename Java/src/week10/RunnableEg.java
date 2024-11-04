package week10;

class myRunnable implements Runnable {
    @Override
    public void run() {
	System.out.println("Running implemented from Runnable");
    }
}

public class RunnableEg {
    public static void main(String[] args) {
	myRunnable thread = new myRunnable();
	thread.run();
    }
}
