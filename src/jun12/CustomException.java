package jun12;

public class CustomException {
	public static void main(String[] args) {
		int age=10;
		try {
			if(age<18) {
				throw new AgeException(); //throw the ageexception
			}
			else {
				System.out.println("eligible");
			}
			
		}
		catch(AgeException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
