package week02;

public class ustQuestion1alt {
    public static void main(String[] args) {

	String s = "01000100000000 ";

	int i = 0;
	int maxZeroes = 0;
	int currZeroes = 0;

	while (i <= s.length() - 1) {
	    char a = s.charAt(i);
	    if (a == '0') {
		currZeroes++;
	    } else {
		if (currZeroes > maxZeroes) {
		    maxZeroes = currZeroes;
		}
		currZeroes = 0;
	    }

	    i++;
	}

	System.out.println("Length of longest combination of zeroes is " + maxZeroes);
    }
}
