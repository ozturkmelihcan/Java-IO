package threads;

public class Yazici2 extends Thread {

	String name;

	public Yazici2(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i += 5) {
			System.out.println(name + " thread çalışıyor " + i);

			try {
				currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("sayici 2 bitirdi");
	}

}
