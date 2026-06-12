package com.OOP.Encapsulation;

import com.OOP.Inheritance.NewAccessModifier;

public class TestNewAccessModifier extends NewAccessModifier
{

	public static void main(String[] args)
	{

		NewAccessModifier a1=new NewAccessModifier ();
		System.out.println(a1.name);
		
		//Protected data you can call in different package only through child class

		TestNewAccessModifier  t1=new TestNewAccessModifier ();
		System.out.println(t1.name);
		System.out.println(t1.acnum);
		
		
		
		
	}

}
