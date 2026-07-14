package com.WebTesting.TestNG.DataReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc071_DatareadingUsingXMlForHRMTest
{
	@Parameters({"un","psw"})
	  @Test
  public void testLogin(String username,String password) 
  {
	  	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//username
		  driver.findElement(By.name("username")).sendKeys(username);
		  
		  //password
		  driver.findElement(By.name("password")).sendKeys(password);
		  
		  //click
		  driver.findElement(By.tagName("button")).click();
		  
  }
}
