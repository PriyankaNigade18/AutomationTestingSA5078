package com.CoreJava.ControlFlowStatement;

public class NestedIfDemo {

	public static void main(String[] args)
	{
		/*
		 * Scenario:
		 * if marks >=90------>A
		 * if marks >=95----->A++
		 * otherwise ----->B
		 */
		
		
		int marks=80;
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++");
			}else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}
		
		
		
		
		
		

	}

}
