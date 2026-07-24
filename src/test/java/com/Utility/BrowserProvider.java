package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProvider
{
	static public WebDriver driver;
	
	
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();

	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	
	public static WebDriver setDriver(String bname)
	{
		
		switch (bname.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			tdriver.set(driver);
			break;
			
		case "edge":
			driver=new EdgeDriver();
			tdriver.set(driver);
			break;
			
			
		case "firefox":
			driver=new FirefoxDriver();
			tdriver.set(driver);
			break;

		}
		
		return getDriver();
	}
	
	
	
}
