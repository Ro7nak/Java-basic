package encryption;

public class Demo {

	public static void main(String[] args) {
		String msg = "My name is Rounak";
		int key = 9;
		int[] enMsg = Demo.en(msg,key);
//		for (int i = 0; i < enMsg.length; i++) {
//			System.out.print(enMsg[i]);
//		}
		System.out.println(enMsg);
		de(enMsg, key);
		
	}
	
	public static int[] en(String msg, int key) {
		char[] k = msg.toCharArray();
		int[] temp =  new int[k.length];
 		for (int i = 0; i < k.length; i++) {
			temp[i] = (int)k[i]*(key*(i+1));
		}
 		return temp;
	}

	
	public static void de(int[] enMsg, int key) {
		int[] k = enMsg;
		char[] temp =  new char[k.length];
		for (int i = 0; i < k.length; i++) {
			temp[i] = (char)(k[i]/(key*(i+1)));
		}
		String ans = "";
		for(int i =0; i< temp.length; i++) {
			ans += temp[i];
		}
		System.out.println(ans);
	}
}
