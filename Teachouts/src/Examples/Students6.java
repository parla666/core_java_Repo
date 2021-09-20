package Examples;

public class Students6 {
	int id =7;
	String name =" Techouts";
	//method to display the value of id and name 
	void display()
	{
		System.out.println(id+"    "+name);
	}
	public static void main (String arg[])
	{
		//creating object
		Students6 s1=new Students6();
		Students6 s2= new Students6();
		//display the value off the object
		s1.display();
		s2.display();
	}

}
