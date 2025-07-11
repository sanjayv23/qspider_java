package marquee_jul08;



public class SelfBalancedBinaryTree {
	class Node{
		int val;
		int height;
		Node left;
		Node right;
		Node(int val){
			this.val=val;
		}
	}
	Node root;
	int size;
	
	public void add(int val) {
		root=add(root,val);
	}

	private Node add(Node root, int val) {
		if(root==null ) {
			size++;
			return new Node(val);
		}
		if(val>root.val) root.right=add(root.right,val);
		else if(val<root.val) root.left=add(root.left,val);
		root.height=Math.max(height(root.left),height(root.right))+1;
		return root;
	}
	
	public Node RightRotation(Node node) {
		Node mid=node.left;
		Node temp=mid.right;
		
		mid.right=node;
		node.left=temp;
		// updating height of mid,node
		node.height=(Math.max(height(node.left),height(node.right))+1);
		mid.height=(Math.max(height(mid.left),height(mid.right))+1);
		return mid;
	}
	
	private int height(Node node) {
		return node==null?-1:node.height;
	}

	public void display() {
		display(root,0);
	}
	
	public void display(Node root, int level) {
		if (root == null) {
			return;
		}
		display(root.right, level + 1);
		System.out.println("|    ".repeat(level >= 1 ? level - 1 : level) + (level >= 1 ? "|--->" : "") + root.val+","+root.height);
		display(root.left,level+1);
	}

	public static void main(String[] args) {
		SelfBalancedBinaryTree obj=new SelfBalancedBinaryTree();
		int[] arr= {6,2,8,23,9,5,7};
		
		for(int a:arr) obj.add(a);
		System.out.println();
		obj.display();
	}
	
}
