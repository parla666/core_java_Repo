package Array;

public class TwoDimensional {
public static void main(String args[]) {
	int sum=0;
	//declaring the initializing TwoDimensional
	int arr[][]= {{1,2,3,},{4,5,6,},{7,8,9,}};
	//printing 2D
	for(int i=0;i<=2;i++) 
	{
		sum+=arr[i][i];/*
		 * 123
		 * 456 
		 * 789
		 */
		/*
		 * for(int j=0;j<3;j++) { System.out.print(arr[i][j]+"  "); }
		 */
		/*
		 * System.out.print(arr[0][1]+"  "); System.out.println();
		 */
		
	}
	System.out.println(sum);
	
	
}
}
