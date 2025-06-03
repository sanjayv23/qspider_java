package methods;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		int[] arr= {2,2,5,5,3,3,4,7,6,7,4,1,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int ele=arr[arr.length-1];
		for(int i=0;i<arr.length-1;i=i+2) {
			if(arr[i]==arr[i+1]) continue;
			else{
				ele=arr[i];
				break;
			}
		}
		
		System.out.println(ele);
	}
}


