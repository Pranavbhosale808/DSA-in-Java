import java.util.Arrays;

public class TimeRequiredToBuy {

    public static int timeRequiredToBuy(int arr[],int k){
        int n = arr.length;

        int time=0;

        for(int i=0;i<n;i++){
            if(i<=k){
                time =+ Math.min(arr[i], arr[k]);
            }
            else time+= Math.min(arr[i], arr[k]-1);
        }
        return time;
        // int front = 0;
        // int rear = n - 1;
        // int count = 0;

        // while(front!=rear){
        //     arr[front] = arr[front] - 1;
        //     front = (front+1)%n;
        //     rear = (rear + 1)%n;
        //     count++;
        // }
        // return count;
    }

    public static void swap(int arr[],int num1,int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void swap(String arr[],int num1,int num2){
        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void sortColors(int[] nums) {
        int n =nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    swap(nums,i,j);
                }
            }
        }
        
    }

     public static String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(heights[j]>heights[i]){
                swap(names, i, j);
                swap(heights,i,j);
              }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String names[] ={"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int heights[] = {180,165,170,17233,32521,14087,42738};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Heights: "+ Arrays.toString(heights));
    }
    
}
