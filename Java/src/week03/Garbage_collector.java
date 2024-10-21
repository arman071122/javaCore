package week03;

public class Garbage_collector {
    public static void main(String[] args) {
	Garbage_collector obj = new Garbage_collector();

	// Make obj eligible for garbage collection
	obj = null;

	// Requesting JVM to run Garbage Collector
	System.gc();

	System.out.println("Garbage Collection requested.");
    }

    // finalize() method without @Override annotation
    protected void finalize() {
	System.out.println("Object is being garbage collected");
    }
}
