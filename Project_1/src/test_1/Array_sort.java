package test_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_sort {

	public static int[] a1 = {1,-8,6,0,-5};
	public static int[] a2 = {5,4,3,-1};
	static int length = a1.length+a2.length;
	public static  int[] x = new int[length];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Array_sort a = new Array_sort();
        a.sort(a1, a2);
        for (int i = 0;i<length;i++){
			System.out.print(x[i]);
		}
	}
	
	public int[] sort(int a1[],int a2[]){
		int temp;
		// insert both array in one
		for (int i = 0;i<a1.length;i++){
			x[i]= a1[i];
			//System.out.println(x[i]);
		}
		for (int j = 0;j<a2.length;j++){
			x[a1.length+j]= a2[j];
			//System.out.println(x[j]);
		}
		
		for (int j = 0;j<length;j++){
			//System.out.println(x[j]);
		}
		
		// sort 
		/*for (int i = 0;i<length; i++){
			for (int j = 1;j<length; j++){
				
			if(x[j-1]>x[j]){
				temp = x[j-1];
				x[j-1] = x[j];
				x[j] = temp;
			}
		
		}
		}*/
		Arrays.sort(x);
		return x;
	}

}
