package Contest;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Map<Integer, Integer> map = new HashMap<>();
		
		
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		while(cases > 0){
		    
		    int cars = in.nextInt();
		    
		    int maxValue = 0;
		    int maxKey = -1;
		    for (int i=1; i<=cars; i++){
		        int km = in.nextInt();
		        int sec = in.nextInt();
		        
		        int avg = km / sec;
		        map.put(i, avg);
		        
		        for (Map.Entry<Integer, Integer> entry : map.entrySet() ) {
		            if(entry.getValue() > maxValue){
		                maxValue = entry.getValue();
		                maxKey = entry.getKey();
		            }
		        }
		        
		    } 
		    
		    System.out.println(maxKey);
		    
		    cases--;
		}

	}
}
