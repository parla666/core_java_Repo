package exampelsJava;

public class CatDog3 {
	int id;
	String name;
	int age;

	// creating two arg constructor
	CatDog3(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	CatDog3(int i, String n, int a) {
	id = i;
	name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		CatDog3 s1 = new CatDog3(111, "Karan");
		CatDog3 s2 = new CatDog3(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}						
