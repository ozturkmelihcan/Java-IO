package innerClass;

public class My_Class3 {

	void method() {
		int num = 2;

		class Minner {
			public int print(int ans) {
			
				for(int i=1;i<=10;i++) {
					 ans = num*i;
					 System.out.println(ans);
				}
				return ans;
				
			}

		}
		Minner i = new Minner();
		i.print(num);

	}

	public static void main(String[] args) {

		My_Class3 inner = new My_Class3();
		inner.method();

	}

}
