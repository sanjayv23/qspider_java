package jan22;

import java.util.Scanner;

public class Input_2d_array {
	public static void main(String[] args) {
		int[][] arr=scan_matrix();
		print_matrix(arr);
	
	}
	static int[][] scan_matrix() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row=scan.nextInt();
		System.out.print("Enter the col: ");
		int col=scan.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the elements for "+i+" row(each row has "+col+" element): ");
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		return arr;
		//System.out.println("Printing the elements: ");
		//print_matrix(arr);
		
	}
	public static void print_matrix(int[][] arr) {
		System.out.println("Printing of the matrix:");
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(+arr[i][j]+" ");
			}
			System.out.println();
			
			
		}
		
		
	}
	
}
