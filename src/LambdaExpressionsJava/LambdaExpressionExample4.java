package LambdaExpressionsJava;

interface Addable {
	int add(int a, int b);

}

public class LambdaExpressionExample4 {
	public static void main(String arg[]) {

		// multiple parameters in lambda expression

		Addable add1 = (a, b) -> (a + b);
		System.out.println(add1.add(20, 30));

		// Multiple parameters with data type in lambda expression

		Addable add2 = (int a, int b) -> (a + b);
		System.out.println(add2.add(20, 30));

		// Lambda expression with return keyword.
		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));
	}

}
