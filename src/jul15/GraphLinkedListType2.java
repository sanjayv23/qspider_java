package jul15;

import java.util.LinkedList;

public class GraphLinkedListType2 {
	static class Value{
		String data;
		LinkedList<String> neighbour;
		public Value(String data) {
			this.data=data;
			neighbour=new LinkedList<String>();
		}
		
	}
	
	LinkedList<Value> list;
	public void add(int i,int j) {
		list.get(i).neighbour=
	}
}
