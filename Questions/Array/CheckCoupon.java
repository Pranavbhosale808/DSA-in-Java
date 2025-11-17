package Questions.Array;

public class CheckCoupon {
    public static void main(String[] args) {

        // Inputs 
        int n = 4;
        int prices[] = {15 ,8, 22, 6};
        int x = 30;
        int y = 10;


  // Intilizations
        int totalSumWithDiscount=0;
        int totalSum = 0;


        // Logic
         for(int i=0;i<prices.length;i++){
            // Sum without discount
          totalSum+=prices[i];

          
        }

        for(int i=0;i<prices.length;i++){
            // Sum with appliying discount
            // 1. If the prices[i] < y therefore price[i] =0 
            if(prices[i]<y) prices[i]=0;
            else prices[i] = prices[i] - y;
            totalSumWithDiscount+=prices[i];
        }


        System.out.println("totalSum " + totalSum);
        System.out.println("totalSumWithDiscount " + totalSumWithDiscount);

       if(x+totalSumWithDiscount<totalSum) System.out.println("COUPON");

       else System.out.println("NOT COUPON");
    }

    
}   
