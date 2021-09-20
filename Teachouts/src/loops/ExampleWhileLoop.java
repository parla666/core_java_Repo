package loops;

public class ExampleWhileLoop {

  static char i = 0;
	
	int j;

	

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public static void main(String[] args) {
		int a = 1;
		System.out.println("while loop");
		while (a <= 10) {
			System.out.println(a);
			a++;
		}
		System.out.println("for loop");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			
		}
		System.out.println(i);
	}
	
	public static void  printing()
	{
		System.out.println("printing static method");
	}
	
	public void nonStatic()
	{
		System.out.println("printing non staic method");
	}

}
