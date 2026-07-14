package com.WebTesting.TestNG.DataReading;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc074_ParallelClassLevel1 
{
 
	  
	  @Test(priority=1)
	  public void chromeTest()
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  System.out.println("Title is: "+driver.getTitle());
	  }
	  
	  
	  
}
