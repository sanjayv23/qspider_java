package jan21;

public class Second_max {
	public static void main(String[] args) {
		int[] a= {4,11,14,13,14,13,9};
		System.out.print("second max: "+find_second_max(a));
	}
	private static int find_second_max(int[] a) {
		// TODO Auto-generated method stub
		int max=a[0];
		int second_max=Integer.MAX_VALUE;
		for(int x:a) {
			if(x>max) {
				second_max=max;
				max=x;
			}
			if(x<max && x>second_max) {
				second_max=x;
			}
			
		}
		
		System.out.println("max:"+max);
		return second_max;
	}
}
