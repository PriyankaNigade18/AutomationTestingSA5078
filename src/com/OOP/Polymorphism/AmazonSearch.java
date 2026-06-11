package com.OOP.Polymorphism;

public class AmazonSearch 
{
	
	
	public void search(String pname)
	{
		System.out.println("Product search by name: "+pname);
	}

	public void search(int price)
	{
		System.out.println("Product search by price: "+price);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product search by name: "+pname+" & by product price: "+price);
	}

	public void search(int price,String pname)
	{
		System.out.println("Product search by price: "+price+" & by product pname: "+pname);
	}

	public void search(String pname,String bname)
	{
		System.out.println("Product search by name: "+pname+" & by product BrandName: "+bname);
	}

	
	
	
	
	
}
