package jan21;

import java.util.Scanner;

public class Two_d_array {
	public static void main(String[] args) {
		//int[][] a=new int[2][3];
		//[[2,3],[5,6]]
		int subject=3;
		Scanner scan=new Scanner(System.in);
		System.out.println("");
		int sudent=scan.nextInt();
		int[][] a= {{1,2},{3,4}};
		int[][] b= {{4,5,6},{7,2,3}}; 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println(i+" "+j+": "+a[i][j]);
				
			}
		}
	}
}
