package kunal_recursion;

public class Rotated_binary_search {
	public static void main(String[] args) {
		
	}
	public boolean find(int[] arr,int st,int end,int target) {
		if(st>end) return false;
		int m=(st+end)/2;
		if(arr[m]==target) return true;
		if(arr[st]<=arr[m]) {
			if(target>=arr[st] && target<=arr[m]) return find(arr, st, m-1, target);
			else return find(arr, m+1, end, target);
		}
		if(target>=arr[m] && target<=arr[end]) {
			return find(arr, m+1, end, target);
		}
		return find(arr, st, m-1, target);
	}
}
