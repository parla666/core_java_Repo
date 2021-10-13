
/*2.Write a program to convert LinkedList to ArrayList?*/

package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

class SecondProgram {
	public static void main(String arg[]) {
		LinkedList<String> lt = new LinkedList<String>();

		lt.add("cows");
		lt.add("pens");
		lt.add("guns");
		lt.add("laptops");
		List<String> aList = new ArrayList<String>(lt);
		System.out.println("Array elements in one place :" + lt);

	}

}
