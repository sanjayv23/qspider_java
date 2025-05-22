package may21;

public class Battery {
	private String type;
	private int battercapacity;
	
	public Battery() {
		super();
	}

	public Battery(String type, int battercapacity) {
		super();
		this.type = type;
		this.battercapacity = battercapacity;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBattercapacity() {
		return battercapacity;
	}
	public void setBattercapacity(int battercapacity) {
		this.battercapacity = battercapacity;
	}
	
	
	
}
