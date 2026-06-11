package com.OOP.Inheritance;

class Parent
{
	public void color()
	{
		System.out.println("Blue");
	}
}


class Child extends Parent
{
	@Override
	public void color()
	{
		System.out.println("Yellow");
	}
}



public class RunTimePolyDemo {

	public static void main(String[] args) 
	{
		// parent ref and parent object
		Parent p1=new Parent();
		p1.color();//blue
		
		//child class ref and child class object
		Child c1=new Child();
		c1.color();//yellow
		
		//Parent ref and Child Object
		Parent p2=new Child();
		p2.color();//yellow
		
		
		
		
		
		
		
		
		
		
		

	}

}
