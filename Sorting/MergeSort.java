import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
 public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void merge(int arr[],int low,int mid,int high){
        List<Integer> lst = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                lst.add(arr[left]);
                left++;
            }
            else{
                lst.add(arr[right]);
                right++;
            }
        }

            while(left<=mid){
                lst.add(arr[left]);
                left++;
            }

            while(right<=high){
                lst.add(arr[right]);
                right++;
            }

            for(int i=0;i<lst.size();i++){
                arr[low + i] = lst.get(i);
            }

            
        }
        
    

    public static void mergeSort(int arr[],int low,int high){
        if(low==high) return ;

        int mid = (low+high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);

        
    }

    public static void main(String[] args) {
        int arr [] = {9,8,7,6,5,4,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Array: " + Arrays.toString(arr));
    }
    
}
