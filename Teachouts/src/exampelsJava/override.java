package exampelsJava;
class a{
public void aa() {
		System.out.println("a");
	}
	
public void aa(int a)
{
	System.out.println("a-ab");
}
}

class b extends a{
	
	public void aa()
	{
		System.out.println("b");
	}
	public void aa(int a)
	{
		System.out.println("b-ab");
	}
	
}
public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 a a= new b();
		  b obb=(b)a;
        b ob=new b();
		  obb.aa(2);  
	}

}
