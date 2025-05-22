package may16;

import may15.*; 

public class AtmDriver {
	public static void main(String[] args) {
		Atm obj=new Atm();
		
		obj.setAmount(5000);
		obj.setLocation("Chennai");
		
		int pin=1234;
		if(obj.getAmount(pin)==-1) System.out.println("Wrong Pin");
		else System.out.println("Amount: "+obj.getAmount(pin));
		System.out.println("Location: "+obj.getLocation());
	
		//Bag b1=new Bag();
		
	}
}
