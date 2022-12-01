package dosyalar;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Dosya_Kopyalama2 {
	public static void main(String[] args) {
		
		File dosya = new File("C:\\Users\\melih\\OneDrive\\Masaüstü\\Java\\001_Javada_Dosya_Acma\\kitap.txt");
		File dosya2 = new File("C:\\Users\\melih\\OneDrive\\Masaüstü\\Java\\001_Javada_Dosya_Acma\\kitapkopya.txt");
		
		char data[] = new char[(int)dosya.length()];
		
		try(FileWriter yaz = new FileWriter(dosya2,true)) {
			
			FileReader reader = new FileReader(dosya);
			
			reader.read(data);
			
			yaz.write(data); // Dizi Dosyaya yazılıyor...
			
		} catch (IOException e) {
			e.printStackTrace(); // Hata yığınını ekrana basar.
		}
	}

}
