package javaMap;

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		Map<String, Integer> m = new HashMap<>();
        for (int i =0;i<n;i++){
            String temp = s.next();
            temp+= s.nextLine();
            //System.out.println(temp);
            //s.nextLine();
            Integer k = s.nextInt();
            //System.out.println(k);
            m.put(temp,k);
        }
        while(s.hasNextLine()){
            String temp = s.next();
            temp += s.nextLine();
            if(m.get(temp)==null)
                System.out.println("Not found");
            else
                System.out.println(temp+"="+m.get(temp));
        }
	}
}


/*
sample input:
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

*/