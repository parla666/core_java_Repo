package Multithreading;

class Thread1 extends Thread 
{
	public void run() 
{
System.out.println(" thread started  ");
for(int i=1;i<=10;i++) 
{
System.out.println("Thread1:"+i);
if(i==7)
	stop();
}
}

	private void stop() {
		// TODO Auto-generated method stub
		
	}
	}