package jan9;

import java.util.Scanner;

public class mini_array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr= new int[4];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+i+" element: ");
			arr[i]=scan.nextInt();
		}
		System.out.print("Array Elements: ");
		search_element.print(arr);
		System.out.println();
		System.out.print("minimum value in the array: "+mini(arr));
		
	}
	public static int mini(int[] arr) {
		int mini=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<mini) mini=arr[i];
		}
		return mini;
	}
}
