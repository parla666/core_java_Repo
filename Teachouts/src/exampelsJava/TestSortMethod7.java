package exampelsJava;

 class TestSortMethod7 extends Thread {
 public void run() {
	for(int i=1;i<=4;i++) 
	{
		try 
		{
			Thread.sleep(1000);
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
	 TestSortMethod7 t1=new TestSortMethod7();  
	 TestSortMethod7 t2=new TestSortMethod7();  
	 TestSortMethod7 t3=new TestSortMethod7();  
	 t1.start();  
	 try{  
	  t1.sort(150);  
	 }catch(Exception e)
	 {
		 System.out.print(e);
		 }  
	  
	 t2.start();  
	 t3.start();  
	 }
	private void sort(int i) {
		// TODO Auto-generated method stub
		
	}  
	}  
		
