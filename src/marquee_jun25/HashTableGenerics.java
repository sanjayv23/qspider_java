package marquee_jun25;

import marquee_jun25.HashTable.Node;

public class HashTableGenerics<T> {
	class Node<T> {
		T val;
		Node<T> next;

		Node(T val) {
			this.val = val;
		}
	}
	public static void main(String[] args) {
		HashTableGenerics<Integer> ht = new HashTableGenerics<>();

		ht.insert(10);
		ht.insert(20);
		ht.insert(15);
		ht.insert(25);
		ht.insert(30);

		System.out.print("HashTable contents: ");
		ht.display();

		System.out.println("Contains 15: " + ht.contains(15));
		System.out.println("Contains 99: " + ht.contains(99));

		ht.insert(10);
		System.out.print("After inserting duplicate 10: ");
		ht.display();
	}

	Node<T>[] arr = new Node[10];
	int size;

	public int hashFunction(T key) {
		return key.hashCode() % arr.length;
	}

	public void display() {
		if (size == 0) {
			System.out.println("[]");
			return;
		}
		for(Node<T> n:arr) {
			if(n!=null) {
				System.out.print("[" + n.val);
				n = n.next;
				while (n != null) {
				    System.out.print(" -> " + n.val);
				    n = n.next;
				}
				System.out.print("] ");
			}
			
		}
		System.out.println();
	}

	public boolean contains(T key) {
		Node<T> node = arr[hashFunction(key)];
		while (node != null) {
			if (node.val.equals(key)) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	public boolean insert(T key) {
		int index = hashFunction(key);
		if (arr[index] != null) {
			Node<T> node = arr[index];
			do{
				//avoid duplication
				if(node.val.equals(key)) {
					return false;
				}
				if(node.next==null) {
					break;
				}
				node = node.next;
			}while(true);
			node.next = new Node<>(key);
		} else {
			arr[index] = new Node<>(key);
		}
		size++;
		return true;
	}
}

