package jan20;

import java.util.Arrays;

import jan9.search_element;

public class Merge_two_array {
	public static void main(String[] args) {
		int[] a= {1,3,5};
		System.out.println("First array: ");
		search_element.print(a);
		System.out.println();
		int[] b= {2,3,1,8};
		System.out.println("Second Array: ");
		search_element.print(b);
		System.out.println();
		int[] c=merge(a, b);
		System.out.println("after merging: ");
		search_element.print(c);
		
	}
	static int[] merge(int[] a,int[] b) {
		int[] c=new int[a.length+b.length];
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				c[k++]=a[i];
				i++;
			}
			else  {
				c[k++]=b[j];
				j++;		
			}
		}
		while(i<a.length) {
			c[k++]=a[i];
			i++;
		}
		while(j<b.length) {
			c[k++]=b[j];
			j++;
		}
		return c;
		
	}
}
