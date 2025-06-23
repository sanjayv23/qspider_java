package jan22;

public class Prime_number {
	public static void main(String[] args) {
		System.out.println(primechecker(71));
	}
	static boolean primechecker(int n) {
		if(n<=1) return false;
		for(int i=2;i<n;i++) {
			System.out.println(n%i);
			if(n%i==0) return false;
		}
		return true;
	}
}
