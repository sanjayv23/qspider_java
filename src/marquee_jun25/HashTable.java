package marquee_jun25;

//import marquee_jun25.CircularDoublyLinkedList.Node;

public class HashTable {
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	    }
	}
	Node[] arr=new Node[10];
	int size;
	
	// completed
	public int hashFunction(int key) {
		return key%arr.length;
	}
	
	// completed
	public boolean contains(int key) {
		Node temp = arr[hashFunction(key)];
	    while (temp != null) {
	        if (temp.data == key) return true;
	        temp = temp.next;
	    }
		return false;
	}
	
	// completed
	public boolean insert(int key) {
		Node newnode=new Node(key);
		
		// not allowing the duplicate  element
		//if(contains(key)) return false;
		if(arr[hashFunction(key)]!=null) {
			Node temp=arr[hashFunction(key)];
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
		else {
			arr[hashFunction(key)]=newnode;
		}
		size++;
		return true;
	}
	
	// completed
	public void display() {
		if(size==0) System.out.println("Empty hashtable");
		
		for(Node n:arr) {
			if(n!=null) {
				System.out.print("[" + n.data);
				n = n.next;
				while (n != null) {
				    System.out.print(" -> " + n.data);
				    n = n.next;
				}
				System.out.print("] ");
			}
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// for another example
		Object[] arr= {10,true,"Sanjay",'c',5.2};
		System.out.println((String)arr[2]);
		
		
		HashTable ht = new HashTable();

	    // Insert keys with no collision
	    System.out.println("Inserting keys without collision:");
	    ht.insert(1);
	    ht.insert(2);
	    ht.insert(3);
	    ht.insert(4);
	    ht.display();  // Expect: 1 2 3 4 (in some order based on hash)

	    // Insert keys that cause collisions
	    System.out.println("Inserting keys with collision:");
	    ht.insert(11);  // Same hash as 1
	    ht.insert(21);  // Same hash as 1
	    ht.insert(12);  // Same hash as 2
	    ht.display();   // Expect chains like 1->11->21, 2->12, etc.

	    // Check contains
	    System.out.println("Test contains:");
	    System.out.println("Contains 11: " + ht.contains(11));  // true
	    System.out.println("Contains 99: " + ht.contains(99));  // false

	    // Re-insert duplicate keys
	    System.out.println("Inserting duplicate key 21:");
	    ht.insert(21);  // Should add another 21 in chain
	    ht.display();   // Chain for hash(1): 1->11->21->21

	    // Final state
	    System.out.println("Final Hash Table:");
	    ht.display();
	}
	
}

