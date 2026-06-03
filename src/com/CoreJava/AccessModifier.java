package com.CoreJava;

public class AccessModifier 
{
	
	int id=101;//default 
	public String name="Sarang";
	private int phno=909787978;
	
	

	public static void main(String[] args)
	{
		//in same class
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);


	}

}
