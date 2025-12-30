import java.util.Arrays;
import java.util.Scanner;

public class NextGreatest {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int mid = 0;
        char ans = letters[0];

        while (left <= right) {
            mid = left - (left - right) / 2;

            if (letters[mid] > target) {
                ans = letters[mid]; // possible answer
                right = mid - 1; // try to find smaller greater
            } else {
                left = mid + 1;
            }
        }

        return ans;

    }

    public static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(s));
    }

    public static String reverseVowels(String s){
        char arr[] = s.toCharArray();
        int n = s.length();
        int left = 0;
        int right = n-1;
        String vowels = "aeiouAEIOU";

        while(left<=right){

            while(left<right && vowels.indexOf(arr[left])==-1){
                left++;
            }

             while(left<right && vowels.indexOf(arr[right])==-1){
                right--;
            }

            swap(arr, left, right);
            left++;
            right--;
          
        }
        String ans = new String(arr);
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ransomNote = "aa";
        String magazine = "ab";


        sc.close();

    }

}
