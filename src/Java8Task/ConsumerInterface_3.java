package Java8Task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Using Consumer Interface,print stream of integers ranging from 1 to 10 and make sure to neglect numbers between 3 and 7.

public class ConsumerInterface_3 
{
	public static void main(String[] args)
	{
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		Consumer<List<Integer>> cList= list1 ->list.stream()
				.filter(a-> a!=3 && a!=7)
				.forEach(b->System.out.println(b+" "));
		cList.accept(list);

	}
}
