package may26;

public class Car extends Cab {
	String ac;

	public Car() {
		super();
	}
	public Car(String driverId, int noOfWheels, String ac) {
		super(driverId, noOfWheels);
		this.ac = ac;
	}

	
}
