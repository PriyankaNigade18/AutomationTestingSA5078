package com.Methods_Constructor;

//this() can be used to invoke current class constructor.

public class ThisKeywordDemo3 
{
	
	public ThisKeywordDemo3()
	{
		//this("Hello");//calling parameterized constructor
		System.out.println("Default constructor is calling....");
	}
	
	public ThisKeywordDemo3(String msg)
	{
		this();//calling default constructor
		System.out.println("Parametrized constructor is calling...."+msg);
	}
	

	public static void main(String[] args) 
	{

		//ThisKeywordDemo3  t1=new ThisKeywordDemo3 ();
		
		ThisKeywordDemo3 t2=new ThisKeywordDemo3 ("Hi...");


	}

}
