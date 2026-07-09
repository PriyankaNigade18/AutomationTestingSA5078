package com.WebTesting.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	//BaseClass Is something where we can add project level configuration(pre and post conditions)
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		//browser + app launch
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
	}
	
	@BeforeMethod
	public void getAppTitle()
	{
		System.out.println("App Title: "+ driver.getTitle());
	}
	
	
	  @AfterClass
	  public void tearDown()
	  {
		  driver.quit();
	  }
	  

}
