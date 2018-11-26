package counting_valley;
import java.util.*;

public class Solution {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int valley = 0;     // # of valleys
        int current_level = 0;   // current level
        char[] char_array = s.toCharArray();
        for(char c : char_array){
            if(c == 'U') ++current_level;
            if(c == 'D') --current_level;
            
            // if we just came UP to sea level
            if(current_level == 0 && c == 'U')
                ++valley;
        }
        System.out.print(valley);
    }
}


/*
 sample input:
8
UDDDUDUU
or
12
DDUUDDUDUUUD
 */
