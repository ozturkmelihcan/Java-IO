package com.melihcanozturk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Kopyalama {

	String KaynakDosyaAdi, hedefDosyaAdi;
	BufferedReader kaynakBuffer;
	BufferedWriter hedefBuffer;
	String satir;

	public static void main(String[] args) {

		if (args.length == 3 && args[1].toUpperCase().equals("TO")) {
			new Kopyalama().kopyala(args[0], args[2]);
		} else {
			System.out.println("kullanım şekli: ");
			System.out.println("Java Kopyalama <dosya1> to <dosya2>");
		}

	}

	public boolean kopyala(String isim1, String isim2) {
		KaynakDosyaAdi = isim1;
		hedefDosyaAdi = isim2;
		return dosyayiAc() && dosyayiKopyala() && dosyayiKapat();
	}

	private boolean dosyayiKopyala() {
		// esas metod
		try {
			satir = kaynakBuffer.readLine();
			while (satir != null) {
				hedefBuffer.write(satir);
				hedefBuffer.newLine();
				satir = kaynakBuffer.readLine();
			}
		} catch (IOException e) {
			System.out.println("Kopyalama yapılamıyor...");
			return false;
		}
		return true;
	}

	private boolean dosyayiAc() {
		// Kaynak dosya açılımı :
		try {
			kaynakBuffer = new BufferedReader(new FileReader(KaynakDosyaAdi));
		} catch (IOException e) {
			System.out.println(KaynakDosyaAdi + " dosyası açılamadı.");
			return false;
		}

		// hedef dosyayı aç:
		try {
			hedefBuffer = new BufferedWriter(new FileWriter(hedefDosyaAdi));
		} catch (IOException e) {
			System.out.println(hedefDosyaAdi + " dosyası açılamadı.");
			return false;
		}
		return true;
	}

	private boolean dosyayiKapat() {
		boolean sorunsuzMu = true;
		// kaynağı kapat
		try {
			kaynakBuffer.close();
		} catch (IOException e) {
			System.out.println(KaynakDosyaAdi + " dosya kapanısında hata!");
			sorunsuzMu = false;
		}
		// hedefi kapat
		try {
			hedefBuffer.close();
		} catch (Exception e) {
			System.out.println(hedefDosyaAdi + " dosyasının kapanışında hata!");
			sorunsuzMu = false;
		}
		return sorunsuzMu;
	}
}
