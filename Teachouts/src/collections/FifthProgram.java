
/*5.Write a program to iterate TreeMap in java?*/

package collections;

import java.util.Map;
import java.util.TreeMap;

class FifthProgram {
	public static void main(String arg[]) {
		Map<String, String> al = new TreeMap<String, String>();
		al.put("Bike Showroom", "R15 is available");
		al.put("Ace Showroom", "craines are available");
		al.put("shopping mall", "dress and play stations are available");

		// using for-each loop for
		// iteration over TreeMap.entrySet()

		for (Map.Entry<String, String> entry : al.entrySet()) {
			System.out.println("[" + entry.getKey() + ", " + entry.getValue() + "]");
		}

	}
}
