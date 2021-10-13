package handling;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class convertingFile {
	static void xlsx(File inputFile, File outputFile) {
		// For storing data into CSV files
		StringBuffer data = new StringBuffer();


		try {
			FileOutputStream fos = new FileOutputStream(outputFile);
			// Get the workbook object for XLSX file
			FileInputStream fis = new FileInputStream(inputFile);
			Workbook workbook = null;



			
			workbook = new HSSFWorkbook(fis);
			
			
			// Get first sheet from the workbook

			int numberOfSheets = workbook.getNumberOfSheets();
			Row row;
			Cell cell;
			// Iterate through each rows from first sheet

			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(0);
				Iterator<Row> rowIterator = sheet.iterator();

				while (rowIterator.hasNext()) {
					row = rowIterator.next();
					// For each row, iterate through each columns
					Iterator<Cell> cellIterator = row.cellIterator();
					while (cellIterator.hasNext()) {

						cell = cellIterator.next();

						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_BOOLEAN:
							data.append(cell.getBooleanCellValue() + ",");

							break;
						case Cell.CELL_TYPE_NUMERIC:
							data.append(cell.getNumericCellValue() + ",");

							break;
						case Cell.CELL_TYPE_STRING:
							data.append(cell.getStringCellValue() + ",");
							break;

						case Cell.CELL_TYPE_BLANK:
							data.append("" + ",");
							break;
						default:
							data.append(cell + ",");

						}
					}
					data.append('\n'); // appending new line after each row
				}

			}
			fos.write(data.toString().getBytes());
			fos.close();

		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}

// testing the application

	public static void main(String[] args) {
		// int i=0;
		// reading file from desktop
		File inputFile = new File("d://test.xls"); // provide your path
		// writing excel data to csv
		File outputFile = new File("d://test.CSV"); // provide your path
		xlsx(inputFile, outputFile);
		System.out.println("Conversion of " + inputFile + " to flat file: " + outputFile + " is completed");
	}
}
