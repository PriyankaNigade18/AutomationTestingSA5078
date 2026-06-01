package com.CoreJava;

public class StudentData 
{
	//data
	int id;
	String name;
	
	//function
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	//main()
	public static void main(String args[])
	{
		/*
		 * To call member of a class we need Object
		 * Object Syntax:
		 * --------------
		 * ClassName referenceVariableName=new className();
		 */
		
		
		StudentData s1=new StudentData();
		s1.show();//default data
		s1.id=101;
		s1.name="Jay";
		s1.show();//real data
		
		System.out.println("---------");
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Priya";
		s2.show();
		
		System.out.println("---------");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
