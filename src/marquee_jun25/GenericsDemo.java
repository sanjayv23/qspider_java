package marquee_jun25;

public class GenericsDemo{
	public static void main(String[] args) {
		Demo<Integer> d=new Demo("trye");
		System.out.println(d.getVal());
	}
}
class Demo<T>{
	private T val;
	public T getVal() {
		return this.val;
	}
	public void setVal(T val) {
		this.val=val;
	}
	public Demo(T val) {
		this.val=val;
	}
}
