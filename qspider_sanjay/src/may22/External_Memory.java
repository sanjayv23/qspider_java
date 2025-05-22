package may22;

public class External_Memory {
	private String brand;
	private int price;
	private int capacity;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public External_Memory(String brand, int price, int capacity) {
		super();
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;
	}
	
	
}
