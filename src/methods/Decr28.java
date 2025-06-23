package methods;


import java.util.Scanner;

public class Decr28 {
	public static void main(String[] args) {
		System.out.println("main beg");
		
		if(24%2==0) {
			System.out.println("if block");
		}
		
		else if(false) { System.out.println("1st else if");}
		
		else if(true) System.out.println("2nd else if");
		
		else System.out.println("else block"); //optional
		
		System.out.println("main end");
		
		Scanner scan = new Scanner(System.in);
//		String str=scan.next();
//		alpha_or_digit(str.charAt(7));
		
		System.out.println("enter chem:" );
		double chem=scan.nextDouble();
		System.out.println("enter math:" );
		double math=scan.nextDouble();
		System.out.println("enter phy:" );
		double phy=scan.nextDouble();
		System.out.println("enter com:" );
		double com=scan.nextDouble();
		System.out.println("enter bio:" );
		double bio=scan.nextDouble();
		
		percentage(math, chem, phy, bio, com);
		
		
		scan.close();
	}
	public static void alpha_or_digit(char ch) {
		if( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z' ) ) System.out.println("aplhabet");
		else if(ch>='0' && ch<='9') System.out.println("digits");
		else System.out.println("special char");
		
		
	}
	public static void percentage(double math,double chem,double phy,double bio,double comp){
		
		double sum=(double)(math+chem+phy+bio+comp);
		System.out.println(sum);
		double percent=(sum/5.0) ;
		System.out.println(percent);
		if(percent>=90) System.out.println("Grade A");
		else if(percent>=80) System.out.println("Grade B");
		else if(percent>=70) System.out.println("Grade C");
		else if(percent>=60) System.out.println("Grade D");
		else if(percent>=40) System.out.println("Grade E");
		else System.out.println("Grade F");
		
	}
}
