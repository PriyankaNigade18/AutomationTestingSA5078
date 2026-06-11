package com.OOP.Inheritance;
/*
 * What is Inheritance
  -----------------------
  Accessing properties of one class into another class is called Inheritance
  -It is Is-A relataion 
  where we can provide relation between two classes with extends Keyword
  
  
 Purpose?
  ------------------
  - To avoid duplication in code
  - To reuse methods
  - To achieve run time polymorphism
 
  
 Real time example
 ----------------------
 Real Parent-chid relation
   
  Types
 ============
	 1.Single level
	 2.Multi level
	 3.Hierachical 
 
 We can not implement using extends keyword (here interface required)
 4.Multiple 
 5.Hybrid
 
 Note:
 ---------------
 Parent class can access only parent properties
 Child class can access parent + child Properties
 
  RunTime Polymorphism(Method Overriding)
  -------------------------------------
  Method Overriding is possible only when two classes have Is-A Relation
  & both Parent,child class have same name method with same signature
  then Child class override parent class method
  
  
  
  
  
  
  
  
  
  
 */


class A
{
	public void m1()
	{
		System.out.println("M1() is calling...");
	}
}


class B extends A// here A will become parent and B is Child: Single level Inheritance
{
	public void m2()
	{
		System.out.println("M2() is calling...");
	}
}


public class InheritanceDemo {

	public static void main(String[] args)
	{

		System.out.println("Scenario1:Parent class referenece and Parent class Object: Parent ");
		
		A a1=new A();
		a1.m1();
		
		System.out.println("Scenario2:Child class referenece and Child class Object: Parent + child ");

		B b1=new B();
		b1.m1();//inherited 
		b1.m2();//individual
		
		System.out.println("Scenario3:Parent class referenece and Child class Object:  Parent class");
		
		
			A a2=new B();
			a2.m1();
		
		System.out.println("Scenario4:Child class referenece and Parent class Object: Invalid ");
		
		//B b2=new A();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		


	}

}
