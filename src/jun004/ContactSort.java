package jun004;

import java.util.*;

public class ContactSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Map<Integer,ArrayList<String>> map=new HashMap<>();
		int n=scan.nextInt();
		scan.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextLine();
		}
		for(String s:arr) {
			if(map.containsKey(s.length())) {
				ArrayList<String> list=map.get(s.length());
				list.add(s);
				Collections.sort(list);
				map.put(s.length(), list);
			}
			else {
				ArrayList<String> list=new ArrayList<>();
				list.add(s);
				
				map.put(s.length(), list);
			}
		}
		for(Map.Entry<Integer,ArrayList<String>> e:map.entrySet()) {
			System.out.println(e.getKey()+"  " +e.getValue());
		}
		
		
		
	}
}
