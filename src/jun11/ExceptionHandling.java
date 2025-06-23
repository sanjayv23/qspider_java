package jun11;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		ExceptionHandling obj=null;
		System.out.println("main strt");
		try {
			c=a/b;
			System.out.println(obj.toString());
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		//System.out.println(c);
		System.out.println("main end");
	}
}
