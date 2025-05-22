package may22;

public class Sim {
	private int balance;
	private int phoneNo;
	
	public Sim(int balance, int phoneNo) {
		super();
		this.balance = balance;
		this.phoneNo = phoneNo;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
