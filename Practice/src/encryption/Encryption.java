package encryption;

public class Encryption {
	
	public int[] encryptionModule(String msg, int key) {
		char[] k = msg.toCharArray();
		int[] temp =  new int[k.length];
 		for (int i = 0; i < k.length; i++) {
			temp[i] = (int)k[i]*(key*(i+1));
		}
 		//System.out.println(temp);
		return temp;
	}
}
