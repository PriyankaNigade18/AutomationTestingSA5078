package com.CoreJava;

import com.Methods_Constructor.MethodTypes;

public class FirstCode 
{
	//single line comment
	
	/*
	 * Multiple line comment
	 */
	
	public static void main(String args[])
	{
		System.out.println("Hello All!");
		
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.name);//public data
		System.out.println(a1.id);//default : only in same class and package
		
		MethodTypes.launchApp();
		
	}
	
	
	

}
