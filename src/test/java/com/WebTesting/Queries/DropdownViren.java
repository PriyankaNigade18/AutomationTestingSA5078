package com.WebTesting.Queries;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropdownViren {
  @Test
  public void f() throws InterruptedException 
  {

	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  driver.findElement(By.id("srcinput")).sendKeys("Pune");
	  Thread.sleep(2000);
	  
	  List<WebElement> allOptions=driver.findElements(By.cssSelector("div[class^='searchCategory']>div[id^='suggestion'] div[role='heading']"));
	  System.out.println(allOptions.size());
	  
	  driver.findElement(By.cssSelector("div[class*='dateInputWrapper']")).sendKeys("20 Jul, 2026");
	 
  }
}
