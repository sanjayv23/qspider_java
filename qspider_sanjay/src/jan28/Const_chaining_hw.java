package jan28;

public class Const_chaining_hw {
	public static void main(String[] args) {
		new C();
		
		
	}
}
class C{
	C(){
		this(true);
		System.out.print(" language");
	}
	C(boolean b){
		this(10);//calls a const with args int
		System.out.print(" programming");
	}
	C(int a){
		this(10.0); //calls a const with args double
		System.out.print(" is a");
	}
	C(double a){
		//this();
		System.out.print(" java");
	}
}
