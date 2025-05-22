package may21;

public class Mobile {
	private String brand;
	private double price;
	private int ram;
	private Battery battery=new Battery();
	{
		battery.setBattercapacity(5000);
		battery.setType("li-ion");
	}
	public void mobileDetailsDisplay(Mobile m1) {
		System.out.println("Brand: "+m1.brand);
		System.out.println("Price: "+m1.price);
		System.out.println("Ram: "+m1.ram);
	}
	
	public Mobile(String brand, double price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
}
