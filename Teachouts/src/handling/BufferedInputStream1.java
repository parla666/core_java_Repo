package handling;

import java.io.*;

public class BufferedInputStream1 {
public static void main (String arg[]) throws IOException {
	FileInputStream fits=new FileInputStream("D://textbook.txt");
	BufferedInputStream bine =new BufferedInputStream(fits);
	int i;
	while ((i=bine.read())!=-1) {
		System.out.println((char)i);
	}
	try {
   bine.close();		
   fits.close();
	
}
    catch (Exception e) {
	    System.out.println(e);
}
}}