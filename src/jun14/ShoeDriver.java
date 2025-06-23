package jun14;

import java.util.Arrays;
import java.util.Scanner;

public class ShoeDriver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Shoe s1=new Shoe("sneaker",3500,"S","nike");
		Shoe s2=new Shoe("sports",5500,"M","puma");
		Shoe s3=new Shoe("formal",1500,"L","nike");
		Shoe s4=new Shoe("sneaker",2500,"S","puma");
		Shoe s5=new Shoe("formal",6500,"S","adidas");
		Shoe s6=new Shoe("sports",500,"M","nike");
		Shoe s7=new Shoe("sneaker",8500,"L","adidas");
		
		System.out.println("----------SHOE MARKET---------- ");
		
		
		Shoe[] shoes= {s1,s2,s3,s4,s5,s6,s7};
		//System.out.println("no sort");
		for(Shoe s:shoes) {
			System.out.println(s.type+" "+s.price+" "+s.size+" "+s.brand);
		}
		System.out.println("----------SORT BY CHOICE---------");
		System.out.println("1. BRAND");
		System.out.println("2. TYPE");
		System.out.println("3. SIZE");
		System.out.println("4. PRICE");
		//int ch=scan.nextInt();
		
		System.out.println("brand sort");
		Arrays.sort(shoes,new ShoeBrandComparator());
		//Arrays.sort(shoes,new PriceComparator());
		Shoe[] brand_sort=new Shoe[3];
		int ind=0;
		for(Shoe s:shoes) {
			if(s.brand=="nike") {
				brand_sort[ind++]=s;
				//System.out.println(s.type+" "+s.price+" "+s.size+" "+s.brand);
			}
		}
		Arrays.sort(brand_sort,new PriceComparator());
		for(Shoe s:brand_sort) {
			if(s!=null && s.brand=="nike") {
				//brand_sort[ind++]=s;
				System.out.println(s.type+" "+s.price+" "+s.size+" "+s.brand);
			}
		}
		
		System.out.println("----------------");
		
		System.out.println("Size sort");
		Arrays.sort(shoes,new SizeComparator()); // use factory method
		for(Shoe s:shoes) {
			System.out.println(s.type+" "+s.price+" "+s.size+" "+s.brand);
		}
		System.out.println("----------------");
		
		
		System.out.println("Price sort");
		Arrays.sort(shoes);
		for(Shoe s:shoes) {
			System.out.println(s.type+" "+s.price+" "+s.size+" "+s.brand);
		}
		System.out.println("----------------");
		
		
		System.out.println("type sort");
		Arrays.sort(shoes,new TypeComparator());
		for(Shoe s:shoes) {
			System.out.println(s.type+" "+s.price+" "+s.size+" "+s.brand);
		}
		System.out.println("----------------");
		
	}
}
