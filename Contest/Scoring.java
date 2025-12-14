public class Scoring{

    public static void scoringCode(int x,int y){
        if(y==1) System.out.println(1 + " " + 0);
        else if(y==0) System.out.println(0 + " " + 0);

     
        else{ for(int i=0;i<y;i++){
            if((i+x)+i==y) {
                System.out.println((i+x) + " " + i);
            }
        }
    }
    }

    public static int bestSeats(int n,int arr[]){
        int cost = Integer.MAX_VALUE;
        if(n==2){
            cost  = arr[0] + arr[1];
            return cost;
        }
        
        for(int i=0;i<n-1;i++){
            int tempcost = arr[i]+arr[i+1];
            cost = Math.min(cost, tempcost);
        }
        return cost;
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {100, 98, 97, 99, 97};

        System.out.println(bestSeats(n, arr));
       
        
    }
}