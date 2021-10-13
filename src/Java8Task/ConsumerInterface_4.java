package Java8Task;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//4. Using Consumer Interface,print stream of integers ranging from 1 to 10 and double these numbers in your output

public class ConsumerInterface_4 
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
				.map(a->a*2)
				.forEach(b->System.out.println(b+" "));
		cList.accept(list);
	}
}
