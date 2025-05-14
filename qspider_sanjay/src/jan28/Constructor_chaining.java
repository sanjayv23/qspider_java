package jan28;

public class Constructor_chaining {
	public static void main(String[] args) {
		new A();
		
		
	}
}
class A{
	A(){
		this(10);//calls a const with args int
		System.out.println("A()");
	}
	A(int a){
		this(10.0); //calls a const with args double
		System.out.println("A(int a)");
	}
	A(double a){
		//this();
		System.out.println("A(double a)");
	}
}