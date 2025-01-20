package jan20;

import java.util.Scanner;

public class remove_based_on_val {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,3};
		System.out.println("before removing: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		Scanner scan=new Scanner(System.in);
		System.out.println();
		System.out.print("enter the val to remove: ");
		int ind=scan.nextInt();
		int[] b=remove(a,ind);
		System.out.println();
		System.out.println("after removing: ");
		for(int x:b) {
			System.out.print(x+" ");
		}
		scan.close();
	}
	static int[] remove(int[] a,int val) {
		int cnt=Frequency_ele.frequency(a, val);
		int[] b=new int[a.length-cnt];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=val) b[j++]=a[i];
		}
		return b;
	}
}
