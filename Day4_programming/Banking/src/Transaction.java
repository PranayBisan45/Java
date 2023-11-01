import java.time.LocalDateTime;

public class Transaction extends BasicBank{

	private LocalDateTime Date;
	private double deposite;
	private double withdrawal;

	public Transaction() {
		super();
	}

	public Transaction(LocalDateTime Date,double deposite,double withdrawal) {
		this.Date=Date;
		this.deposite=deposite;
		this.withdrawal=withdrawal;
	}

	public LocalDateTime getDate() {
		return Date;
	}

	public void setDate(LocalDateTime date) {
		Date = date;
	}
	

	public double getDeposite() {
		return deposite;
	}

	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}

	public double getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(double withdrawal) {
		this.withdrawal = withdrawal;
	}

	@Override
	public String toString() {
		return "Transaction [Date=" + Date + ", deposited amount=" + deposite + ", withdrawal amount=" + withdrawal;
	}

	

}
