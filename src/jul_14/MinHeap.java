package jul_14;

import java.util.Arrays;

public class MinHeap {
	int[] arr;
	int size;
			
	public  MinHeap(int size) {
		arr=new int[size+1];
	}
	public void insert(int val) {
		if(IsFull()) return;
		arr[++size]=val;
		HeapfyBottomTop(size);
	}
	public void HeapfyBottomTop(int ind) {
		if(ind<=1) return;
		int parent=ind/2;
		if(arr[parent]>arr[ind]) {
			int temp=arr[parent];
			arr[parent]=arr[ind];
			arr[ind]=temp;
		}
		HeapfyBottomTop(parent);
	}
	
	public void display() {
		System.out.println(Arrays.toString(arr));
	}
	
	public Integer peek() {
		return IsEmpty()?null:arr[1];
	}
	
	public boolean IsEmpty() {
		
		return size==0?true:false;
	}
	public boolean IsFull() {
		
		return size==arr.length-1?true:false;
	}
	
	public void delete() {
		if(IsEmpty()) {
			System.out.println("Heap Empty");
			return;
			
		}
		arr[1]=arr[size--];
		HeapifyTopBottom(1);
	}
	private void HeapifyTopBottom(int ind) {
		int left=ind*2;
		int right=ind*2+1;
		if(size<left) return;
		if(size==left && arr[left]<arr[ind]) {
			// swap arr[left] and a[ind]			
			arr[left]=(arr[left]+arr[ind])-(arr[ind]=arr[left]);
		}
		else {
			int min=arr[left]<arr[right]?left:right;
			if(arr[ind]>arr[min]) {
				// swap arr[ind] and arr[min]
				arr[ind]=(arr[ind]+arr[min])-(arr[min]=arr[ind]);
				HeapifyTopBottom(min);
			}
		}
	}
	public static void main(String[] args) {
		int[] num= {15,6,42,16,21,45,1};
		MinHeap obj=new MinHeap(num.length);
		
		
		for(int a:num) {
			obj.insert(a);
		}
		obj.delete();
		obj.display();
		
		
	}
	
	
}
