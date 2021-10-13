package LambdaExpressionsJava;

interface Sayable {
	public String say();
}

public class LambdaExpressionsExampels2 {
	public static void main(String arg[]) {
		Sayable sb = () -> {
			return "i have to say nothing.";

		};
		System.out.println(sb.say());
	}

}








               // In this program we write without parameters