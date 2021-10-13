package LambdaExpressionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpressionExampels6 {
	public static void main(String arg[]) {
		// Adding products.

		List<Product> list = new ArrayList<Product>();
		list.add(new Product(3, "HP Laptop", 25000f));
		list.add(new Product(2, "dell Laptop", 25000f));
		list.add(new Product(1, "apple Laptop", 25000f));

		// implementing Lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}
}