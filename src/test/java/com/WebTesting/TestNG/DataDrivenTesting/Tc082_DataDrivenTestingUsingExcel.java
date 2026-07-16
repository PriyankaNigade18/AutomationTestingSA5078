package com.WebTesting.TestNG.DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc082_DataDrivenTestingUsingExcel
{
  @Test(dataProvider="ExcelData",dataProviderClass = CustomDataSet.class)
  public void testLogin(String un,String psw) 
  {
	  	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//username
		  driver.findElement(By.name("username")).sendKeys(un);
		  
		  //password
		  driver.findElement(By.name("password")).sendKeys(psw);
		  
		  //click
		  driver.findElement(By.tagName("button")).click();
		  
		  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail!");
		  System.out.println("User login completed....");
		  
  }
}
