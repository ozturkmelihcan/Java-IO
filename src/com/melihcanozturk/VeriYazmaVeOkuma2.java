package com.melihcanozturk;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class VeriYazmaVeOkuma2 {

	public static void main(String[] args) {

		/*
		 * FileOutputStream binary bir dosyaya byte tipinde bir değişken yazmak için
		 * kullanılır. Aşağıdaki örnekte data değişkenindeki byte değerleri binary.dat
		 * adında bir dosyaya yazılmak için hazırlanmıştır. BufferedOutputStream ise
		 * binary dosyaya yazma işlemi sırasında bize tampon bellek sağlar. write
		 * komutuyla yazma işlemi tamamlandıktan sonra close metodu ile akış (stream)
		 * kapatılmalıdır.
		 */

		byte[] data = { 0 * 01, 0 * 02 };

		File binaryFile = new File("binary.dat");
		try {
			FileOutputStream fos = new FileOutputStream(binaryFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);  // tampon bellek sağlar.
			bos.write(data);											// yazma işlemi tamamlanır.
			bos.close();												// akış (stream) kapatılır.
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı hatası...");
		} catch (IOException e) {
			System.out.println("dosya yazılamadı");
		}

		
		data = new byte[(int) binaryFile.length()];
		try {
			FileInputStream fis = new FileInputStream(binaryFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.read(data,0,data.length);
			bis.close();
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadı hatası...");
		} catch (IOException e) {
			System.out.println("Dosya okunamadı hatası");
		}
		
	}

}
