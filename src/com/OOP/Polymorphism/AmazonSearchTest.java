package com.OOP.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) 
	{

		AmazonSearch se=new AmazonSearch();
			se.search("iphone");
			se.search(90000);
			se.search(10000,"bag");
			se.search("Watch",50000);
			se.search("Hand Bag","Zara");
		

	}

}
