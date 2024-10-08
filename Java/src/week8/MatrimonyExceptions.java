package week8;

public class MatrimonyExceptions extends Exception {
    public MatrimonyExceptions(String message) {
	super(message);
    }
}

class Underage extends MatrimonyExceptions {
    public Underage() {
	super("You are underage to marry");
    }
}

class Overage extends MatrimonyExceptions {
    public Overage() {
	super("You are overage to marry");
    }
}
