package Jan4;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("Pattern");
		pattern8();
		System.out.println("hi");
		
	}
	
	public static void pattern1() {
		int cnt=1;
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(cnt++);
			}
			System.out.println();
		}
	}
	
	public static void pattern2() {
		char ch='A';
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
	
	public static void pattern3() {
		
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}
	public static void pattern4() {
		int cnt=01;
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(cnt<=9) System.out.print("0"+cnt++ +" ");
				else System.out.print(cnt+++" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern5() {
		int cnt=1;
		char ch='A';
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				if(row%2!=0) System.out.print(cnt++ +" ");
				else System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern6() {
		
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				System.out.print(col +" ");
				
			}
			System.out.println();
		}
	}
	
	public static void pattern7() {
		
		char ch='A';
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				if(row%2!=0) System.out.print(col +" ");
				else System.out.print(ch+++" "); 
			}
			System.out.println();
		}
	}
	
	public static void pattern8() {
		
		char ch='A';
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				if(row%2!=0) System.out.print(row +" ");
				else System.out.print(ch+++" "); 
			}
			System.out.println();
		}
	}
}
