package jan29;

public class Non_static_init {
	public static void main(String[] args) {
		new A(10,20);
	}
}

class A{
	 //int a=display();
	{
		System.out.println("non static 1");
		System.out.println("non static 2");
	}
	A(){
		 System.out.println("A()");
	 }
	 A(int a,int b){
		 System.out.println("A(int int)");
	 }
	 
	//single-line initializer
	int b=display();
	public int display() {
		// TODO Auto-generated method stub
		//System.out.println(a);
		System.out.println("disp");
		return 10;
	}
	{

		System.out.println("non static 3");
		System.out.println("non static 4");
	
	}

	 
	 
}