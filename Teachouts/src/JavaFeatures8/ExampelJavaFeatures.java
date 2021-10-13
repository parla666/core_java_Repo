package JavaFeatures8;

import java.util.function.BiFunction;

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}

}
public class ExampelJavaFeatures {
	public static void main(String arg[]) {
		BiFunction<Integer,Integer,Integer>adder=Arithmetic::add ;
		int result =adder.apply(19,10);
		System.out.println(result);
		
	}
}