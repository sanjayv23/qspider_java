package kunal_recursion;

import java.util.ArrayList;
import java.util.List;

public class Dice_with_target {
	public static void main(String[] args) {
		System.out.print(helper("",4,6));
	}
	public static List<String> helper(String p,int target,int face){
		if(target==0) {
			List<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		List<String> list=new ArrayList<String>();
		for(int i=1;i<=face && target-i>=0;i++) {
			list.addAll(helper(p+i,target-i,6));
		}
		return list;
		
	}
}
