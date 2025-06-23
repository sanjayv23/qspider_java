package jan24;

import java.util.Arrays;

public class For_each_print_matrix {
	public static void main(String[] args) {
		int[][] grid= {{1,2,3},{4,5,6},{7,8,9}};
		matrix(grid);
		System.out.println(Arrays.deepToString(grid));
	}
	public static void matrix(int[][] grid) {
		for(int[] row:grid) {
			for(int ele:row) {
				System.err.print(ele+" ");
			}
			System.err.println();
		}
	}
}
