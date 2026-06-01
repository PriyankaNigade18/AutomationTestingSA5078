package com.CoreJava;

public class MethodDemo 
{
		
	public void accept()
	{
		System.out.println("accept()...Instance method is calling");
	}
	
	public static void display()
	{
		System.out.println("display()....Static method is calling");
	}
	
	
	public static void main(String[] args)
	{
			
		MethodDemo.display();
		display();
		
		//object
		MethodDemo m1=new MethodDemo();
		//The static method display() from the type MethodDemo should be accessed in a static way
		m1.display();
		m1.accept();
		
		
		
		
		
		

	}

}
