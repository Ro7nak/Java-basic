package intro;
import java.io.*;
import java.util.*;
import java.text.*;

public class Java_Currency_Formatter {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
	        Locale indLocale = new Locale("en", "IN");
	        NumberFormat india = NumberFormat.getCurrencyInstance(indLocale);
	        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        // Write your code here.
	        
	        System.out.println("US: " + us.format(payment));
	        System.out.println("India: " + india.format(payment));
	        System.out.println("China: " + china.format(payment));
	        System.out.println("France: " + france.format(payment));
	    }
	}

/*
sample input:
12324.134
*/
