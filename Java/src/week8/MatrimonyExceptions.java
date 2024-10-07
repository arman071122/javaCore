package week8;

public class MatrimonyExceptions extends Exception {
    public MatrimonyExceptions(String message) {
	super(message);
    }
}

class MenUnderage extends MatrimonyExceptions {
    public MenUnderage() {
	super("You are underage to marry");
    }
}

class MenOverage extends MatrimonyExceptions {
    public MenOverage() {
	super("You are overage to marry");
    }
}

class WomenUnderage extends MatrimonyExceptions {
    public WomenUnderage() {
	super("You are underage to marry");
    }
}

class WomenOverage extends MatrimonyExceptions {
    public WomenOverage() {
	super("You are overage to marry");
    }
}
