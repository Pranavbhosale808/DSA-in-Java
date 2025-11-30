package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array{

    public static void swap(int arr[],int num1 , int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void searchElement(int arr[],int ele){
          boolean flag=false;
          for(int i=0;i<arr.length;i++){
        if(arr[i]==ele) flag=true;
       }

       if(flag) System.out.println("Yes");

       else System.out.println("No");
    }

    public static void maxElement(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println(max);
    }
    
    public static String checkCoupon(int n,int x,int y,int []prices){
        String mesaage = "NOT COUPON";
        int totalSumWithDiscount=0;
        int totalSum = 0;

            for(int i=0;i<n;i++){
            // Sum without discount
            totalSum+=prices[i];
        }

        for(int i=0;i<n;i++){
            // Sum with appliying discount
            // 1. If the prices[i] < y therefore price[i] =0 
            if(prices[i]<y) prices[i]=0;
            else prices[i]-=y;
            totalSumWithDiscount+=prices[i];
        }

        if(x+totalSumWithDiscount<totalSum) return mesaage="COUPON";

       return mesaage;
    }
  
    public static void checkGroceries(int n,int x,int arrOfFreshness[],int []arrOfPrices){
        int totalSum = 0;
        for(int i=0;i<n;i++){
            if(arrOfFreshness[i]>x) totalSum+=arrOfPrices[i];
        }
        System.out.println("Sum is "+totalSum);
    }

    public static void secondLargestElement(int arr[]){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num:arr){
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }
            else if(num>secondLargest && num!=firstLargest){
                secondLargest=num;
            }
        }

        System.out.println("Max element" + firstLargest);
        System.out.println("Second Max element : " + secondLargest);
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }

        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //            i
        int arr[] = {10,20,30,8,7,96};
        selectionSort(arr);
        // int n = 2;
        // int x = 20;
        // int arrA [] = {15,67};
        // int arrB [] = {10,90};

        //checkGroceries(n,x,arrA,arrB);


    //     int test = sc.nextInt();

    //     while (test>0) {
    //  int arrsize = sc.nextInt();
    //  int x = sc.nextInt();
    //  int y = sc.nextInt();
    //    int arr[] = new int[arrsize];

    //    for(int i=0;i<arrsize;i++){
    //       System.out.println("Enter " + i + " element of the array : ");
    //       arr[i]=sc.nextInt();
    //    }
    //    System.out.println(checkCoupon(arrsize,x,y,arr));
    //    test--;
    //     }

            //############## Search Element #####################
    //    int element = sc.nextInt();
    //    searchElement(arr, element);
      
       sc.close();
    }   
}