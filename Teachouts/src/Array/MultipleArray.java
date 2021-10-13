/*Implement logic for the following method 

public static int[] getMultiplesArray(int number). 

This method should create a new integer array of size 10 and fill it with the multiples (multiples 1 to 10) of the given number. 
and return the array.*/


package Array;


	import java.util.Scanner;

	 	public class MultipleArray {
	    public static int getMultiplesArray(int number) {
	        
	        int a[]= {1,2,3,4,5,};
	        for(int i=0; i<a.length; i++) {
	            //System.out.println(a.length);
	            int b= a[i]*number;
	            System.out.print(b+" ");
	        }
	        
	        return number;
	        
	    }
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("enter the number");
	        int number= sc.nextInt();
	        
	        MultipleArray m= new MultipleArray();
	        
	        //System.out.println(getMultiplesArray(number));
	        getMultiplesArray(number);
	    
	    }

	 

	}

