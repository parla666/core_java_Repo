package collections;

import java.util.*;

class TextBooks {
	int id;
	String name, author, publisher;
	int quantity;

	public TextBooks() {

	}

	public TextBooks(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;

	}
}

public class TextBook {

	public TextBook(int i, String string, String string2, String string3, int j) {
		// TODO Auto-generated constructor stub
	}

	public TextBook(int i, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String arg[]) {
		TextBooks t = new TextBooks();

//creating list of TextBook
		List<TextBooks> list = new ArrayList<TextBooks>();
		new TextBooks(1, "sai", "raj", "ram", 2);
		TextBooks b1 = new TextBooks(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		TextBooks b2 = new TextBooks(201, "techouts", "VENKATA SIVA PRASAD", "SKASHI TV", 20);
		TextBooks b3 = new TextBooks(303, "techouts", "venkata prasad", "tv ", 606);
		// adiing TextBooks list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// traversing list
		for (TextBooks b : list) {
			System.out.println(b.id + "   " + b.name + "    " + b.author + "    " + b.publisher + "     " + b.quantity);

		}

	}

}
