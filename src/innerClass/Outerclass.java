package innerClass;

public class Outerclass {

	void my_Method() {
		int num = 23;
		
		
		
		class MethodInner{
			public void print() {
				System.out.println("Bu inner bir sınıftır " + num );
			}
		} // inner sınıfın kapanısı
		
		
		MethodInner inner = new MethodInner();
		inner.print();
	}
	

	
	public static void main(String[] args) {


		Outerclass outer = new Outerclass();
		outer.my_Method();
		
	}

}
