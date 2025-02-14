package com.jbk.read;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	/*// 1. file read/write - FileInputStream
	//FileOutputSteam
	//2. Workbook
	//3. Sheet
	//4. rows
	//5.cells*/
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fileInputStream = new FileInputStream(new File("D:\\Prachi\\JavaByKiran\\Apache_POI\\src\\main\\resources\\employee.xlsx"));
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rows = sheet.rowIterator();
			
			while(rows.hasNext()) {
				Row row = rows.next();
				
				Iterator<Cell> cells = row.cellIterator();
				
				while(cells.hasNext()) {
					Cell cell = cells.next();
					
					System.out.println(cell.getStringCellValue()+"\t");
										
				}
				System.out.println();
			}
			
			
		}catch (Exception e){
			
			e.printStackTrace();
		}
		
	}
	

	
	

}
