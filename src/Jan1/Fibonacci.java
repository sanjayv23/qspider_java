package Jan1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int num = scan.nextInt();
		fibonacci(num);
		scan.close();
	}
	public static void fibonacci(int num) {
		int i;
		int num1=0;
		int num2=1;
		int res;
		System.out.println("The first "+num+" fibonacci series  is");
		for(i=1;num>=i;i++) {
			System.out.println(num1);
			res = num1+num2;
			num1=num2;
			num2=res;
		}
	}
}
