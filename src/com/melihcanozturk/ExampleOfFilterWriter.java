package com.melihcanozturk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

class CustomFilterWriter extends FilterWriter{
	public CustomFilterWriter(Writer out) {
		super(out);
	}
	public void write(String str) throws IOException{
		try {
			super.write(str.toLowerCase());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

public class ExampleOfFilterWriter {

	public static void main(String[] args) {


		try {
			FileWriter fw = new FileWriter("Record.txt");
			CustomFilterWriter filterWriter = new CustomFilterWriter(fw);
			filterWriter.write("bla bla bla");
			filterWriter.close();
			FileReader fr = new FileReader("record.txt");
			BufferedReader bufferedReader = new BufferedReader(fr);
			int k;
			while((k = bufferedReader.read())!=-1) {
				System.out.print((char)k);
				
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
