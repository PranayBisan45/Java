import java.util.Arrays;

public class BasicBank {
	private long accno=9587462165465l;
	private String acname;
	private String dob;
	static int minbal;
	static float roi;
	static int num1;
	private int balance;
	private Transaction t ;
//	private int balanceWithInterest;
	
	static {
		num1=1;
		minbal = 5000;
		roi = 6.05f;
	}
	public long generateAccNo() {
		num1++;
		return accno+num1;
	}
	
 	public BasicBank() {
 	}
 	
 	public BasicBank(String acname, String dob) {
 		this.accno=generateAccNo();
 		this.acname=acname;
 		this.dob = dob;
 		this.balance=minbal;
 	}
 	
	public Transaction getT() {
		return t;
	}

	public void setT(Transaction t) {
		this.t = t;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public long getAccno() {
		return this.accno;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "BasicBank [accno=" + accno + ", acname=" + acname + ", dob=" + dob + ", balance=" + balance + "]";
	}
}