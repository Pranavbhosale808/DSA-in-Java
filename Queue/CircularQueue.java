

public class CircularQueue {
    int front;
    int rear;
    int maxSize;
    int arr[];
    int count;


    public CircularQueue(int size){
        front=0;
        rear = -1;
        this.maxSize=size;
        this.arr = new int[size];
        count = 0;
    }

    public void eneque(int element){
        if(isFull()){
            System.out.println("Queue is Full");
            return ;
        }
        rear = (rear+1) % maxSize;
        arr[rear] = element;
        count++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty add some elements ");
        }
        int val = arr[front]; 
        front = (front + 1) % maxSize;
        count--;
        return val;
    }

    public boolean isFull(){
        return (count==maxSize);
    }

    public boolean isEmpty(){
        return (count==0);
    }

    public int peek(){
        return count;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty nothing to show");
        }
        int i = front;
        int tempCount = 0;

        while(tempCount<count){
            System.out.print(arr[i] + ", ");
            i++;
            tempCount++;
        }
    }

    public static void main(String[] args) {
        CircularQueue arrayQueue = new CircularQueue(5);

        arrayQueue.eneque(10);
        arrayQueue.eneque(2);

        System.out.println("Added element: "+arrayQueue.peek());
        System.out.println("Deleted : "+arrayQueue.dequeue());
        System.out.println("Deleted element: "+arrayQueue.peek());

        arrayQueue.display();
    }
    
}
