
/*10 How to synchronize an ArrayList in java?*/


package collections;
import java.util.*;
public class TenthProgram {
	public static void main (String arg[]) {
		
	// Non Synchronized ArrayList   
   List<String> flavours= new ArrayList<String>();  

   flavours.add("Mango");  
   flavours.add("Banana");  
   flavours.add("Apple");  
   flavours.add("Strawberry");  
   flavours.add("Pineapple");  

   
    
  
   flavours= Collections.synchronizedList(flavours);  
   
   
   
    synchronized (flavours) {  
        Iterator<String> itr =flavours.iterator();  
        while (itr.hasNext()) {  
            System.out.println(itr.next());  
        }  
    }  

	
	
	}
}