package com.melihcanozturk;

import java.io.CharArrayReader;
import java.io.IOException;

public class ExampleOfCharArrayReader {

	public static void main(String[] args) throws IOException {


		char[] array = { 'j','a','v','a','p','o','i','n','t'};
		CharArrayReader reader = new CharArrayReader(array);
		int k = 0;
		
		while ((k = reader.read())!=-1) {
			char ch = (char) k;
			System.out.print(ch + " : ");
			System.out.println(k);
		}

	}

}
