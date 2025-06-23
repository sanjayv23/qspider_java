package jun12;import java.nio.channels.FileLockInterruptionException;

public class ExecutionPropagation {
	
	void vimal()  {
		System.out.println("vimal st");
		try{
			System.out.println("st try");
			 Thread.sleep(0);
			 
			System.out.println("end try");
		}
		catch(InterruptedException e) {
			System.out.println("error");
			e.printStackTrace();
			
		}
		
		System.out.println("vimal end");
	}
	void hari()  {
		System.out.println("hari st");
		vimal();
		System.out.println("hari end");
	}
	void dixith()  {
		System.out.println("dixith st");
		hari();
		System.out.println("dixith end");
	}
	public static void main(String[] args)  {
		ExecutionPropagation obj=new ExecutionPropagation();
		System.out.println("main st");
		//try{
			obj.dixith();
		//}
		//catch(Exception e){
			//System.out.println("error ulla");
			//e.printStackTrace();
		//}
		
		System.out.println("main end");
	}
}
