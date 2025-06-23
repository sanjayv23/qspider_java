package jun14;

public class Laptop implements Comparable{
	String brand;
	double  price;
	public Laptop(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Laptop l1=(Laptop)o;
		if(l1.price==this.price) return  0;
		if(this.price>l1.price) return 1;
		return -1;
	}
	
}
