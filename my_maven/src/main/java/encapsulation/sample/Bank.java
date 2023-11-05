package encapsulation.sample;

public class Bank {
	
	private String accName;
	private float balance;
	
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void calculateInterest() {
		float interest = (balance*3*7)/100;
		balance = interest + balance;
	}

}
