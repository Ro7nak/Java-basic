package encryption_256;

public class aes256_app {

	public static void main(String[] args)
	{
	    String originalString = "howtodoinjava.com";
	    String secretKey = "boooooooooom!!!!";
	    
	    String encryptedString = aes256_en.encrypt(originalString, secretKey) ;
	    String decryptedString = aes256_de.decrypt(encryptedString, secretKey) ;
	      
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	}
	
}
