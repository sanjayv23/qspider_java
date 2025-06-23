package jan9;

import java.util.Scanner;

public class Swap_array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr= {10,20,30,40};
		System.out.println("Before swapping array elements: ");
		print(arr);
		System.out.println();
		System.out.print("enter the index1 to swap: ");
		int a=scan.nextInt();
		System.out.print("enter the index1 to swap: ");
		int b=scan.nextInt();
		swap(a, b, arr);
		System.out.println("after swapping array element: ");
		print(arr);
	}
	public static void print(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int a,int b,int[] arr) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
