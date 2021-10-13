package LambdaExpressionsJava;

interface venkataprasad {
	public String say(String name);
}

public class LambdaExpressionsExample3 {
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		venkataprasad vp1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(vp1.say("Sonoo"));

		// You can omit function parentheses
		venkataprasad vp2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(vp2.say("Sonoo"));
	}
}
