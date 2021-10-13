
/*4 Write a program to reverse ArrayList in java?*/

package collections;

import java.util.*;

public class FourthProgram {
	public static void main(String arg[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("techouts");
		al.add("hcl");
		al.add("tcs");
		al.add("goa");
		System.out.println("before reversing the array elements  :" + al);
		// after creating the reverse elements
		System.out.println(al.toString());
		Collections.reverse(al);
		System.out.println("after reversing the array elements :" + al);

	}
}
