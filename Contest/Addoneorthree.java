import java.util.Scanner;
public class Addoneorthree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0;i<n;i++){
            int diff  = m-x;
            if(diff>3 || (x+3)==m){
                x+=3;
            }
            else{
                x+=1;
            }
        }

        if(x==m) System.out.println("YES");
        else System.out.println("NO");

        sc.close();
    }
    
}
