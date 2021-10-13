package multiThreading;
/*Display all the properties of running threads. 
 * Create 3 threads and rename thread1 to "yourName" and 
 * make this thread a daemon thread.
Get the updated thread details.*/

public class ThreadNaming_2 extends Thread {
	public ThreadNaming_2(String str){
		super(str);
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) 
		{
		System.out.println(getName()+" "+ "is Deamon thread");	
		}
		else {
			System.out.println(getName()+" "+ "is User thread");
		}
	}
	public static void main(String[] args)
	{
	ThreadNaming_2 t1= new ThreadNaming_2("thread1");
	ThreadNaming_2 t2= new ThreadNaming_2("thread2");
	ThreadNaming_2 t3= new ThreadNaming_2("thread3");

	System.out.println("Name of t1:"+" "+t1.getName());
	System.out.println("Name of t2:"+" "+t2.getName());
	System.out.println("Name of t3:"+" "+t3.getName());

	t1.setDaemon(true);
	
	t1.start();
	t2.start();
	t3.start();
	t1.setName("Mahendar");
	
	System.out.println("After changing the name of t1:"+" "+t1.getName());
	}
	
}
