package threads2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Musteri implements Runnable {

	String name;
	long islemSuresi;
	long urunSayisi;
	List<Integer> urunNumarasi = new ArrayList<>();
	
	public Musteri(String name) {
		Random random = new Random();
		this.name = name;
		this.islemSuresi = random.nextLong(1000,5000);
	}


	@Override
	public void run() {
		while(!Indirim.urunListesi.isEmpty()) {
			int musteriSayisi = Indirim.urunListesi.poll();
			urunNumarasi.add(musteriSayisi);   // 1. ürünü ahmet aldı , 2. ürünü mehmet aldı.. gibi
			System.out.println(name +  " " + urunNumarasi.size() + ". ürünü aldı. " + musteriSayisi);
			try {
				Thread.sleep(islemSuresi);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		urunSayisi = urunNumarasi.size();
		System.out.println(name + " " + "toplam " + urunSayisi + " ürün aldı..."  );
		
	}
	
}
