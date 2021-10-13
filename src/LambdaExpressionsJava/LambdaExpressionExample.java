package LambdaExpressionsJava;

interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		int width = 29;

		// without lambda, Drawable implementation using anonymous class
	// with lambda
		//	Drawable d = new Drawable() {
		 Drawable d2=()->{
		//	public void draw() {
				System.out.println("Drawing " + width);
			//	}
			};
//		d.draw();
		  d2.draw();
	}


}










                       // In this we are writing  { (without) (with)  } using lambda expressions