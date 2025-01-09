package jan08;

public class Avg_element_of_array {
	public static void main(String[] args) {
		int sum=0;
		int[] arr= {1,5,3,4,8,6};
		for(int n:arr) {
			sum+=n;
		}
		System.out.println("Average :"+(sum/arr.length));
		
	}
}
