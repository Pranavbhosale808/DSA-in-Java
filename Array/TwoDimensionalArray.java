import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoDimensionalArray {

    public static boolean isAnagram(String s,String t){
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr, tarr);
    }

    public static void main(String[] args) {
      
        String str1 = "anagram";
        String str2 = "nagaras";

        boolean flag = isAnagram(str1, str2);
        System.out.println(flag);

      
       
    }
}
