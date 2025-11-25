import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Questions {

    public static int singleNumber(int nums[]){

      Map<Integer,Integer> myMap = new HashMap<>();
      int count  = 0;
      int n = nums.length;

      for(int i=0;i<n;i++){
        for(int j = i+1;j<n;j++){
            if(nums[i]==nums[j]){
                count++;
            }
        }
        myMap.put(count, i);
      }

      

    }

    public static int missingNumber(int nums[]){

        int n = nums.length;

        for(int i=1;i<=n;i++){
            boolean flag = false;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    flag = true;
                    break;
                }
            }
            if(flag==false) return i;
        }
        return 0;
    }

    public static int missingNumberOptimal(int nums[]){
        int n = nums.length;
        int toatalSum  = 0;
        int arrSum = 0;

        for(int i=0;i<=n;i++){
            toatalSum+=i;
        }

        for(int i=0;i<n;i++){
            arrSum+=nums[i];
        }

        return toatalSum-arrSum;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count  = 0;
        int maxCount  = 0;

        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;  
                if(count>maxCount) {
                maxCount=count;
             }      
            }
            else{
           
             count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {

        int arr[] = {2,2,1};
        System.out.println(singleNumber(arr));
        
    }
    
}
