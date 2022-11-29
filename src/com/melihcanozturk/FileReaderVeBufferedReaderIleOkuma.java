package com.melihcanozturk;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderVeBufferedReaderIleOkuma {

	public static void main(String[] args) {

		// FileReader sınıfı sayesinde disk üzerindeki metin tipi dosyadan alınan
		// karakterler, bellek içinde char tipine dönüştürülür.
		// Diskten okunan verilerin önce bellekte bir tampon alan(buffer) içine
		// yerleştirilmesi genellikle daha etkin bir yöntemdir. BufferedReader sınıfı bu
		// amaçla kullanılır.
		
		
		String dosyaAdi = "siir.txt";
		String satir;
		try {
			BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
			satir = oku.readLine();
			while(satir != null) {
				System.out.println(satir);
				satir = oku.readLine();
				
			}
			oku.close();
			
		} catch (Exception e) {
			System.out.println(dosyaAdi + " adlı dosya okunamıyor.");
		}
		
	}

}
