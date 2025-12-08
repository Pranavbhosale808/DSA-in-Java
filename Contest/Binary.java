import java.util.ArrayList;
import java.util.Arrays;

public class Binary {

    public static int[] sortBinaryReflection(int nums[]) {
        int n = nums.length;
        String binaryString = "";
        ArrayList<String> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            binaryString = Integer.toBinaryString(nums[i]);
            StringBuilder string = new StringBuilder(binaryString);
            lst.add(string.reverse().toString());
        }

        for(int i=0;i<n;i++){
            for(String var:lst){
                
            }
        }

        return nums;
    }

    public static String addBinary(String a , String b){
        
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 4 };
        System.out.println(Arrays.toString(sortBinaryReflection(arr)));
        // System.out.println(Arrays.toString(arr));
    }
}
