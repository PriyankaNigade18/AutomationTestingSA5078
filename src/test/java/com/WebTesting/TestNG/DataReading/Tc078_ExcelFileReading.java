package com.WebTesting.TestNG.DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class Tc078_ExcelFileReading {
  @Test
  public void fileRead() throws IOException
  {
	  
	  //give the file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//DataFile.xlsx");
	  
	  //read in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row--->cell--->value
	  
	  //format based class: Workbook
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //read single entry from excel file
	  String toolName=wb.getSheet("BookData").getRow(3).getCell(1).getStringCellValue();
	  System.out.println("tool: "+toolName);
	  
	  
	 double priceData= wb.getSheet("BookData").getRow(1).getCell(2).getNumericCellValue();
	 System.out.println((int)priceData);
	  
	  
	  /*
	  //wb-->sheet
	  XSSFSheet sheet1=wb.getSheet("BookData");
	  
	  //sheet-->row
	  XSSFRow expRow=sheet1.getRow(3);
	  
	  //row-->cell
	  XSSFCell expCell=expRow.getCell(1);
	  
	  //cell--->read data
	  String toolName=expCell.getStringCellValue();
	  
	  System.out.println(toolName);
	  
	  */
	  
	  
	  
	  
	  
	  
	  
  }
}
