package week10;

public class RunWalk {
    public static void main(String[] args) throws InterruptedException {
	First f = new First();
	Second s = new Second();
	Thread t1 = new Thread(f);
	Thread t2 = new Thread(s);
	t1.start();
	t2.start();
    }
}
