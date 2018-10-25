package io;

import java.io.FileOutputStream;

public class Output {
public static void main(String[] args) throws Exception{
	// Create a stream instance to write to a file
	 FileOutputStream outFile = new FileOutputStream("CandidateNames.txt"); 

	 String data = "Rounak Goyanka Ahalya Bhairav Chitra Dushyant Eshwari Falgun Gargi Hiren";
	 // Convert string to byte array
	 byte bArray[] = data.getBytes();
	 
	 // Write bytes into the file with overloaded method which takes a byte array
	 outFile.write(bArray);   
	                                              
	 // Close the stream to release resources held by it
	 outFile.close();   
}
}
