/*Define a method that makes the sum of all odd numbers from given input arrray and sends integer.

Write the method with following specifications

Name of method : getOddSum
Arguments : One Integer Array 
Return Type : Integer*/




package Array;

public class OddSum {
	
		 
	    static void getOddSum(int arr[])
	    {
	        int odd = 0;
	       for (int i = 0; i < arr.length; i++) {
	            if (i % 2 != 0)
	                odd += arr[i];
	        }
	        System.out.println(" sum of odd elements = " + odd);
	    }
	    public static void main(String[] args)
	    {
	        int arr[] = { 2, 3, 4, 5, 6 };
	        getOddSum(arr);
	    }
	}

