package jan25;
import jan22.Input_2d_array;
public class Multiple_matrix {
	public static void main(String[] args) {
		int[][] a= {{1, 1}, {2, 2}};
		int[][] b= {{1, 1}, {2, 2}};
		int[][] c=multiple(a, b);
		Input_2d_array.print_matrix(c);
		
	}
	public static int[][] multiple(int[][] a,int [][] b){
		int[][] c=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j]+=(a[i][j]*b[k][j]);
				}
			}
		}
		return c;
	}
}
