package exampelsJava;

 class Tanimal {
	void  eat () {
		System.out.println("eating");}

}
class Dog extends Tanimal{
     void bark() {
	System.out.println("Barking");}
}
class BabyDog extends Dog{
	  void weap () {
		System.out.println("weaping");}
}

class TestInheritance2{
	public static void main (String arg[]) {
		BabyDog d=new BabyDog ();
		d.weap();
		d.bark();
		d.eat();
		
		
	}
}