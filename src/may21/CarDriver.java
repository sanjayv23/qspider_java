package may21;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("white",700000,10);
		System.out.println(c1.getColor()+" "+c1.getMileage()+" "+c1.getPrice());
		
		System.out.println(c1.getE1()+" "+c1.getE1().getEngineType()+" "+c1.getE1().getPower());
	}
}
