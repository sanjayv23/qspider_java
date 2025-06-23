package marque;

import java.util.Arrays;

public class Isomorphic {

	public static void main(String[] args) {
		System.out.println(Matches("egg","add"));
		System.out.println(Matches("abbe", "ghhr"));
	}
	static boolean Matches(String s,String t) {

		
		//String[] split_s=s.split(" ");
		//System.out.println(Arrays.toString(split_s));
		for(int i=0;i<s.length();i++) {
			char temp=t.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					if(t.charAt(j)==temp) continue;
					else return false;
				}
			}
		}
		return true;
	}
}
