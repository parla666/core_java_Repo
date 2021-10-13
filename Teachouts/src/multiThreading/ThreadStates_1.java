package multiThreading;
public class ThreadStates_1 extends Thread {/*For any created thread, Observe the thread life cycle on each run.*/
	
	public static void main(String[] args) 
	{
		ThreadStates_1 thread= new ThreadStates_1();
		System.out.println("State after thread creation:"+" "+ thread.getState());

		thread.start();
		System.out.println("State after calling start() method:" +" "+thread.getState());
	
		try
		{
			thread.sleep(500);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	System.out.println("State after sleep() method:"+" "+thread.getState());
	
	}
}
