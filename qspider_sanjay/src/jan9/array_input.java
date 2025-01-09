package jan9;

import java.util.Scanner;

public class array_input {
	public static void main(String[] args) {
		Scanner sanjay=new Scanner(System.in);
		int[] arr=new int[4];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sanjay.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		sanjay.close();
	}
}
