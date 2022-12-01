package threads;

public class Yazici3 extends Thread {

	String name;

	public Yazici3(String name) {

		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 50; i += 7) {
			System.out.println(name + " yazıyor " + i);

			try {
				currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		System.out.println("sayici 3 bitirdi");
	}

	@Override
	public String toString() {
		return "Yazici3 [name=" + name + "]";
	}

}
