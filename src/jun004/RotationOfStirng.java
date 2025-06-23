package jun004;

import java.util.Scanner;

public class RotationOfStirng {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean found=false;
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		for(int i=1;i<s1.length();i++) {
			String a=s1.substring(0,i);
			String b=s1.substring(i, s1.length());
			String temp=b+a;
			System.out.println("b: "+ b+" a: "+a);
			if(temp.equalsIgnoreCase(s2)) {
				found=true;
				System.out.println("True");
				break;
			}
		}
		if(!found) System.out.println("False");
		
	}
}
