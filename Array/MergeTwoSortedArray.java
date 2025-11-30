package Array;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void mergeSorted(int nums1[],int nums2[]){
        /* 
       nums1 = [1,2,3,0,0,0], m = 3, 
       nums2 = [2,5,6], n = 3

       Output: [1,2,2,3,5,6]
     */
        int m = nums1.length - 1;
        int n = nums2.length - 1;
       int i=0;
       int j=0;

       while(i<m && j<n){
        if(nums1[i]<nums2[j])
            i++;
       }
       
       for(int k=i;k<n-1;k++){
        nums1[k+1] = nums1[k];
       }
       nums1[i] = nums2[j];
       j++;

       while(j<n){
        nums1[i] = nums2[j];
        j++;
       }

    }

        
    public static int countZeroPermutation(int arr[]){
        int n = arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0 && arr[i+1]==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
      int arr1[] = {1,2,3,0,0,0};
      int arr2[] = {2,4,5};
      System.out.println(Arrays.toString(arr1));
      mergeSorted(arr1,arr2);
      System.out.println(Arrays.toString(arr1));
      
    }
       
    
}
