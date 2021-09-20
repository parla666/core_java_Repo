package Array;

public class Alphabets {
public static void main(String arg[]) 
{
	//declaring  a source array
	char[]  copyFrom= {'A','B','C','D','E','F','G','H','I','P','A','R','L','A'};
         //DECLARING A DESTINATION ARRAY
	char[] copyTo=new char[6];
	//copying  array using System.arraycopy() method
	System.arraycopy(copyFrom, 9,copyTo, 0,5);
	System.out.println(String.valueOf(copyTo));
}
}
