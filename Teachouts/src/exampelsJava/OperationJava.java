package exampelsJava;

public class OperationJava {
	 int square(int n){  
		  return n*n;  
		 }  
		}  
		  
		class Circle{  
			OperationJava  op;//aggregation  
		 double pi=17.5;  
		    
		 double area(int radius){  
		   op=new OperationJava ();  
		   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
		   return pi*rsquare;  
		 }  
		  
		     
		    
		 public static void main(String args[]){  
		   Circle c=new Circle();  
		   double result=c.area(9);  
		   System.out.println(result);  
		 }  
		} 


