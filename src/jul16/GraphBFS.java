package jul16;

import jul15.GraphAdjacenyMatrix;

class Value{
	String data;
	int index;
	Value(String data,int index){
		this.data=data;
		this.index=index;
		
	}
}
public class GraphBFS {
	public static void main(String[] args) {
		Value arr[]= {new Value("A",0),
				new Value("B",1),
				new Value("C",2),
				new Value("D",3),
				new Value("E",4)};
		
		
		GraphAdjacenyMatrix obj=new  GraphAdjacenyMatrix(arr);
		obj.add(0,1);
		obj.add(0,3);
		obj.add(1,2);
		obj.add(1,4);
		obj.add(1,0);
		obj.add(3,4);
		obj.add(3, 4);
		obj.add(4,1);
		obj.add(4, 3);
		obj.add(4,2);
		obj.display();
	}
	
	 
	public void BreathFirstSearch() {
		
	}
	
	
}
