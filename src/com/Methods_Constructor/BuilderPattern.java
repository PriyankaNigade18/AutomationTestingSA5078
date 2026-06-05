package com.Methods_Constructor;

//this can be used to return the current class instance from the method.

public class BuilderPattern 
{
	//method--->CurrentObject
	public BuilderPattern  startBrowser()
	{
		System.out.println("Open Browser....");
		return this;
		
	}
	
	//method--->Object
	public BuilderPattern runApp()
	{
		System.out.println("Run Application....");
		return this;
	}
	
	public void stopBrowser()
	{
		System.out.println("Stop Browser....");
	}

	public static void main(String[] args) 
	{

		BuilderPattern  b1=new BuilderPattern();
		b1.startBrowser().runApp().stopBrowser();
		
		
		
		
		
		
		

	}

}
