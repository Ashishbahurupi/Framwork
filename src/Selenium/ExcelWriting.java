package Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook1=new XSSFWorkbook();
		
		XSSFSheet sheet1= workbook1.createSheet("EMP Info");
		
		Object Empdata[] []= {   { "10001","Ashish","engineer"},
		                         { "10002","Nileema","computer engg"} ,
		                         { "10003","Pratik","Anylyst"},
		                         { "10004","Dnyanesh"," Quality engg"} 

	};
		//Using Loop
		int rows=Empdata.length;
		int cols=Empdata[0].length;
		
		System.out.println(rows);
		
		System.out.println(cols);
		
		
		
		for(int r=0; r<rows; r++) {
			
		XSSFRow row	=sheet1.createRow(r);
		
		 for(int c=0; c<cols;c++) 
		 {
			 
			XSSFCell cell =row.createCell(c);
			Object value=Empdata[r][c];
			
			if(value instanceof String)
				cell.setCellValue((String)value);
			if(value instanceof Integer)
				cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean)value);
			
		 }
		}
		
		String filepath=".\\DataFiles\\Book1.xlsx";
		FileOutputStream outstream=new FileOutputStream(filepath);
		workbook1.write(outstream);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
