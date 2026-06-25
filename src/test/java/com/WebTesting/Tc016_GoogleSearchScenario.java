package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc016_GoogleSearchScenario {

	public static void main(String[] args) 
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		//search for keyword
		driver.findElement(By.id("APjFqb")).sendKeys("Jenkins",Keys.ENTER);
		

	}

}
