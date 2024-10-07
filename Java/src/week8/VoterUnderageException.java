package week8;

public class VoterUnderageException extends Exception {

    @Override
    public String getMessage() {
	return "You are Underage";
    }
}
