package methods;

import java.util.Scanner;

public class Dec28_switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		//String s=(num%2==0?"Evennum":"Oddnum");
		switch (num%2) {
			default:
				System.out.println("Odd number");
				break;
			case 0: 
				System.out.println("Even number");
				break;
			
		}
		String str=scan.next();
		vowels_or_constants(str.charAt(0));
		scan.close();
	}
	public static void vowels_or_constants(char ch) {
		
		if( ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) System.out.println("vowels");
		else System.out.println("constants");
		
		
	}
	
}
