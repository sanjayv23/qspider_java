package kunal_recursion;

import java.util.Arrays;

public class Selection_sort {
	public static void main(String[] args) {
		int[] arr= {5,2,3,1};
		sort(arr,0,arr.length,0);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr,int st,int end,int maxind) {
		if(end==0) return;
		//int max=maxind;
		if(st<end) {
		 	if(arr[st]>arr[maxind]) {
		 		sort(arr,st+1,end,st);
		 		//maxind=st;
		 	}
		 	else sort(arr, st+1, end, maxind);
		 	
		}
		else {
			int temp=arr[maxind];
	 		arr[maxind]=arr[end-1];
	 		arr[end-1]=temp;
			sort(arr,0,end-1,0);
		}
		
	}
}	
