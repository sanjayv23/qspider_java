package jan28;

public class Constructor {
	public static void main(String[] args) {
		new Employee("sanjay");
		
		Employee obj=new Employee();
		obj.display();
		
		Employee obj1=new Employee("sanjay");
		obj1.display();
		
		Employee obj2=new Employee(80);
		obj2.display();
		
		Employee obj3=new Employee("gaji",69);
		obj3.display();
		
		;
	}
}
class Employee{
	String name;
	int salary;
	Employee(){
		System.out.println("Empty const");
	}
	Employee(String name){
		System.out.println("only name");
		this.name=name;
	}
	
	Employee(int salary){
		System.out.println("only salary");
		this.salary=salary;
	}
	Employee(String name,int salary){
		System.out.println("both name and salary");
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("=================");
	}
}
