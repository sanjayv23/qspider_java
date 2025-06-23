package jan27;

public class Object_creation {
	String brand;
	String ram;
	double price;
	public void show(Object_creation obj) {
		System.out.println("outside main");
		System.out.println("Brand: "+obj.brand);
		System.out.println("Price: "+obj.price);
		System.out.println("Ram: "+obj.ram);
	}
	public static void main(String[] args) {
		Object_creation obj=new Object_creation();
		
		obj.brand="Realme";
		obj.price=8000;
		obj.ram="64gb";
		obj.show(obj);
		System.out.println("In main: ");
		System.out.println("Brand: "+obj.brand);
		System.out.println("Price: "+obj.price);
		System.out.println("Ram: "+obj.ram);
	}
}
