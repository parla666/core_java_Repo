
/* try and catch exceptions */

package exampelsJava;

 class MainException2 {


	  public static void main(String[] args) {
	    try {
	      int divideByZero = 5 / 0;
	    }

	    finally {
	      System.out.println("Finally block is always executed");
	    }
	  }
	}