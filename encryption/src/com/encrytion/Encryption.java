package com.encrytion;

public class Encryption {
	
	public String encryptionModule(String msg, int key) {
		
		char[] k = msg.toCharArray();
		String temp =  new String();
		
 		for (int i = 0; i < k.length; i++) {
 			char t = (char)((key%26)+20);
			temp += (char)((int)k[i]*((int)t*(i+1)));
		}
		return temp;
	}
}
