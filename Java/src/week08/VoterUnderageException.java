package week08;

public class VoterUnderageException extends Exception {

    @Override
    public String getMessage() {
	return "You are Underage";
    }
}
