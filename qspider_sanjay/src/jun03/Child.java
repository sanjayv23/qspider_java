package jun03;

public class Child extends Parent {
	//@override
	public static void greet() {
		System.out.println("child");
	}
	
	String name;
	int rollno;
	@Override
	public String toString() {
		return this.name+" "+this.rollno;
	}
	
	@Override
	public boolean equals(Object o) {
		Child c1=(Child)o; // downcast 
		return this.name==c1.name && this.rollno==c1.rollno;
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.name="sanjay";
		obj.rollno=383;
		
		Child obj1=new Child();
		obj1.name="sanjay";
		obj1.rollno=383;
		
		System.out.println(obj.equals(obj1));
		
		
		System.out.println(obj);
		System.out.println();
	}
}
