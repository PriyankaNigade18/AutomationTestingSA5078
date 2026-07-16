package com.WebTesting.TestNG.DataDrivenTesting;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class Tc081_ExcelFileReading {
  @Test
  public void testFileRead() throws IOException
  {
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//DataFile.xlsx");
	  
	  //FileStream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Wb->sheet-->row-->cell-->value
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //number of rows
	  int rows=wb.getSheet("LoginData").getPhysicalNumberOfRows();
	  System.out.println("Total rows: "+rows);//5
	  
	  //number of columns
	  int cells=wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Total Columns: "+cells);//2
	  
	  
	  //design array of same size like file data
	  Object arr[][]=new Object[rows-1][cells];//skip heading size should be rows-1
	  
	  //read data from file and store it inside file
	  for(int i=1;i<rows;i++)//rows
	  {
		  for(int j=0;j<cells;j++)//column
		  {
			  //array should start from 0
			  arr[i-1][j]=wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(arr[i-1][j]+"   ");
		  }
		  System.out.println();
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
