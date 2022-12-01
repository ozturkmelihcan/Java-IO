package innerClass;

public class MyClass4 {

	void method() {
		int num = 2;
		
		class Minner {
			public int print(int ans) {
			
				for(int i=1;i<=10;i++) {
					 ans = (int) Math.pow(num, i);
					 System.out.println(ans);
				}
				return ans;
				
			}

		}
		Minner i = new Minner();
		i.print(num);
		
	}

	public static void main(String[] args) {

		MyClass4 inner = new MyClass4();
		inner.method();
		

	}

}
