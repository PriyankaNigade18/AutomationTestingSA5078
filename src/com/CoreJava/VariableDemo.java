package com.CoreJava;

public class VariableDemo
{
	//instance variable
	int id=111;
	String name="Kiran";
	
	//static variable
	static String orgName="StarAgile";
	
	
	public void display()
	{
		int marks=90;//local variable
		System.out.println("Marks from display(): "+marks);
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
		System.out.println("OrgName is: "+orgName);
		
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println("OrgName is: "+orgName);
		int marks=100;//local variable
		System.out.println(marks);
		
		//object
		VariableDemo v1=new VariableDemo();
		v1.display();
		
		
		

	}

}
