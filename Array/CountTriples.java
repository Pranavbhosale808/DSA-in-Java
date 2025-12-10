import java.util.Scanner;
public class CountTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count=0;

      for(int a=1;a<n;a++){
        for(int b=1;b<n;b++){
            for(int c=1;c<n;c++){
                if((a*a)+(b*b)==(c*c)) count++;
            }
        }
      }

      System.out.println("Count is " + count);

      sc.close();
    }
    
}
