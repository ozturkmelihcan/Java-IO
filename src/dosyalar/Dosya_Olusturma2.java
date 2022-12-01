package dosyalar;

import java.io.File;
import java.io.IOException;

public class Dosya_Olusturma2 {

	public static void main(String[] args) {
		File dosya = new File("C:\\Users\\melih\\OneDrive\\Masaüstü\\Java\\001_Javada_Dosya_Acma\\deneme.txt");

		try {

			dosya.createNewFile();// Yeni dosya oluşturmak

		}

		catch (IOException e) {

			e.printStackTrace();

		}

		File path = new File("C:\\Users\\melih\\OneDrive\\Masaüstü\\Java\\001_Javada_Dosya_Acma\\yeni");

		path.mkdir();// Yeni klasör açmak

		// Dosynın adını ve yolu değiştirmek

		File yeni = new File("C:\\Users\\melih\\OneDrive\\Masaüstü\\Java\\001_Javada_Dosya_Acma\\Kopya.txt");

		dosya.renameTo(yeni);

		if (yeni.canRead() == true && yeni.canWrite() == true)

			System.out.println("Dosya okunabilir ve yazılabilir");

	}

}
