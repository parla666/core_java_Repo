
/*7 Write a program to serialize a HashMap in java?*/

package collections;

import java.util.*;
import java.io.*;

public class SeventhProgram {
	public static void main(String arg[]) {

		// creating HashMap here

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(22, " football");
		hm.put(33, "cricket");
		hm.put(44, "vollyball");
		hm.put(25, "throwball");

		try {
			FileOutputStream fos = new FileOutputStream("hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hm);
			oos.close();
			fos.close();
			System.out.printf("Serialized HashMap data is saved in hashmap.ser");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
