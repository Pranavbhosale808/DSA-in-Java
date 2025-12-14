import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CouponCodeValidator {

    
       public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
            int n = code.length;
            List<String> temp = new ArrayList<>();
            List<String> e = new ArrayList<>();
            List<String> g = new ArrayList<>();
            List<String> p = new ArrayList<>();
            List<String> r = new ArrayList<>();

            for(int i=0;i<n;i++){
                if(isActive[i]){
                if(code[i].matches("[a-zA-Z0-9_]+"))
                    {
                        if(businessLine[i].equals("electronics") ) e.add(code[i]);
                        else if(businessLine[i].toString().equals("grocery") ) g.add(code[i]);
                        else if(businessLine[i].toString().equals("pharmacy")) p.add(code[i]);
                        else if(businessLine[i].toString().equals("restaurant")) r.add(code[i]);

                        }
                       
            }
        }

        // Sort the collections
        Collections.sort(e);
        Collections.sort(g);
        Collections.sort(p);
        Collections.sort(r);

        temp.addAll(e);
        temp.addAll(g);
        temp.addAll(p);
        temp.addAll(r);

        return temp;
    }

    public static void main(String[] args) {
       String code[] = {"SAVE20","","PHARMA5","SAVE@20"};
       String businessLine[]={ "restaurant","grocery","pharmacy","restaurant"};
       boolean isActive []= {true,true,true,true};

       List<String> lst = validateCoupons(code, businessLine, isActive);
       System.out.println(Arrays.toString(lst.toArray()));



        
    }
    
}
