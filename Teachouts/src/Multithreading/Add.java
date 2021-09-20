package Multithreading;

public class Add implements Runnable {
	public void run() {
		int a=2,b=2;
		int c=a+b;
		System.out.println("The sum of two numbers is ");
		System.out.println(c);
		Avg av =new Avg();
		av.add(c);
	}
	

}
