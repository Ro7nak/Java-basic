package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_Demo {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		try {
		    bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Kannada.txt")));
		    // Writing unicode string
		    bw.write("\u0c87\u0ca8\u0ccd\u0cab\u0cc6\u0cc2\u0cd5\u0cb8\u0cbf\u0cb8\u0ccd");
		    System.out.println("Data written successfully");
		}
		catch(IOException ioe) {
		    System.out.println("ERROR: " + ioe.getMessage());
		}
		finally {
			System.out.println("\u0C87");
		    if(bw != null) bw.close();
		}
	}
	
}
