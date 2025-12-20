
import java.util.HashMap;
import java.util.Map;


public class Isomorphics {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> tempmaps = new HashMap<>();
        Map<Character, Integer> tempmapt = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {

            if (!tempmaps.containsKey(s.charAt(i)))
                tempmaps.put(s.charAt(i), i);
            if (!tempmapt.containsKey(t.charAt(i)))
                tempmapt.put(t.charAt(i), i);

            if (tempmaps.get(s.charAt(i)).equals(tempmapt.get(t.charAt(i))))
                return false;
        }
        return true;

    }

    public static String toLowerCase(String s) {
        StringBuilder tempstring = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
                tempstring.append((char) ascii);
            } else
                tempstring.append(s.charAt(i));
        }

        return tempstring.toString();
    }


    

    public static void main(String[] args) {

        String s = "abcd";
        String y = "abcde";

    }
}