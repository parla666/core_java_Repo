/*Employee has methods for create, read and write to a file.
Manager extends employer and have these file methods overriden(Examine here without handling the exceptions) along with delete the file.
Write the details of Employee class to a file in your local and make this file non-editable.
b.Convert from CSV to excel.
c.Convert from Excel to a CSV File.*/

package handling;

import java.io.*;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import employee.Employee;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;

class EmployeeFile {

	public File  f = new File("d://company.CSV");
	private EmployeeFile fl;

	public void create() throws IOException {

		FileOutputStream fos = new FileOutputStream(f);
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
	}

	public void write() throws IOException {
		FileWriter flw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(flw);
		bw.write("name ");
		bw.write("  id ");
		bw.write(" salary");
		bw.close();
		System.out.println(" its ended");

	}

	public void read() throws IOException {
		FileReader flr = new FileReader(f);
		BufferedReader br = new BufferedReader(flr);
		String s = br.readLine();
		if (s != null) {
			System.out.println(s);
			br.readLine();
		}
		br.close();
	}

	public void delete() {
		try {

			f.delete();
		} catch (NullPointerException e) {

		}
	}


	public static void main(String[] args) {
		try {

			new EmployeeFile().create();
			new EmployeeFile().write();
		 new EmployeeFile().read();

			new EmployeeFile().delete();
	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}