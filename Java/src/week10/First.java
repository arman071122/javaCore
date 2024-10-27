package week10;

public class First extends Thread {
    public void run() {
	for (int i = 0; i <= 100; i++)
	    System.out.println(i + " run");
    }
}