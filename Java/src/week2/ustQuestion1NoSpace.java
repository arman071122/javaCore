package week2;

public class ustQuestion1NoSpace {
    public static void main(String[] args) {

	String s = "010001000000000000000000000000000000";

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

	if (currZeroes > maxZeroes) { // handles end of string when string ends without any other character than 0
	    maxZeroes = currZeroes;
	}

	System.out.println("Length of longest combination of zeroes is " + maxZeroes);
    }
}
