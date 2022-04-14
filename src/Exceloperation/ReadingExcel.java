package Exceloperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {

	public static void main(String[] args) throws Exception  {
	
		//String ExcelFilePath="C:\\Users\\HP\\eclipse-workspace\\Selenium1\\DataFiles\\BooK1.xlsx ";
		String ExcelFilePath=System.getProperty("user.dir")+"\\data.xlsx";
		
		FileInputStream inputstream=new FileInputStream("ExcelFilePath ");
		
		XSSFWorkbook Workbook=new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet=Workbook.getSheetAt(0);
		
		// Using for loop
		
		int rows =sheet.getLastRowNum();
		int cols =sheet.getRow(1).getLastCellNum();

		for(int r=0; r<=rows; r++)
		{
			XSSFRow row =sheet.getRow(r);
			
			for(int c=0; c<cols; c++)
			{
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType()) {
				
				case STRING:System.out.println(cell.getStringCellValue());break;
				case NUMERIC:System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
				}
			}
			
			System.out.print(" | ");
		}
	}
}


