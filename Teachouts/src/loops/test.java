package loops;

public class test {
	public static void main(String[] args) {
		ExampleWhileLoop ex = new ExampleWhileLoop();
		ex.setJ(50);
		System.out.println(loops.ExampleWhileLoop.i);
		System.out.println(ex.j);
		loops.ExampleWhileLoop.printing();
		ex.nonStatic();
	}

}
