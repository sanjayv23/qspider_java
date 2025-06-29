package marquee_jun25;

public class QueueByLL {
	static class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
        }
    }
	int size;
    Node top;
    Node rear;    
    int total;
    
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        
        Node newNode=new Node(value);
        if(isEmpty()){
            top=rear=newNode;
            rear.next=top;
            
        }
        else{
            rear.next=newNode;
            rear=rear.next;
            rear.next=top;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        top=top.next;
        rear.next=top;
        size--;
        return true;    
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return top.data;
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return rear.data;
    }
    
    public boolean isEmpty() {
        return size==0;    
    }
    
    public boolean isFull() {
        return false;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        Node i = top;
        do{
            System.out.print(i.data+ " ");
            
            i=i.next;
        }while (i!=top) ;
        System.out.println();
    }
    
    public static void main(String[] args) {
    	QueueByLL cq = new QueueByLL();

        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);
        cq.enQueue(40);
        cq.enQueue(50); // Should say full

        cq.display();

        cq.deQueue();
        cq.deQueue();

        cq.display();

        cq.enQueue(60);
        cq.enQueue(70); // Should work fine with wrap around

        cq.display();

        System.out.println("Peek: " + cq.Front());
	}
}

