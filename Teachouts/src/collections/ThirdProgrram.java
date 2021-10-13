
/*3 Write a program to convert HashSet to Array?*/



package collections;
import java.util.*;
public class ThirdProgrram {
	public static void main (String arg[]) {
		HashSet<String>hs=new HashSet<String>();
		hs.add("youtube");
		hs.add("google");
		hs.add("facebook");
		hs.add("whatsapp");
		//display the HashSet values..
		System.out.println("HashSet array values :");
		
		
		//creating the array and use to array()
		
		Object[] arr=hs.toArray();
		System.out.println("The Array is :");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);

		}	
	}
}
