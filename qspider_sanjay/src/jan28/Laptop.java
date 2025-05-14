package jan28;

public class Laptop {
	String brand;
	int price;
	String model;
	public void set_value(String brand,int price,String model ) {
		this.brand=brand;
		this.price=price;
		this.model=model;                                             
	}
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	public Laptop(String brand,int price,String model ) {
		this.brand=brand;
		this.price=price;
		this.model=model;                 
		
	}
	public void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args) {
		Laptop obj=new Laptop();
		obj.set_value("Lenove", 350000, "Ideapad");	
		obj.display();
	}
}
