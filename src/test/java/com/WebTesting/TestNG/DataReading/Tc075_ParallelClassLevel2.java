package com.WebTesting.TestNG.DataReading;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc075_ParallelClassLevel2 
{
 
	
	  
	  
	  @Test(priority=1)
	  public void edgeTest()
	  {
		  WebDriver driver=new EdgeDriver();
		  
		  driver.get("https://www.amazon.in");
		  System.out.println("Title is: "+driver.getTitle());
	  }
}
