package multiThreading;

public class DisplayThread_3 extends Thread 
{
	private void display(int sum, int avg) 
	{
	System.out.println(sum);
	System.out.println(avg);
	}
	public int avg(int a) 
	{
		return a;
	}
	public static void main(String[] args) 
	{
		AddThread_3 ad= new AddThread_3();
		AvgThread_3 av= new AvgThread_3();
		Thread t= new Thread(ad);
		Thread t1= new Thread(av);
		
		t.start();
		t1.start();
	}
}
