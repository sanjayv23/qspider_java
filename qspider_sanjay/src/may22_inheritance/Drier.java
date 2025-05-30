package may22_inheritance;

public class Drier {
	public static void main(String[] args) {
		Child c1=new Child("Sanjay",21);
		System.out.println(c1.name);
		
		Parent p1=new Parent("velu",55);
		System.out.println(p1.name);
	}
}
