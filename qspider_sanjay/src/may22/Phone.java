package may22;

public class Phone {
	private String model;
	private String color;
	private int price;
	private Sim sim;
	private External_Memory externalMemory=new External_Memory("samsung",25000,5000); 
	
	
	public External_Memory getExternalMemory() {
		return externalMemory;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public Phone(String model,String color,int price) {
			this.model=model;
			this.color=color;
			this.price=price;
	}
	
	public void createSim(int balance,int phoneNo) {
		sim=new Sim(balance,phoneNo);
	}
	
	
	
	
	
	
	
}
