package dosyalar;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dosya_Kopyalama {

	public static void main(String[] args) {

		File dosya = new File("C:\\Users\\melih\\OneDrive\\Masaüstü\\Java\\001_Javada_Dosya_Acma\\kitap.txt");
		
		char[] data = new char[(int)dosya.length()];
		
		try {
			FileReader fr = new FileReader(dosya);
			fr.read(data); // Dosyadan okunan veri char dizisine aktarılıyor.
		} catch (IOException e) {
			System.err.println("Dosya okunamadı.");
		}
		
		String okunan = new String(data); // char dizisini String'e çevirdik.
		System.out.println(okunan);
		
		for(int i= 0;i<data.length;i++) {
			System.out.println(data[i]);
		}

	}

}
