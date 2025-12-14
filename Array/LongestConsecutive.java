import java.util.Arrays;

public class LongestConsecutive {

    public static int longestConsecutive(int arr[]){
        int n = arr.length;
        int count  = 0;
        int lastSmaller  = Integer.MIN_VALUE;
        int longest = 1;

        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            if(arr[i]-1==lastSmaller){
                count++;
                lastSmaller=arr[i];
            }
            else if(arr[i]!=lastSmaller){
                count=0;
                lastSmaller=arr[i];
            }

            longest = Math.max(longest,count);
        }

        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {5,8,3,2,1,4};
        System.out.println(longestConsecutive(arr));
    }
}