package jun004;

public class Palindrome {
	public static void main(String[] args) {
		String str="                 Madam, in eden, I'm Adam4841548423!@$^^&";
		
		//String str="Was it a car or a cat I saw";
		str=str.toLowerCase();
		
		String res="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') res+=str.charAt(i);
		}
		
		String temp="";
		for(int i=res.length()-1;i>=0;i--) {
			temp+=res.charAt(i);
		}
		
		
		
		System.out.println(res.equals(temp));
		
	}
}
