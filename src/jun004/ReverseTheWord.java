package jun004;

import java.util.Scanner;

public class ReverseTheWord {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String  s=scan.nextLine();
		System.out.println("str: " +s);
		
		s=s.trim();
		s=" "+s;
		String res="";
		int end=s.length();
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				res+=s.substring(i,end);
				end=i;
			}
		}
		res=res.trim();
		System.out.println("ans: "+res );
		
		
	}
}
