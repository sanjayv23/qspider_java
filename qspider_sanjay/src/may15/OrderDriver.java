package may15;

public class OrderDriver {
	public static void main(String[] args) {
		Order obj1=new Order();
		obj1.setPayment("GPay");
		obj1.setPrice(60000);
		obj1.setProductId("twqeh76321575");
		obj1.setProductName("Camera");
		
		System.out.println("Product Name: "+obj1.getProductName());
		System.out.println("PRoduct Id: "+obj1.getProductId());
		System.out.println("Payment Type: "+obj1.getPayment());
		System.out.println("Price: "+obj1.getPrice());
		
		System.out.println();
		
		Order obj2=new Order();
		obj2.setPayment("Cash On Delivery");
		obj2.setPrice(52000);
		obj2.setProductId("5r5t45wwe5");
		obj2.setProductName("Gopro_hero11");
		
		System.out.println("Product Name: "+obj2.getProductName());
		System.out.println("PRoduct Id: "+obj2.getProductId());
		System.out.println("Payment Type: "+obj2.getPayment());
		System.out.println("Price: "+obj2.getPrice());
	}
}
