import java.util.*;

public class BuyAndSell{

    public static int buyAndSellStock(int arr[]){
        int n = arr.length;

        int profit = 0;
        int mini = arr[0];

        for(int i=1;i<n;i++){
            int cost = arr[i] - mini;
            profit = Math.max(profit,cost);
            mini = Math.min(arr[i],mini);
        }
        return profit;
    }
public static void main(String[] args) {
    int arr[] = {7,6,4,3,1};
    System.out.println("Profit is " + buyAndSellStock(arr));
}

}