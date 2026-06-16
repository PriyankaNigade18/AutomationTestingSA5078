package com.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args)
	{

		System.out.println("Program starts.....");
		
		try {
		System.out.println(9/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Write other number than 0");
		}
		finally 
		{
			System.out.println("Finally block used to store special code\nWhich will execute with or without excepction");
		}
		
		
		
		System.out.println("Program ends.....");

	}

}
