package threads2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kisiler implements Runnable{
	
	String isim;
	int kisiNumarasi;
	long meyveAlmaSuresi;
	List<Integer> meyveSayisi = new ArrayList<>();
	long meyveAdedi;
	public Kisiler(String isim) {
		Random random = new Random();
		this.kisiNumarasi=kisiNumarasi;
		this.isim=isim;
		this.meyveAlmaSuresi = random.nextLong(1000,5000);
	}

	
	@Override
	public String toString() {
		return "Kisiler [name=" + meyveSayisi + "]";
	}


	@Override
	public void run() {
		while(!Sepet.meyveler.isEmpty()) {
			int meyveNo = Sepet.meyveler.poll();
			meyveSayisi.add(meyveNo);
			System.out.println(isim + " " + meyveSayisi.size() + ". meyvesini aldı. " + meyveNo );
			try {
				Thread.sleep(meyveAlmaSuresi);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		meyveAdedi = meyveSayisi.size();
		System.out.println(isim +  "toplam " + meyveAdedi + " Meyve aldı..." + "    " + meyveAdedi);
	}
	
}
