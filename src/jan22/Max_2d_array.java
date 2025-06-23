package jan22;

import java.awt.print.Printable;

public class Max_2d_array {
	public static void main(String[] args) {
		int[][] arr= {{3,8,5},{1,6,3},{11,3,7}};
		Input_2d_array.print_matrix(arr);
		max_row(arr);
		max(arr);
		max_col(arr);
		sum_diagonal(arr);
	}
	static void sum_diagonal(int[][] arr) {
		int sum_major=0;
		int sum_minor=0;
		for(int i=0;i<arr.length;i++) {
		
			for(int j=0;j<arr[i].length;j++) {
				if(i==j)sum_major+=arr[i][j];
				if((i+j)==arr[0].length-1) sum_minor+=arr[i][j];
				
			}
			
		}
		System.out.println("sum of all major diagonal element: "+sum_major);
		System.out.println("sum of all minor diagonal element: "+sum_minor);
	}
	static void max_row(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			int max=arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			System.out.println("Maximum of "+i+" row "+max);
		}
	}
	static  void max_col(int[][] arr) {
		for(int i=0;i<arr[0].length;i++) {
			int max=arr[0][i];
			for(int j=0;j<arr.length;j++) {
				if(arr[j][i]>max) {
					max=arr[j][i];
				}
			}
			System.out.println("Maximum of "+i+" col "+max);
		}
	}
	static void max(int[][] arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			
		}
		System.out.println("Maximum of entire matrix: "+max);
	}
}
