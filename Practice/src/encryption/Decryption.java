package encryption;

public class Decryption {

	public String decryptionModule (int[] enMsg, int key) {
		int[] k = enMsg;
		char[] temp =  new char[k.length];
		for (int i = 0; i < k.length; i++) {
			temp[i] = (char)(k[i]/(key*(i+1)));
		}
		String ans = "";
		for(int i =0; i< temp.length; i++) {
			ans += temp[i];
		}
		//System.out.println(ans);
		return ans;
	}
	
}
