package jun09;

public class StringExample {
	public static void main(String[] args) {
		String s1="sanjay";
		String s2=new String("sanjay");
		
		System.out.println(s1=="sanjay");
		System.out.println(s1.equals(s2));
		
		System.out.println("thread safe "+ s1.describeConstable()  );
	}
}
