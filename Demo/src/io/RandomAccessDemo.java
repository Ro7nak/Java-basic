package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile randomFile = new RandomAccessFile("C:\\Users\\rounak_goyanka\\eclipse-workspace\\Demo\\Output.txt", "rw");
		randomFile.writeUTF("Writing");
		//randomFile.writeBytes("Rounak Project");
		//randomFile.writeUTF("Read");
                System.out.println("Current position:" + randomFile.getFilePointer());
                randomFile.seek(0);
		System.out.println(randomFile.readUTF());
		System.out.println("Current position:" + randomFile.getFilePointer());
		randomFile.close();

	}

}
