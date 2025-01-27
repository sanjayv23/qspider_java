package jan21;

import jan9.search_element;

public class Frequency_with_dupl {
	public static void main(String[] args) {
		int[] arr= {4, 1, 2, 1, 2};
		frequency(arr);
		search_element.print(arr);
		System.out.println("unique element: ");
		unique_element(arr);
	}
	static void unique_element(int[] arr) {
		//int marker=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			//if(arr[i]==marker) continue;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]==arr[i]) {
					
					cnt++;
					arr[j]=Integer.MIN_VALUE;
				}
				
			}
			if(cnt==1&&arr[i]!=Integer.MIN_VALUE){
				System.out.print(arr[i]+" ");
			}
		}
	}
	static void frequency(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]==arr[i]) {
					
					cnt++;
					arr[j]=Integer.MIN_VALUE;
				}
				
			}
			if(arr[i]!=Integer.MIN_VALUE) System.out.println(arr[i]+" "+cnt);
		}
	}
}
