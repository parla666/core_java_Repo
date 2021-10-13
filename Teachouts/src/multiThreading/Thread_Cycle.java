package multiThreading;

public class Thread_Cycle extends Thread 
{	
	
	public void run() {
		
	}
		int a=5,b=5, c;
		public void add()
		{
			c=a+b;
			System.out.println(c);
		}
		int d=2, e=4, f=6, g;
		public void avg()
		{
			g=(d+e+f)/3;
			System.out.println(g);
		}
		public void display() 
		{
			System.out.println();
		}
	public static void main(String[] args)
	{
		Thread_Cycle t= new Thread_Cycle();
		Thread_Cycle t1= new Thread_Cycle();
		Thread_Cycle t2= new Thread_Cycle();
		t.start();
		t.add();
		t1.avg();
		t2.display();
	}
	
		
}
