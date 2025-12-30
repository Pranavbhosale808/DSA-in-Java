
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Unique {

      public static int firstUniqChar(String s) {
        Map<Character,Integer> temp = new HashMap<>();

        for(char c : s.toCharArray()){
            temp.put(c,temp.getOrDefault(c, 0) +1);
        }

        for(int i=0;i<s.length();i++){
            if(temp.get(s.charAt(i))==1){
                return i;
            }
        }
        
        return -1;
    }

    public static char findTheDifference(String s , String t){
        int arr[] = new int[26];

        for(int i=0;i<t.length();i++){
            int index = t.charAt(i) - 'a';
            arr[index]++;
        }

        System.out.println(Arrays.toString(arr));
        
         for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            arr[index]--;
        }
        System.out.println(Arrays.toString(arr));

        for(char c ='a';c<='z';c++){
          if(  arr[c - 'a'] == 1){
            return c;
          }
        }
       return 'a';
      
    }

    public static void main(String[] args) {
        int a = 'a';
        int b = 'A';

        System.out.println("Value of a is : " + a + " Value of A is " + b);
        // String s = "abcd";
        // String t = "abcda";
        
        // System.out.println(findTheDifference(s, t));
    }
    
}
