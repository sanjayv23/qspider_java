package Jan6;

public class Pyramid {
	public static void main(String[] args) {
		int n=3;
		//System.out.println("s");
		for(int row=1;row<=n;row++) {
			for(int i=0;i<((2*n-1)-((2*n)-((2*row)-1)))/2;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<((2*n)-((2*row)-1));i++) {
				System.out.print("*");
			}
			for(int i=0;i<((2*n-1)-((2*n)-((2*row)-1)))/2;i++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
}
