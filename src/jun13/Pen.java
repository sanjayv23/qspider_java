package jun13;

import java.util.Objects;

public class Pen {
	int price;
	
	public Pen(int price) {
		super();
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Pen p=(Pen)obj;
		return this.price==p.price;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(price);
	}
	public static void main(String[] args) {
		Pen p1=new Pen(10);
		Pen p2=new Pen(10);
		Pen p3=p1;
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode()==p2.hashCode());
	}
}
