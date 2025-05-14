package jan27;

public class Employ_obj {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.eid=1;
		e1.name="Sanjay";
		e1.salary=500000;
		e1.display();
		
		Employee e2=new Employee();
		e2.eid=2;
		e2.name="Gajji";
		e2.salary=5;
		e2.display();
		
		Employee e3=new Employee();
		e3.eid=3;
		e3.name="Rajesh";
		e3.salary=10;
		e3.display();
	
		Employee e4=new Employee();
		e4.set_value("chekka", 4, 456000);
		e4.display();
	}
}
