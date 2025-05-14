package jan27;

public class Java_hw {
	public static void main(String[] args) {
		//System.out.println("s");
		car_maker obj=new car_maker("hyundai",700000,"creta");
		obj.display();
		
	}
}
class car_maker{
	String brand;
	int price;
	String model;
	public car_maker(String brand,int price,String model) {
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void display() {
		System.out.println("Brand: "+brand);
		System.out.println("price: "+price);
		System.out.println("Model: "+model);
		System.out.println("======================");
		
		
	}
}
