package marque;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int size=0;
	
	boolean isEmpty() {
		return size==0; 
	}
	
	boolean append(int val) {
		Node newNode=new Node(val);
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			
		}
		else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		size++;
		return true;
	}
	
	boolean prepend(int val) {
		Node newNode=new Node(val);
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			
		}
		else {
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
		}
		size++;
		return true;
	}
	
	boolean insertAtKthIndex(int k,int val) {
		Node temp=head;
		int cnt=0;
		if(k==0) {
			prepend(val);
			return true;
		}
		if(k<0) return false;
		if(k>=size) {
			append(val);
			return true;
		}
		Node newNode=new Node(val);
		while(temp!=null) {
			if(cnt+1==k) {
				newNode.next=temp.next;
				temp.next.prev=newNode;
				temp.next=newNode;
				newNode.prev=temp;
				break;
				
			}
			temp=temp.next;
			cnt++;
		}
		size++;
		return true;
	}
	
	boolean DeleteAtTail() {
		if(isEmpty()) {
			System.out.println("Empty LL");
			return false;
		}
		else {
			tail=tail.prev;
			tail.next=null;
			size--;
			return true;
		}
	}
	
	boolean DeleteAtHead() {
		if(isEmpty()) {
			System.out.println("Empty LL");
			return false;
		}
		else {
			
			head=head.next;
			head.prev=null;
			size--;
			return true;
		}
	}
	
	boolean deleteAtKthIndex(int k) {
		if(isEmpty()) {
			System.out.println("empty ll");
			return false;
		}
		Node temp=head;
		int cnt=0;
		
		if(k==0) {
			DeleteAtHead();
			return true;
		}
		if(k<0) return false;
		if(k>=size-1) {
			DeleteAtTail();
			return true;
		}
		
		while(temp!=null) {
			if(cnt+1==k) {
				temp.next=temp.next.next;
				temp.next.prev=temp;
				
			}
			temp=temp.next;
			cnt++;
		}
		size--;
		return true;
	}

	void printDoublyLL() {
		if(isEmpty()) {
			System.out.println("Empty LinkedList ");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	
	void reversePrintDoublyLL() {
		if(isEmpty()) {
			System.out.println("Empty LinkedList ");
			return;
		}
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		DoublyLinkedList obj=new DoublyLinkedList();
		obj.append(10);
		obj.append(20);
		obj.append(30);
		obj.prepend(0);
		obj.append(40);
		obj.prepend(-10);
		obj.insertAtKthIndex(6, 18);
		
		obj.printDoublyLL();
		obj.reversePrintDoublyLL();
		
		System.out.println();
		
		obj.DeleteAtTail();
		
		obj.printDoublyLL();
		obj.reversePrintDoublyLL();
		
		System.out.println();
		
		obj.DeleteAtHead();
		
		obj.printDoublyLL();
		obj.reversePrintDoublyLL();
		
		System.out.println();
		
		obj.deleteAtKthIndex(5);
		obj.printDoublyLL();
		obj.reversePrintDoublyLL();
			
	}
	
}

class Node{
	Node next;
	Node prev;
	int data;
	Node(int val){
		data=val;
		next=null;
		prev=null;
	}
}
