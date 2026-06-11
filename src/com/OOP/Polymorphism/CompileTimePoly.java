package com.OOP.Polymorphism;
/*
Polymorphism: One thing in many form we can use

what is purpose?
Polymorphism used for Method reusability

Types of Polymorphism
---------------------
1.Compile time poly(Method Overloding)
2.Run time Poly(Method Overriding): IS-A relation in classes

Compile time polymorphism
------------------------------
When same name method is reused in same class with different signature
then it is called compile time or Method overloading

What is different signature
------------------------------
Method should have same name
	1.number of parameters allowed
	2.Different type of data allowed
	3.Order of parameters can be different

Is Main() overloading is possible?
---------------------------------------
Yes, main() overloading is possible but practically we dont need it
Main() overriding is not possible

Constructor overloading is Possible?
----------------------------------------
Yes, constructor overloading is possible and it refer as constructor chaining

Constructor overriding is not possible

What is Real time examples:
---------------------------
 payment gateway
 Ola/zomato/uber
----------------------------------------------------------
*/
public class CompileTimePoly
{

	
	public void add()
	{
		int a=100,b=90;
		System.out.println("Addition is: "+(a+b));
	}
	
	//1.Number of parameter
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));

	}

	//2.Different type of parameter
	public void add(double a,int b)
	{
		System.out.println("Addition is: "+(a+b));

	}
	//3.change order of parameters
	public void add(int a,double b)
	{
		System.out.println("Addition is: "+(a+b));

	}
	
	public void add(int a,int b,int c)
	{
		System.out.println("Addition is: "+(a+b+c));

	}
	
//	public int add(int a,int b)
//	{
//		return a+b;
//	}
	//Constructor overloading
	public CompileTimePoly()
	{
		System.out.println("This is default constructor calling....");
	}
		
	public CompileTimePoly(int id)
	{
		System.out.println("This is parameterized constructor calling....id: "+id);
	}
		
	public CompileTimePoly(String msg)
	{
		System.out.println("This is parameterized constructor calling....msg: "+msg);
	}
		
	
	public static void main(String[] args)
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(67.66, 99);
		c1.add(100,78.660);
		c1.add(890,450);
		c1.add(78,7868,900);
		
		CompileTimePoly c2=new CompileTimePoly("Hello");
	}

}
