package jun14;

public class Shoe implements Comparable {
	String type;
	int price;
	String size;
	String brand;
	public Shoe(String type, int price,String size, String brand) {
		super();
		this.type = type;
		this.price = price;
		this.size = size;
		this.brand = brand;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Shoe s1=(Shoe)(o);
		return this.price-s1.price;
	}
	
	
}
