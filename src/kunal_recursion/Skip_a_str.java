package kunal_recursion;

public class Skip_a_str {
	public static void main(String[] args) {
		String str="bccappledha"; // skip 'a' char 
		System.out.println("ans: "+skip_ch("apple", str,""));
		System.out.println(('a'+"v"));
	}
	public static String skip_ch(String remove,String str,String ans) {
		if(str.length()<remove.length()) return ans+str.substring(0);
		if(str.substring(0,remove.length()).equals(remove)) {
			return skip_ch(remove, str.substring(remove.length()), ans);
		}
		return skip_ch(remove, str.substring(1),(ans+str.substring(0,1)));
		
		
	}
	
}
