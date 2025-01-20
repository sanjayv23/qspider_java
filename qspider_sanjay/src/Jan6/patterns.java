package Jan6;
import java.util.*;
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
		
		System.out.println("pattern 5:");
		pattern_5(5);
		
		System.out.println("pattern 6:");
		pattern_6(3);
		
		System.out.println("pattern 7:");
		pattern_7(5);
		
		System.out.println("pattern 8:");
		pattern_8(5);
		
		System.out.println("pattern 9:");
		pattern_9(4);

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
	public static void pattern_5(int n) {
//		*
//	    **
//	    ***
//	    ****
//	    *****
//	    ****
//	    ***
//	    **
//	    *
		for(int i=1;i<=(2*n-1);i++) {
			if(i<=5) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=0;j<=((2*n-1)-i);j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void pattern_6(int n) {
		for(int i=1;i<=(2*n-1);i++) {
			if(i<n) {
				//star
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				//space
				for(int j=0;j<(2*n-(2*i));j++) {
					System.out.print(" ");
				}
				//star
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else if(i==n) {
				for(int j=0;j<(2*n);j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=0;j<(2*n-i);j++) {
					System.out.print("*");
				}
				//space
				for(int j=0;j<(2*n)-(2*(2*n-i));j++) {
					System.out.print(" ");
				}
				//star
				for(int j=0;j<(2*n-i);j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}
	public static void pattern_7(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			int cnt=i;int less=0;;
			for(int j=0;j<2*i-1;j++) {
				
				if(cnt==0) {
					less=1;
					cnt=2;
				}
				
				if(less==0) System.out.print(cnt--);
				else System.out.print(cnt++);
			}
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern_8(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			int cnt=i;int less=0;;
			for(int j=0;j<2*i-1;j++) {
				
				if(cnt==0) {
					less=1;
					cnt=2;
				}
				
				if(less==0) System.out.print(cnt--);
				else System.out.print(cnt++);
			}
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		int cnt=4;
		for(int i=1;i<=n-1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			int low=0,temp=cnt;
			for(int j=0;j<(2*n-1-(2*i));j++){
				if(temp==1) {
					low=1;
				}
				if(low==1) System.out.print(temp++);
				else System.out.print(temp--);
			}
			cnt--;
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern_9(int n) {
		for(int row=1;row<=(2*n-1);row++) {
			for(int col=1;col<=(2*n-1);col++) {
				int left=col-1;
				int right=(2*n-1)-col;
				int	top=row-1;
				int bottom=(2*n-1)-row;
				
				
				System.out.print(n-Math.min(Math.min(top, bottom),Math.min(right,left)));
				
			}
			System.out.println();
			
		}
	}
}
