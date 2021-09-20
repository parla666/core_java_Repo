package Array;

public class HelloColumn {
	
	
	public static int[] getColumnSum(int arr[][]) {
		int b[] = new int[arr.length];
		
	
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;

			for(int j=0;j<arr.length;j++) 
			{
			sum=sum+arr[j][i];
	        }
			b[i]=sum;
			System.out.print((b[i]));

		}
		return b;
	}
	public static void main(String[] args) {
		
		int arr [][]= {{1,2,3},{1,2,3},{1,2,3}};

		getColumnSum(arr);	
		}
}


