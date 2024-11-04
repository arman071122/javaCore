package week11;

class SharedResource {
    private int data = -1;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
	while (hasData) {
	    wait();
	}
	data = value;
	System.out.println("Produced: " + data);
	hasData = true;
	notify();
    }

    public synchronized int consume() throws InterruptedException {
	while (!hasData) {
	    wait();
	}
	System.out.println("Consumed: " + data);
	hasData = false;
	notify();
	return data;
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
	SharedResource sharedResource = new SharedResource();

	Thread producer = new Thread(() -> {
	    for (int i = 1; i <= 5; i++) {
		try {
		    sharedResource.produce(i);
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
		}
	    }
	});

	Thread consumer = new Thread(() -> {
	    for (int i = 1; i <= 5; i++) {
		try {
		    sharedResource.consume();
		    Thread.sleep(6000);
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
		}
	    }
	});

	producer.start();
	consumer.start();
    }
}
