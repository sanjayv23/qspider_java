package jul_14;

import java.util.Arrays;

public class MinHeap {
	int[] arr;
	int size;
			
	public  MinHeap(int size) {
		arr=new int[size+1];
	}
	public void insert(int val) {
		if(size>=arr.length-1) return;
		arr[++size]=val;
		heapfy(size);
	}
	private void heapfy(int ind) {
		if(ind<=1) return;
		int parent=ind/2;
		if(arr[parent]>arr[ind]) {
			int temp=arr[parent];
			arr[parent]=arr[ind];
			arr[ind]=temp;
		}
		heapfy(parent);
	}
	
	public void display() {
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] num= {15,6,42,16,21,45,1};
		MinHeap obj=new MinHeap(num.length);
		
		
		for(int a:num) {
			obj.insert(a);
		}
		
		obj.display();
		
		
	}
	
	
}
