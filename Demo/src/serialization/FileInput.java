package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class FileInput implements Serializable{
public static void main(String[] args) throws Exception {
	FileInputStream inFile = new FileInputStream("StudentData.bin");
	ObjectInputStream objStream = new ObjectInputStream(inFile);

	// Read an object from the file stream
	Student student = (Student) objStream.readObject();

	// Rest of the code

	objStream.close();
	inFile.close();
}
}
