package com.SwagLab.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.SwagLab.Utilities.BrowserProvider;
import com.SwagLab.Utilities.PropertiesUtil;

public class BaseTest 
{
	//declare project level variable
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected InventoryPage inventoryPage;
	protected CartPage cartPage;
	protected PropertiesUtil prop;
	protected CheckoutPage checkoutPage;
	protected  OverviewPage overviewPage;
	
	@Parameters({"bname"})
	@BeforeClass
	public void setUp(String bname)
	{
//		switch(bname.toLowerCase().trim())
//		{
//		case "chrome":driver=new ChromeDriver();break;
//		case "edge":driver=new EdgeDriver();break;
//		case "firefox":driver=new FirefoxDriver();break;
//		default:driver=new EdgeDriver();break;
//		}
		
		driver=BrowserProvider.setDriver(bname);
		prop=new PropertiesUtil("Project");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getValue("swagUrl"));
		loginPage=new LoginPage(driver);
		inventoryPage=new InventoryPage(driver);
		cartPage=new CartPage(driver);
		checkoutPage=new CheckoutPage(driver);
		overviewPage=new OverviewPage(driver);
				
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
