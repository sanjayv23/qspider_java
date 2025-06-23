package jan9;

public class right_shift {
	public static void main(String[] args) {
		int[] arr= {8,9,11,13,12};
		search_element.print(arr);
		right(arr);
		System.out.println();
		search_element.print(arr);
	}
	public static void right(int[] arr) {
		int temp=arr[arr.length-1];
		
		int t1=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			int t2=arr[i+1];	
			arr[i+1]=t1;
			t1=t2;
		}
		arr[0]=temp;
	}
}
