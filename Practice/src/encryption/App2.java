package encryption;

public class App2 {

	public static void main(String[] args) {
		int key = 678;
		String msg = "name is fuck your self";
		
		Encryption e = new Encryption();
		int[] enMsg = e.encryptionModule(msg, key);
		for (int i = 0; i < enMsg.length; i++) {
			System.out.println(enMsg[i]);
		}
		
		Decryption d = new Decryption();
		String result = d.decryptionModule(enMsg, key);
		
		System.out.println(result);

	}

}
