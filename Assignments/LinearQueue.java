package Assignments;


public class LinearQueue {
    
    public int front;
    public int rear;
    public int maxsize;
    public int arr[];

    public LinearQueue(int maxsize){
        front = 0;
        rear = -1;
        this.maxsize = maxsize;
        this.arr = new int[maxsize];
    }

    public boolean isFull(){
        if(rear==maxsize-1) return true;
        return false;
    }

    public boolean isEmpty(){
        if(rear==-1) return true;
        return false;
    }

    public void eneque(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        rear++;
        arr[rear] = val;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1 ;
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
            System.out.println("Quue is empty");
            return -1;
        }

        return arr[rear];
    }

    public void traverse(){
       if(isEmpty()){
        System.out.println("Queue is empty");
        return ;
       }

        for(int i=front;i<=rear;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        LinearQueue lq = new LinearQueue(10);

        lq.eneque(10);
        lq.eneque(20);
        lq.eneque(30);
        lq.eneque(40);
        lq.eneque(50);
        lq.eneque(60);
        lq.eneque(70);
        lq.eneque(80);
        lq.eneque(90);
        lq.eneque(100);
        
        System.out.println("Front -> " + lq.peek());
        System.out.println("Rear -> " + lq.getRear());
        lq.traverse();

        lq.dequeue();

        
        System.out.println("Front -> " + lq.peek());
        System.out.println("Rear -> " + lq.getRear());
        lq.traverse();



        
    }
    
}
