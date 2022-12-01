package threads;

public class ThreadNotSafe {
	private int count=0;
	public void threadleriCalistir() {

		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5000;i++) {
					count++;
				}
				System.out.println("Thread1 Bitti...");
				
				
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5000;i++) {
					count++;
				}
				System.out.println("Thread2 Bitti...");
				
				
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Count değeri : " + count);

	}
	public static void main(String[] args) {
		
		ThreadNotSafe main = new ThreadNotSafe();
		main.threadleriCalistir();
		// Threadlerin senkronizsyon sorunundan dolayı (Aynı anda count'a erişip arttırmaya çalıştıklarından) count 10000 yazmaz. 
		// Bunu çözmenin yolu SENKRONIZASYON YAPMAKTIR.
	}

}
