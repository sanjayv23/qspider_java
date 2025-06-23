package jun004;

import java.util.Arrays;
import java.util.Scanner;

public class SearchByChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String[] arr=new String[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextLine();
		}
		char ch=scan.nextLine().charAt(0);
		String str=""+ch;
		System.out.println(Arrays.toString(arr));
		for(String s:arr) {
			String temp=""+s.charAt(0);
			if(temp.equalsIgnoreCase(str)) System.out.println(s);
		}
	}
}
