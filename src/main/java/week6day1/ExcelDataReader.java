package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataReader {
	@Test
	public void getData() throws IOException {

		XSSFWorkbook wbook = new XSSFWorkbook("./data/Testleaf Login Credentials.xlsx");
		
		XSSFSheet sheet = wbook.getSheet("Details");
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Number of Rows in the excelsheet is: "+rowCount);
		
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of Column in the excelsheet is: "+colCount);
		
		
		System.out.println("Number of rows with column header :"+sheet.getPhysicalNumberOfRows());
		
		for(int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for(int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				
				String value = cell.getStringCellValue();
				
				System.out.println(value);
			}
		}
		
		
		wbook.close();
		
	}

}
