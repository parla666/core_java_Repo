package FunctionalInterface;

interface sayable {
	void say(String msg);
}

public class FunctionalInterfaceExampel1 implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExampel1 fie = new FunctionalInterfaceExampel1();
		fie.say("Hello there");
	}
}