package sorting;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {
        char[] a1 = new char[a.length()];
        char[] b1 = new char[b.length()];
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i =0; i< a.length(); i++ ){
            a1[i] = a.charAt(i);
            b1[i] = b.charAt(i);
        }
        Arrays.sort(a1);
        Arrays.sort(b1);
        for(int i =0;i<a.length();i++){
            if (a1[i]!=b1[i])
                return false;
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
