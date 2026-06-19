package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc002_BrowserCommands {

	public static void main(String[] args)
	{
		/*
		 * Scenario:
		 * Validate Google application title, which should be Google
		 */
		
		//launch Browser: create driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		//open google application:get(URL)
		driver.get("https://www.google.com/");
		
		//get the page title: getTitle():string
		String actTitle=driver.getTitle();
		
		//validate title should be Google
		if(actTitle.equals("Google"))
		{
			System.out.println("Title Match....Test Pass");
		}else
		{
			System.out.println("Title not match....Test Fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
