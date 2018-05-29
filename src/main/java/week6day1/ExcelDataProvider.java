package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataProvider {
@Test
	public Object[][] getData(String excelFileName) throws IOException {

		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		
		XSSFSheet sheet = wbook.getSheet("Details");
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Number of Rows in the excelsheet is: "+rowCount);
		
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of Column in the excelsheet is: "+colCount);
		
		Object[][] data = new Object[rowCount][colCount];
		
		for(int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for(int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				
				data[i-1][j] = cell.getStringCellValue();
				
			}
		}
		
		wbook.close();
		return data;
	}

}

