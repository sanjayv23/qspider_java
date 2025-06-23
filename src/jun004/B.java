package jun004;


class B{
	public static void main(String[] args) {
		int a=10,b=20;
		helper(a,b);
		System.out.println(a+" "+b );
	}
	public static void helper(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
}