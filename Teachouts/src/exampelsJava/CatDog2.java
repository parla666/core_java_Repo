package exampelsJava;

public class CatDog2 {
	int id;
	String name;

//creating a parameterized constructor  
	CatDog2(int i, String n) {
		id = i;
		name = n;

	}

//method to display the values  
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
//creating objects and passing values  
		CatDog2 s1 = new CatDog2(222, "Aryan");
		CatDog2 s2 = new CatDog2(111, "Karan");
//calling method to display the values of object  
		s1.display();
		s2.display();
	}
}
