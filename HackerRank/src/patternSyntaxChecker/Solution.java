package patternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	try{
          	
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
		}
	}
}


/*
 
 https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 
 sample input:
 3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
 */
