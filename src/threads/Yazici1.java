package threads;

public class Yazici1 extends Thread {

	String name;

	public Yazici1(String name) {

		this.name = name;
	}

	@Override
	public String toString() {
		return "Yazici1 [name=" + name + "]";
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i += 3) {
			System.out.println(name + " thread çalışıyor " + i);

			try {
				currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("sayici 1 bitirdi");
	}

}
