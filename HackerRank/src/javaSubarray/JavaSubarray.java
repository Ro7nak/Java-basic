package javaSubarray;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarray {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        s.nextLine();
	        int a[] = new int[n];
	        for(int i=0; i<n; i++){
	            a[i] = s.nextInt();
	        }
	        int count = 0;
	        for(int i=0;i<a.length;i++){
	            int sum =a[i];
	            if(sum < 0)
	                count++;
	            for(int j=i+1;j<a.length;j++){
	                sum += a[j];
	                    if(sum < 0)
	                        count++;
	            }
	        }
	        System.out.println(count);
	        
	    }
}


/*
sample input:
https://www.hackerrank.com/challenges/java-negative-subarray/problem
5
1 -2 4 -5 1
*/