package week7;

public class Email {
    private String mailid;
    private String password;

    public Email(String mailid, String password) {
	super();
	this.mailid = mailid;
	this.password = password;
    }

    public Email() {
	super();
    }

    public String getmailid() {
	return mailid;
    }

    public void setmailid(String mailid) {
	this.mailid = mailid;
    }

    public void setpassword(String password) {
	this.password = password;
    }
}
