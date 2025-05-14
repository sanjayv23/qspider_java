package jan27;

class Employee {
	String name;
	int eid;
	double salary;
	public void display() {
		System.out.println("======================");
		System.out.println("Name       : "+name);
		System.out.println("Empolyee ID: "+eid);
		System.out.println("Salary     : "+salary);
		System.out.println("======================");
	}
	public void set_value(String name,int eid,double salary) {
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
}
