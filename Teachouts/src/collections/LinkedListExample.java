package collections;
import java.util.*;
public class LinkedListExample {
public static void main(String arg[]) {
	LinkedList al=new LinkedList();
	al.add(" Ramu");
	al.add("ravi");
	al.add("raju");
	al.add("R15");
	Iterator<String> itr=al.iterator();  
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
