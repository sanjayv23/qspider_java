package jun12;


public class Practice {
	
	void vimal() throws ArithmeticException  {
		System.out.println("vimal st");
		int c=10/0;
		System.out.println("vimal end");
	}
	void hari() throws ArithmeticException  {
		System.out.println("hari st");
		vimal();
		System.out.println("hari end");
	}
	void dixith() throws ArithmeticException   {
		System.out.println("dixith st");
		hari();
		System.out.println("dixith end");
	}
	public static void main(String[] args)   {
		Practice obj=new Practice();
		System.out.println("main st");
		obj.dixith();
		System.out.println("main end");
	}
}
