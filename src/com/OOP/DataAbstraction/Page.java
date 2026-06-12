package com.OOP.DataAbstraction;

/*
 * Data abstraction
  --------------------
  Hiding internal details of software and providing relevant features to user is called
 data abstraction
  
  Purpose: Hiding information/internal details
  
  Real time example:
  ATM
  Google Map
  
  How to implement in Java
  ============================
  1.Using Abstract class
 -----------------------
	Class declare with abstract keyword is abstract class
	 Abstract class can have implemented method and abstract method
	 Abstract method is method without body
	 for Partial abstraction we use abstract class
	 And Abstract class Object we can't create 
	 To call methods we need child class
	 Child class can implement all abstract methods from parent
 
 */
public abstract class Page
{
	
	
	//Implemented (Method with body)
	
	public void getTitle()
	{
		System.out.println("Page.......getTitle()");
	}
	
	//Non implemented /Abstract method(Method without body:use abstract keyword)
	public abstract void findElement();
	
	
	public static void main(String args[])
	{
		//Page p1=new Page();//Cannot instantiate the type Page
		
	}
	
	
	
	

}
