package handling;
import java.io.FileOutputStream;  

public class FileOutputStreamExample3 {
	public static void main (String arg[]) {
		try {
			FileOutputStream fout=new FileOutputStream("D:\\techouts.csv");
			fout.write(65);
			fout.close();
			System.out.println("success.....");
		}
		catch (Exception e)
		{
			System.out.println(e); 
			}
		
			
			
		}
	}


