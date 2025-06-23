package Jan6;

public class pattern2 {
	public static void main(String[] args) {
		pattern(3);
	}
	public static void pattern(int n) {
//		*   *
//		** **
//		*****
		for(int row=1;row<=n;row++) {	
			for(int col=1;col<=2*n-1;col++) {
				if(row>=col || row+col>=2*n) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern1(int n) {
//		*   *
//		** **
//		*****
		for(int row=1;row<=n;row++) {	
			for(int col=1;col<=2*n-1;col++) {
				if(row>=col ) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
