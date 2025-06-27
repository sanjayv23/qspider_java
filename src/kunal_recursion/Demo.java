package kunal_recursion;

public class Demo {
	public static void main(String[] args) {
		System.out.println(sanjay(5));
	}
	
	static int sanjay(int n) {
		if(n==0) return 1;
		return sanjay(n-1)*++n;
	}
}
