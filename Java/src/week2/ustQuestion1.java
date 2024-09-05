//java program to give the longest combination of zeroes in a string s="00100001000"

package week2;

public class ustQuestion1 {
    public static void main(String[] args) {

	String s = "0100000000000010000000000000000000000 ";

	int i = 0;
	String maxZeroes = "";
	String currZeroes = "";

	while (i <= s.length() - 1) {
	    char a = s.charAt(i);
	    if (a == '0') {
		currZeroes += s.charAt(i);
	    } else {
		if (currZeroes.length() > maxZeroes.length()) {
		    maxZeroes = currZeroes;
		}
		currZeroes = "";
	    }

	    i++;
	}
	System.out.println("Length of longest combination of zeroes is " + maxZeroes.length());
    }
}
