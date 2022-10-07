package com.DataDriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllData {

	public static void main(String[] args) throws IOException {

		File f= new File("C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Datadriven\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);

		for(int  i = 0;i < 3;i++) {
			Row row = sheet.getRow(i);

			for(int j = 0;j < 3;j++) {
				Cell cell = row.getCell(j);

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

		}		
	}

}



