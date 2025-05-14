package kunal_recursion;
import java.util.*;
public class Iterative_subseq {
	public static void main(String[] args) {
		System.out.println(subseq_no_duplicate(new int[]{1,2,2}));
	}
	public static List<List<Integer>> subseq_no_duplicate(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		outer.add(new ArrayList<>());
		int start=0,end=0;
		for(int i=0;i<arr.length;i++) {
			start=0;
			if(i!=0 && arr[i]==arr[i-1]) start=end+1;
			end=outer.size()-1;
			int outer_size=outer.size();
			for(int j=start;j<=end;j++) {
				List<Integer> internal=new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		
		return outer;
	}
	public static List<List<Integer>> subseq_for_loop(int[] arr){
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		outer.add(new ArrayList<>());
		for(int n:arr) {
			int outer_size=outer.size();
			for(int i=0;i<outer_size;i++) {
				List<Integer> internal=new ArrayList<>(outer.get(i));
				internal.add(n);
				outer.add(internal);
			}
		}
		
		
		
		
		return outer;
	}
}
