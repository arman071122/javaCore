package week03;

public class FinalizeExample {
    public static void main(String[] args) {
	FinalizeExample obj = new FinalizeExample();

	// Make obj eligible for garbage collection
	obj = null;

	// Requesting JVM to run Garbage Collector
	System.gc();

	System.out.println("End of main method.");
    }

    // finalize() method without @Override annotation
    protected void finalize() {
	System.out.println("finalize() method called before object is collected");
    }
}
