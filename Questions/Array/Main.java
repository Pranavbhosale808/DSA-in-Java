package Questions.Array;

import java.util.ArrayList;
import java.util.List;


public class Main{

    public static List<Integer> unionArr(int arrOne[],int arrTwo[]){
        List<Integer> temp = new ArrayList<>();
        int n1 = arrOne.length;
        int n2 =arrTwo.length;
        int i = 0;
        int j = 0;


        while(i<n1 && j<n2){

            // Check if arrOne[i] is less than wqual to second array
            if(arrOne[i]<=arrTwo[j]){
                if(arrOne.length==0 || !temp.contains(arrOne[i])){
                    temp.add(arrOne[i]);
                }
                i++;
            }

            // chehck if arrTwo[i] is less another array
            else{
                if(arrTwo.length==0 || !temp.contains(arrTwo[j])){
                    temp.add(arrTwo[j]);
                }
                j++;
            }
        }


        while(i<n1){
            if(arrOne[i]<=arrTwo[j]){
                if(arrOne.length==0 || !temp.contains(arrOne[i])){
                    temp.add(arrOne[i]);
                }
                i++;
            }
        }

        while(j<n2){
            if(arrTwo.length==0 || !temp.contains(arrTwo[j])){
                temp.add(arrTwo[j]);
            }
            j++;
        }
        return temp;
    
    }
   
    public static int missingNumber(int nums[]){
        int n  = nums.length;
        int missingNumber = 0;

        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<=n;i++) { temp.add(i);}

        for(int i=0;i<n;i++){
                
        }

    

        

        return missingNumber;
    }
    public static void main(String[] args) {
        int arr[] = {0,1};
        List<Integer> temp = new ArrayList<>();
        int missingNumber = 0;

     
        System.out.println(missingNumber);


        
        //System.out.println(missingNumber(arr));
        
    


        
    }

}