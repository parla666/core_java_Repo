package Multithreading;

    import java.lang.Thread.State;

     class Thread1 extends Thread 
{
	 public void run() 
{
    System.out.println(" thread started  ");

    for(int i=1;i<=10;i++) 
{
	try {
		Thread.sleep(1000);
 }
	catch (Exception e)
    	{
 }
     System.out.println("PRASAD TAKES 1:"+i);

   }
}
	public synchronized void start() 
	{
		super.start();
	}
	public long getId() 
	{
		return super.getId();
	}
	public State getState() 
	{
		return super.getState();
	}
	public static void main(String[] args)
	{
		Thread1 t1= new Thread1();
		
		t1.start();
	}
	}

     