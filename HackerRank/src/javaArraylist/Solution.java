package javaArraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int d,q,x,y;
    ArrayList[] set = new ArrayList[n];
    for(int i=0;i<n;i++){
        d = in.nextInt();
        set[i] = new ArrayList();
        for(int j=0;j<d;j++){  
            set[i].add(in.nextInt());                
        }
    }
    q=in.nextInt();
    for(int i=0;i<q;i++){
        x=in.nextInt();
        y=in.nextInt();
        try{
            System.out.println(set[x-1].get(y-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
    }
    }
}


/*

https://www.hackerrank.com/challenges/java-arraylist/problem

sample input:
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

*/