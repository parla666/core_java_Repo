package collections;
import java.util.*;
public class LinkedList3 {
public static void main (String arg[]) {
LinkedList<String> lt=new LinkedList<String>();
System.out.println("initial list of elements :"+lt);
lt.add("snehitha");
lt.add("poojitha");
lt.add("abhigna");
lt.add("lakshmi");
System.out.println("after invoking add E method :"+lt);
//Adding an element at specific position
lt.add(3,"akhila");
System.out.println("after invoking the element :"+lt);
LinkedList<String>lt2=new LinkedList<String>();
lt2.add("google");
lt2.add("pubg");
lt.add("techouts");
//adding second List element to the first element
lt.addAll(lt2);
System.out.println("after invoking add elements"+lt);
LinkedList<String> lt3=new LinkedList<String>();  
lt3.add("John");  
lt3.add("Rahul");  
//Adding second list elements to the first list at specific position  
lt.addAll(1, lt3);  
System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+lt);  
//Adding an element at the first position  
lt.addFirst("Lokesh");  
System.out.println("After invoking addFirst(E e) method: "+lt);  
//Adding an element at the last position  
lt.addLast("Harsh");  
System.out.println("After invoking addLast(E e) method: "+lt);  
  
}  
}