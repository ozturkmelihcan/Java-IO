package com.melihcanozturk;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

public class JavaApiFile {

	public static void main(String[] args) {
		
		File f = new File("a.txt");
		try {
			FileReader fr = new FileReader(f);
			int c = fr.read();
			while(c!=-1) {
				char k = (char)c;
				System.out.print(k+ " ");
				c = fr.read();
			}
			fr.close();
			f = new File("a.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
			System.out.println(br.readLine());
			br.close();
			File input = new File("cikti.txt");
			FileWriter fw = new FileWriter(input);
			fw.write("deneme mesajı");
			fw.close();
		} catch (Exception e) {
			System.out.println("a.txt diye bir dosya bulunamadı.");
		}
		

	}

}
