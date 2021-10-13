package exampelsJava;
//which displays the default values  
public class CatDog1 {
	public CatDog1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	int id;
	String name;
	
	//method to display the value of id and name  
	 void display() 
	 {
		 System.out.println(id+" "+name);
		 
	 }
public static void main (String arg[]) {
	// creating object 
	CatDog1 cd=new CatDog1(12,"tat");
	CatDog1 cd2=new CatDog1(88,"fat");
	// display the values
	cd.display();
	cd2.display();
	
}
	 }



       // this is the exampel of constructor