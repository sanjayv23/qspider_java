package marque;



public class SingleLinkedList {
	
	Node head;
	Node tail;
	int size=0;
	
	boolean isEmpty() {
		return size==0;
	}
	
	void printLinkedList() {
		if(isEmpty()) {
			System.out.println("Empty LinkedList");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		System.out.println();
		
	}

	boolean prepend(int val) {
		Node newNode=new Node(val);
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			size++;
			return true;
		}
		else {
			
			newNode.next=head;
			head=newNode;
			size++;
			return true;
		}
		
	}
	
	boolean append(int val) {
		Node newNode=new Node(val);
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			size++;
			return true;
		}
		else {
			tail.next=newNode;
			tail=newNode;
			size++;
			return true;
			
		}
	}
		
	boolean insertAtKthIndex(int val,int k) {
		if(k<0) return false;
		if(k==0) {
			prepend(val);
			return true;
		}
		if(isEmpty() || k>=size) {
			append(val);
			return true;
		}
		Node temp=head;
		int cnt=0;
		while(temp!=null) {
			if(cnt+1==k) {
				Node newNode=new Node(val);
				newNode.next=temp.next;
				temp.next=newNode;
				size++;
				break;
			}
			temp=temp.next;
			cnt++;
		}
		return true;
		
	}
	
	boolean deleteAtTail() {
		if(isEmpty()) return false;
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		tail=temp;
		tail.next=null;
		size--;
		return false;
		
	}
	
	boolean deleteAtHead() {
		if(isEmpty()) {
			return false;
		}
		head=head.next;
		size--;
		return true;
	}
	
	boolean deleteAtKthIndex(int k) {
		if(k==0) {
			deleteAtHead();
			return true;
		}
		
		if(isEmpty()) {
			return false;
		}
		if(k<0) return false;
		if(k>=size-1) {
			deleteAtTail();
			return true;
		}
		else {
			Node temp=head;
			int cnt=0;
			while(temp!=null) {
				if(cnt+1==k) {
					temp.next=temp.next.next;
					size--;
					break;
				}
				temp=temp.next;
				cnt++;
			}
		}
		return true;
	}
	
	int getValueAtKthNode(int k) {
		if(isEmpty() || k<0 ) return Integer.MIN_VALUE;
		if(k>=size-1) {
			return tail.data;
		}
		Node temp=head;
		int cnt=0;
		while(temp!=null) {
			if(cnt==k) {
				return temp.data;
			}
			temp=temp.next;
			cnt++;
		}
		return Integer.MIN_VALUE;
	}
	
	int size() {
		return size;
	}

	public static void main(String[] args) {
		SingleLinkedList obj=new SingleLinkedList();
		obj.prepend(10);
		obj.prepend(30);
		obj.prepend(0);
		obj.append(69);
		obj.append(12);
		
		obj.insertAtKthIndex(-1, 0);
		
		obj.printLinkedList();
		
		obj.deleteAtKthIndex(0);
		
		obj.getValueAtKthNode(3);
		
		obj.printLinkedList();
		

	}

}


class Node{
	int data;
	Node next;
	
	Node(int val){
		data=val;
		next=null;
	}
}
