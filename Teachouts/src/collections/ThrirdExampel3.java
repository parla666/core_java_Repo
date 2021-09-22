package collections;

import java.util.*; 
public class ThrirdExampel3 {
public static void main(String arg[]) {
	
	Vector<String> v=new Vector<String>(); 
	v.add("techots");
	v.add("is the best");
	v.add("prasad");
	v.add("parla");
	v.add("siva");

	Iterator<String> itr=v.iterator();  

	while(itr.hasNext()){  
System.out.println(itr.next());

}
}
}
