package kunal_recursion;

public class Skip_a_char {
	public static void main(String[] args) {
		String str="bacccad"; // skip 'a' char 
		System.out.println("ans: "+skip_ch('c', str,""));
	}
	public static String skip_ch(char ch,String str,String ans) {
		if(str.length()==0) return ans;
		if(str.charAt(0)==ch) {
			return skip_ch(ch, str.substring(1), ans);
		}
		return skip_ch(ch, str.substring(1),( ans+str.subSequence(0,1)));
		
		
	}
}
