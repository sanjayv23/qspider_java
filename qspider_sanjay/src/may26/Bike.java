package may26;

public class Bike extends Cab{
	String helmet;

	public Bike(String driverId, int noOfWheels, String helmet) {
		super(driverId, noOfWheels);
		this.helmet = helmet;
	}

	public Bike() {
		super();
	}
}
