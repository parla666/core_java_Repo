package handling;

import java.io.FileReader;

public class FileReaderExample9 {
	public static void main(String arg[]) throws Exception {

		FileReader fr = new FileReader("D:\\computer");
		int i;
		while ((i = fr.read()) != -1)
			System.out.println((char) i);

	}
}
