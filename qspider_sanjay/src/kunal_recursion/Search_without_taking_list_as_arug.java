package kunal_recursion;

import java.util.ArrayList;


public class Search_without_taking_list_as_arug {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,8};
		System.out.print(helper(arr, 4, 0));
	}
	public static ArrayList<Integer> helper(int[] arr,int target,int ind){
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(ind==arr.length-1) return list;
		if(arr[ind]==target) list.add(ind);
		ArrayList<Integer> all_list=helper(arr, target, ind+1);
		list.addAll(all_list);
		return list;
	}
}
