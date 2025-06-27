package marquee_jun25;



public class StackImplementationArray {
	public static void main(String[] args) {
		stack st=new stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		st.display();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		st.display();
	}	
}
class stack{
	int[] arr=new int[10];
	int top=-1;
	
	boolean isEmpty() {
		return top==-1;
	}
	
	boolean isFull() {
		return top==arr.length-1;
	}
	
	boolean push(int val) {
		if(isFull()) {
			int[] temp=new int[arr.length*2];
			for(int i=0;i<arr.length;i++) {
				temp[i]=arr[i];
			}
			arr=temp;
		}
		arr[++top]=val;
		return true;
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("StackUnderFlow");
			return -1;
		}
		if(top<arr.length/2) {
			int[] temp=new int[arr.length/2];
			for(int i=0;i<=top;i++) {
				temp[i]=arr[i];
			}
			arr=temp;
		}
		return arr[top--];
		
		
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("StackUnderFlow");
			return -1;
		}
		return arr[top];
	}
	
	void display() {
		System.out.println("---------DISPLAY--------");
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------END----------");
	}
	
	
}
