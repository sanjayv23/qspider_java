package marque;

import java.util.*;


public class Pattern_Problem {
	public static void main(String[] args) {
		System.out.println(Matches("abba","dog cat cat dog"));

		System.out.println(Matches("abba","dog cat cat fish"));
		
		System.out.println(Matches("aaaa","dog cat cat dog"));
		
		System.out.println(Matches("abba","dog cat cat dog"));
	}
	static boolean Matches(String pattern,String s) {

		
		String[] split_s=s.split(" ");
		System.out.println(Arrays.toString(split_s));
		for(int i=0;i<pattern.length();i++) {
			String temp=split_s[i];
			for(int j=i+1;j<pattern.length();j++) {
				if(pattern.charAt(i)==pattern.charAt(j)) {
					if(split_s[j].equals(temp)) continue;
					else return false;
				}
			}
		}
		return true;
	}
	
}
