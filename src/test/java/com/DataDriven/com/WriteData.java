package com.DataDriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void WriteData() throws IOException {


		File f= new File("C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Datadriven\\Book2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("data").createRow(0).createCell(0).setCellValue("Email");
		wb.getSheet("data1").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("data1").createRow(1).createCell(0).setCellValue("Arun");
		wb.getSheet("data1").getRow(1).createCell(1).setCellValue("1253654");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

}

	public static void main(String[] args) throws IOException {

		WriteData();
	}
}



