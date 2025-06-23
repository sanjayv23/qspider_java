package jan9;

import java.util.Scanner;

public class search_element {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr= new int[4];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+i+" element: ");
			arr[i]=scan.nextInt();
		}
		System.out.print("Array Elements: ");
		print(arr);
		System.out.println();
		System.out.print("Enter the element to search: ");
		int x=scan.nextInt();		
		 int ind=search(x, arr);
		 if(ind!=-1) System.out.println("Element found at index "+ind);
		 else System.out.println("element not found");
	}
	public static void print(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int search(int x,int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) return i;
		}
		return -1;
	}
}
