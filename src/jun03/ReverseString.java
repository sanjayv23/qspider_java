package jun03;

public class ReverseString {
	
	public static String reverse(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		return res;
	}
	
	public int[] count(String s) {
			int[] res=new int[2];
			s=s.toLowerCase();
			
			
	}
	public static void main(String[] args) {
		String s="yajnas";
		System.out.println(reverse(s));
		
	}

}
