package week11;

public class ThreadRunnableLambda {
    public static void main(String[] args) {
	Runnable r1 = () -> {
	    for (int i = 0; i < 5; i++)
		System.out.println("hai");
	};
	Runnable r2 = () -> {
	    for (int i = 0; i < 5; i++)
		System.out.println("hello");
	};
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();
    }
}
