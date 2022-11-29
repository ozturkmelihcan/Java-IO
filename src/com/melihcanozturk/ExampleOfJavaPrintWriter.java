package com.melihcanozturk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExampleOfJavaPrintWriter {

	public static void main(String[] args) {
		
		PrintWriter writer = new PrintWriter(System.out);
		writer.write("Java provides tutorials of all technology.");
		writer.flush();
		writer.close();
		PrintWriter writer1 = null;
		try {
			writer1 = new PrintWriter(new File("C:\\test\\testout.txt"));
			writer1.write("Like java, Spring,Hibernate,Android,PHP etc.");
			writer1.flush();
			writer1.close();
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadı hatası");
			
		}
		

	}

}
