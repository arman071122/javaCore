package week8;

public class UnderageException extends Exception {

    @Override
    public String getMessage() {
	return "You are Underage";
    }
}
