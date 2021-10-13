package Array;


	public class DiagonalsAdding {
		
		public static void main(String[] args) {
			
			int i, sum = 0;	
		//SumOfDiagonals in the array
			int[][] Sod_arr = {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}};
		
			for(i = 0; i < Sod_arr.length ; i++)
			{
					sum = sum + Sod_arr[i][i];
			}
		System.out.println("SUM OF THE DIAGONALS :  " + sum);

		}
	}

