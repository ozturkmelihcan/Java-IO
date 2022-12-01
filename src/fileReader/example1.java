package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class example1 {

	static ArrayList<Ogrenciler> ogrList = new ArrayList<>();
	public static void main(String[] args) {
		/*
		 *                   FILEWRİTER - FILEREADER
		 *                   
		 *                   
		 *                   	1. uygulama elimizde dosya yok --> dosyaya veri yazalım daha sonra okuyalım
		 *                   	2. elimizde txt dosyası olsun içinde elemanlar olsun
		 *                   liste olustur listeyi yeni bir dosyaya atayalım...
		 *                
		 */
		ogrencileriOkuListeyeYaz();
		kaldiMi();
		
	
	}
	
	public static void dosyaYazMa() {
		
		try(FileWriter fw = new FileWriter("dosya1.txt",true)) {
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void dosyaOkuma() {
		try(Scanner sc = new Scanner(new FileReader("dosya1.txt"))){
			
			while(sc.hasNextLine()) {
				String okunan = sc.nextLine();
				System.out.println(okunan);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void ogrencileriOkuListeyeYaz() {
		
		
		try(Scanner sc = new Scanner(new FileReader("dosya1.txt"))){
			
			while(sc.hasNextLine()) {
				String okunan = sc.nextLine();
				String[] x = okunan.split(",");
				int v1 = Integer.parseInt(x[1]);
				int v2 = Integer.parseInt(x[2]);
				int v3 = Integer.parseInt(x[3]);
				int vOrt = (v1+v2+v3)/3;
				ogrList.add(new Ogrenciler (x[0], vOrt));
			}
			
			for (Ogrenciler ogrenciler : ogrList) {
				System.out.println(ogrenciler);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
	}
	
	public static void kaldiMi() {
		
		try(FileWriter fw = new FileWriter("gecmedurumu.txt")){
			
			for (Ogrenciler ogrenciler : ogrList) {
				if(ogrenciler.getOrtPuan()>70) {
					fw.write(ogrenciler.getAdSoyad() +  " isimli öğrenicinin ortalama puanı: "
							+ ogrenciler.getOrtPuan() + " geçti.\n" );
				}else {
					fw.write(ogrenciler.getAdSoyad() + " isimli öğrenci " + ogrenciler.getOrtPuan() 
											+" kaldı...\n");
				}
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void charOkuma() {
		
		
		
		
		
		
		
		
		
	}
	
}
