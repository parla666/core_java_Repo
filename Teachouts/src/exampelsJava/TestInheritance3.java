package exampelsJava;

class TestAnimal {
void eat() {
	System.out.println("eating");
}
}
class Cat extends TestAnimal{
	void meow() {
		System.out.println("meowing");
	}
}
class TestInheritance3{
	public static void main(String arg[]) {
		Cat c=new Cat();
		c.meow();
		c.eat();
	}
}