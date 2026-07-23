package com.WebTesting.TestNG.ListenersReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {
  @Test
  public void testReport() 
  {
	  //extent report object
	  ExtentReports extent=new ExtentReports();
	  
	  //path for the report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//TestReport//ExtentHtmlReport.html");
	  
	  //attached report
	  extent.attachReporter(spark);
	  
	  //configuration
	  spark.config().setDocumentTitle("AutomationReport");
	  spark.config().setReportName("TestApp automation Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //create a test
	ExtentTest test= extent.createTest("Test SwagLab app");
	
	//log
	test.log(Status.PASS,"Test Pass");
	test.log(Status.FAIL,"Test Fail");
	test.log(Status.INFO,"Test info");
	test.log(Status.WARNING,"Test have warning");
	
	//flush the report
	extent.flush();
	
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
