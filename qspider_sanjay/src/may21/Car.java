package may21;

public class Car {
	private String color;
	private int price;
	private int mileage;
	// non static initializer
	private Engine e1=new Engine("1200cc","V8");
	private Radio radio;
	
	
	public Engine getE1() {
		return e1;
	}
	public void setE1(Engine e1) {
		this.e1 = e1;
	}
	
	public Car(String color, int price, int mileage) {
		super();
		this.color = color;
		this.price = price;
		this.mileage = mileage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
}
