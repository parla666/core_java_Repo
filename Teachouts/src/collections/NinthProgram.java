
/* 9.Write a program to serialize an ArrayList in java?*/

package collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.*;

public class NinthProgram {
	static void serializeArrayList() {

		ArrayList<String> countryList = new ArrayList<String>();

		// adding the data into the ArrayList
		countryList.add("INDIA");
		countryList.add("UK");
		countryList.add("USA");

		try {

			FileOutputStream fos = new FileOutputStream("namesListData");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(countryList);

			oos.close();

			fos.close();

			System.out.println("countryList SERIALIZED");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

		serializeArrayList();

	}
}
