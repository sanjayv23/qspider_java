package marquee_jun25;

import java.util.Arrays;

public class Generics {
	public static void main(String[] args) {
		
	}
}

class GO {
	Object[] val = new Object[10];
	int ind = -1;

	public void add(Object val) {
		if(ind==this.val.length-1) {
			return;
		}
		this.val[++ind]=val;
	}
	public Object[] getVal() {
		return val;
	}
	public void display() {
		System.out.println(Arrays.toString(val));
	}
}
class GC<T>{
	class Node<T>{
		T data;
		@Override
		public String toString() {
			return ""+data;
		}
		Node(T val){
			this.data=val;
		}
	}
	Node<T>[] val=new Node[10];
	int ind = -1;

	public void add(T val) {
		if(ind==this.val.length-1) {
			return;
		}
		this.val[++ind]=new Node(val);
	}
	public Node<T>[] getVal() {
		return val;
	}
	public void display() {
		System.out.println(Arrays.toString(val));
	}
	
}