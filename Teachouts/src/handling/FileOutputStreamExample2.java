package handling;
import java.io.FileOutputStream;  
public class FileOutputStreamExample2 {
public static void main(String arg[]) {
	try {
		  FileOutputStream fout =new FileOutputStream("D://PRAVALLIKA.CSV");
		  String s="welcome to java point ";
		  byte b[]=s.getBytes();   //converting string to array byte 
		  fout.write(b);
		  fout.close();
		  System.out.println("success....");
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
		  
	}
}

