


/*6.Write a program to sort HashMap by value?*/




package collections;
import java.util.Map;  
import java.util.HashMap;  
import java.util.TreeMap;  
import java.util.Iterator;  
public class SixthProgram {
	public static void main(String arg[]) {
		
		//implementation of HashMap
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		
		//addding keys and values to HashMap  
		
		hm.put(12,"PARLA");
		hm.put(23,"venkata");
		hm.put(34,"siva");
		hm.put(45,"prasad");
		Iterator<Integer>it=hm.keySet().iterator();
		System.out.println("Befor sorting :");
		
		while(it.hasNext())  
		{  
		int key=(int)it.next();  
		System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
		}  
	System.out.println("/n");
	Map<Integer, String> map=new HashMap<Integer, String>();  
	System.out.println("After Sorting");
	

	//using TreeMap constructor to sort the HashMap  

	
	TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);  
	Iterator itr=tm.keySet().iterator();               
	
	while(itr.hasNext())    
	{    
	int key=(int)itr.next();  
	System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
	}    
	
	
	}

}
