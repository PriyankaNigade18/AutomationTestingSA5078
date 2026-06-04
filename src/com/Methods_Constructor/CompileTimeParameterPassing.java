package com.Methods_Constructor;

public class CompileTimeParameterPassing 
{
	public void add()//0 parameter
	{
		int a=100,b=200;//local variable
		System.out.println("Addition is: "+(a+b));
	}
	
	public void subtract(int a,int b)//2 parameter which are local 
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	public void info(String msg)
	{
		System.out.println("Message is: "+msg);
	}

	public static void main(String[] args)

	{
		/*
		 *Compile time parameter passing
		 *----------------------------------
		 *At the time of compilation when we call method itself if when we any argument to the 
		 *method then it called compile time parameter passing
		 *
		 *what is parameter
		 *-----------------------
		 *Parameter represent variables
		 *
		 *What is argument?
		 *------------------------
		 *Argument represent real data
		 */
		
		
		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		c1.add();
		
		c1.subtract(1000,500);//2 argument
		
		c1.info("After 6 more days we will starting with automation!");
		
		c1.info("After Webdriver we will learn TestNG framework...");
		
		
			


	}

}
