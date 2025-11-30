import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class reversekelements {
    /* 
    Input Queue: [10, 20, 30, 40, 50, 60, 70]
    k = 4
    Output Queue: [40, 30, 20, 10, 50, 60, 70]
    */

    public static void reversekelementsofqueue(Queue<Integer> temp , int k){

        if(k<0 || k>temp.size()){
            System.out.println("Size must be greater than zero and less than length of queue");
            return;
        }
        Stack<Integer> tempStack = new Stack<>();

        // 1. It will pop the element need to reverse and add into the stack
        for(int i=0;i<k;i++){
            tempStack.push(temp.remove());
        }

        // 2. Add that elemnt back to the queue from the stack
        while(!tempStack.isEmpty()){
            temp.add(tempStack.pop());
        }

        // 3. other elements need to pop from queue and 
        int rem = temp.size()-k;

        for(int i=0;i<rem;++i){
            temp.add(temp.remove());
        }
        

    }
    public static void main(String[] args) {
        Deque<Integer> tempQueue = new ArrayDeque<>() ;
        tempQueue.add(10);
        tempQueue.add(20);
        tempQueue.add(30);
        tempQueue.add(40);
        tempQueue.add(50);

      System.out.println(Arrays.toString(tempQueue.toArray()));

      reversekelementsofqueue(tempQueue,2);

       System.out.println(Arrays.toString(tempQueue.toArray()));

       


        
    }
    
}
