package fileReader02;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Sehirler> sehirler = new ArrayList<>();
	
	public static void main(String[] args) {

		
		sehirListesiOkuVeYaz();

		plakaNo70TenBuyukMu();
	}
	
	
	public static void dosyaYaz() {
		
//		File file = new File("calisma.txt");
//		
//		try {
//			file.createNewFile();
//		} catch (Exception e) {
//			System.out.println("dosya oluşturulamadı");
//		}
//		System.out.println("dosyanız oluşturulmuştur.");
		
		try (FileWriter fr = new FileWriter("calisma2.txt")){
			
		} catch (Exception e) {
			System.out.println("dosya oluşturulamadı.");
		}
		System.out.println("dosyanız oluşturuldu..");
	}

	public static void dosyaOku() {
		
		try (Scanner scanner = new Scanner(new FileReader("calisma2.txt"))){
			
			while(scanner.hasNextLine()) {
				String okunan = scanner.nextLine();
				System.out.println(okunan);
			}
		} catch (Exception e) {
			System.err.println("dosyanız okunamamıştır...");
		}
		
		
	}
	
	
	public static void sehirListesiOkuVeYaz() {
		
		try(Scanner scanner = new Scanner(new FileReader("calisma2.txt"))) 
		{
			while(scanner.hasNextLine())
			{
				String okunan = scanner.nextLine();
				String[] s = okunan.split(",");
				int s1 = Integer.parseInt(s[0]);
				sehirler.add(new Sehirler(s[1],s1));
			}
			for (Sehirler sehirler2 : sehirler) {
				System.err.println(sehirler2);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void plakaNo70TenBuyukMu() {
		
		try(FileWriter fw = new FileWriter("plakalar.txt")) {
			for (Sehirler sehirler2 : sehirler) {
				if(sehirler2.getPlaka()>50) 
				{
					fw.write("\nŞehir:" +sehirler2.getName() +  " plaka kodu:" + sehirler2.getPlaka());
				}
				else 
				{
					
				}
			}
		} catch (Exception e) {
			System.err.println("hata...");
		}
	}
	

	
}
