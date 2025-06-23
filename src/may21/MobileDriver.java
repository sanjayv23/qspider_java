package may21;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("samsung", 15000, 8);
		System.out.println(m1.getBrand() + " " + m1.getPrice() + " " + m1.getRam());
		System.out.println(m1.getBattery() + " " + m1.getBattery().getType() + " " + m1.getBattery().getBattercapacity());

		m1.mobileDetailsDisplay(m1);
	}
}
