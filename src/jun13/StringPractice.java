package jun13;

public class StringPractice extends StringPracticeParent{
//	public static void main(String[] args) {
//		StringBuilder sb=new StringBuilder("coding");
//		sb.reverse();
//		sb.setLength(3);
//		sb.insert(1, 'x');
//		System.out.println(sb);
//		
//		String str="programming";
//		String s1=st hr+"in java";
//		System.out.println(s1=="programmingin java");
//	}
	public StringPractice  demo() {
		return new StringPractice();
	}
	public static void main(String[] args) {
		StringPractice obj=new StringPractice();
		
	}
	
}

class StringPracticeParent {
	public StringPracticeParent  demo() {
		return new StringPracticeParent();
	}
	
	
}
