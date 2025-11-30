package Array.Sort;


public class LeetcodeExample {

    public static int singleNumber(int nums[]){
        int result = 0;

        for(int val:nums){
            result ^=val;
            System.out.println(val + ": " + result);
        }
        return result;

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
