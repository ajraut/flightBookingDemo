package com.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGeneric {
	
	public XSSFWorkbook wb;
	public XSSFSheet sh;
	FileInputStream fs;
	public XSSFCell cell;
	
	public ExcelGeneric(String excelPath) {

		try {
			
			FileInputStream fs = new FileInputStream(new File(excelPath));
			wb = new XSSFWorkbook(fs);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String getData(int row, int col, String sheetName) {
		sh = wb.getSheet(sheetName);
		cell=sh.getRow(row).getCell(col);
		return cell.toString().trim();
	}
	
	public int getRow(String sheetName) {
		int row = wb.getSheet(sheetName).getLastRowNum();

		return row;
	
	}
	
	
	
	
	

}
