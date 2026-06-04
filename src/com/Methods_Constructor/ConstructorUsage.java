package com.Methods_Constructor;

public class ConstructorUsage
{
	//instance variable
	int id;
	String name;
	
	//this is keyword used to refer current class instance variable and current class instance method
	public ConstructorUsage(int id,String name)//local variable
	{
		//constructor is used to initialize object
		//assign local data to instance data
		this.id=id;//The assignment to variable id has no effect bcz its local=local
		this.name=name;//The assignment to variable name has no effect
	}
		
	public void show()
	{
		System.out.println("Id is: "+this.id);
		System.out.println("Name is: "+this.name);
	}
	
	public static void main(String[] args) 
	{
		ConstructorUsage c1=new ConstructorUsage(101,"Kiran");
		c1.show();
		
		
		

	}

}
