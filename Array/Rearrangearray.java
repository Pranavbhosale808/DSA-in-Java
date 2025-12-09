import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rearrangearray {

    public static int[] rearrangeArray(int nums[]){
        int n = nums.length;
        int posnums[] = new int[n/2];
        int negnums[] = new int[n/2];
        int p=0;
        int ne=0;

        for(int i=0;i<n;i++){
            if(nums[i]>=0) posnums[p++] = nums[i];
           else  negnums[ne++] = nums[i];
        }

        int posIndex=0;
        int negIndex=1;
       for(int i=0;i<n/2;i++){
            nums[posIndex] = posnums[i];
            nums[negIndex] = negnums[i];
            posIndex = posIndex+2;
            negIndex = negIndex+2;
       }

       return nums;
    }

    public static void rearrangeArrayVariation(int arr[]){
        int n = arr.length;
        List<Integer> poslst = new ArrayList<>();
        List<Integer> neglst = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]>=0) poslst.add(arr[i]);
            else neglst.add(arr[i]);
        }

        for(int i=0;i<n;i++){
            arr[i*2] = poslst.get(i);
            arr[i*2+1] = neglst.get(i);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }   
    
}
