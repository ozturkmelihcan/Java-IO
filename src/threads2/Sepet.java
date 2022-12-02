package threads2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sepet {

	static Queue<Integer> meyveler = new LinkedList<Integer>();

	List<Kisiler> kisiList = new ArrayList<>();

	public Sepet() {
		this.meyveleriOlustur();
		this.kisileriSirayaSok();
	}

	private void kisileriSirayaSok() {
		kisiList.add(new Kisiler("ahmet"));
		kisiList.add(new Kisiler("mehmet"));
		kisiList.add(new Kisiler("kenan"));
		kisiList.add(new Kisiler("buse"));
		kisiList.add(new Kisiler("mert"));
		kisiList.add(new Kisiler("ali"));
		kisiList.add(new Kisiler("melih"));
		kisiList.add(new Kisiler("furkan"));
		kisiList.add(new Kisiler("melike"));
		kisiList.add(new Kisiler("ayşe"));
		System.out.println("kişiler sıraya girdi...");

	}

	private void meyveleriOlustur() {
		for(int i=1;i<=50;i++) {
			meyveler.offer(i);
		}
		System.out.println("meyveler sepete eklendi...");

	}
	
	public void meyveleriAl() {
		for(int i=0;i<10;i++) {
			Thread thread = new Thread(kisiList.get(i));
			thread.start();
		}
	}

	public static void main(String[] args) {

		Sepet sepet = new Sepet();
		sepet.meyveleriAl();
	}

}
