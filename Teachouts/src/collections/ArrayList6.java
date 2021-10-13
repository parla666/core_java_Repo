/*1. perform followiing operations on array list
How to Iterate ArrayList using Java ListIterator
Arraylist add element at specific index
Sort ArrayList in descending order
insert an element to ArrayList using ListIterator
Hsort arraylist of strings alphabetically java
Sort elements of Java ArrayList
replace an element at specified index arraylist
Search an element of Java ArrayList
JRemove element from specified index ArrayList
Remove duplicates from arraylist without using collections*/

package collections;

import java.util.*;

public class ArrayList6 {
	public static void main(String arg[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("prasad");
		al.add("sonu");
		al.add("vishnu");
		al.add("sanju");
		al.add("sandeep");
		al.add("sujith");
		al.add("charan");
		System.out.println("Iterate ArrayList using Java ListIterator" + al);
		ListIterator<String> i = al.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// Arraylist add element at specific index

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("techouts");

		// adding elements
		al.addAll(al2);
		System.out.println("adding elements in program :" + al);

		// Sort ArrayList in descending order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("descending order : " + al);

		// insert an element to ArrayList using ListIterator
		ListIterator<String> itr = al.listIterator();
		itr.add("venkata siva prasad");
		itr.add("sumanth reddy");
		for (String name : al) {
			System.out.println("   insert an element to ArrayList using ListIterator    :" + name);

		}

		// sort arraylist of strings alphabetically java

		Collections.sort(al);
		for (String marks : al) {
			System.out.println("  sort arraylist of strings   " + marks);
		}

		// replace an element at specified index arraylist

		al.set(3, "THOR");
		System.out.println("replace element in ArrayList  :" + al);
		// Search an element of Java ArrayList

		int index1 = al.indexOf("THOR");
		int index2 = al.indexOf("dell laptop");
		if (index1 == -1)
			System.out.println("The element THOR is not in the ArrayList");
		else
			System.out.println("The element THOR is in the ArrayList at index " + index1);
		if (index2 == -1)
			System.out.println("The element dell laptop is not in the ArrayList");
		else
			System.out.println("The element della laptop is in the ArrayList at index " + index2);

		// Remove element from specified index ArrayList

		al.remove(3);
		System.out.println("remove element from the list:   " + al);

		// Remove duplicates from arraylist without using collections

		al.add(0, "prasad");
		al.add("sumanth reddy");
		al.add("charan");

		System.out.println("adding again elements for duplicates:  " + al);

		for (int i1 = 0; i1 < al.size(); i1++) {

			for (int j = i1 + 1; j < al.size(); j++) {
				if (al.get(i1).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}

		}

		System.out.println("remove duplicates from the list  :" + al);

	}

}
