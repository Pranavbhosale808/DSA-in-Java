import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderInArray {
    
    public static void leaderInArray(int nums[]){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        List<Integer> temp = new ArrayList<>();

        for(int i=n-1;i>=0;i--){

            if(nums[i]>max){
                temp.add(nums[i]);
            }

            max = Math.max(max, nums[i]);
        }
   System.out.println(Arrays.toString(temp.toArray()));
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        leaderInArray(arr);
    }
}
