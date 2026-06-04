package com.Methods_Constructor;

public class ConstructorDemo 
{
	
	//default constructor: without any parameter
	public ConstructorDemo()
	{
		System.out.println("Default constructor is calling.....");
	}
	
	//Parameterized constructor
	public ConstructorDemo(int id,String name)//2 parameters
	{
		System.out.println("Parameterized constructor is calling....id="+id+" & name="+name);
	}
	
	
	public static void main(String[] args) 
	{
		//constructor called at the time of object creation
		ConstructorDemo c1=new ConstructorDemo();
		
		ConstructorDemo c2=new ConstructorDemo(101,"Kiran");
		
		
		
		
		
		

	}

}
