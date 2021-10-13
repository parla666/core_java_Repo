
/*8 Write a program to synchronize a HashMap in java?*/

package collections;

import java.util.*;

public class EightthProgram {
	public static void main(String arg[]) {
		// creating a synchronize HashMap

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(2, "techouts");
		hm.put(3, "Hcl");
		hm.put(4, "Tcs");
		hm.put(5, "Dell");
		hm.put(6, "Acer");
		System.out.println("Synchronize HashMap values :");
		Map map = Collections.synchronizedMap(hm);
		Set set = map.entrySet();
		synchronized (map) {
			Iterator i = set.iterator();

			// Display elements
			while (i.hasNext()) {
				Map.Entry pair = (Map.Entry) i.next();
				System.out.print(pair.getKey() + ": ");
				System.out.println(pair.getValue());
			}
		}

	}

}
