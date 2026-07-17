package com.SwagLab.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	//declare project level variable
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected InventoryPage inventoryPage;
	
	@Parameters({"bname"})
	@BeforeClass
	public void setUp(String bname)
	{
		switch(bname.toLowerCase().trim())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default:driver=new EdgeDriver();break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		loginPage=new LoginPage(driver);
		inventoryPage=new InventoryPage(driver);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
