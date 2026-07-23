package com.WebTesting.TestNG.DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Tc076_DataReadingFromPropertiesFileDemo1 {
  @Test
  public void testDataReadingFromFile() throws IOException 
  {
	  //to get the current project directory
	  //System.getProperty("user.dir")
	  
	  
	  //file path: File class
	  File f1=new File("./"+"//TestData//config.properties");
	  
	  //to read the file data in stream: FileInputStream class
	  FileInputStream fs=new FileInputStream(f1);
	  
	  
	  //to read properties file data use Properties class
	  Properties prop=new Properties();
	  
	  //load the file
	  prop.load(fs);
	  
	  System.out.println("Browser is: "+prop.getProperty("browserName"));
	  System.out.println("Platform name is: "+prop.getProperty("platformName"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
