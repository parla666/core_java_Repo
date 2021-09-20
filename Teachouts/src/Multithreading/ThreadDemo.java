package Multithreading;

class ThreadDemo extends Thread 
{
	public void run  ()
	{
		System.out.println("run mnethod is excuted by JVM");
	}
	public static void main(String arg[])
	{
		ThreadDemo td= new   ThreadDemo();
		Thread t=new Thread(td);
		t.start();
	}
 
}
