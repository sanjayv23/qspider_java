package may26;

public class Driver extends Cab  {
	private String driverName;
	private String driverPhno;
	private String driverId;
	private double rating;
	
	// constructor
	public Driver(String driverName, String driverPhno, String driverId) {
		super();
		this.driverName = driverName;
		this.driverPhno = driverPhno;
		this.driverId = driverId;
	}
	
	// 	getters & setters 
	
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getDriverPhno() {
		return driverPhno;
	}
	public void setDriverPhno(String driverPhno) {
		this.driverPhno = driverPhno;
	}

}
