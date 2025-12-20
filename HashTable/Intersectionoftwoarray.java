package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Intersectionoftwoarray {
    // nums1 = [1,2,2,1], //
    // nums2 = [2,2] //

    public static int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j = 0;
        int  k =0;

        while(i<n && j<m){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0, k);
       
    }

    public static void main(String[] args) {

        
    }

}
