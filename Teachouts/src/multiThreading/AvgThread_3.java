package multiThreading;

public class AvgThread_3 extends Thread
{
	
    public int add(int sum) 
    {
		return sum;
    }
    public void run() 
    {
        int d=2,e=3,f=4;
    	int average= (d+e+f)/3;
    	
    	System.out.println("Average is:"+ average);
    	DisplayThread_3 d1= new DisplayThread_3();
    	d1.avg(average);
    }
  
}
