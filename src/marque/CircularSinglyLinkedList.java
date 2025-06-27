package marque;

public class CircularSinglyLinkedList {
	Node tail;
	Node head;
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
		int cnt=size;
		while(cnt!=0) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			cnt--;
			
		}
		System.out.println();
		
	}
	
	boolean append(int val) {
		return insertAtKthIndex(size, val);
		
	}
	
	boolean prepend(int val) {
		return insertAtKthIndex(0, val);
		
	}
	
	boolean insertAtKthIndex(int k,int val) {
		if(k<0) return false;
		
		Node newNode=new Node(val);
		
		if(isEmpty()) {
			head=newNode;
			tail=head;
			tail.next=head;
			
		}
		else if(k==0) {
			newNode.next=head;
			head=newNode;
			tail.next=head;
			
		}
		else if(k>=size){
			tail.next=newNode;
			tail=tail.next;
			tail.next=head;
			
		}
		else {
			Node temp=head;
			int cnt=0;
			while(temp!=null) {
				if(cnt+1==k) {
					newNode.next=temp.next;
					temp.next=newNode;
					break;
				}
				temp=temp.next;
				cnt++;
			}
		}
		size++;
		return true;
	}
	
	boolean deleteAtKthIndex(int k) {
		if(isEmpty() || k<0 || k>=size) return false;
		
		if(k==0) {
			head=head.next;
			tail.next=head;
			
		}
		else if(head==tail) {
			head=tail=null;
		}
		else if(k==size-1) {
			Node temp=head;
			while(temp.next.next!=head) {
				temp=temp.next;	
			}
			tail=temp;
			tail.next=head;
		}
		else {
			Node temp=head;
			int cnt=0;
			while(cnt<k-1) {
				temp=temp.next;	
				cnt++;
			}
			temp.next=temp.next.next;
		}
		size--;
		return true;
	}
	
	boolean deleteAtHead() {
		return deleteAtKthIndex(0);
	}
	
	boolean deleteAtTail() {
		return deleteAtKthIndex(size-1);
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
	public static void main(String[] args) {
		CircularSinglyLinkedList obj=new CircularSinglyLinkedList();
		obj.insertAtKthIndex(0,1);
		obj.insertAtKthIndex(1,2);
		obj.insertAtKthIndex(2,3);
		obj.insertAtKthIndex(3,4);
		obj.insertAtKthIndex(5, 10);
		obj.append(15);
		obj.printLinkedList();
		obj.deleteAtTail();
		obj.getValueAtKthNode(1);
		obj.printLinkedList();
		
	}
}


