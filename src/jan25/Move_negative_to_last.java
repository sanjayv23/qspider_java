package jan25;

import java.util.Arrays;

import jan22.Input_2d_array;

public class Move_negative_to_last {
	public static void main(String[] args) {
		int[] arr= {-1,2,-2,3,-5};
		System.out.println(Arrays.toString(arr));
		move_negative(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void move_negative(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				int pos_ind=i,neg_ind = arr.length-1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<0) {
						neg_ind=j;
						break;
					}
				}
				right_shift(arr, pos_ind, neg_ind);
				
			}
			
		}
	}
	
	public static void right_shift(int[] arr,int st,int end) {
		int temp=arr[end];
		for(int i=end;i>=st;i--) {
			arr[i]=arr[i-1];
		}
		arr[st]=temp;
	}
}
