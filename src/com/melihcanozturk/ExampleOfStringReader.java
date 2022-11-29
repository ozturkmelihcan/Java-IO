package com.melihcanozturk;

import java.io.IOException;
import java.io.StringReader;

public class ExampleOfStringReader {

	public static void main(String[] args) {


		String str = "Hello Java !! \nWelcome to java.";
		StringReader reader = new StringReader(str);
		int k = 0;
		try {
			while((k=reader.read())!=-1) {
				System.out.print((char)k);
			}
		} catch (IOException e) {
			System.out.println("IOException");
		}

	}

}
