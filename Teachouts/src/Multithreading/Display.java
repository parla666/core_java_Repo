package Multithreading;

public class Display extends Thread {
	public void dispay (int sum,int avg) {
		System.out.println(sum);
		System.out.println(avg);
		
	}
public int avg(int a) {
	return a;
}
public static void main (String arg[]) {
	//Scanner sc=new Scanner(System.in);
	Add  obj = new Add();
	Avg obj1 =new Avg();
   Thread t= new Thread(obj);
   Thread t1= new Thread(obj1);
   t.start();
   t1.start();



}
}
