package com.Methods_Constructor;
//this is keyword used to refer current class instance variable and current class instance method
//this can be used to refer current class instance variable.

public class ThisKeywordDemo1 {


	//instance variable
	int id;
	String name;
	
	
	public ThisKeywordDemo1(int id,String name)//local variable
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
		ThisKeywordDemo1 c1=new ThisKeywordDemo1(101,"Kiran");
		c1.show();
		
		
		

	}

}
