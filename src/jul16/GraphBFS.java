package jul16;


import java.util.*;

public class GraphBFS {
	static class Value{
		String data;
		int index;
		Value(String data,int index){
			this.data=data;
			this.index=index;
			
		}
	}
	
	Value nodes[];
	int[][] matrix;
	public GraphBFS(Value[] nodes) {
		super();
		this.nodes = nodes;
		matrix=new int[nodes.length][nodes.length];
	}
	
	

	public void display() {
		System.out.print("  ");
		for(Value str:nodes)
			System.out.print(str.data+" ");
		System.out.println();
		for(int i=0;i<matrix.length;i++) {
			System.out.print(nodes[i].data+" ");
			for(int n:matrix[i]) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
	
	public void add(int i,int j) {
		matrix[i][j]=1;
		matrix[j][i]=1;
	}
	public void delete(int i,int j) {
		matrix[i][j]=0;
		matrix[j][i]=0;
	}
	
	public Value[] getNeighbours(Value value) {
		Value[] neighbour=new Value[nodes.length];
		int ind=0;
		for(int i=0;i<nodes.length;i++) {
			if(matrix[value.index][i]==1) {
				neighbour[ind++]=nodes[i];
			}
		}
		return neighbour;
		
	}
	
	public List<String> BFS(List<String> bfsarr){
		List<Value> queue=new ArrayList<>();
		int[] visited=new int[nodes.length];
		queue.add(nodes[0]);
		visited[nodes[0].index]=1;
		while(!queue.isEmpty()) {
			Value currentnode=queue.removeFirst();
			
			bfsarr.add(currentnode.data);
			for(Value val:getNeighbours(currentnode)) {
				if(val==null) continue;
				else {
					if(visited[val.index]==0) {
						queue.add(val);
						visited[val.index]=1;
					}
				}
			}
			
			
		} 
		return bfsarr;
		
	}
	public static void main(String[] args) {
		Value arr[]= {
				new Value("A",0),
				new Value("B",1),
				new Value("C",2),
				new Value("D",3),
				new Value("E",4),
				new Value("F",5),
				new Value("G",6),
				new Value("H",7),
				new Value("I",8),
				new Value("J",9),
				new Value("K",10),
				new Value("L",11),
				new Value("M",12)
		};
		
		GraphBFS obj=new  GraphBFS(arr);
		obj.add(0,1);
		obj.add(0,3);
		obj.add(0,2);
		obj.add(0,4);
		
		obj.add(2,5);
		obj.add(2,6);
		
		
		obj.add(3,7);
		obj.add(3,8);
		
		obj.add(4, 9);
		obj.add(4, 10);
		
		obj.add(1,12);
		obj.add(1,11);
		
		obj.display();
		
		List<String> bfsarr=obj.BFS(new ArrayList<String>());
		System.out.println(bfsarr);
		
		
		
	}
	
}
