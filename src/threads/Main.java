package threads;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Thread yazici1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("yazıcı 1 çalıstı...");
				for (int i = 0; i < 10; i++) {
					System.out.println("yazıcı 1 yazıyor: " + i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println("yazıcı 1 durdu...");
			}
		});

		Thread yazici2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("yazıcı 2 çalıştı...");
				for (int i = 0; i < 10; i++) {
					System.out.println("yazıcı 2 yazıyor: " + i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println("yazici 2 durdu...");
			}
		});
		
		yazici1.start();
		yazici2.start();
		
	}

}
