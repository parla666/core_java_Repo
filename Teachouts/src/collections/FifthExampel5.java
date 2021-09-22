package collections;

import java.util.*;

public class FifthExampel5 {
	public static void main(String arg[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Dad");
		queue.add("mom");
		queue.add("i am joining in techouts");
		queue.add("hyderabad");
		System.out.println("head " + queue.element());
		System.out.println("head " + queue.peek());
		System.out.println("i like more and more :");
		Iterator itr = queue.iterator();

		while (itr.hasNext())
			
		{
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after joining they went home :");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext())
		{
			System.out.println(itr2.next());
		}

	}
}