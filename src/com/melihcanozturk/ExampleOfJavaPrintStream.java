package com.melihcanozturk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ExampleOfJavaPrintStream {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\test\\testout.txt");
			PrintStream pout = new PrintStream(fileOutputStream);
			pout.println(2022);
			pout.println("Hello Java");
			pout.println("Welcome to Java");
			pout.close();
			fileOutputStream.close();
			System.out.println("Success?");
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadı hatası");
			
		} catch (IOException e) {
			System.out.println("dosya okuma veya yazma hatası...");
		}
		
		

	}

}
