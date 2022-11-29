package com.melihcanozturk;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOfCharArrayReader2 {

	public static void main(String[] args) {


		CharArrayWriter out = new CharArrayWriter();
		try {
			out.write("Welcome to java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileWriter f1 = new FileWriter("C:\\test\\a.txt");
			FileWriter f2 = new FileWriter("C:\\test\\b.txt");
			FileWriter f3 = new FileWriter("C:\\test\\c.txt");
			FileWriter f4 = new FileWriter("C:\\test\\d.txt");
			out.writeTo(f1);
			out.writeTo(f2);
			out.writeTo(f3);
			out.writeTo(f4);
			f1.close();
			f2.close();
			f3.close();
			f4.close();
		} catch (IOException e) {
		System.out.println("yazma veya okuma hatası");
		}
			System.out.println("Success...");	

	}

}
