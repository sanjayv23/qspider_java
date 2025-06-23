package may15;

public class Driver {
	public static void main(String[] args) {
		Branch obj=new Branch();
		
		// obj2.managerName="sanjay"; ---> not visible because of visibility
		obj.setIfscCode("211422106382");
		obj.setManagerName("Smith");
		System.out.println("IFSC CODE: "+obj.getIfscCode());
		System.out.println("MANANGER NAME: "+obj.getManagerName());
	}
}
