package Multithreading;

 class Daemonthread extends Thread{
	 public Daemonthread(String str) {
				 super(str);
	}
		
		 public void run() {
			 if(Thread.currentThread().isDaemon())
			 {
				 System.out.println(getName() +"is daemon thread");
				 
			 }
			 else
			 {
				 System.out.println(getName()+" is user thread");
			 }
		 
	 }
public static void main(String args[]) {
	Daemonthread thread1=new Daemonthread ("thread1");
	Daemonthread thread2=new Daemonthread ("thread2");
	Daemonthread thread3=new Daemonthread ("thread3");


	System.out.println("Name of t1:"+thread1.getName());
	System.out.println("Name of t2:"+thread2.getName());
	System.out.println("Name of t3:"+thread3.getName());

   thread1.setDaemon(true);
   thread1.start();
   thread2.start();
   thread3.start();
   thread1.setName("PARLA VENKATA SIVA PRASAD");


          System.out.println("after changing name t1:"+thread1.getName());

       }
   }
