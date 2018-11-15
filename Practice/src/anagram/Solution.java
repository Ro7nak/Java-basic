package anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Solution {

	 static boolean isAnagram(String a, String b) {
		 
		// basic check
		 if(a.length()!=b.length())
			return false;
		 
		// invalid input
		 if(a == null || b == null || a.equals("")|| b.equals(""))
			 throw new IllegalArgumentException();
		 
		 a = a.toLowerCase();
		 b = b.toLowerCase();
		 
		 Map<Character, Integer> map = new HashMap<>(); 
		 
		 for (int i = 0; i < b.length(); i++) {
			char letter = b.charAt(i);
			
			if(!map.containsKey(letter))
				map.put(letter, 1);
			else {
				Integer frequency = map.get(letter);
				map.put(letter, ++frequency);
			}
		}
		
		 //check each value with characters in a 
		 
		 for (int i = 0; i < a.length(); i++){
			 char letter = a.charAt(i);
			 
			 if(!map.containsKey(letter))
				 return false;
			 
			 Integer frequency = map.get(letter);
			 if (frequency == 0)
				 return false;
			 else
				 map.put(letter, --frequency);
		 }
			
		 return true;
	 }

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}