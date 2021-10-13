package multiThreading;

import java.lang.Thread.State;

public class Life_Cycle extends Thread{

	public synchronized void start() {
	System.out.println("hello");
		super.start();
	}
	public long getId() {
		return super.getId();
	}
	public State getState() {
		return super.getState();
	}
		public void run() {
			System.out.println("life cycle");
		}
		public static void main(String[] args) {
			Thread thread=new Life_Cycle();
			thread.start();
			thread.run();
			thread.setName("Mahendar");
			//System.out.println(thread.getName());
			System.out.println(thread.getId() +" "+thread.getName()+" "+thread.getPriority());
			
		}
}
