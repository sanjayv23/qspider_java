package marquee_jun25;
public class QueueByArray {
    int[] arr=new int[10];
    int front=-1, rear=-1;
    int size=0;
    int total=arr.length; 
    

    // Check if the queue is full
    public boolean isEmpty() {
        return size==0;    
    }
    
    public boolean isFull() {
        return size==total;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } 
        else {
            rear = (rear + 1) % total;
        }

        
        arr[rear]=value;
    
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        
        
    
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % total;
        }
        size--;
        return true;    
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear];
    }
    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % total;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        QueueByArray cq = new QueueByArray();

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
