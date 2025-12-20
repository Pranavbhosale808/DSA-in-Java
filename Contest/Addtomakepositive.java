import java.util.Scanner;

public class Addtomakepositive {

    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of testcases: ");
        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the ele " + i + ": ");
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            if (sum >= 0) {
                System.out.println(0);
            } else {
                int x = (-sum + n - 1) / n; // minimum X
                System.out.println(x);
            }

            t--;
        }
        sc.close();
    }

}
