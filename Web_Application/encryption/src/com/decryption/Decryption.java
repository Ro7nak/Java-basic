package com.decryption;

public class Decryption {

	public String decryptionModule (String enMsg, int key) {
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
