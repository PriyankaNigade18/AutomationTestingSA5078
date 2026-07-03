package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc046_DynamicWebTableAutomation {
  @Test
  public void testDynamicTable()
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement tableHeading=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
	  ElementUtil.scrollUpToElement(driver,tableHeading);
	  
	  //get the headings
	  List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@id='taskTable']//tr//th"));
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("------------Specific Column---------------");

	  String expHeading="Disk";
	  int count=0;
	  for(WebElement i:allHeadings)
	  {
		  count++;
		  if(i.getText().contains(expHeading))
		  {
			  //position of column
			  System.out.println("Expected heading "+expHeading+" found at position: "+count );
			  
			  //based on position we can get that specific column
			  List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+count+"]"));
			  for(WebElement j:cellData)
			  {
				  System.out.println(j.getText());
			  }
			  
			  
			  
		  }
	  }
	  
	  
	  
	  System.out.println("-------Specific Row------------------");

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
