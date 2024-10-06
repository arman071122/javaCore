package week7;

import java.util.Scanner;

public class Emailobj {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Email e = new Email();
	System.out.println("enter mailid");
	e.setmailid(s.next());
	System.out.println(e.getmailid());
	System.out.println("enter password");
	e.setpassword(s.next());
    }
}