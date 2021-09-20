/*Define a method which accepts an array of numbers and return the sum of unique numbers from the array.



Name of method :sumOfArray()

Arguments: one argument of type integer array

Return Type: an integer value*/


package Array;


public class Class {
	

	public static void main(String[] args) {
		
		//create an array
		int a[]= {6,5,4,2,3,9};
		System.out.println(sumOfArray(a));
	}
	 public static int sumOfArray(int b[]) 
	 {
		int sum = 0;
		
		 for(int i=0;i<=b.length-1;i++) {
			 
			 sum+=b[i];
		 }
		return sum;
	 }
	 
		}

