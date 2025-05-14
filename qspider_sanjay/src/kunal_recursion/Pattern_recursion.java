package kunal_recursion;

public class Pattern_recursion {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
		pattern1(4, 0);
		System.out.println();
		System.out.println("Patttern 2");
		pattern2(4, 0);
	}
	public static void pattern1(int r,int c) {
		if(r==0) return;
		if(c<r) {
			pattern1(r, c+1);
			System.out.print("*");
 		}
		else {
			pattern1(r-1, 0);
			System.out.println();
		}
	}
	public static void pattern2(int r,int c) {
		if(r==0) return;
		if(c<r) {
			System.out.print("*");
			pattern2(r, c+1);
			
			
 		}
		else {
			System.out.println();
			pattern2(r-1, 0);
			
		}
	}
}
