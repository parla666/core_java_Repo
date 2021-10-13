package handling;

import java.io.File;
import java.io.IOException;

public class ManagerFile extends EmployeeFile {

	public static void main(String arg[]) {
	ManagerFile mng=new ManagerFile();
	try {
		mng.create();
		mng.write();
		mng.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
      
	}
	
	
	
	
}
}