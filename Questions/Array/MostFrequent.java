package Questions.Array;

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

    public 
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 2, 4, 4, 1 };
        System.out.println(mostFrequentEven(arr));
    }

}
