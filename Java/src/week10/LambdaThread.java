package week10;

public class LambdaThread {
    public static void main(String[] args) {
	Runnable r = () -> {
	    for (int i = 1; i <= 100; i++) {
		System.out.println("Hi");
	    }
	};
	Thread t = new Thread(r);
	t.start();
    }
}
