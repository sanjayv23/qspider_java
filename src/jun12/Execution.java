package jun12;

public class Execution {
	public static void main(String[] args) {
		Execution obj=null;
		int a=10,b=0,c=-1;
		System.out.println("main start");
		int[] arr=new int[1];
		try {
			//System.out.println(10/0);
			System.out.println(arr[2]);
			//System.out.println(obj.toString());
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
//			try {
//				c=a/b;
//			}
//			catch(ArithmeticException e1) {
//				e1.printStackTrace();
//			}
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("poda sotta");
			e.printStackTrace();
		}
		System.out.println(c);
		System.out.println("main ends");
	}
}
