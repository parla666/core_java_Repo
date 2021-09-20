package Multithreading;

public class ThreadState extends Thread
{
	public static void main(String arg[]) 
	{
		ThreadState thread=new ThreadState();
		System.out.println("state after creating it :"+thread.getState());
		
	thread.start();
	System.out.println("state after calling .start() method :" +thread.getState());
	try
	{
		thread.sleep(200);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
		System.out.println("State of after sleep() methood: "+thread1.getState());
	
	
	
	
	
}
	
	


