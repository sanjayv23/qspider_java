package jan30;

public class Rough_note {
	int a=10;
	public Rough_note() {
		System.out.println("const");
		//a=20;
	}
	public void display() {
		System.out.println("a: "+a);
	}
	public static void main(String[] args) {
		Rough_note obj=new Rough_note();
		obj.display();
		boolean b;
		if(b=true) System.out.println("Sd");
		
	}
}
