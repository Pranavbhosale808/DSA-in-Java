

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public static int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        int n = nums.length;
        
        for(int num:nums){
            if(num%2==0){
                tempMap.put(num, tempMap.getOrDefault(num, 0)+1);
            }
        }

        if(tempMap.isEmpty()) return -1;

        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;


        for(Map.Entry<Integer,Integer> entry : tempMap.entrySet()){
            int value  = entry.getValue();
            int freq = entry.getKey();

            if(freq>maxFreq ||  (freq==maxFreq && value < ans)){
                maxFreq= freq;
                ans=value;
            }
        }

        return ans;
    }

    public static int  findLucky(int nums[]){
        Map<Integer,Integer> tempMap = new HashMap<>();
        int ans   = -1;
  

        for(int val:nums){
            tempMap.put(val,tempMap.getOrDefault(val, 0)+1);
        }

        for(int key : tempMap.keySet()){
            if(key==tempMap.get(key)){
                ans = Math.max(ans,key);
            }
        }
        return ans;
    }

    public static int countElements(int arr[],int k){
        int n = arr.length;
        int max  = Integer.MIN_VALUE;

        Map<Integer,Integer> tempMap = new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            tempMap.put(arr[i],n-i- 1);
        }

        for(Map.Entry<Integer,Integer> entry : tempMap.entrySet()){
            System.out.println("Key: " + " " + entry.getKey() + " " + " Value : " + entry.getValue());
            if(entry.getValue()>max){
                    max = entry.getValue();
            }
        }

        return max;
    }

    
    public static void main(String[] args) {
        int arr[] = {6,3,5,2};
    }

}
