package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileStreamTester {

	public static void main(String[] args) throws IOException {
		Reader r = null;
		Writer w = null;
		
		try {
			r = new FileReader("ReadFrom.txt");
			w = new FileWriter("OutputTo.txt");
			int i = r.read();
			while(i != -1) {
				w.write(i);
				i = r.read();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
		if(r != null)r.close();
		if(w != null)w.close();
		}
	}
		

}
