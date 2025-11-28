import java.util.Arrays;

public class SelectionSort {
    
    public static void swap(int arr[],int num1 , int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
         int arr[] = {10,20,30,8,7,96};
        selectionSort(arr);
    }
}
