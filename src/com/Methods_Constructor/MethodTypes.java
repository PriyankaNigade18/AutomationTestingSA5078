package com.Methods_Constructor;

public class MethodTypes
{
	
	//1.Instance Method: which we can access only through Object
	public void startBrowser()
	{
		System.out.println("Start browser for automation....");
	}
	
	//2.Static Method: Which we can access through className
	public static void launchApp()
	{
		System.out.println("Open Application within a browser....");
	}
	
	
	public static void main(String[] args)
	{
			
		//className
		MethodTypes.launchApp();
		
		//Object
		MethodTypes m1=new MethodTypes();
		m1.startBrowser();


	}

}
