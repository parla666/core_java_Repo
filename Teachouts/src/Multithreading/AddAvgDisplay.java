package Multithreading;
import java.lang.*;
import java.util.*;
//Thread A(for arithmetic operation)
class AddAvgDisplay  extends Thread {
	
		int i,j;
		//Parameterized contractor to initialize instance variable
		AddAvgDisplay(int x,int y)
		{
			i=x;
			j=y;
		}
		public void run() {
			System.out.println(" add="+(i+j));
			}
		public void start() {
			// TODO Auto-generated method stub
			
		}
}
class Avg extends Thread {
	int i,j;
	//parameterized  contractor to initialize instance variable
	Avg (int x,int y)
	{
		i=x;
    	j=y;
	}
	public void run()
	{
		System.out.println("avg="+((i+j)/2));
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}
}
//main class
public class Thread Ex {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER TWO VALUES");
	int x=s.nextInt();
	int y=s.nextInt();
	AddAvgDisplay1  = new AddAvgDisplay(x,y);
Avg a2=new Avg(x,y);
a1.start();
a2.start();
}




}

}
}
