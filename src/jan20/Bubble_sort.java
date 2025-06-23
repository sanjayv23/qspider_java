package jan20;

public class Bubble_sort {
	public static void main(String[] args) {
		int[] a= {23,2,63,5,89,45,3};
		System.out.println("Before sorting:");
		for(int x:a) {
			System.out.print(x+" ");
		}
		bubble_sort(a);
		System.out.println();
		System.out.println("after sorting:");
		for(int x:a) {
			System.out.print(x+" ");
		}
 	}
	static void bubble_sort(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			int swap=0;
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					swap=1;
					swap_ele(j,a);
				}
			}
			if(swap==0) {
				
				break;
			}	
		}
	}
	static void swap_ele(int j, int[] a) {
		int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		
	}
}
