package week11;

public class ThreadLambda {
    public static void main(String[] args) throws InterruptedException {

	Thread t1 = new Thread(() -> {
	    for (int i = 0; i < 5; i++)
		System.out.println("hai");
	});
	Thread t2 = new Thread(() -> {
	    for (int i = 0; i < 5; i++)
		System.out.println("hello");
	});

	t1.start();
	t2.start();
    }
}
