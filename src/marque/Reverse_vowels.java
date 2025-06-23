package marque;

import java.util.Arrays;

public class Reverse_vowels {
	public static void main(String[] args) {
		System.out.println("SDs");
		System.out.println(Reverse("leetcode"));
		System.out.println(Reverse("IceCreAm"));
		System.out.println();
		System.out.println(ReverseTwoPointer("leetcode"));
		System.out.println(ReverseTwoPointer("IceCreAm"));
	}
	
	static String Reverse(String str) {
		String s=new String(str);
		String res="";
		char[] vowels=new char[str.length()];
		int ind=0;
		int l=0;
		while(l<str.length()) {
			if(IsVowels(str.charAt(l))) vowels[ind++]=str.charAt(l);
			l++;
		} 
		System.out.println(Arrays.toString(vowels)+" ind:"+ind);
		ind--;
		//int cnt=vowels.length-1;
		for(int i=0;i<str.length();i++) {
			if(!IsVowels(str.charAt(i))) res+=str.charAt(i);
			else {
				res+=vowels[ind--];
			}
		}
		return res;
	}
	static String ReverseTwoPointer(String str) {
		StringBuilder s=new StringBuilder(str);
		int l=0,r=s.length()-1;
		
		while(l<=r) {
			if(!IsVowels(s.charAt(l))) l++;
			if(!IsVowels(s.charAt(r))) r--;
			if(IsVowels(s.charAt(l)) && IsVowels(s.charAt(r))) {
				char ch=s.charAt(l);
				s.setCharAt(l, s.charAt(r));
				s.setCharAt(r, ch);
				l++;
				r--;
			}
		}
		return s.toString();
	}
	
	static boolean IsVowels(char ch) {
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') return true;
		return false;
	}
}

