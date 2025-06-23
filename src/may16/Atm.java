package may16;

public class Atm {
	private int amount;
	private String location;
	private int correctPin=1234;
	public void setAmount(int amount) {
		this.amount=amount;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public int getAmount(int pin) {
		int temp=pin;
		int count=0;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		if(count==4) {
			
			if(pin==correctPin) return this.amount;
			return -1;
		}
		
		return -1;
	}
	public String getLocation() {
		return this.location;
	}
}
