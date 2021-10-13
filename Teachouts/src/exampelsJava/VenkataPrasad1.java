package exampelsJava;

import java.util.*;

public class VenkataPrasad1 {
	static void main(char str[]) {

		// create a set usingSTRING CHARACTERS
		// EXCLUDING '\0'
		HashSet<Character> s = new LinkedHashSet<>();

		/// HashSet doesn't allow repeataion of elements

		for (char x : str)
			s.add(x);

		// print content of the set

		for (char x : s)
			System.out.print(x);

	}

	// Drive code

	public static void main(String arg[]) {
		char str[] = " 6a16S@d3F$g%QETI^x7d9vgS PL@2IF ".toCharArray();
		int n = str.length;
		removeDuplicate(str);
	}

	private static void removeDuplicate(char[] str) {
		// TODO Auto-generated method stub

	}
}
