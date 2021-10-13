package exampelsJava;

class TestJoinMethod6 extends Thread
{  
	 public void run()
	 {  
	  for(int i=1;i<=3;i++)
	  {  
	   try
	   {  
	    Thread.sleep(700);  
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
		   }  
	  System.out.println(i);  
	  }  
	 }  
	public static void main(String args[])
	{  
	 TestJoinMethod6 t1=new TestJoinMethod6();  
	 TestJoinMethod6 t2=new TestJoinMethod6();  
	 TestJoinMethod6 t3=new TestJoinMethod6();  
	 t1.start();  
	 try
	 {  
	  t1.join();  
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
		 }  
	  
	 t2.start();  
	 t3.start();  
	 }  
	}  
