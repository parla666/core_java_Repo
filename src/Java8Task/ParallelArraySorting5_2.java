package Java8Task;

import java.util.Arrays;

public class ParallelArraySorting5_2 {
	public static void main(String[] args) {
		// Creating an integer array
		int[] arr = { 7,9 , 3,  5, 2, 6 ,50, -3 };
		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}
		// Sorting array elements parallel and passing start, end index
		Arrays.parallelSort(arr,0,5);
		System.out.println("\nArray elements after sorting");
		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
