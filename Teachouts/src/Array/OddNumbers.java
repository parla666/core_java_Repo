/*Define a  method that counts and returns the number of odd numbers from given input arrray

Write the method with following specifications

Name of method : getOddCount
Arguments : One Integer Array 
Return Type :int */



package Array;
import java.util.*; 

	public class OddNumbers  {
		 
	    static void getOddCount(int arr[])
	    {
	        int odd_count = 0;
	        for (int i = 0; i<arr.length;i++)
	        {
	            if ((arr[i]%2)!=0)
	            {
	                odd_count++;
	            }
	        }
	 System.out.println("get odd count=:"+odd_count);
	    }
	    public static void main(String[] args)
	    {
	    	Scanner in = new Scanner(System.in); 
	        int arr[] = { 2, 3, 4, 5, 6 };
	        getOddCount(arr);
	    }
	}

