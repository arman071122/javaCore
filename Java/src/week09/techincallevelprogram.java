package week09;

public class techincallevelprogram {
    public static void main(String[] args) {
	checkPassword("aA1_67", 6);
	checkPassword("a987 abC012", 11);
    }

    static int checkPassword(String str, int x) {
	int alphcount = 0, numcount = 0, special = 0;

	char arr1[] = str.toCharArray();

	// the original code had nested if loops which were problematic, for instance if
	// an uppercase letter is found, it then checks if it is also a special
	// character which is logically incorrect and affects the counting.
	for (int i = 0; i < arr1.length; i++) {
	    if (x >= 4) {
		// added the condition for checking if the starting one is a digit
		if (!(arr1[0] >= '0' && arr1[0] <= '9')) {
		    if (arr1[i] >= 'A' && arr1[i] <= 'Z') {
			alphcount++;
		    }
		    // in the check for / and space the original code is logically wrong
		    if ((arr1[i] == '/' || arr1[i] == ' ')) {
			special++; // if / or space is encountered special is incremented
		    }
		    // added check for the condition that checks for at least 1 number
		    // in the original code charachter array elements are getting compared to
		    // integers 0 to 9
		    if (arr1[i] >= '0' && arr1[i] <= '9') {
			numcount++;
		    }
		}
	    }
	}

	// the original code checks for alphcount is equal to 1, but the question is to
	// check if capital letters appear atleast once, as we are using counter
	// everytime a capital letter is encountered it is incremented that makes it
	// possible to go beyond the value 1 so we shd just check alphcount>0.
	// special condition is right and i have added the condition for at least one
	// number
	if (alphcount > 0 && numcount > 0 && special == 0) {
	    System.out.println("You inputed String " + str + " is a valid password");
	    return 1;
	} else {
	    System.out.println("You inputed String " + str + " is an invalid password");
	    return 0;
	}
    }
}