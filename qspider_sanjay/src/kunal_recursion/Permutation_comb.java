package kunal_recursion;

import java.util.*;

public class Permutation_comb {
	public static void main(String[] args) {
		//System.out.println("sd");
		Set<String> setstr=new HashSet<>();
		setstr=helper("","AAB",setstr);
		System.out.println(setstr);
		
		List<Integer> up=new ArrayList<>();
		;
		up.add(0);
		up.add(1);
		up.add(2);
		up.add(3);
		up.add(4);
		up.add(0,4);
		System.err.println(up);
		
	}
	public static void array_prem(List<Integer> p,List<Integer> up) {
		if(up.size()==0) {
			System.out.println(p);
			return;
		}
		int n=up.get(0);
		List<Integer> ans=new ArrayList<>(up.subList(1,up.size()));
		for(int i=0;i<=p.size();i++) {
			
			
			array_prem(sanjay, ans);
		}
	}
	
	public static Set<String> helper(String p,String up,Set<String> setstr){
        if(up.length()==0 ) {
        	//System.out.println(p);
        	setstr.add(p);
        	return  setstr;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            helper(f+ch+s,up.substring(1),setstr);
        }
		return setstr;

    }
}
