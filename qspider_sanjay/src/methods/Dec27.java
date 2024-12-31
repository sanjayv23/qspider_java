package methods;
import java.util.Scanner;
public class Dec27 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=scan.nextInt();
		if(num%10==0) System.out.println("number end with 0");
		else System.out.println("number not end with 0");
		
		
		System.out.println("Enter the three angles of triangle: ");
		System.out.print("Enter 1st angle: ");
		int num1=scan.nextInt();
		System.out.print("Enter 2nd angle: ");
		int num2=scan.nextInt();
		System.out.print("Enter 3rd angle: ");
		int num3=scan.nextInt();
		valid_triangle(num1, num2, num3);
		largest_three(100,22,330);
		
		System.out.println(leap_not(1230));
		
		scan.close();
		
	}
	
	public static String leap_not(int year) {
		//String ch;
		if( (year%4==0 && year%100!=0) || year%400==0	)return "LeapYear";
		return "NonLeapYear";
	}
	public static void largest_three(int a,int b,int c) {
		if(a>b && a>c) {
		
			System.out.println(a+" is the largest");
			return;
			
		}
		if(b>a && b>c) {
			System.out.println(b+" is the largest");
			return;
		}
		if(c>a && c>b) {
			System.out.println(c+" is the largest");
			return;
		}
		System.out.println("large");
	}
	public static void valid_triangle(int num1,int num2,int num3) {
		int sum=num1+num2+num3;
		if(sum==180) {
			System.out.println("Entered triangle is valid");
			return;
		}
		System.out.println("Entered triangle is not valid");
		
	}
}
