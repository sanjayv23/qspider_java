package may26;
import java.util.*;
public class CabDriver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("BOOKING APPLICATION");
		System.out.println("1. BOOK CAR");
		System.out.println("2. BOOK BIKE");
		System.out.println("3. BOOOK AUTO");
		
		int n=scan.nextInt();
		
		// generalise becoz it can store any of the child class reference
		Cab cab1;
	
                                                                                                      
                                                                             
		switch(n) {
			case 1:{
				cab1=new Car();
				System.out.println("booked car");
				break;
			}
			
			case 2:{
				cab1=new Bike();
				System.out.println("booked bike");
				break;
			}
				
			case 3:{
				cab1=new Auto();
				System.out.println("booked auto");
				break;
			}
			default:{
				System.out.println("WRONG CHOICE");
			}
			
			
		}
		
	}
}
