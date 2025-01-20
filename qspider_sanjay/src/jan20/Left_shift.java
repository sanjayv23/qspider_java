package jan20;

import jan9.search_element;

public class Left_shift {
	public static void main(String[] args) {
		int[] arr= {8,9,11,13,12};
		search_element.print(arr);
		left_shift(arr);
		System.out.println();
		search_element.print(arr);
	}
	static void left_shift(int[] a) {
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	}
}
