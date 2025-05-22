package may15;

public class Order {
	private String productName;
	private String ProductId;
	private int price;
	private String payment;
	public void display() {
		System.out.println("Product Name: "+this.productName);
		System.out.println("Product Id: "+this.ProductId);
		System.out.println("Price: "+this.price);
		System.out.println("Payment: "+this.payment);
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
}
