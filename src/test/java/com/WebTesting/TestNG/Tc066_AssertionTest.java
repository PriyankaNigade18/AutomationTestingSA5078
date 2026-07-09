package com.WebTesting.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc066_AssertionTest {
  @Test
  public void verifyTitle()
  {
	//launch Browser: create driver session with chrome
			WebDriver driver=new ChromeDriver();
			
			//open google application:get(URL)
			driver.get("https://www.google.com/");
			
			//get the page title: getTitle():string
			String actTitle=driver.getTitle();
			
			//validate title should be Google
			Assert.assertTrue(actTitle.contains("Google"),"Title not matched...");
			System.out.println("Title Matched...: "+actTitle);
			
			
			
			
  }
}
