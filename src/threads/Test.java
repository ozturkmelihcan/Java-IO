package threads;

public class Test {

	public static void main(String[] args) {


		Thread sayici1 = new Thread(new Yazici1("yazıcı 1 "));
		Thread sayici2 = new Thread(new Yazici2("yazıcı 2 "));
		Thread sayici3 = new Thread(new Yazici3("yazıcı 3 "));
		
		System.out.println("main thread calısıyor...");
		sayici1.start();
		sayici2.start();
		sayici3.start();
		
		System.out.println("main thread çıkıyor");
		
	}

}
