package methods;


public class Dec24 {
	public static void main(String[] args) {
		System.out.println("hello world");
		num('a',12); // int int 
		num('a','i');// char char
		num(12,12.35);//double double
		num(12.35,5); //double int
		
		int res1=triarea(12,12);
		int res2=rectarea(12,12);
		int res3=circlearea(12);
		System.out.println("area of triangle: "+res1);
		System.out.println("area of rectangle: "+res2);
		System.out.println("area of circle: "+res3);
	}
	public static int triarea(int l,int h) {
		return (int)(0.5*l*h);
	}
	public static int rectarea(int l,int b) {
		return (l*b);
	}
	public static int circlearea(int r) {
		return (int)(2*3.14*r*r);
	}
	
	public static void num(int a,int b) {
		System.out.println("int int");
	}
	public static void num(double a,int b) {
		System.out.println("double int");
	}
	public static void num(double a,double b) {
		System.out.println("double double");
	}
	public static void num(char a,char b) {
		System.out.println("char char");
	}
//	public static void num(int a,double b) {
//		System.out.println("int double");
//	}
}
