package kunal_recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Search_recursion {
	public static void main(String[] args) {
		int[] arr= {1,3,3,4,4,8};
		helper(arr,3,0);
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println(find_ind(arr, 4, 0, list));
	}
	static ArrayList<Integer> list=new ArrayList<Integer>();
	static void helper(int[] arr,int target,int i) {
		if(i==arr.length-1) return;
		if(arr[i]==target) list.add(i);
		helper(arr, target, i+1);
	}
	static ArrayList<Integer> find_ind(int[] arr,int target,int i,ArrayList<Integer> list){
		if(i==arr.length-1) return list;
		if(arr[i]==target) list.add(i);
		return find_ind(arr, target, i+1,list);
	}
}
