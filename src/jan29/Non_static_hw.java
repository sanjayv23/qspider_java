package jan29;

public class Non_static_hw {
	public static void main(String[] args) {
		System.out.println("int int");
		new AB(10,100);
		System.out.println("No args");
		new AB();
	}
}
class AB{
	int a=display();
	{
		System.out.println("non static block 1");
		System.out.println("non static block 2");
	}
	AB(){
		System.out.println("A()");
	}
	AB(int a,int b){
		System.out.println("A(int int)");
	}
	int b=display();
	{
		System.out.println("non static block 3");
		System.out.println("non static block 4");
	}
	public int display() {
		System.out.println(a);
		System.out.println("disp");
		return 10;
	}
}