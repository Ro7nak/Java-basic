package io;

import java.io.File;

public class File_Demo {

	public static void main(String[] args) throws Exception{
		File f = new File("JohnTotal.txt");
		System.out.println(f.getAbsolutePath());
		
		File file = new File("C:\\Users\\rounak_goyanka\\eclipse-workspace\\Demo\\Demo.txt");
		boolean isCreated = file.createNewFile();
		System.out.println("File created: "+isCreated);
		System.out.println("Name of the file: "+file.getName());
		System.out.println("Path of the file: "+file.getPath());
		System.out.println("isDirectory: "+file.isDirectory());
		System.out.println("list: "+file.list());

	}

}
