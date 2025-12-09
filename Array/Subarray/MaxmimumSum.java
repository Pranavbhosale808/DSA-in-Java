package Subarray;

public class MaxmimumSum {

    public static int maximumSumSubArrayByK(int arr[], int k) {
        int n = arr.length;

        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }

        }

        return len;
    }

    public static int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxiMum = Integer.MIN_VALUE;

        if(n==1) return nums[0];

        for (int i = 0; i < n; i++) {
             int sum = 0;
            for (int j = i; j < n; j++) {
               sum += nums[j];
                maxiMum = Math.max(maxiMum, sum);
            }

        }
        return maxiMum;
    }

    public static void main(String[] args) {
        int arr[] = { -3,-2,-2,-3};
        System.out.println("Maximum Sub Array : " + maxSubArray(arr));

    }

}
