import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {

    public static boolean wordpattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String ,Character> map2 = new HashMap<>();

        String[] sarr = s.trim().split("\\s+");

        if (pattern.length() != sarr.length) return false;

        for (int i = 0; i < pattern.length(); i++) {

            if (map.containsKey(pattern.charAt(i))) {
            if(!map.get(pattern.charAt(i)).equals(sarr[i]))  return false;
            }
            else  map.put(pattern.charAt(i), sarr[i]);

            if(map2.containsKey(sarr[i])) 
                {if(!map2.get(sarr[i]).equals(pattern.charAt(i))) return false;}
            else map2.put(sarr[i], pattern.charAt(i));
            
        }
        return true;

    }

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat fish";

        boolean val = wordpattern(pattern, s);
        System.out.println("Output " + val);

    }

}
