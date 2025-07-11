package marquee_jul08;

import java.util.Scanner;

import org.w3c.dom.Node;



public class BinarySearchTree {
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
	
	public void add(int val) {
		root=add(root,val);
	}
	public Node add(Node root,int val) {
		if(root==null) {
			size++;
			return new Node(val);
		}
		if(val>root.val) root.rightNode=add(root.rightNode,val);
		if(val<root.val) root.leftNode=add(root.leftNode,val);
		return root;
	}
	
	public void display() {
		display(root,0);
	}
	public void display(Node root,int level) {
		
		if(root==null) return ;
		display(root.rightNode,level+1);
		System.out.println("    ".repeat(level)+root.val);
		System.out.println();
		 display(root.leftNode,level+1);
	}
	
	public boolean contains(Node root,int val) {
		if(root==null) return false;
		if(val>root.val) return contains(root.rightNode,val);
		else if(val<root.val) return contains(root.leftNode,val);
		else  return true;
	}
	
	
	public Node findMin(Node root) {
		if(root.leftNode==null) return root;
		return findMin(root.leftNode);
	}
	
	public void delete(int val) {
		root=delete(root,val);
	}
	public Node delete(Node node,int val) {
		if(node==null) return null;
		if(val>node.val) node.rightNode=delete(node.rightNode,val);
		else if(val<node.val) node.leftNode=delete(node.leftNode,val);
		else {
			if(node.leftNode!=null && node.rightNode!=null) {
				int min=findMin(node.rightNode).val;
				node.val=min;
				node.rightNode=delete(node.rightNode,min);
			}
			else if(node.leftNode!=null) {
				return node.leftNode;
			}
			else if(node.rightNode!=null) {
				return node.rightNode;
			}
			else return null;
		}
		return node;
	}
	public static void main(String[] args){
		BinarySearchTree obj=new BinarySearchTree();
		//obj.add(12);
		//obj.add(6);
		int[] arr= {10, 5, 15, 3, 7, 12, 20};
		for(int i=0;i<arr.length;i++) {
			obj.add(arr[i]);
		}
		
		System.out.println(obj.contains(obj.root,2));
		obj.display();
	
		System.out.println(obj.findMin(obj.root).val);
	}
	
}
