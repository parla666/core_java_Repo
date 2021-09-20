package Exception;

public class UserDefinedException extends Exception {

	int a;
	   UserDefinedException(int b) {
	     a=b;
	   }
	   public String toString(){
	     return ("Exception Number =  "+a) ;
	  }
	
public static void main(String args[]){
	  try{
	       throw new UserDefinedException(2);
	       // throw is used to create a new exception and throw it.
	  }
	 catch(UserDefinedException e){
	    System.out.println(e) ;
	 }
	}
	}