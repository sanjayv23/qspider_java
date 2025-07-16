package jul15;

public class GraphAdjacenyLinkedList {
	java.util.LinkedList<String> nodes;
	java.util.LinkedList<java.util.LinkedList<String>> neighbour;
	
	
	public GraphAdjacenyLinkedList(java.util.LinkedList<String> nodes) {
		
		this.nodes = nodes;
		neighbour=new java.util.LinkedList<java.util.LinkedList<String>>();
		for(int i=0;i<nodes.size();i++) {
			neighbour.add(new java.util.LinkedList<String>());
		}
	}
	public void add(int i,int j) {
		String first=nodes.get(i);
		String second=nodes.get(j);
		neighbour.get(i).add(second);
		neighbour.get(j).add(first);
	}
	public static void main(String[] args) {
		java.util.LinkedList<String> list = new java.util.LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		
		
		
		GraphAdjacenyLinkedList g = new GraphAdjacenyLinkedList(list);
		g.add(0, 1);
		g.add(0, 3);
		g.add(1, 2);
		g.add(1, 4);
		g.add(3, 4);
		g.add(2, 4);
		g.display();
		
		
	}
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<nodes.size();i++) {
			System.out.print( nodes.get(i)+" : ");
			for(int j=0;j<neighbour.get(i).size();j++) {
				System.out.print(neighbour.get(i).get(j)+" --> ");
			}
			System.out.println();
			
		}
	}


	
}
