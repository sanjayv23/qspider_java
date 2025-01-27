package jan20;

import jan9.search_element;

public class Second_minimum {
	public static void main(String[] args) {
		int[] a= {23,2,63,5,89,45,3};
		search_element.print(a);
		int second_min=find_second_mini(a);
		System.out.println();
		System.out.println("Second minimum: "+second_min);
	}

	private static int find_second_mini(int[] a) {
		// TODO Auto-generated method stub
		int min=a[0];
		int second_min=Integer.MAX_VALUE;
		for(int x:a) {
			if(x<min) {
				second_min=min;
				min=x;
			}
			if(x>min && x<second_min) {
				second_min=x;
			}
			
		}
		
		System.out.println("min:"+min);
		return second_min;
	}
}

