package com.OOP.Inheritance;

public class SuperChild extends SuperParent
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("ParentId is: "+super.pid);
		System.out.println("Child id is: "+cid);
		super.parentIncome();
		System.out.println("Child income is $30000");
	}

	//constructor
	public SuperChild()
	{
		super();//super constructor
		System.out.println("Child class constructor calling.....");
	}
	
	
	
	public static void main(String[] args)
	{

		SuperChild s1=new SuperChild();
		//s1.parentIncome();
		s1.childIncome();
//		System.out.println(s1.pid);
//		System.out.println(s1.cid);

	}

}
