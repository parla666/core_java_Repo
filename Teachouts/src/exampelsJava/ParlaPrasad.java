package exampelsJava;

interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class ParlaPrasad implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
	ParlaPrasad obj = new ParlaPrasad();  
obj.print();  
obj.show();  
 }  
}  
