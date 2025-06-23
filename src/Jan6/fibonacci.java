package Jan6;

public class fibonacci {
	public static void main(String[] args) {
		int n=6;
		int first=0,second=1;
		System.out.print(first+" "+second+" ");
		for(int i=0;i<n;i++) {
			int temp=first+second;
			System.out.print(temp+" ");
			first=second;
			second=temp;
					
			
		}
	}
}
