package week9;

public class ndjk {
    public static void main(String[] args) {

	System.out.println(checkPassword("aA1_67", 6));
	System.out.println(checkPassword("a987 abC012", 11));
    }

    static int checkPassword(String str, int x) {
	int alphcount = 0;
	int special = 0;
	int count = 0;
	int start = 0;

	char arr1[] = str.toCharArray();

	for (int i = 0; i < arr1.length; i++) {
	    if (x >= 4) {
		if (arr1[i] >= 'A' && arr1[i] <= 'Z') {
		    alphcount++;
		    System.out.println("helo");
		    if (arr1[i] != '/' && arr1[i] != ' ') {
			special++;
			System.out.println("oiii");
			if (arr1[0] >= 0 && arr1[0] <= 9) {
			    start++;
			    System.out.println("oyyyy");
			}
		    }
		}
	    }
	}

	if (alphcount == 1 && special == 0 && start == 0) {
	    System.out.println("You inputed String " + str + " is a valid password");
	    return 1;
	} else {
	    System.out.println("You inputed String " + str + " is a invalid password");
	    return 0;
	}

    }
}