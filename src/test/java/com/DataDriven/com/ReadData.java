package com.DataDriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void readPartticulardata() throws IOException {

		File f= new File("C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Datadriven\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0); 
		CellType celltypes = cell.getCellType();

		if (celltypes.equals(CellType.STRING)) {
			String stringcellvalue = cell.getStringCellValue();	
			System.out.println(stringcellvalue);
		}
		else if (celltypes.equals(CellType.NUMERIC)) {
			double numericcellvalue = cell.getNumericCellValue();
			System.out.println(numericcellvalue);

		}	

	}

	public static void main(String[] args) throws IOException {

		readPartticulardata();

	}

}