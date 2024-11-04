package week11;

public class VowelNotFoundException extends Exception {
    @Override
    public String getMessage() {
	return "No Vowels in the String";
    }
}
