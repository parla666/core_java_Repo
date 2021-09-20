package Multithreading;

class ThreadCycle extends Thread{
	public static void main(String arg[]) {
		ThreadCycle thread1=new ThreadCycle();
		System.out.println("cycle finishing :"+thread1.getState());
		thread1.start();
		System.out.println(" Cycle calling start() method: "+thread1.getState());
		try
		{
			thread1.sleep(1000);
		
		}
	       catch(Exception e)
		{
	    	   e.printStackTrace();
	    	   
		}
	System.out.println(" Cycle finishing then sleep() method:" + thread1.getState());
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}

	private String getState() {
		// TODO Auto-generated method stub
		return null;
	}

}
