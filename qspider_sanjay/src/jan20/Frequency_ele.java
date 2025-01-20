package jan20;

import java.util.Scanner;

public class Frequency_ele {
	public static void main(String[] args) {
		int[] num={8,6,3,8,1,8};
		for(int x:num) {
			System.out.print(x+" ");
		}
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the number to find frequency: ");
		int n=scan.nextInt();
		int cnt=frequency(num, n);
		if(cnt==0) System.out.print("no element of "+n+" is found...");
		else System.out.print("number of frequency of "+n+" is: "+cnt);
		scan.close();
		
	}
	static int frequency(int[] num,int n) {
		int cnt=0;
		for(int x:num) {
			if(x==n) cnt++;
		}
		return cnt;
		
	}
}
