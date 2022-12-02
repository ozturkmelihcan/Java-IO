package threads2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Indirim {

	static Queue<Integer> urunListesi = new LinkedList<>();
	List<Musteri> musteriListesi = new ArrayList<>();
	
	public Indirim() {
		this.musteriler();
		this.urunler();
	}

	private void urunler() {
		for(int i=1;i<=100;i++) {
			urunListesi.offer(i);
		}
		System.out.println("ürünler eklendi...");

	}

	private void musteriler() {
		musteriListesi.add(new Musteri("ahmet"));
		musteriListesi.add(new Musteri("kenan"));
		musteriListesi.add(new Musteri("ayşe"));
		musteriListesi.add(new Musteri("fatma"));
		musteriListesi.add(new Musteri("mehmet"));
		musteriListesi.add(new Musteri("nazlı"));
		musteriListesi.add(new Musteri("faruk"));
		musteriListesi.add(new Musteri("mert"));
		musteriListesi.add(new Musteri("cengiz"));
		musteriListesi.add(new Musteri("ali"));
		System.out.println("müşteriler sıraya girdi...");

	}
	
	private void urunAl() {
		for(int i=0;i<10;i++) {
			Thread thread = new Thread(musteriListesi.get(i));
			thread.start();
		}
	}

	
	public static void main(String[] args) {

		Indirim indirim = new Indirim();
		indirim.urunAl();
	}
}
