package jun12;

public class AgeException extends Exception{

	public AgeException() {
		System.err.println("age exception occured");
		
	}
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("age is leess than the 18");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "<18";
	}
	
}
