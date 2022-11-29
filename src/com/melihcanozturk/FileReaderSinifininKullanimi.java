package com.melihcanozturk;

import java.io.FileWriter;
import java.io.IOException;

public class FileReaderSinifininKullanimi {

	public static void main(String[] args) {
		
		String dosyaAdi = "siir.txt";
		try {
			FileWriter yazar = new FileWriter(dosyaAdi);
			yazar.write("çoklarından düşüyor da bunca");
			yazar.write("\ngörmüyor gelip geçenler");
			yazar.write("\neğilip alıyorum");
			yazar.write("\nsolgun bir gül oluyor dokununca - behçet necatigil");
			yazar.close();
			
		} catch (IOException e) {
			System.out.println("dosya yazılamadı.");
		
	}
}
}