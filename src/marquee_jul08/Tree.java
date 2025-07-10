package marquee_jul08;
import java.util.Scanner;

public class Tree {
	class Node{
		int val;
		Node arr[];
		Node(int val){
			this.val=val;
		}
	}
	Node root;
	int size;
	Scanner sc=new Scanner(System.in);
	public void add() {
		System.out.println("enter the val to insert in root node: "  );
		root=new Node(sc.nextInt());
		size++;
	}
	public void add(Node parent) {
		System.out.println("do you want child nodes - "+parent.val);
		char c=sc.next().toLowerCase().charAt(0);
		if(c=='y') {
			System.out.println("How many child node to be inserted "+parent.val);
			int num=sc.nextInt();
			parent.arr=new Node[num];
			for(int i=0;i<num;i++) {
				System.out.println("Enter the val to insert child node - "+parent.val);
				Node node=new Node(sc.nextInt());
				parent.arr[i]=node;
				size++;
				add(parent.arr[i]);
			}
		}
		
	}
	// Enhanced Display Method
	public void display() {
	    System.out.println("Displaying the Tree:");
	    display(root, "", true);
	}

	private void display(Node node, String prefix, boolean isLast) {
	    if (node == null) return;

	    System.out.print(prefix);
	    if (!prefix.isEmpty()) {
	        System.out.print(isLast ? "└── " : "├── ");
	    }
	    System.out.println(node.val);

	    if (node.arr != null) {
	        for (int i = 0; i < node.arr.length; i++) {
	            boolean last = (i == node.arr.length - 1);
	            display(node.arr[i], prefix + (isLast ? "    " : "│   "), last);
	        }
	    }
	}

	public static void main(String[] args) {
		Tree obj=new Tree();
		obj.add();
		obj.add(obj.root);
		obj.display();
	}
}
