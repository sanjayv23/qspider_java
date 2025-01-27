package jan27;

public class Car_object {
	public static void main(String[] args) {
		Car obj1=new Car();
		obj1.brand="Hyundai";
		obj1.model="creta";
		obj1.price=700000;
		obj1.show();
		
		
		Car obj2=new Car();
		obj2.brand="Maruthi";
		obj2.model="Wagon r";
		obj2.price=200000;
		obj2.show();
		
		Car obj3=new Car();
		obj3.brand="BMW";
		obj3.model="M7";
		obj3.price=7000000;
		
		//Car.show(obj3);
		obj3.show();
	}
}	
class Car{
	String brand;
	double price;
	String model;
	public void show() {
		System.out.println("Brand: "+this.brand+" Model: "+this.model+" Price: "+this.price);
		//System.out.println(obj);
	}
}
