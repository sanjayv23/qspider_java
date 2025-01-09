package Jan6;

public class patterns {
	public static void main(String[] args) {
		int n=5;
		System.out.println("pattern 1:");
		pattern_1(n);
		
		System.out.println("pattern 2:");
		pattern_2(n);
		
		System.out.println("pattern 3:");
		pattern_3(3);
		
		System.out.println("pattern 4:");
		pattern_4(3);
		
		

	}
	public static void pattern_1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if( (row==(n/2)+1) || (col==(n/2)+1) ) {
					if(row==col) System.out.print("#");
					else System.out.print("*");
					
				}
				else System.out.print(" ");
				
				
			}
			System.out.println();
		}
	}
	public static void pattern_2(int n) {
		for(int row=1;row<=n;row++) {
			int stars=(row<=((n/2)+1)?(2*row-1):(2*(n-row)+1));
			int space=(n-stars)/2;
			for(int i=0;i<space;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<stars;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern_3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=(2*n-1);col++) {
				if(row>=col || row+col>=2*n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}
	public static void pattern_4(int n) {
		for(int row=1;row<=n;row++) {
			
			int star=((2*n-1)-n-row);
			int space=(2*n-1)-star;
				for(int i=0;i<star;i++) {
					System.out.print("*");
				}
				for(int i=0;i<space;i++) {
					System.out.print(" ");
				}
				for(int i=0;i<star;i++) {
					System.out.print("*");
				} 
			System.out.println();
		}
	}
}
