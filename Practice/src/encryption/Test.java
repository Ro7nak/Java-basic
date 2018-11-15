package encryption;

public class Test {

	public static void main(String[] args) {
		int key = 678;
		String msg = "name is fuck your self";
		
		Encryption_v2 e = new Encryption_v2();
		Decryption_v2 d = new Decryption_v2();
		String enMsg = e.encryptionModule2(msg, key);
		System.out.println(enMsg);
		
		String result = d.decryptionModule2(enMsg, key);
		
		System.out.println(result);
	}

}
