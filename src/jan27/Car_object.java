package jan27;

public class Car_object {
	public static void main(String[] args) {
		Car_make obj1=new Car_make();
		obj1.brand="Hyundai";
		obj1.model="creta";
		obj1.price=700000;
		obj1.show();
		
		
		Car_make obj2=new Car_make();
		obj2.brand="Maruthi";
		obj2.model="Wagon r";
		obj2.price=200000;
		obj2.show();
		
		Car_make obj3=new Car_make();
		obj3.brand="BMW";
		obj3.model="M7";
		obj3.price=7000000;
		
		//Car.show(obj3);
		obj3.show();
	}
}	
class Car_make{
	String brand;
	double price;
	String model;
	public void show() {
		System.out.println("Brand: "+brand+" Model: "+model+" Price: "+price);
		//System.out.println(obj);
	}
}
