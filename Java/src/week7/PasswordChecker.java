package week7;

import java.util.Scanner;

public class PasswordChecker {
    public static int CheckPassword(char str[], int n) {
	if (n < 4)
	    return 0;
	if (str[0] >= '0' && str[0] <= '9')
	    return 0;

	boolean hasCapital = false, hasDigit = false;

	for (int i = 0; i < n; i++) {
	    if (str[i] >= '0' && str[i] <= '9')
		hasDigit = true;
	    if (str[i] >= 'A' && str[i] <= 'Z')
		hasCapital = true;
	    if (str[i] == ' ' || str[i] == '/')
		return 0;
	}

	if (hasCapital && hasDigit)
	    return 1;
	else
	    return 0;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter your password : ");
	String password = sc.nextLine();
	char str[] = password.toCharArray();
	int n = str.length;

	int result = CheckPassword(str, n);

	if (result == 0)
	    System.out.println(result);
	else
	    System.out.println(result);
    }
}
