package serialization;

import java.io.*;
public class FileStream {
	public static void main(String args[]) throws Exception {
	   Account account = new Account("FinanceIndia","20345678");
	   ObjectOutputStream objOutStream = new ObjectOutputStream(
	                     new FileOutputStream("account.dat"));
	   objOutStream.writeObject(account);
	   ObjectInputStream objInStream = new ObjectInputStream(
		                 new FileInputStream("account.dat"));
	   Account accountRead = (Account )objInStream.readObject();
	   System.out.println(accountRead);
	   objOutStream.close();
	   objInStream.close();
	}
}