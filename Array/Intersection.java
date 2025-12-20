import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static int[] intersection(int nums1[],int nums2[]){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
       
        for(int val1:nums1){
            if(!set1.contains(val1)){
                set1.add(val1);
            }
        }

         for(int val1:nums2){
            if(set1.contains(val1)){
                set2.add(val1);
            }
        }

         int [] arr = new int[set2.size()];
        int i=0;
        for(int val:set2){
            arr[i++]=val;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,2,1};
        int arr2[] = {2,2};

        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
    
}
