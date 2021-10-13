package multiThreading;

public class AddThread_3 extends Thread
{
	public void run()
	{
	int a=5,b=5,c=a+b;
	
    	System.out.println("sum of two numbers is:" +c);
     AvgThread_3 av= new AvgThread_3();
    	av.add(c);
	}
}


