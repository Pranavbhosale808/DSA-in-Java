import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {

        List<String> temp = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                temp.add("FizzBuzz");
            } else {
                if (i % 3 == 0) {
                    temp.add("Fizz");
                } else if (i % 5 == 0) {
                    temp.add("Buzz");
                } else {
                    temp.add(Integer.toString(i));
                }
            }
        }

        return temp;
    }

    public static int countSegments(String s) {
        // if(s.length()==0) return 0;
        // String reg = "[\\s]+";
        // String []arr = s.split(reg);
        // System.out.println(Arrays.toString(arr));

        // return arr.length;
        int count=0;
        boolean flag = false;

        for(char c : s.toCharArray()){
            if(c!=' ' || !flag){
                count++;
                flag=true;
            }
            else if(c==' '){
                flag = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //51391
        for(int i=99;i>0;i/=2){

        }

        sc.close();
    }

}
