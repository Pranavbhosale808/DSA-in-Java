import java.util.Arrays;

public class BubbleSort {

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=n-1;i>=0;i--){
            boolean flag = false;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    flag=true;
                }
            }
            if(!flag) break;
            // System.out.println("runs");
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
    
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        bubbleSort(arr);
    }
    
}
