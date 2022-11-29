package com.melihcanozturk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VeriYazmaVeOkuma {

	public static void main(String[] args) {
		
		
		String str = "Bu yazdıklarımı dosyaya yazdır...";
		
		File file = new File("dosya.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Dosya yazılamadı.");
			}
		}
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file,false);
		} catch (IOException e) {
			System.out.println("Dosya yazılamadı");
		}
		BufferedWriter bWriter = new BufferedWriter(fileWriter);
		try {
			bWriter.write(str);
		} catch (IOException e) {
			System.out.println("Dosya yazılamadı.");
		}
		try {
			bWriter.close();
		} catch (IOException e) {
			System.out.println("Dosya yazılamadı.");
		}

	
		try {
			FileReader fileReader = new FileReader(file);
			String line;
			BufferedReader br = new BufferedReader(fileReader);
			while((line= br.readLine()) != null ) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı.");
		} catch (IOException e) {
			System.out.println("dosya okunamadı...");
		}
		
	// NOT: BUFFEREDREADER BİZE YÜKSEK BİR TAMPON BELLEK SAĞLAR. BUFFEREDREADER KULLANILMAZSA READ METODU HER ÇAĞIRILDIĞINDA
		// DOSYADAN BYTE'LAR ÇEKİLİR. KARAKTERLERE DÖNÜŞTÜRÜLÜR VE DÖNDÜRÜLÜR. BU DA PROGRAMIN PERFORMANSININ DÜŞMESİNE YOL AÇAR.
		// EĞER BİR RESMİ YA DA İNTERNET ÜZERİNDEN ÇEKTİĞİMİZ BİR DOSYAYI DİSKE KAYIT ETMEK İSTİYORSAK, METİN DOSYASI YERİNE 
		// BINARY DOSYA KULLANMAMIZ GEREKİR. JAVA BU AMAÇLA BİZE FARKLI FARKLI SINIFLAR SUNMAKTADIR.
		
		
	} // Main

} // Close
