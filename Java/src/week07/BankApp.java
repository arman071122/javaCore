package week07;

import java.util.Scanner;

class BankAccount {
    private String email;
    private String password;
    private int balance;

    public BankAccount(String email, String password) {
	this.email = email;
	this.password = password;
	this.balance = 0;
    }

    public boolean login(String email, String password) {
	return this.email.equals(email) && this.password.equals(password);
    }

    public void checkBalance() {
	System.out.println("Current balance: Rs " + balance);
    }

    public void withdraw(int amount) {
	if (amount <= balance) {
	    balance -= amount;
	    System.out.println("Withdrawal success. Amount withdrawn: Rs " + amount);
	} else {
	    System.out.println("Insufficient balance.");
	}
    }

    public void deposit(int amount) {
	balance += amount;
	System.out.println("Deposit success. Amount deposited: Rs " + amount);
    }
}

public class BankApp {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("\nSign-Up\n");
	System.out.print("Enter your email: ");
	String email = scanner.nextLine();
	System.out.print("Enter your password: ");
	String password = scanner.nextLine();

	BankAccount bankapp = new BankAccount(email, password);
	System.out.println("Sign-up successful!\n");

	boolean loggedIn = false;
	while (!loggedIn) {
	    System.out.println("\nLogin\n");
	    System.out.print("Enter your email: ");
	    String loginEmail = scanner.nextLine();
	    System.out.print("Enter your password: ");
	    String loginPassword = scanner.nextLine();

	    if (bankapp.login(loginEmail, loginPassword)) {
		System.out.println("Login successful!\n");
		loggedIn = true;
	    } else {
		System.out.println("Invalid email or password. Try again.\n");
	    }
	}

	int ch;
	do {
	    System.out.println("\nBanking Menu");
	    System.out.println("1. Check Balance");
	    System.out.println("2. Withdraw");
	    System.out.println("3. Deposit");
	    System.out.println("4. Exit");
	    System.out.print("Choose an option: ");
	    ch = scanner.nextInt();

	    switch (ch) {
	    case 1:
		bankapp.checkBalance();
		break;
	    case 2:
		System.out.print("Enter amount to withdraw: ");
		int amount = scanner.nextInt();
		bankapp.withdraw(amount);
		break;
	    case 3:
		System.out.print("Enter amount to deposit: ");
		int depositAmount = scanner.nextInt();
		bankapp.deposit(depositAmount);
		break;
	    default:
		if (ch == 4)
		    System.out.println("\n Thank u !!!");

		else
		    System.out.println("Invalid Input \n");
	    }
	} while (ch < 4);
    }
}
