package threads2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Taksi implements Runnable {
	
	int id;
	long musteriBirakmaSuresi;
	List<Integer> musteriId = new ArrayList<>();
	long musteriSayisi;
	
	public Taksi(int id) {
		Random random = new Random();
		this.musteriBirakmaSuresi = random.nextLong(1000,2000);
		this.id=id;
		
	}
	@Override
	public void run() {
		while(!Durak.kuyruk.isEmpty()) {
			int musteriNo = Durak.kuyruk.poll();
			musteriId.add(musteriNo);
			System.out.println(id + ".Taksi: " + musteriId.size() + ". müşterisini aldı :  " + musteriNo);
			try {
				Thread.sleep(musteriBirakmaSuresi);
			} catch (Exception e) {
				
			}
		}
		musteriSayisi = musteriId.size();
		System.out.println(id + ". Taksi " + "Toplam " + musteriSayisi + " Müşteri aldı...");
		
	}

	// * Durağımızda toplam 10 adet taksi olsun ve durak onunde 100 kişilik
		// * bir müşteri kuygrugu(queue) olsun bu musterilerimiz için sınıf yaratmayalım
		// * bir int bir id değeri olarak tutalım
		// *
		// * 10 adet taksimiz hızlarına göre kuyruktan sırayla musteri alacaklardır

		// Takside run methodunu override edelim
		// taksilere müşteri alcaz
		// müşterileri duraktaki kuyruktan alcaz
		// ve aldığımız müşterileri listeye atıcaz
		// taksini her müşteri aldığında hangi taksinin kaçıncı müşterisini aldığını
		// yazdıralım
	
	

}
