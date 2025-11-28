package Questions.Array;

public class SecondLargest {

    public static int secondLargest(int arr[]){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest ){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void removeDuplicateFromArray(int arr[]){
        int i = 0;

        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        System.out.println(i+1);
    }

    public static void main(String[] args) {
        
        int arr[] = {1,1,3,1,2,3,4,1,2,3};
        removeDuplicateFromArray(arr);
    }
    
}
