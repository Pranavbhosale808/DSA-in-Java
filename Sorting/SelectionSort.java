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
            int mini = i;
            for(int j=i+1;j<n;j++){
                if(arr[mini]>arr[j]) mini=j;
            }
            swap(arr, mini, i);
        }

       System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    swap(arr, i, j);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int index = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>index){
                arr[i+1] = arr[j];
                j--; 
            }
            arr[j+1] = index;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
         int arr[] = {10,20,30,8,7,96};
        insertionSort(arr);
    }
}
