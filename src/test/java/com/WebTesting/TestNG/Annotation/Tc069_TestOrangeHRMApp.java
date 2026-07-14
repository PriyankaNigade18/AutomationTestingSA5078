package com.WebTesting.TestNG.Annotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Tc069_TestOrangeHRMApp extends BaseClass

{
	
  @Test(priority=1)
  public void testLogin()
  {
	  //username
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  //password
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  
	  //click
	  driver.findElement(By.tagName("button")).click();
	  
	  
  }
  
  
  @Test(priority=2)
  public void testLogout()
  {
	  driver.findElement(By.cssSelector("i.oxd-userdropdown-icon")).click();
	  driver.findElement(By.linkText("Logout")).click();
  }
}
