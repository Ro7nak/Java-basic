package io;

import java.io.FileInputStream;

public class Input {

	public static void main(String[] args) throws Exception {
		// Create an stream instance with the file to read as input
		 FileInputStream inFile = new FileInputStream("CandidateNames.txt");

		 // Read the first byte
		 int i = inFile.read();

		 // Keep reading till end of file
		 while (i != -1) {
		     System.out.print((char)i);
		     // Read the next byte
		     i = inFile.read();
		 }

		 // Close the stream to release resources held by it
		 inFile.close();
	}

}
