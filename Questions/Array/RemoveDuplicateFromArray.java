package Questions.Array;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        
        int arr[] = {1,2,5,6,9,1};
        Arrays.sort(arr);

        int i =0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,i+1)));
    }
    
}
