package Questions.Array;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int nums[],int target){
        int arr[] = new int[2];
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static int[] twoSumOptimal(int nums[],int target){
        int n  = nums.length;
        int left = 0;
        int right = n-1;
        int sum = 0;
        int arr[] = new int[2];

        while(left<right){
            sum =  nums[left] + nums[right];
            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
            else {
                arr[0] = left;
                arr[1] = right;
                return arr;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {

        int arr[] = {3,2,4};
        System.out.println(Arrays.toString(twoSumOptimal(arr, 6)));
        
    }
    
}
