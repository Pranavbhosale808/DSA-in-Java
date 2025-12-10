import java.util.Arrays;

public class NextPermutation {

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void next_permuattaion(int nums[]){
        int n = nums.length;
        int ind = -1;

        // To get the longest prefix
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }

         if(ind==-1){
            Arrays.sort(nums);
        }
        else{
        // To get the numsber slighlty greater than ind and then swap that numsber
        for(int i=n-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums, ind, i);
                break;
            }
        }

        // SOrting reaming elements
        for(int i=ind+1;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    swap(nums, i, j);
                }
            }
        }
    }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
         System.out.println("Before Permutation: " + Arrays.toString(arr));
        next_permuattaion(arr);
        System.out.println("After Permuattion: " + Arrays.toString(arr));
        
    }
    
}
