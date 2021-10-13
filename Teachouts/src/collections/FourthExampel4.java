package collections;

import java.util.*;

public class FourthExampel4 {
	public static void main(String arg[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("plane");
		stack.push("car");
		stack.push("bike");
		stack.push("cycle");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}