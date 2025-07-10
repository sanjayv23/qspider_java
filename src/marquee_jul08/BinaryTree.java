package marquee_jul08;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	Scanner scan=new Scanner(System.in);
	class Node{
		int val;
		Node leftNode;
		Node rightNode;
		Node (int val){
			this.val=val;
		}
	}
	Node root;
	int size;
	
	public void add() {
		System.out.println("enter the value for the rootnode");
		root=new Node(scan.nextInt());
		add(root);
	}
	private void add(Node parent) {
		System.out.println("do you want to add left child for=> "+parent.val);
		char ch=scan.next().toLowerCase().charAt(0);
		if(ch=='y') {
			System.out.println("Enter val to left child=> "+parent.val);
			parent.leftNode=new Node(scan.nextInt());
			size++;
			add(parent.leftNode);
		}
		System.out.println("do you want to add right child for=> "+parent.val);
		char ch1=scan.next().toLowerCase().charAt(0);
		if(ch1=='y') {
			System.out.println("Enter val to right child=> "+parent.val);
			parent.rightNode=new Node(scan.nextInt());
			size++;
			add(parent.rightNode);
		}
	}
	public void display() {
		display(root,0);
	}
	public void display(Node parent,int level) {
		System.out.println(" ".repeat(level)+parent.val);
		if(parent.leftNode!=null) display(parent.leftNode, level+1);
		if(parent.rightNode!=null) display(parent.rightNode, level+1);
	}
	public static void main(String[] args) {
		
		BinaryTree  obj=new BinaryTree();
		obj.add();
		obj.display();
		
		System.out.println("INORDER TRAVERSAL: ");
		obj.inorder();
		System.out.println();
		
		System.out.println("POSTORDER TRAVERSAL: ");
		obj.postorder();
		System.out.println();
		
		System.out.println("PREORDER TRAVERSAL: ");
		obj.preorder();
		System.out.println();
		
		System.out.println("LEVEL ORDER TRAVERSAL: ");
		obj.levelorder();
		System.out.println();
	}
	
	public void preorder() {
		preorder(root);
	}
	public void preorder(Node root) {
		System.out.print(root.val+" ");
		if(root.leftNode!=null) preorder(root.leftNode);
		if(root.rightNode!=null) preorder(root.rightNode);
	}
	
	public void postorder() {
		postorder(root);
	}
	public void postorder(Node root) {
		
		if(root.leftNode!=null) postorder(root.leftNode);
		if(root.rightNode!=null) postorder(root.rightNode);
		System.out.print(root.val+" ");
	}

	public void inorder() {
		inorder(root);
	}
	public void inorder(Node root) {
		
		if(root.leftNode!=null) inorder(root.leftNode);
		System.out.print(root.val+" ");
		if(root.rightNode!=null) inorder(root.rightNode);
	}
	
	public void levelorder() {
		levelorder(root);
	}
	private void levelorder(Node root) {
		// TODO Auto-generated method stub
		LinkedList<Node> queue=new LinkedList<>();
		queue.addLast(root);
		while(!queue.isEmpty()) {
			Node node=queue.peek();
			if(node.leftNode!=null)queue.addLast(node.leftNode);
			if(node.rightNode!=null) queue.addLast(node.rightNode);
			System.out.print(node.val);
			queue.removeFirst();
		}
	}
	
	
}
