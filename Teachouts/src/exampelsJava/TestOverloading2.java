package exampelsJava;

class Adding
{  
static int add(int a, int b){return a+b;
}  
static double add(double a, double b)
{
	return a+b;
	}  
}  
  class TestOverloading2{  
public static void main(String[] args)
{  
System.out.println(Adding.add(13,71));  
System.out.println(Adding.add(19.9,19.9));  
}
}  
