package jun14;

import java.util.Arrays;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1=new Laptop("acer",50_000);
		Laptop l2=new Laptop("dell",40_000);
		Laptop l3=new Laptop("lenovo",80_000);
		
		Laptop[] laptops= {l1,l2,l3};
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop.brand +" "+laptop.price);
		}
			System.out.println("------------------------------");
		Arrays.sort(laptops);  // is implict calling that compareto method
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop.brand +" "+laptop.price);
		}
		
		
		Arrays.sort(laptops,new BrandComparator());
		System.out.println("--------------------");
		for (Laptop laptop : laptops) {
			System.out.println(laptop.brand +" "+laptop.price);
		}
		
	}
}
