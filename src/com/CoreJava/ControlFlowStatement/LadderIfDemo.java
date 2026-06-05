package com.CoreJava.ControlFlowStatement;

public class LadderIfDemo {

	public static void main(String[] args) 
	{

		int n1=1000,n2=2000,n3=300;
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+" greater than "+n2+" and "+n3);
		}else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+" greater than "+n1+" and "+n3);
		}else
		{
			System.out.println(n3+" greater than "+n1+" and "+n2);
		}
		
		System.out.println("------------");
		
	
		
		/*
		 * How to test equality between string
		 * ------------------------------------------
		 * In Java String is Class
		 * We use for string operations methods
		 * 
		 * For String equality
		 * ----------------------
		 * 1.equals(): looks for exact match and it is case sensitive
		 * 2.equalsIgnoreCase(): looks for exact match and it is not case sensitive
		 * 
		 * 	
		String s1="Hello All";
		
		String s2="Hello All";
		
		String s3="hello all";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
		*/
	//Scenario:Test for test case is executing on chrome/firefox/edge:BrowserValidation
		
		String bname="safari";
		
		if(bname.equals("chrome"))
		{
			System.out.println("Test case is executing on Chrome!");
		}
		else if(bname.equals("firefox"))
		{
			System.out.println("Test case is executing on Firefox!");

		}else if(bname.equals("edge"))
		{
			System.out.println("Test case is executing on Edge!");

		}
		else
		{
			System.out.println("Wrong Browser name!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
