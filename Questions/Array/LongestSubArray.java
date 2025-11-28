package Questions.Array;

public class LongestSubArray {

    public static int LongestSubArrayindex(int [] arr,int k){
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i+1;j<arr.length;j++){
                sum += arr[j];

                if(sum==k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 1, 1, 1, 1};
        System.out.println(LongestSubArrayindex(arr, 3));      
    }
    
}
