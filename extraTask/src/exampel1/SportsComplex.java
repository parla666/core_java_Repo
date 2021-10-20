package exampel1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class SportsComplex {
	static int rowid = 0;

	static int count = 0;

	static int rowCount = 0;

	static HSSFWorkbook workbook = null;

	static HSSFSheet sheet = null;

	static String filename = "D:\\userdata.xls";

	public static void main(String[] args) throws Exception {
		DataOfSlotsList.slotsListOfSports();
		SportsList.userDetails();
		SportsList.listOfSports();

	}

	public static void writeXlasxData(CustomerSlotData data) throws IOException {
		if (count == 0) {
			workbook = new HSSFWorkbook();
			sheet = workbook.createSheet("customerData");
			count++;

		}
		HSSFRow rowhead = sheet.createRow((short) rowCount);
		rowhead.createCell(0).setCellValue(data.getName());
		rowhead.createCell(1).setCellValue(data.getSlotNo());
		rowhead.createCell(2).setCellValue(data.getTiming());
		FileOutputStream fileOut = new FileOutputStream(filename);
		workbook.write(fileOut);
		workbook.close();
		fileOut.flush();
		fileOut.close();
		rowCount++;
	}

}
