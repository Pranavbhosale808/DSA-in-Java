import java.util.Arrays;

public class LinearQueue {

    int front ;
    int rear ;
    int maxSize;
    int arr[];
    int count ;
    public LinearQueue(int size){
        front=0;
        rear=-1;
        this.maxSize=size;
        this.arr = new int[size];
    }

    public boolean isFull(){
        return (rear==maxSize-1);
    }

    public boolean isEmpty(){
        return (rear==-1);
    }

    public void eneque(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return ;
        }
        rear++;
        arr[rear] = element;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty nothing to show");
            return -1;
        }

        int val = arr[front];
        front++;
        return val;
    }

    public int peek(){
        return arr[front];
    }

    public int getRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return arr[rear];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return ;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        LinearQueue linearQueue = new LinearQueue(5);
        linearQueue.eneque(10);
        linearQueue.eneque(20);
        linearQueue.eneque(30);
        linearQueue.eneque(40);
        System.out.println("Peek : " + linearQueue.peek());
        System.out.println("Get Rear : " + linearQueue.getRear());

        linearQueue.dequeue();
        System.out.println("Peek : " + linearQueue.peek());

        linearQueue.display();

    }
    
}
