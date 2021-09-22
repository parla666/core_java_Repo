package collections;

import java.util.*;

class Firstcollection1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
//Creating arraylist  
		list.add("ram"); // Adding object in arraylist
		list.add("joined ");
		list.add("techouts");
		list.add("developer");
//Traversing list through Iterator  
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
}
