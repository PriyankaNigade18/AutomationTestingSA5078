package com.WebTesting.TestNG.DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class CustomDataSet 
{
	
	@DataProvider(name="myArrayData")
	public Object[][] getDataSet()
	{
		Object arr[][]= {{"Admin","admin123"},{"Richa","test123"},{"Poonam","test123"},{"Amit","test123"}};
		return arr;
	}
	

}
