package collections;

import java.util.*;

public class LinkedList2 {
	public static void main(String arg[]) {
		LinkedList<String> lt = new LinkedList<String>();
		lt.add("prasad 1");
		lt.add("sonu 2");
		lt.add("vishnu 3");
		lt.add("sanju 4");
		lt.add("sandeep 5");
		lt.add("sujith 6");
		lt.add("charan 7");
		lt.add("akhila 8");
		lt.add("pravallika 9");
		lt.add("sumanth 10");
		System.out.println("initial list of the elements :" + lt);

		// removing specific elements from the object

		lt.remove("sanju 4");
		System.out.println("after invoking remove index :" + lt);

		// remove element from the basic of specic position
        System.out.println("hiiiiiii");
        lt.remove(0);
        System.out.println("removed 0");
        System.out.println(lt);
		lt.remove(5);
		System.out.println("hi");

		System.out.println("after removing with value position :" + lt);

		LinkedList<String> lt2 = new LinkedList<String>();

		lt2.add("venkatesh");

		lt2.add("poojitha");

		// adding new elements to arraylist

		lt.addAll(lt2);
		System.out.println("updating list :" + lt);

		// removing all the elements from the array list

		lt.removeAll(lt2);
		System.out.println("after invoking removeAll()method : " + lt2);

		// after Removing first element from the list

		lt.removeFirst();
		System.out.println("after removeing first element :" + lt);

		// after removing the last elements from the list

		lt.removeLast();
		System.out.println("after removing last elements :" + lt);

		// after removing FirstOccurrence from the list

		lt.removeFirstOccurrence("akhila 8");
		System.out.println("after removing  FirstOccurrence : " + lt);

		// after removing LastOccurrence element from the list

		lt.removeLastOccurrence("pravallika 9");
		System.out.println("after removing LastOccurrence :" + lt);

		// REMOVE ALL THE ELEMENTS AVAILABLE FROM THE LIST

		lt.clear();
		System.out.println("removing all the elements : " + lt);

	}

}
