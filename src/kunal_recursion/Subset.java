package kunal_recursion;

import java.util.ArrayList;

public class Subset {
	public static void main(String[] args) {
		String str="abbab";
		System.out.println("Subset of "+str+" :");
		subset("", str);
		System.out.println();
		System.out.println(subset_arraylist("", str)+" "+subset_arraylist("", str).size());
	}
	public static ArrayList<String> subset_arraylist(String pro,String unpro) {
		if(unpro.length()==0) {
			
			ArrayList<String> list=new ArrayList<>();
			list.add(pro);
			return list;
		}
		ArrayList<String> left=subset_arraylist(pro+unpro.charAt(0),unpro.substring(1));
		ArrayList<String> right=subset_arraylist(pro,unpro.substring(1));
		left.addAll(right);
		return left;
	}
	
	public static void subset(String pro,String unpro) {
		if(unpro.length()==0) {
			
			if(pro.length()==0) System.out.print("{empty str}");
			System.out.print(pro+" ");
			return;
		}
		subset(pro+unpro.charAt(0),unpro.substring(1));
		subset(pro,unpro.substring(1));
	}
}
