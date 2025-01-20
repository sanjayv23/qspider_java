package jan20;

import java.util.Scanner;

public class Remove_element {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		System.out.println("before removing: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the index to remove: ");
		int ind=scan.nextInt();
		int[] b=remove(a,ind);
		System.out.println();
		System.out.println("after reverse: ");
		for(int x:b) {
			System.out.print(x+" ");
		}
	}

	private static int[] remove(int[] a, int ind) {
		// TODO Auto-generated method stub
		int[] b=new int[a.length-1];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(i!=ind) b[j++]=a[i];
		}
		return b;
		
	}
	
}
