package javaSubstringComparison;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

// https://www.hackerrank.com/challenges/java-string-compare/problem

public class app {
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        SortedSet<String> m=new TreeSet<String>();
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        for (int i = 0; i < s.length()-k+1; i++) {
                m.add(s.substring(i,k+i));
 }
	        Iterator<String> i = m.iterator();
	        while(i.hasNext())
	        	System.out.println(i.next());
	       
	            System.out.println(m.first());
	            System.out.println(m.last());
	        
	        return smallest + "\n" + largest;
	    }
	 
	   public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        getSmallestAndLargest(s, k);
	    }
}
