package Multithreading;

class ThreadDemo extends Thread {
	public void run  () {
		System.out.println("runmnethod is excuted by JVM");
	}
	public static void main(String arg[]) {
		ThreadDemo td= new   ThreadDemo();
		Thread t=new Thread(td);
		t.start();
	}
 
}
