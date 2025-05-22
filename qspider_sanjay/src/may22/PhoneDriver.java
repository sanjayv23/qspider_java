package may22;

public class PhoneDriver {
	public static void main(String[] args) {
		Phone ph=new Phone("M35","grey",15000);
		
		System.out.println(ph.getModel()+" "+ph.getColor()+" "+ph.getPrice());
		System.out.println(ph.getExternalMemory() +" "+ ph.getExternalMemory().getBrand()+ " " + ph.getExternalMemory().getCapacity() +" "+ ph.getExternalMemory().getPrice()) ;
		
		//lazy instantiation 
		ph.createSim(249,1234567890);
		System.out.println(ph.getSim().getBalance()+" " +ph.getSim().getPhoneNo());
		
	}
}
