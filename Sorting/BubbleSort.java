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
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
    
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        bubbleSort(arr);
    }
    
}
