package may15;

public class BagDriver {
	public static void main(String[] args) {
		Bag b1=new Bag();
		b1.setColor("Green");
		b1.setPrice(2500);
		System.out.println(b1);
		System.out.println("Color: "+b1.getColor());
		System.out.println("PRICE: "+b1.getPrice());
		Bag b2=new Bag();
		System.out.println(b2);
		
		
		b2.setColor("White");
		b2.setPrice(5000);
		System.out.println("Color: "+b2.getColor());
		System.out.println("price: "+b2.getPrice());
		
	}
}
