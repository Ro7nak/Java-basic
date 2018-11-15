package encryption;

public class Encryption_v2 {

	public int[] encryptionModule(String msg, int key) {
		
		char[] k = msg.toCharArray();
		int[] temp =  new int[k.length];
		
 		for (int i = 0; i < k.length; i++) {
 			char t = (char)((key%26)+key);
			temp[i] = (int)k[i]*((int)t*(i+1));
		}
		return temp;
	}
	
public String encryptionModule2(String msg, int key) {
		
		char[] k = msg.toCharArray();
		String temp =  new String();
		
 		for (int i = 0; i < k.length; i++) {
 			char t = (char)((key%26)+20);
			temp += (char)((int)k[i]*((int)t*(i+1)));
		}
		return temp;
	}
}
