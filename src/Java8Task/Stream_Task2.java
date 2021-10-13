package Java8Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_Task2 {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);

		// method to count
		long cList = num.stream().count();
		System.out.println("Count=" + cList);

		// Method to sum
		int sum = num.stream().collect(Collectors.summingInt(n -> n));
		System.out.println("Sum=" + sum);

		// Method to min
		int min = num.stream().min((n1, n2) -> n1 > n2 ? 1 : -1).get();
		System.out.println("Minimum=" + min);

		// Method to avg
		Double avg = num.stream().collect(Collectors.averagingInt(l -> l));
		System.out.println("Average=" + avg);

		// Method to max
		int max = num.stream().max((n1, n2) -> n1 > n2 ? 1 : -1).get();
		System.out.println("Maximum=" + max);

	}
}
