package com.WebTesting.TestNG.Annotation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	//common precoditions and postconditions 
	protected WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterMethod
	public void getUrl()
	{
		System.out.println("App URl: "+driver.getCurrentUrl());
	}
	
	@BeforeMethod
	public void getPageTitle()
	{
		System.out.println("Current page Title: "+driver.getTitle());
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
