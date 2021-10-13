package Array;


	class SumOfDiagonals {
		
		public static void main(String[] args) {
			
			int i, sum = 0;	
		
			int[][] Sod_arr = {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}};
		
			for(i = 0; i < Sod_arr.length ; i++)
			{
					sum = sum + Sod_arr[i][i];
			}
		System.out.println("\nThe Sum of the Matrix Diagonal Items = " + sum);

		}
	}
