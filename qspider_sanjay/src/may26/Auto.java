package may26;

public class Auto extends Cab{
	String lever;

	public Auto() {
		super();
	}

	public Auto(String driverId, int noOfWheels, String lever) {
		super(driverId, noOfWheels);
		this.lever = lever;
	}
}
