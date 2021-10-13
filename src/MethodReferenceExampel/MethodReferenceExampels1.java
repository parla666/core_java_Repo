package MethodReferenceExampel;

interface Sayable {
	void say();
}

public class MethodReferenceExampels1 {
	public static void saySomething() {
		System.out.println(" hello , this is static method .");
	}

	public static void main(String arg[]) {
		// referring static method
		Sayable sayable = MethodReferenceExampels1::saySomething;
		// Calling interface method
		sayable.say();
	}
}
