package encryption;

public class Decryption_v2 {

	public String decryptionModule (int[] enMsg, int key) {
		int[] k = enMsg;
		char[] temp =  new char[k.length];
		for (int i = 0; i < k.length; i++) {
			char t = (char)((key%26)+key);
			temp[i] = (char)(k[i]/((int)t*(i+1)));
		}
		String ans = "";
		for(int i =0; i< temp.length; i++) {
			ans += temp[i];
		}
		return ans;
	}
	
	public String decryptionModule2 (String enMsg, int key) {
		char[] k = enMsg.toCharArray();
		int[] temp =  new int[k.length];
		for (int i = 0; i < k.length; i++) {
			char t = (char)((key%26)+20);
			temp[i] = (int)((int)k[i]/((int)t*(i+1)));
		}
		String ans = "";
		for(int i =0; i< temp.length; i++) {
			ans += (char)temp[i];
		}
		return ans;
	}
}
