package jan20;

public class Reverse_arr {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		System.out.println("before reverse: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		reverse_only_even(a);
		System.out.println();
		System.out.println("after reverse: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	static void reverse(int[] a) {
		int last=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			swap(i,last-i,a);
		}
	}
	static void reverse_only_even(int[] a) {
		int last=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			if(i%2==0) swap(i,last-i,a);
		}
	}
	static void reverse_secondhalf(int[] a) {
		int last=a.length-1;
		int start=a.length/2;
		for(int i=start,cnt=0;cnt<(a.length-start)/2;i++,cnt++) {
			swap(i,last-cnt,a);
			//break;
			
		}
	}
	private static void swap(int i, int j, int[] a) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
