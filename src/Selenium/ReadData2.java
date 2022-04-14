package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData2 {
	
	

	public static void main(String[] args) throws IOException {
		 
		String Excelfilepath= System.getProperty("user.dir")+ "\\data.xlsx ";  // get the path location
		
		FileInputStream inputStream=new FileInputStream(Excelfilepath);//  open the file from work book
        
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);   //got workbook 
		
		XSSFSheet sheet=workbook.getSheet(" Sheet1");
		
		XSSFSheet sheet1 =workbook.getSheetAt(0);
		
		
		//using for loop
		int rows =sheet.getLastRowNum();      /// get the last row number
		
		int cols =sheet.getRow(1).getLastCellNum();
		
		
		//for
		
		
	}

}   // 

