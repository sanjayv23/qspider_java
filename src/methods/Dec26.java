package methods;
import java.util.*;
public class Dec26 {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
//		 System.out.print("Enter the number to check even or odd: ");
//		 double num=scan.nextDouble();
//		 System.out.print(num%2==0?"Even number":"od number");
	
		 System.out.println();
		 String str=scan.next();
		 System.out.println("next: "+str);
		 
		 int num=scan.nextInt();
		 System.out.println("num: "+num);
		 //scan.nextLine();
		 String str1=scan.nextLine();
		 System.out.println("nextline: "+str1);
		 
		 System.out.println(oddoreven(45));
		 System.out.println('A');
		 scan.close();
		 
	}
	public static int oddoreven(int n) {
		return (n);
		// System.out.println("erer"); give error has it is unreachable
	}
	
	
}
