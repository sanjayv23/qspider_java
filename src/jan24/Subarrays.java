package jan24;

public class Subarrays {
	public static void main(String[] args) {
		int[] arr= {8,9,5,3,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				print_array(arr, i, j);
				System.out.println();
			}
		}
	
	}
	
	

	public static void print_array(int[] arr,int st,int end) {
		for(int i=st;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
