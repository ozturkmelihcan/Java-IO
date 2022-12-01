package dosyalar;

import java.io.File;

public class Dosya_Olusturma {

	public static void main(String[] args) {
		
		File dosya = new File("C:\\Users\\melih\\OneDrive\\Masaüstü\\Java\\001_Javada_Dosya_Acma\\deneme.txt");
		
		try {
			dosya.createNewFile(); // yeni bir dosya oluşturdum.
			System.out.println("dosya oluşturuldu.");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(dosya.getName());
		System.out.println(dosya.getPath());
		System.out.println(dosya.getAbsolutePath());

		
	}

}
