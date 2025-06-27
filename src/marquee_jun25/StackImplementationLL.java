package marquee_jun25;

public class StackImplementationLL {
	public static void main(String[] args) {
		StackByLL st=new StackByLL();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.display();
	}
}
class StackByLL{
	static class Node{
		Node next;
		int val;
		Node(int data){
			val=data;
		}
	}
	Node top;
	boolean isEmpty() {
		return top==null;
	}
	void push(int data) {
		Node newNode=new Node(data);
		if(isEmpty()) {
			top=newNode;
			return ;
		}
		else{
			newNode.next=top;
			top=newNode;
			return;
		}
	}
	
	int pop() {
		if(isEmpty()) {
			return -1;
		}
		int ans=top.val;
		top=top.next;
		return ans;
		
	}
	
	
	int peek() {
		if(isEmpty()) {
			return -1;
		}
		return top.val;
	}
	
	void display() {
		System.out.println("---------DISPLAY--------");
		Node temp=top;
		for(Node i=temp;i!=null;i=i.next) {
			System.out.println(i.val);
		}
		
		System.out.println("-----------END----------");
	}
}


