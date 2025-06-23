package marque;

import java.util.Arrays;

public class Array {
	
	 int[] arr=new int[10];
	 int index=-1;
	
	public  boolean IsEmpty() {
		return index==-1;
		
	}
	public  boolean IsFull() {
		return index==arr.length-1;
	}
	
	
	public boolean Append(int num) {
		if(IsFull()) return false;
		index++;
		arr[index]=num;
		return true;
	}
	
	public boolean Prepend(int num) {
		if(IsFull()) return false;
		for(int i=index;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=num;
		index++;
		return true;		
	}
	public boolean Insert(int num,int ind) {
		if(ind<0 || ind>=arr.length) return false;
		if(IsFull()) {
			
		}
		if(ind>index) {
			arr[++index]=num;
			return true;
		}
		for(int i=index;i>=ind;i--) {
			arr[i+1]=arr[i];
		}
		arr[ind]=num;
		index++;
		return true;
	}
	public boolean DeleteAtFirst() {
		if(IsEmpty()) return false;
		
		for(int i=1;i<=index;i++) {
			arr[i-1]=arr[i];
		}
		arr[index--]=0;
		return true;
	}
	
	public boolean DeleteAtLast(){
		if(IsEmpty()) return false;
		arr[index--]=0;
		return true;
	}
	
	
	public boolean DeleteInd(int ind) {
		if(IsEmpty()) return false;
		for(int i=ind+1;i<=index;i++) {
			arr[i-1]=arr[i];
		}
		arr[index--]=0;
		return false;
	}
	
	public int DisplayElement(int ind) {
		if(ind<0 || ind>=arr.length) return -1;
		return arr[ind];
	}
	
	public static void main(String[] args) {
		Array obj=new Array();
		//System.out.println(obj.IsEmpty()+" "+obj.IsFull());
		System.out.println(Arrays.toString(obj.arr));
		
		obj.Append(1);
		//System.out.println(obj.IsEmpty()+" "+obj.IsFull());
		System.out.println(Arrays.toString(obj.arr));
		
		obj.Append(2);
		//System.out.println(obj.IsEmpty()+" "+obj.IsFull());
		System.out.println(Arrays.toString(obj.arr));
		
		obj.Append(3);
		//System.out.println(obj.IsEmpty()+" "+obj.IsFull());
		System.out.println(Arrays.toString(obj.arr));
		
		
		obj.Prepend(4);
		System.out.println(Arrays.toString(obj.arr));
		
		obj.Append(6);
		System.out.println(Arrays.toString(obj.arr));
		
		//won't execute becoz of array is full
		//obj.Prepend(664);
		//System.out.println(Arrays.toString(obj.arr));
		
		obj.Insert(23, 0);
		System.out.println(Arrays.toString(obj.arr));
		
		obj.DeleteAtFirst();
		System.out.println(Arrays.toString(obj.arr));
		
		obj.DeleteAtLast();
		System.out.println(Arrays.toString(obj.arr));
		
		
		obj.DeleteInd(0);
		System.out.println(Arrays.toString(obj.arr));
		
		
	}
		
	
}
